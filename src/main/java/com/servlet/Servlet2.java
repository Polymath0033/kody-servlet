package com.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet2", urlPatterns = "/hello2", initParams = {@WebInitParam(name="copyrightYear",value = "2025")})
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String copyrightYear = getServletConfig().getInitParameter("copyrightYear");
        if(copyrightYear != null){

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}