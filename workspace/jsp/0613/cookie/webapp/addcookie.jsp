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
	Object sessionNum = request.getSession().getAttribute("num");
	System.out.println((String)sessionNum);
	int num = 1;
	if(sessionNum == null) {
		num = 1;
	} else {
		num = Integer.parseInt((String)sessionNum);
	}
	
	System.out.println(++num);
	request.getSession().setAttribute("num", String.valueOf(num));
	System.out.println((String)request.getSession().getAttribute("num"));
	
	Cookie cookie1 = new Cookie("product"+String.valueOf(num), "computer"+String.valueOf(num));
	response.addCookie(cookie1);
	%>
</body>
</html>