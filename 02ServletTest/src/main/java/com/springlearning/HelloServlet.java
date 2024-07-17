package com.springlearning;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("In Sevice");

        res.setContentType("text/html");
        PrintWriter out;
        try {
            out = res.getWriter();
            out.println("<h1>Hallo Bhawuk!</h1>");
        } catch (IOException e) {
            System.out.println(e);
        }
        

    }
}
