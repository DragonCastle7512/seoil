<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/webapp/index.jsp</title>
</head>
<body>
<h1>websocket</h1>
<fieldset>
<legend>채팅</legend>
<div>
보낼메세지:<input type="text" id="message">
<input type="button" id="sendbtn" value="보내기"> 
</div>
<p>
<div id="messagebox" style="border: 1px solid gray; height: 50px; overflow:auto;"></div>
</fieldset>
<script>
const websocket = new WebSocket("ws://localhost:8888/websocket");
//console.log(websocket);
websocket.onopen = function(event) {
	console.log(event);
}
websocket.onclose = function(event) {
	console.log(event);
}
websocket.onerror = function(event) {
	console.log(event);
}
websocket.onmessage = function(event) {
	console.log(event);
	messagebox.innerHTML += event.data+"<br>";
	//messagebox 자동으로 크기 조절하는 방법
	messagebox.style.scrollTop = messagebox.scrollHeight;
}
</script>
<script>
const message = document.getElementById("message");
const sendbtn = document.getElementById("sendbtn");
sendbtn.addEventListener("click", function() {
	websocket.send(message.value);
});
</script>
</body>
</html>