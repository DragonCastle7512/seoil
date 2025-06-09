<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
request:<%=request.getAttribute("id") %><br>
session:<%=request.getSession().getAttribute("id") %><br>
context(application):
<%=request.getServletContext().getAttribute("id") %><br>
<a href="/login">로그인페이지이동</a>
<a href="/logout">로그아웃</a>