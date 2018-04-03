package com.neuedu.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Logincookie
 */
@WebServlet("/Logincookie")
public class Logincookie extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*//创建cookei对象（key,value）注意：value默认不支持中文
		//如果设置了时间就存在本地（C盘）的硬盘中，反之浏览器窗口中
		Cookie c=new Cookie("pwd","123");
		//设置Cookie的生命周期单位是秒
		c.setMaxAge(7*24*60*60);//一周
		//把kookie放在response对象中
		response.addCookie(c);
		//重定向跳转到客户端界面
		response.sendRedirect("index.jsp");*/
		String realname=request.getParameter("username");
		String pwd=request.getParameter("password");
		System.out.println(realname);
		System.out.println(pwd);
		if (realname.equals("yanlei")&&pwd.equals("666")) {
			Cookie c=new Cookie("rel",realname);
			c.setMaxAge(7*24*60*60);
			response.addCookie(c);
			
			Cookie c1=new Cookie("pwsd",pwd);
			System.out.println(pwd);
			c1.setMaxAge(7*24*60*60);
			response.addCookie(c1);
			
			response.sendRedirect("index.jsp");//如果用户名正确成功跳转到主页上
		} else {
			response.sendRedirect("cookitest.jsp");//反之留在cookitest.jsp
		}
		
		
		
	}

}
