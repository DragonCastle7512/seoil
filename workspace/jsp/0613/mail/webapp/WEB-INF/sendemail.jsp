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
	<input type="email" name="recvmail" placeholder="받는주소입력"><br>
	<input type="text" name="subject" placeholder="제목입력"><br>
<!-- 	<input type="text" name="recvmail" placeholder="내용입력"><br> -->
	<textarea rows="10" cols="20" name="content"></textarea><br>
	<input type="submit" value="메일보내기">
</form>
</body>
</html>