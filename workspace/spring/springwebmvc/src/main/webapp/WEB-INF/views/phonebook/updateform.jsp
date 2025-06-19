<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>폼 예제</title>
  <!-- Bootstrap 5 CDN -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
  <div class="container mt-5">
    <h2 class="mb-4">정보 수정 폼</h2>
    <form action="/phonebook/update" method="post" class="border p-4 rounded bg-white shadow-sm">

	  <div class="mb-3">
        <label for="id" class="form-label">아이디</label>
        <input type="text" class="form-control" id="id" name="id" value="${pb.id}" readonly>
      </div>
      <div class="mb-3">
        <label for="name" class="form-label">이름</label>
        <input type="text" class="form-control" id="name" name="name" value="${pb.name}">
      </div>

      <div class="mb-3">
        <label for="hp" class="form-label">휴대폰 번호</label>
        <input type="text" class="form-control" id="hp" name="hp" value="${pb.hp}">
      </div>

      <div class="mb-3">
        <label for="email" class="form-label">이메일</label>
        <input type="email" class="form-control" id="email" name="email" value="${pb.email}">
      </div>

      <div class="mb-3">
        <label for="memo" class="form-label">메모</label>
        <textarea class="form-control" id="memo" name="memo" rows="4">${pb.memo}</textarea>
      </div>

      <button type="submit" class="btn btn-primary">전화번호 수정</button>
      <a href="/" class="btn btn-outline-primary">
		<i class="bi bi-house-door-fill"></i> Home
	  </a>
    </form>
  </div>

  <!---- Bootstrap JS (선택사항) -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
