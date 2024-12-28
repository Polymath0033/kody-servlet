package com.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegistrationServlet", value = "/register")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //setting form value later
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String age = request.getParameter("age");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirm-password");
        if(name == null || email == null || age == null || password == null || confirmPassword == null) {
            request.setAttribute("error", "Please fill all the required fields");
            getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
            System.out.println("hello");
        }else{
            if(!password.equalsIgnoreCase(confirmPassword)) {
                request.setAttribute("error","The password do not match");
                doGet(request, response);
                System.out.println("hi");
            }else {
                System.out.println("The account has been created");
                System.out.println("good");
            }

        }

      //  System.out.println("Form received successfully");
    }
}