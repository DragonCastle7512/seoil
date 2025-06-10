<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
request:${requestScope.id}<br>
session:${sessionScope.id}<br>
context(application):${applicationScope.id}<br>
<a href="/loginform">로그인페이지이동</a>