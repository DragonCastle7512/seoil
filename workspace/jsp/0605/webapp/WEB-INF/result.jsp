<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String res = (String)request.getAttribute("state");
String message = "";
switch(res) {
	case "insert success":message = "전화번호 삽입 성공"; break;
	case "insert fail":message = "전화번호 삽입 실패"; break;
	case "update success":message = "전화번호 업데이트 성공"; break;
	case "update fail":message = "전화번호 업데이트 실패"; break;
	case "delete success": message = "전화번호 삭제 성공"; break;
	case "delete fail": message = "전화번호 삭제 실패"; break;
}
%>
<script>
alert("<%=message%>");
location.href = "/list";
</script>