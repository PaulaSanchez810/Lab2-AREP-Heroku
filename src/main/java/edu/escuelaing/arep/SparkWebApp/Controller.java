package edu.escuelaing.arep.SparkWebApp;
import edu.escuelaing.arep.Calculator;
import edu.escuelaing.arep.LinkedliStstructure.LinkedList;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.template.velocity.VelocityTemplateEngine;



import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Controller {

    public static String render(Request request, Map<String, Object> object, String template){
        return new VelocityTemplateEngine().render(new ModelAndView(object,template));
    }
    public static Route main = (Request req, Response res) -> {
        HashMap<String, Object> model = new HashMap<>();
        return render(req, model, "/render/calculator.php");
    };
    public static Route computeNumbers = (Request req, Response res) -> {
        HashMap<String, Object> model = new HashMap<>();
        String numbers = req.queryParams("numbers");

        if (!numbers.equals("")) {
            try {
                LinkedList<Double> data = new LinkedList<Double>(Arrays.stream(numbers.split(","))
                        .map(Double::valueOf)
                        .toArray(Double[]::new));
                model.put("mean", String.format("%.2f", Calculator.calculateMean(data)));
                model.put("deviation", String.format("%.2f", Calculator.calculateStandarDeviation(data)));
            } catch (NumberFormatException e) {
                model.put("msg", "Verifique que la entrada sean números");
            }
        }
        return render(req, model, "/render/calculator.php");
    };
}
