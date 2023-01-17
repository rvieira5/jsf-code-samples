package br.com.rvieira5.servlet;

import jakarta.servlet.http.*;
import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(name = "HelloServlet", urlPatterns = {"/*"})
public class HelloWorldServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        var writer = resp.getWriter();

        // write message to http response
        writer.println("<h1> Hello World </h1>");

        writer.close();
    }

}
