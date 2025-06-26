<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>게시글 상세</title>
  <!-- Bootstrap 5 CDN -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    .content-box {
      white-space: pre-wrap;
      line-height: 1.6;
    }
    .card-title {
      font-size: 1.75rem;
      font-weight: bold;
    }
    .card-subtitle {
      color: #666;
    }
    .attachment-box {
      background-color: #f8f9fa;
      padding: 10px;
      border-radius: 6px;
    }
  </style>
</head>
<body class="bg-light">
  <div class="container mt-5">
    <div class="card shadow-sm">
      <div class="card-body">
        <h2 class="card-title mb-3">${ page.title }</h2>
        <h6 class="card-subtitle mb-4 text-muted">작성자: ${ page.author }</h6>
        
        <div class="content-box mb-4">
          ${ page.content }
        </div>

        <div class="attachment-box mb-4">
          첨부파일: ${ page.attachment }
        </div>

        <div class="d-flex justify-content-between">
          <div>
          	<button onclick="location.href='/reboard/updateform?id=${ page.id }'" class="btn btn-primary">수정</button>
          	<button onclick="location.href='/reboard/delete?id=${ page.id }'" class="btn btn-primary">삭제</button>
          </div>
          <button onclick="location.href='/reboard/reply?id=${ page.id }'" class="btn btn-success">댓글 쓰기</button>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
