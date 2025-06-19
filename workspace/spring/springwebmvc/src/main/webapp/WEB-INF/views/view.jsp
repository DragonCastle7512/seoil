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
    <tbody>
      <tr>
        <th scope="row" class="bg-light">아이디</th>
        <td>${pb.id}</td>
      </tr>
      <tr>
        <th scope="row" class="bg-light">이름</th>
        <td>${pb.name}</td>
      </tr>
      <tr>
        <th scope="row" class="bg-light">전화번호</th>
        <td>${pb.hp}</td>
      </tr>
      <tr>
        <th scope="row" class="bg-light">이메일</th>
        <td>${pb.email}</td>
      </tr>
      <tr>
        <th scope="row" class="bg-light">메모</th>
        <td>${pb.memo}</td>
      </tr>
    </tbody>
  </table>
</div>
    <div class="card-footer d-flex justify-content-between">
      <!-- 🏠 Home 버튼 -->
      <a href="/" class="btn btn-outline-primary">
        <i class="bi bi-house-door-fill"></i> Home
      </a>
      <!-- 목록 버튼 -->
      <div class="ml 3">
      <!-- <a href="javascript:updatebtn(this)" class="btn btn-secondary">수정하기</a> -->
      <a href="/phonebook/updateform?id=${pb.id}" class="btn btn-secondary">수정하기</a>
      <a href="/phonebook/delete?id=${pb.id}" class="btn btn-secondary">삭제하기</a>
      </div>
    </div>
  </div>
</div>

<script>
function updatebtn(obj) {
	let tds = document.querySelectorAll("td");
	tds.forEach((td) => {
		console.log(td);
		td.setAttribute('contenteditable', 'true');
		td.style.backgroundColor = "#ffffcc";
	});
}
</script>
<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
