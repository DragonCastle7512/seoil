<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
request:<%=request.getAttribute("id") %><br>
session:<%=request.getSession().getAttribute("id") %><br>
context(application):
<%=request.getServletContext().getAttribute("id") %><br>
<a href="/login">�α����������̵�</a>
<a href="/logout">�α׾ƿ�</a>