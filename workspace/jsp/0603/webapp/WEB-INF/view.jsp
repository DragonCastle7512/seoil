<%@page import="java.util.List"%>
<%@page import="phonebook.Phonebook"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<%
Phonebook pb = (Phonebook)request.getAttribute("pb");%>
<% if(pb != null) {%>
<div class="container mt-5">
<div class="mb-4">
<h2 class="d-flex justify-content-center">전화번호 상세보기</h2>
</div>
<div>
<table class="table table-hover">
<thead class="table-success">
<tr>
	<th>아이디</th>
	<th>이름</th>
	<th>전화번호</th>
	<th>이메일</th>
	<th>메모</th>
</tr>
</thead>
<tbody>
<tr>
	<td><%=pb.getId()%></td>
	<td><%=pb.getName()%></td>
	<td><%=pb.getHp()%></td>
	<td><%=pb.getEmail()%></td>
	<td><%=pb.getMemo()%></td>
</tr>
</tbody>
</table>
</div>
<button class="btn btn-outline-success" onclick="location.href='/phonebook/updateform?id=<%=pb.getId()%>'">수정</button>
<button class="btn btn-outline-success" onclick="location.href='/phonebook/delete?id=<%=pb.getId()%>'">삭제</button>
<%}
else {%>
<script>
alert("찾는 아이디가 없습니다.");
location.href ="/searchid.html";
</script>
<%}%>
</div>
</body>
</html>