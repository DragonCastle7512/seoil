<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	쿠키는 클라이언트(웹브라우저)에서 데이터를 저장하는 객체
	<%
	Cookie[] cookies = request.getCookies();
	for(Cookie cookie : cookies) {
		out.print(cookie.getName());
		out.print(cookie.getValue());
		out.print("<br>");
	}
	%>
</body>
</html>