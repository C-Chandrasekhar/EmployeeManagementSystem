package com.db.employeemanagementsystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

import com.db.employeemanagementsystem.bean.LoginBean;
import com.db.employeemanagementsystem.service.LoginService;
import com.db.employeemanagementsystem.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName= request.getParameter("userName");
		String password= request.getParameter("password");
		
//		System.out.println(userName+" "+password);
		// request dispatchers forward method
		// sendredirect method
		
		// for internal switching between components use request dispatchers
		// send redirect -- external switching 
		RequestDispatcher dispatcher = null;
		
//		if(userName.equals("admin") && password.equals("admin") ) {
//			//response.sendRedirect("adminHomePage.html");
//			dispatcher = request.getRequestDispatcher("adminHomePage.html");
//			dispatcher.forward(request, response);
//		}
//		else {
//			response.sendRedirect("login.html");
//		}
		
		LoginBean login = new LoginBean(userName, password);
		
		LoginService loginService = new LoginServiceImpl();
		if(loginService.authenticate(login) ) {
//			dispatcher = request.getRequestDispatcher("adminHomePage.html");
//			dispatcher.forward(request, response);
			response.sendRedirect("adminHomePage.html");
		}
		else {
			response.sendRedirect("login.html");
		}
		
	}

}
