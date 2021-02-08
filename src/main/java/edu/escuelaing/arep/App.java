package edu.escuelaing.arep;

import edu.escuelaing.arep.LinkedliStstructure.LinkedList;
import spark.Request;
import spark.Response;

import static spark.Spark.*;
import static spark.Spark.port;

public class App {
    public static void main(String[] args ) {
        port(getport());
        get("/calculadoraArep",(req,res)->inputDataPage(req,res));
        get("/resultado", (req,res)->resultsPage(req,res));

    }
    private static int getport() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set
    }
    private static String inputDataPage(Request req, Response res) {
        String content = "<!DOCTYPE html>" + "<html>" + "<body>"
                + "<form action=\"/resultado\">"
                +"<fieldset>"+"<legend>Calculadora</legend>"
                +"<p>Ingrese el conjunto de números para calcular la media y desviación estandar</p>"
                +"<input type=\"text\"name=\"data\" placeholder=\"Ej:1,2,3\">" + "<br/><br/>"
                + "<input type=\"submit\" value=\"Calcular\">" + "</form>"
                +"</fieldset>"
                + "</body>" + "</html>";
        return content;
    }

    private static String resultsPage(Request req, Response resp) {
        LinkedList<Double> linkedList = new LinkedList<Double>();
        String [] dataSet = req.queryParams("data").split(",");
        if (!dataSet.equals("")) {
            try {
                for (String i : dataSet) {
                    double value = Double.parseDouble(i);
                    linkedList.insertLast(value);
                }
            }catch (NumberFormatException e){
                return ("ERROR VALOR NO VALIDO. Verifique que el valor ingresado sea un número");
            }
        }
        double mean = Calculator.calculateMean(linkedList);
        double standard = Calculator.calculateStandarDeviation(linkedList);
        String pageContent = "<!DOCTYPE html>" + "<html>" + "<body>"
                +"<fieldset>"
                +"<legend>Resultado</legend>"
                +"<p style=\"margin: 20px 0\">Media:"+String.format("%.2f",mean)+"</p>"
                +"<p style=\"margin: 20px 0\">Desviación Estándar:"+String.format("%.2f",standard)+"</p>"
                + "</fieldset>"
                + "</body>" + "</html>";
        return pageContent;
    }
}




