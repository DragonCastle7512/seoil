<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="/mail/sendmail" method="post">
	<input type="email" name="recvmail" placeholder="�޴��ּ��Է�"><br>
	<input type="text" name="subject" placeholder="�����Է�"><br>
<!-- 	<input type="text" name="recvmail" placeholder="�����Է�"><br> -->
	<textarea rows="10" cols="20" name="content"></textarea><br>
	<input type="submit" value="���Ϻ�����">
</form>
</body>
</html>