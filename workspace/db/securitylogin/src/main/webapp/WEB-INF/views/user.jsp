<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>user 페이지</h1>
<p>Authenticated User: <sec:authentication property="name" /></p>
<form id="logoutForm" action="/logout" method="post" style="display: inline;">
  <button type="submit">로그아웃</button>
  <input type="hidden" name="${ _csrf.parameterName }" value="${ _csrf.token }">
</form>
</body>
</html>