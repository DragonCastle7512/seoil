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
    <form action="/contacts/newProc" method="post" class="border p-4 rounded bg-white shadow-sm">

      <div class="mb-3">
        <label for="name" class="form-label">이름</label>
        <input type="text" class="form-control" id="name" name="name" placeholder="이름을 입력하세요" required>
      </div>

      <div class="mb-3">
        <label for="hp" class="form-label">전화번호</label>
        <input type="tel" class="form-control" id="hp" name="hp" placeholder="010-1234-5678" required pattern="^01[016789]-?\d{3,4}-?\d{4}$">
      </div>

      <div class="mb-3">
        <label for="email" class="form-label">이메일</label>
        <input type="email" class="form-control" id="email" name="email" placeholder="example@email.com">
      </div>
	  <div class="mb-3">
        <label for="memo" class="form-label">주소</label>
        <input type="text" class="form-control" id="address" name="address" placeholder="주소를 입력하세요">
      </div>
      <div class="mb-3">
        <label for="memo" class="form-label">메모</label>
        <textarea class="form-control" id="memo" name="memo" rows="4" placeholder="내용을 입력하세요"></textarea>
      </div>

      <button type="submit" class="btn btn-primary">저장</button>
      <a href="/contacts" class="btn btn-outline-primary">취소</a>
    </form>
  </div>

  <!---- Bootstrap JS (선택사항) -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
