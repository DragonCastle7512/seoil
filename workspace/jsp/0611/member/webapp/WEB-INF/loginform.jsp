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
<script>alert("�α��� ����");</script>
</c:if>
<c:if test="${not empty id}">
<h1>�α��ε� ����</h1>
<a href="/logout">�α׾ƿ�</a>
</c:if>
<c:if test="${empty id}">
<form action="/login" method="post">
<input type="text" name="id" id="id" placeholder="���̵�"><br>
<input type="password" name="password" id="password" placeholder="��й�ȣ"><br>
<a href="createMemberForm">ȸ������</a>
<a href="#">���̵�ã��</a>
<a href="#">�н�����ã��</a><br>
<input type="submit" value="�α���">
</form>
</c:if>
</div>
</body>
</html>