package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/log")
public class login extends HttpServlet {
public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
	PrintWriter out=response.getWriter();
	 request.getRequestDispatcher("link.html").include(request, response);
	String u=request.getParameter("user");
	String p=request.getParameter("pass"); 

	if(p.equals("159"))
	
	{
		out.println("you are successfully logged in");
		out.println("<br> welcome"+  u);
		 
		Cookie ck=new Cookie("user",u);
		response.addCookie(ck);
				
	}
	else
	{
		out.println( "<h1 style=color:red>USERNAME OR PASSWORD ERROR!!!!!</h1>");
	  
	 request.getRequestDispatcher("login.html").include(request,response);
	}
	
	
	
	out.close();
	
}
 
}
