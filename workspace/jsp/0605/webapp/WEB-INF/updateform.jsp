<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container-fluid">
	<form action="/update" method="post" enctype="multipart/form-data">
	<div class="h3 text-center pb-3">
	<h3>전화번호부 수정</h3>
	</div>
	<div class="pb-3">
	<label class="form-label" for="id">아이디</label>
	<input class="form-control" type="text" value="${pb.id}" disabled="disabled">
	<input class="form-control" type="hidden" id="id" name="id" value="${pb.id}" readonly>
	</div>
	<div class="pb-3">
	<label class="form-label" for="name">이름</label>
	<input class="form-control" type="text" id="name" name="name" required value="${pb.name}">
	</div>
	<div class="pb-3">
	<label class="form-label" for="pb">전화번호</label>
	<input class="form-control" type="text" id="hp" name="hp" required value="${pb.hp}">
	</div>
	<div class="pb-3">
	<label class="form-label" for="email">이메일</label>
	<input class="form-control" type="text" id="email" name="email" required value="${pb.email}">
	</div>
	<div class="pb-3">
	<label class="form-label" for="memo">메모</label>
	<input class="form-control" type="text" id="memo" name="memo" required value="${pb.memo}">
	</div>
	<div class="pb-3">
	<label class="form-label" for="file">사진</label>
	<input class="form-control" type="file" id="file" name="file" value="${pb.imgfilename}">
	</div>
	<input class="form-control btn btn-primary mb-2" type="submit" value="수정하기">
	<input class="form-control btn btn-primary" type="button" value="취소하기"
	onclick="location.href='/list'">
</form>
</div>
</body>
</html>