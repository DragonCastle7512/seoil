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