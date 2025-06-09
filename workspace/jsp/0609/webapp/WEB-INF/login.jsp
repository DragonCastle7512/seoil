<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div>
<%if(request.getSession().getAttribute("id") != null) {%>
<a href="/result">바로 로그인</a>
<% } else {%>
<form action="login_proc" method="post">
<input type="text" name="id" id="id" placeholder="아이디"><br>
<input type="password" name="password" id="password" placeholder="비밀번호"><br>
<a href="#">회원가입</a>
<a href="#">아이디찾기</a><a href="#">패스워드찾기</a>
<input type="submit" value="로그인">
</form>
<% }%>
</div>
</body>
</html>