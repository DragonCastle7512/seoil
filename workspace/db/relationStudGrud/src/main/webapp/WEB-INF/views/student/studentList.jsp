<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>학생 목록과 성적</title>
</head>
<body>
    <h1>학생 성적 조회</h1>
    <table>
    	<thead>
    	<tr>
	    	<th>아이디</th>
	    	<th>이름</th>
	    	<th>과목</th>
	    	<th>성적</th>
	    </tr>
    	</thead>
    	<tbody>
    	<c:forEach var="student" items="${students}">
    	<tr>
    		<td>${student.studentId}</td>
    		<td>${student.name}</td>
    		<td>${student.major}</td>
    		<td>${student.grades}</td>
    	</tr>
    	</c:forEach>
    	</tbody>
    </table>
</body>
</html>