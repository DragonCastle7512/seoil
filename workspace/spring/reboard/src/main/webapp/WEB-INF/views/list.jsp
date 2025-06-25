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
	<div>${ page.totalCount }개의 글(${ page.currentPage }/${ page.totalPage })</div>
	<button class="btn btn-primary" onclick="location.href='/reboard/writeform'">글쓰기</button>
    <!-- 게시판 테이블 -->
    <table class="table table-bordered table-hover text-left align-center">
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
        <c:forEach var="board" items="${ page.list }">
        	<tr onclick="location.href='/reboard/view?id=${ board.id }'">
	          <td name="id">${ board.id }</td>
	          <td>${ board.parentid }</td>
	          <td name="title">
	          		<c:if test="${ board.parentid > 0 }">
	          			<c:forEach begin="1" end="${ board.tab }" step="1">
	          				&nbsp;&nbsp;
	          			</c:forEach>
	          			[댓글]
	          		</c:if>
		          ${ board.title }
	          </td>
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
        <li class="page-item ${ page.pre ? '' : 'disabled' }">
          <a class="page-link " href="/reboard/list?requestPage=${ page.startPage - page.pageCount }" tabindex="-1">이전</a>
        </li>
        <!-- 페이지 이동 -->
        <c:forEach begin="${ page.startPage }" end="${ page.endPage }" step="1" var="i">
        	<li class="page-item active">
	        	<a class="page-link active" href="/reboard/list?requestPage=${ i }">${ i }</a>
	        </li>
        </c:forEach>
	    <!-- 다음 페이지 -->
        <li class="page-item ${ page.next ? '' : 'disabled' }">
          <a class="page-link" href="/reboard/list?requestPage=${ page.startPage + page.pageCount }">다음</a>
        </li>
      </ul>
    </nav>
  </div>
 
</body>
</html>