<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
<% 
Cookie[] cookies = request.getCookies();
if(cookies != null) {
	for(Cookie cookie : cookies) {
		cookie.setMaxAge(0);
		response.addCookie(cookie);
	}
}
%>