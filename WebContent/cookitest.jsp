<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
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
	String UsernameValue="";
	String PsswordValue="";
	Cookie[] cs=request.getCookies();/*获取后台的Cookie*/
	
	if(cs!=null){
		
		for(int i=0;i<cs.length;i++){
			
			
			
			Cookie c=cs[i];
		
			if(c.getName().equals("rel")){
				
				UsernameValue=c.getValue();
				%>
				<%=UsernameValue %>
				<%
			}
			if(c.getName().equals("pwsd")){
				PsswordValue=c.getValue();
				%>
				<%=PsswordValue %>
				<%
				
			}
		}
	}
	%>
  <form action="Logincookie" method="post">
    <input type="text"  name="username" value="<%=UsernameValue%>"/>
    <input type="text"  name="password" value="<%=PsswordValue%>"/>
    <button type="submit">提交</button>
  </form>
</body>
</html>