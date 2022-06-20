package com.example.demo1;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String position = request.getParameter("position");
        request.setAttribute("name", name);
        request.setAttribute("position", position);
        getServletContext().getRequestDispatcher("/basic.jsp").forward(request, response);
    }

}