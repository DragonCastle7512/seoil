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
	<button class="btn btn-primary" onclick="location.href='/contacts/new'">추가</button>
    
    <!-- 게시판 테이블 -->
    <table class="table table-bordered table-hover text-left align-center">
      <thead class="table-light">
        <tr>
          <th scope="col">이름</th>
          <th scope="col">전화번호</th>
          <th scope="col">이메일</th>
          <th scope="col">상세보기 | 수정 | 삭제</th>
        </tr>
      </thead>
      <tbody>
        <!-- 예시 데이터 -->
        <c:forEach var="con" items="${ page.list }">
        	<tr>
	          <td name="name">${ con.name }</td>
	          <td name="hp">${con.hp }</td>
	          <td name="author">${ con.email }</td>
	          <td name="detail">
	          	<a href="contacts/?id=${ con.id }">[ 보기 ]</a>
	          	<a href="contacts/edit?id=${con.id}">[ 수정 ]</a>
	          	<a href="contacts/delete?id=${con.id }" onclick="return confirm('정말로 삭제하시겠습니까?')">[ 삭제 ]</a>
	          </td>
	        </tr>
        </c:forEach>
      </tbody>
    </table>

    <!-- 페이지 네비게이션 -->
    <nav aria-label="페이지 네비게이션">
      <ul class="pagination justify-content-center">
      	<!-- 이전 페이지 -->
        <li class="page-item ${ page.pre ? '' : 'disabled' }">
          <a class="page-link " href="/contacts?requestPage=${ page.startPage - page.pageCount }" tabindex="-1">이전</a>
        </li>
        <!-- 페이지 이동 -->
        <c:forEach begin="${ page.startPage }" end="${ page.endPage }" step="1" var="i">
        	<li class="page-item active">
	        	<a class="page-link active" href="/contacts?requestPage=${ i }">${ i }</a>
	        </li>
        </c:forEach>
	    <!-- 다음 페이지 -->
        <li class="page-item ${ page.next ? '' : 'disabled' }">
          <a class="page-link" href="/contacts?requestPage=${ page.startPage + page.pageCount }">다음</a>
        </li>
      </ul>
    </nav>
  </div>
 
</body>
</html>