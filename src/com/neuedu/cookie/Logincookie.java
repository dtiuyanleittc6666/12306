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
		/*//����cookei����key,value��ע�⣺valueĬ�ϲ�֧������
		//���������ʱ��ʹ��ڱ��أ�C�̣���Ӳ���У���֮�����������
		Cookie c=new Cookie("pwd","123");
		//����Cookie���������ڵ�λ����
		c.setMaxAge(7*24*60*60);//һ��
		//��kookie����response������
		response.addCookie(c);
		//�ض�����ת���ͻ��˽���
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
			
			response.sendRedirect("index.jsp");//����û�����ȷ�ɹ���ת����ҳ��
		} else {
			response.sendRedirect("cookitest.jsp");//��֮����cookitest.jsp
		}
		
		
		
	}

}
