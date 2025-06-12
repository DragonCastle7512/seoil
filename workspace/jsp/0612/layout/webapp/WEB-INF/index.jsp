<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
//request.setAttribute("mainpage", "createMemberForm");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/menu.css">
</head>
<body>
<jsp:include page="/WEB-INF/header.jsp"/>
<main>
<jsp:include page="/WEB-INF/${mainpage}.jsp"/>
</main>
<jsp:include page="/WEB-INF/footer.jsp"/>
</body>
</html>