<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <%
       String username = "";
       String password ="";
       Cookie[] cs = request.getCookies();
       if(cs!=null)
       {
    	   for(int i=0; i<cs.length;i++)
    	   {
    		   Cookie c = cs[i];
    		   if(c.getName().equals("username"))
    		   {
    			   username = c.getValue();
    		   }
    		   if(c.getName().equals("password"))
    		   {
    			   password = c.getValue();
    		   }
    	   }
       }
   %>
   <form action="LoginServlet" method="post">
       <input type="text" name="username" value="<%=username%>"/>
       <input type="password" name="password" value="<%=password%>"/>
       <button type="submit">登录</button>
   </form>

</body>
</html>