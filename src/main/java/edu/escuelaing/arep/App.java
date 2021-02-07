package edu.escuelaing.arep;

import edu.escuelaing.arep.SparkWebApp.Controller;
import spark.Request;
import spark.Response;

import java.io.FileNotFoundException;

import static spark.Spark.*;
import static spark.Spark.port;

public class App {
    private static Calculator calculator = new Calculator();

    public static void main(String[] args ) throws FileNotFoundException {
        port(getport());
        staticFiles.location("/render");
        get("/CalculadoraArep/",Controller.main);
        post("/CalculadoraArep/", Controller.computeNumbers);

        get("*", (Request req, Response res) -> {
            res.redirect("/CalculadoraArep/");
            return null;
        });
    }

    private static int getport() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set
    }
}




