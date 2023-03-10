package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/logos")
public  class logout extends HttpServlet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
	PrintWriter out=response.getWriter();
	String u=request.getParameter("user");
	String p=request.getParameter("pass"); 

	request.getRequestDispatcher("link.html").include(request, response);
	if(p.equals("159"))
	{
	Cookie ck=new Cookie("user","");
	 ck.setMaxAge(1*60);  
     response.addCookie(ck); 
     response.sendRedirect("index.html");
     out.print("you are successfully logged out!");  
 }  
	else
	{
		out.println("password error");
	}
}

}
