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
<h1>모두 접속가능한 all page입니다.</h1>
<p>Authenticated User: <sec:authentication property="name" /></p>
<%-- <sec:authentication property="principal" var="user" />
<p>Authenticated User: ${ user.username }</p> --%>

<form id="logoutForm" action="/logout" method="post" style="display: inline;">
  <button type="submit">로그아웃</button>
</form>
</body>
</html>