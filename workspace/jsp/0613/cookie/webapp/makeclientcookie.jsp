<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>Ŭ���̾�Ʈ���� ��Ű �����(������ �������)</h3>
<ul>
<li onclick="makecookie(this)">��ǰ1</li>
<li onclick="makecookie(this)">��ǰ2</li>
<li onclick="makecookie(this)">��ǰ3</li>
<li onclick="makecookie(this)">��ǰ4</li>
<li onclick="makecookie(this)">��ǰ5</li>
</ul>
<script>
var num = 1;
function makecookie(obj) {
	alert(obj.innerText+"�� ��ٱ��Ͽ� �߰� �Ǿ����ϴ�.");
	num++;
	document.cookie="prod"+num+"="+obj.innerText;
}
document.cookie = "prod1=make1";
document.cookie = "prod2=make2";
</script>
</body>
</html>