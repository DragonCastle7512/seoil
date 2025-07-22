<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
System.out.println("hello"); 
String msg = "hello java";
%>
<%=msg%>

<%
request.setAttribute("name", "o");
session.setAttribute("name", "value");
application.setAttribute("name", "value");

pageContext.getRequest();
ServletRequest req = pageContext.getRequest();
HttpServletRequest req2 = (HttpServletRequest)pageContext.getRequest();
%>