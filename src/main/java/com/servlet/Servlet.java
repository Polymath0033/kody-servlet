package com.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
       String copyrightYear = getServletConfig().getInitParameter("copyrightYear");
       if (copyrightYear != null) {
           System.out.println(copyrightYear);
       }


    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {}
}
