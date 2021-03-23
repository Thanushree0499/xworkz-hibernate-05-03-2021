package com.xworkz.register;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.register.dao.RegisterDAO;
import com.xworkz.register.dao.RegisterDAOImpl;
import com.xworkz.register.dto.RegisterDTO;
import com.xworkz.register.service.RegisterService;
import com.xworkz.register.service.RegisterServiceImpl;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegisterServlet() {
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside servlet");
		String firstNameStr=request.getParameter("fname");
		String lastNameStr=request.getParameter("lname");
		String emailStr=request.getParameter("email");
		String adressStr=request.getParameter("address");
		String passwordStr=request.getParameter("pass");
		
		System.out.println("firstname entered is :"+firstNameStr);
		System.out.println("lastname entered is :"+lastNameStr);
		System.out.println("email entered is :"+emailStr);
		System.out.println("address entered is :"+adressStr);
		System.out.println("password entered is :"+passwordStr);
		
		RegisterDTO registerDTO=new RegisterDTO(firstNameStr,lastNameStr,emailStr,adressStr,passwordStr);
		
		RegisterDAO registerDAO=new RegisterDAOImpl();
		
		RegisterService registerService=new RegisterServiceImpl(registerDAO);
		
		registerService.validateAndSaveUserData(registerDTO);
		
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("Successfull.html");
		requestDispatcher.forward(request, response);	
		
	}

}
