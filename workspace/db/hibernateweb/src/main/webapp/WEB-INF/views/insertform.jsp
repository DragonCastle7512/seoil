<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/insert" method="post">
		<label for="sid">학번: </label><input type="text" name="sid" id="sid"><br>
		<label for="name">이름: </label><input type="text" name="name" id="name"><br>
		<label for="hp">전화번호: </label><input type="text" name="hp" id="hp"><br>
		<input type="submit" value="학생정보입력">
	</form>
</body>
</html>