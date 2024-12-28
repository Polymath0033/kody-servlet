package com.servlet;

import model.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PersonServlet", value = "/person")
public class PersonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");
        StringBuilder error = new StringBuilder();
        if(firstName==null){
            error.append("A First name was not provided \n");
        }else if(lastName==null){
            error.append("A Last name was not provided \n");
        }else if(age==null){
            error.append("A age was not provided \n");
        }
        if(error.length()>0){
            request.setAttribute("error", error.toString());
        }else{
            request.setAttribute("person", new Person(firstName, lastName, Integer.parseInt(age)));
        }
        getServletContext().getRequestDispatcher("/name.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}