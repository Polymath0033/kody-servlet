package com.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "NameServlet", value = "/name")
public class NameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String firstName = request.getParameter("firstName");
//        String lastName = request.getParameter("lastName");
//
//        if(firstName != null && lastName != null) {
//            System.out.println("Hello "+firstName+ " "+lastName+" nice to meet you");
//        }else{
//            System.out.println("A fullname was not provided");
        //}
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
            request.setAttribute("firstName", firstName);
            request.setAttribute("lastName", lastName);
            request.setAttribute("age", age);
        }
        getServletContext().getRequestDispatcher("/other").forward(request, response);
        System.out.println(firstName + " " + lastName + " " + age);
        //request.getParameter()
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}