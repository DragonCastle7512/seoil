<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>key event</h1>
<p></p>
<script>
const body = document.querySelector("body");
let message = "";
body.addEventListener("keydown", (e) => {
	//console.log(e);
	//console.log(e.key);
	//console.log(e.keyCode);
	if(e.key === "Enter") {
		console.log("출력값: "+message);
		message = "";
		return;
	}
	message += e.key;
});
</script>
<script>
websocket.onmessage=function (message){
	console.log(message); //json객체형식의 답변	
	console.log(message.data); //필요로 하는 데이터만 추출
	//messagebox.textContent+=message.data+"<br>";
	//messagebox.innerHTML+=message.data+"<br>";

	//message가 json형식의 문자열일 경우 객체로 변환
	let obj=JSON.parse(message.data);
	messagebox.innerHTML+="["+obj.nickname +"]:"+obj.message+"<br>";
	}
</script>
</body>
</html>