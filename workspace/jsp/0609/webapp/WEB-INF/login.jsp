<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div>
<%if(request.getSession().getAttribute("id") != null) {%>
<a href="/result">�ٷ� �α���</a>
<% } else {%>
<form action="login_proc" method="post">
<input type="text" name="id" id="id" placeholder="���̵�"><br>
<input type="password" name="password" id="password" placeholder="��й�ȣ"><br>
<a href="#">ȸ������</a>
<a href="#">���̵�ã��</a><a href="#">�н�����ã��</a>
<input type="submit" value="�α���">
</form>
<% }%>
</div>
</body>
</html>