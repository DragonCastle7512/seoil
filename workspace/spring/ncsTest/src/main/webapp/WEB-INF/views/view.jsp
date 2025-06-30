<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="EUC-KR">
  <title>회원 상세 정보</title>
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <!-- Bootstrap Icons CDN -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
  <div class="card shadow-sm">
    <div class="card-header bg-primary text-white">
      <h4 class="mb-0">회원 상세 정보 🧾</h4>
    </div>
    <div class="card-body">
  <table class="table table-bordered table-striped">
      <tr>
        <th scope="row" class="bg-light">이름</th>
        <td>${con.id}</td>
      </tr>
      <tr>
        <th scope="row" class="bg-light">전화번호</th>
        <td>${con.hp}</td>
      </tr>
      <tr>
        <th scope="row" class="bg-light">이메일</th>
        <td>${con.email}</td>
      </tr>
      <tr>
        <th scope="row" class="bg-light">주소</th>
        <td>${con.address}</td>
      </tr>
      <tr>
        <th scope="row" class="bg-light">이름</th>
        <td>${con.memo}</td>
      </tr>
  </table>
   <a href="/contacts" class="btn btn-outline-primary">뒤로가기</a>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
