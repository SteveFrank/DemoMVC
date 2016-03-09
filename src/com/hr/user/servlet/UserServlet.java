package com.hr.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hr.user.service.impl.UserServiceImpl;

public class UserServlet extends HttpServlet {

	UserServiceImpl userServiceImpl = new UserServiceImpl();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		
		String method = request.getParameter("method");
		
		if(method.equals("login")){
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			if(userServiceImpl.loginUser(username, password)){
				request.getRequestDispatcher("success.jsp").forward(request, response);
			} else {
				request.setAttribute("msg", "您输入的密码或用户名错误请重新输入");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			} 
		}
	}

}
