<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<c:if test="${corr eq 'fail'}">
<script>alert("로그인 실패");</script>
</c:if>
<c:if test="${not empty id}">
<h1>로그인된 상태</h1>
<a href="/logout">로그아웃</a>
</c:if>
<c:if test="${empty id}">
<form action="/login" method="post">
<input type="text" name="id" id="id" placeholder="아이디"><br>
<input type="password" name="password" id="password" placeholder="비밀번호"><br>
<a href="createMemberForm">회원가입</a>
<a href="#">아이디찾기</a>
<a href="#">패스워드찾기</a><br>
<input type="submit" value="로그인">
</form>
</c:if>
</div>
</body>
</html>