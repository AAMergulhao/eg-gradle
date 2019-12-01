package app;

import static spark.Spark.get;

import model.Model;

import model.Formula;

import com.google.gson.Gson;

public class Controller{

    private Model model;

    public Controller(Model model){
        this.model = model;
    }

    public void srcFormula(){
        get("/formula/:id", (req, res) ->{
            Integer id = Integer.parseInt(req.params(":id"));
            Formula formula = model.srcFormula(id);
            return new Gson().toJson(formula);
        });
    }
}