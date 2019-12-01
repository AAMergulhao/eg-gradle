package app;

import static spark.Spark.port;
import static spark.Spark.staticFileLocation;

import model.Formula;
import model.Model;


public class MainServer{
	
	final static Model model = new Model();
	
    public static void main(String[] args) {

		// Get port config of heroku on environment variable
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 8080;
        }
        port(port);

		//Servir conteudo html, css e javascript
        staticFileLocation("/static");
        
        initForms();

		Controller controller = new Controller(model);
		
		controller.srcFormula();
		
    }
    public static void initForms(){
        model.addFormula(new Formula(1, "{\"Formula\": \"Velocidade Media\", \"DeltaS\": \" intervalo de deslocamento (espaco) - posicao final - a posicao inicial\",\"DeltaT\": \" intervalo de tempo - tempo final - o tempo inicial\"}"));
        model.addFormula(new Formula(2, "{\"Formula\": \"Aceleracao Media\", \"DeltaV\": \" Variacao da velocidade (ΔV = V - V0)\",\"DeltaT\": \"Variacao do tempo (Δt = T - T0)\"}"));
        model.addFormula(new Formula(3, "{\"Formula\": \"Equacao de Torricelli\", \"V\": \" Velocidade final (m/s)\",\"V0\": \"Velocidade inicial (m/s)\", \"A\": \"Aceleracao (m/s)ao quardrado\", \"DeltaS\": \"Espaco percorrido pelo corpo (m)\"}"));
        model.addFormula(new Formula(4, "{\"Formula\": \"Movimento Uniforme\", \"S\": \" Posicao\",\"S0\": \"Posicao inicial\", \"V\": \"Velocidade\", \"DeltaT\": \"Variacao do tempo (Δt = T - T0)\"}"));
    }
}
