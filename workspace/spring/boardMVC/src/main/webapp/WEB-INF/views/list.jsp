<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>게시판 테이블[pageList]</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="p-4">
  <div class="container">
    <h2 class="mb-4">📋 게시판</h2>
	<div>${ pageList.totalCount }개의 글(${ pageList.currentPage }/${ pageList.totalPage })</div>
	<button class="btn btn-primary" onclick="location.href='/board/writeform'">글쓰기</button>
    <!-- 게시판 테이블 -->
    <table class="table table-bordered table-hover text-center align-middle">
      <thead class="table-light">
        <tr>
          <th scope="col">ID</th>
          <th scope="col">제목</th>
          <th scope="col">작성자</th>
          <th scope="col">작성일</th>
          <th scope="col">조회수</th>
        </tr>
      </thead>
      <tbody>
        <!-- 예시 데이터 -->
        <c:forEach var="board" items="${ pageList.list }">
        	<tr>
	          <td name="id">${ board.id }</td>
	          <td name="title">${ board.title }</td>
	          <td name="author">${ board.author }</td>
	          <td name="createdate"><fmt:formatDate value="${ board.createDate }" pattern="yyyy년 MM월 dd일"/></td>
	          <td name="viewcnt">${ board.viewcnt }</td>
	        </tr>
        </c:forEach>
      </tbody>
    </table>

    <!-- 페이지 네비게이션 -->
    <nav aria-label="페이지 네비게이션">
      <ul class="pagination justify-content-center">
      	<!-- 이전 페이지 -->
        <li class="page-item ${ pageList.pre ? '' : 'disabled' }">
          <a class="page-link " href="/board/list?requestPage=${ pageList.startPage - pageList.pageCount }" tabindex="-1">이전</a>
        </li>
        <!-- 페이지 이동 -->
        <c:forEach begin="${ pageList.startPage }" end="${ pageList.endPage }" step="1" var="i">
        	<li class="page-item active">
	        	<a class="page-link active" href="/board/list?requestPage=${ i }">${ i }</a>
	        </li>
        </c:forEach>
	    <!-- 다음 페이지 -->
        <li class="page-item ${ pageList.next ? '' : 'disabled' }">
          <a class="page-link" href="/board/list?requestPage=${ pageList.startPage + pageList.pageCount }">다음</a>
        </li>
      </ul>
    </nav>
  </div>
 
</body>
</html>