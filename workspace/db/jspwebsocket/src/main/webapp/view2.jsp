<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	ul {
	  display: flex;
	  flex-wrap: wrap;
	  padding: 0;
	  margin: 0;
	  list-style: none;
	}
	li {
	  padding: 0;
	  margin: 0;
	}
</style>
</head>
<body>
<ul class="number">
</ul>
<ul class="countup-btn">
</ul>
<script>
const websocket = new WebSocket("ws://192.168.56.1:8888/websocket");
const numberList = document.querySelector(".number");
const countupList = document.querySelector(".countup-btn");
for(let i=0; i<4; i++) {
	const li = document.createElement("li");
	const buttonLi = document.createElement("li");
	li.innerText = 0;
	const button = document.createElement("button");
	button.addEventListener("click", (e) => {
		//console.log(i+1);
		const tempLi = numberList.querySelectorAll("li")[parseInt(i)];
		tempLi.innerText = parseInt(tempLi.innerText) + 1;
		websocket.send(i);
	});
	button.innerText = i+1;
	buttonLi.appendChild(button);
	numberList.appendChild(li);
	countupList.appendChild(buttonLi);
}

</script>
<script>
websocket.onmessage = function(num){
	console.log(num);
	const li = numberList.querySelectorAll("li")[parseInt(num.data)];
	li.innerText = parseInt(li.innerText) + 1;
}
</script>
</body>
</html>