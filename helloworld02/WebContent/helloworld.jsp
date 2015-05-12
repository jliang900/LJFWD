<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hola!</title>
</head>
<body>
	<%!public String hola(String obj) {
		return "Hola, " + obj;
	}%>
	Message from
	<b>Scriptlet</b>:
	<%
		hola("World");
	%><br /> Message from
	<b>Expression</b>:
	<%=hola("World")%><br />
	<jsp:useBean id="user" class="com.apress.jspactions.User"></jsp:useBean>
	<jsp:setProperty name="user" property="name" value="Josh" />
	Message from
	<b>jsp property</b>: Hello,
	<jsp:getProperty name="user" property="name" />
</body>
</html>