<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div class="container mt-5">
<c:if test="${not empty pb}">
	<div class="mb-4">
	<h2 class="d-flex justify-content-center">전화번호 상세보기</h2>
	</div>
	<div>
	<table class="table table-hover">
	<thead class="table-success">
	<tr>
		<th>이미지</th>
		<th>아이디</th>
		<th>이름</th>
		<th>전화번호</th>
		<th>이메일</th>
		<th>메모</th>
	</tr>
	</thead>
	<tbody>
	<tr>
		<td><img src="/img/${pb.imgfilename}" width="75" height="75"
			alt="${pb.imgfilename}" style="border-radius: 100%; border: 1px solid black; padding: 5px 5px"></td>
		<td>${pb.id}</td>
		<td>${pb.name}</td>
		<td>${pb.hp}</td>
		<td>${pb.email}></td>
		<td>${pb.memo}</td>
	</tr>
	</tbody>
	</table>
	</div>
	<button class="btn btn-outline-success" onclick="location.href='/updateform?id=${pb.id}'">수정</button>
	<button class="btn btn-outline-success" onclick="location.href='/delete?id=${pb.id}'">삭제</button>
</c:if>
<c:if test="${empty pb}">
	<script>
	alert("찾는 아이디가 없습니다.");
	location.href ="/searchid.html";
	</script>
</c:if>
</div>
</body>
</html>