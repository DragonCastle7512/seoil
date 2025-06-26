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
    <h2 class="mb-4">정보 입력 폼</h2>
    <form action="/reboard/write" method="post" class="border p-4 rounded bg-white shadow-sm" enctype="multipart/form-data">

      <div class="mb-3">
        <label for="title" class="form-label">제목</label>
        <input type="text" class="form-control" id="title" name="title" placeholder="타이틀을 입력하세요">
      </div>
      
      <div class="mb-3">
        <label for="author" class="form-label">작성자</label>
        <input type="text" class="form-control" id="author" name="author" placeholder="작성자를 입력하세요">
      </div>

      <div class="mb-3">
        <label for="content" class="form-label">내용</label>
        <textarea class="form-control" id="content" name="content" rows="4" placeholder="내용을 입력하세요"></textarea>
      </div>

      <div class="mb-3">
        <label for="attechment" class="form-label">붙임</label>
        <input type="file" class="form-control" id="attachment" name="attachment">
      </div>

      <button type="submit" class="btn btn-primary">제출</button>
      <a href="/" class="btn btn-outline-primary">
		<i class="bi bi-house-door-fill"></i> Home
	  </a>
    </form>
  </div>

  <!---- Bootstrap JS (선택사항) -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
