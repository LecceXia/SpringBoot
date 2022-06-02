package com.example.webdemo;

import com.example.sevice.Service;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Demo")
public class ServletDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        boolean flag=true;
        resp.getWriter().write(""+flag);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        String pwd = req.getParameter("password");

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<html><body>");
        writer.println("<h2> Complete the registration</h2>");
        writer.println("<form action = '/Webdemo_war_exploded/Demo1' method = 'post'>");
        writer.println("Email :<input type = text name = email><br>");
        writer.println("PhoneNumber:<input type = text name = number><br>");
        writer.println("<input type = submit value = submit>");
        writer.println("</form></body></html>");
    }
}
