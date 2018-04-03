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
	    //1. ��ñ�����
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		if(name.equals("feiyy") || name.equals("admin"))
		{
			//��֤�ɹ�
			//���û���д��cookie��
			Cookie c = new Cookie("username",name);
			c.setMaxAge(7*24*60*60);
			//��cookie������Ӧ������
			response.addCookie(c);
			
			//������д��cookie��
			Cookie c2 = new Cookie("password",pass);
			c2.setMaxAge(7*24*60*60);
			//��cookie������Ӧ������
			response.addCookie(c2);
			//��ת����ҳ��
			response.sendRedirect("index.jsp");
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
	}

}
