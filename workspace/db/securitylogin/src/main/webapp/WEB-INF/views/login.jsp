<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>login 페이지</h1>
<form action="/login" method="post">
	<label for="username">ID</label>
	<input type="text" name="username" id="username"><br>
	<label for="password">Password</label>
	<input type="password" name="password" id="password"><br>
	<input type="submit" value="login"><br>
	<input type="hidden" name="${ _csrf.parameterName }" value="${ _csrf.token }">
</form>
</body>
</html>