<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>�� ����</title>
  <!-- Bootstrap 5 CDN -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

  <div class="container mt-5">
    <h2 class="mb-4">���� �Է� ��</h2>
    <form action="insert" method="post" class="border p-4 rounded bg-white shadow-sm">

      <div class="mb-3">
        <label for="name" class="form-label">�̸�</label>
        <input type="text" class="form-control" id="name" name="name" placeholder="�̸��� �Է��ϼ���">
      </div>

      <div class="mb-3">
        <label for="hp" class="form-label">�޴��� ��ȣ</label>
        <input type="text" class="form-control" id="hp" name="hp" placeholder="010-1234-5678">
      </div>

      <div class="mb-3">
        <label for="email" class="form-label">�̸���</label>
        <input type="email" class="form-control" id="email" name="email" placeholder="example@email.com">
      </div>

      <div class="mb-3">
        <label for="memo" class="form-label">�޸�</label>
        <textarea class="form-control" id="memo" name="memo" rows="4" placeholder="������ �Է��ϼ���"></textarea>
      </div>

      <button type="submit" class="btn btn-primary">����</button>
    </form>
  </div>

  <!---- Bootstrap JS (���û���) -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
