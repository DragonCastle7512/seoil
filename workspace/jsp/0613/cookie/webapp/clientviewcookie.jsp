<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	��Ű�� Ŭ���̾�Ʈ(��������)���� �����͸� �����ϴ� ��ü
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