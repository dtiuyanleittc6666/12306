package com.neuedu.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
	    //1. 获得表单参数
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		if(name.equals("feiyy") || name.equals("admin"))
		{
			//验证成功
			//把用户名写在cookie里
			Cookie c = new Cookie("username",name);
			c.setMaxAge(7*24*60*60);
			//把cookie放在响应对象里
			response.addCookie(c);
			
			//把密码写在cookie里
			Cookie c2 = new Cookie("password",pass);
			c2.setMaxAge(7*24*60*60);
			//把cookie放在响应对象里
			response.addCookie(c2);
			//跳转到主页上
			response.sendRedirect("index.jsp");
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
	}

}
