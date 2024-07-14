package dukes.greeting;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import jakarta.ejb.EJB;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/greeting")
public class GreetingServlet extends HttpServlet {
    @EJB
    private GreetingService greetingService;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try {
            PrintWriter out = resp.getWriter();
            out.println(greetingService.getMessage());
        } catch (IOException e) {
            Logger.getLogger(GreetingServlet.class.getName()).severe(String.format("Error: %s", e.getMessage()));
        }
    }
}
