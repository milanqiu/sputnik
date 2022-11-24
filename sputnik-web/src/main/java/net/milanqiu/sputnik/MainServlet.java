package net.milanqiu.sputnik;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Main servlet.
 * <p>
 * Creation Date: 2016-06-11
 * @author Milan Qiu
 */
public class MainServlet extends HttpServlet {

    public static int addTwo(int value) {
        return value+2;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("Param: " + request.getParameter("param"));
    }
}
