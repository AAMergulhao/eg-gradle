$(document).ready(function(){
  $('.modal').modal();
  $("#velocidadeMedia").click(function() {
    var url = "/formula/1";
    $.getJSON(url, function(data) {
      var formula = JSON.parse(data.formula);
      document.getElementById("modal-content").innerHTML = 	"<h4>Formula: " + formula.Formula +"</h4>" + "<p>Vm: " + formula.Formula + "</p>" + "<p>ΔS: " + formula.DeltaS + "</p>" + "<p>ΔT: " + formula.DeltaT + "</p>";
    });
  });
  $("#aceleracao").click(function() {
    var url = "/formula/2";
    $.getJSON(url, function(data) {
      var formula = JSON.parse(data.formula);
      document.getElementById("modal-content").innerHTML = 	"<h4>Formula: " + formula.Formula +"</h4>" + "<p>Am: " + formula.Formula + "</p>" + "<p>Δv: " + formula.DeltaV + "</p>" + "<p>ΔT: " + formula.DeltaT + "</p>";
    });
  });
  $("#torricelli").click(function() {
    var url = "/formula/3";
    $.getJSON(url, function(data) {
      var formula = JSON.parse(data.formula);
      document.getElementById("modal-content").innerHTML = 	"<h4>Formula: " + formula.Formula +"</h4>" + "<p>v: " + formula.V + "</p>" + "<p>v0: " + formula.V0 + "</p>" + "<p>a: " + formula.A + "</p>" + "<p>Δs: " + formula.DeltaS + "</p>" ;
    });
  });
  $("#deslocamento").click(function() {
    var url = "/formula/4";
    $.getJSON(url, function(data) {
      var formula = JSON.parse(data.formula);
      document.getElementById("modal-content").innerHTML = 	"<h4>Formula: " + formula.Formula +"</h4>" + "<p>s: " + formula.S + "</p>" + "<p>s0: " + formula.S0 + "</p>" + "<p>v: " + formula.V + "</p>" + "<p>Δt: " + formula.DeltaT + "</p>" ;
    });
  });
});

