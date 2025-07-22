<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div><input type="text" id="username" placeholder="username입력"></div>
<div><input type="password" id="password" placeholder="password입력"></div>
<div><input type="email" id="email" placeholder="eamil입력"></div>
<div>
<button id="insertexecbtn">입력실행</button>
<button id="updateexecbtn" style="display: none;">수정실행</button>
<button id="deleteexecbtn" style="display: none">삭제실행</button>
<button id="back" style="display: none">입력화면으로</button>
</div>
<div><button id="selectAllexecbtn">전체출력실행</button></div>
<div><input type="text" id="findusername" placeholder="검색 username입력"></div>
<div><button id="selectByUsernameexecbtn">선택출력실행</button></div>
<div id="result"></div>
<script>
const xhr = new XMLHttpRequest();
let buttonId = null;
xhr.onload = function () {
	console.log('onload 함수 호출!!')
	  	if(xhr.status === 200) {
	  		div.innerText=xhr.responseText;
	    	if(buttonId === "insertexecbtn") {
	    		console.log("입력");
	    	}
		    else if(buttonId === "selectAllexecbtn") {
		    	console.log("전체 출력");
		    }
		    else if(buttonId === "selectByUsernameexecbtn") {
		    	console.log("선택 출력");
		    	const obj = JSON.parse(xhr.responseText);
		    	username.value = obj["username"];
		    	password.value = obj["password"];
		    	email.value = obj["email"];
		    	
		    	updateexecbtn.style.display = "inline";
		    	deleteexecbtn.style.display = "inline";
		    	back.style.display = "inline";
		    	insertexecbtn.style.display = "none";
		    	username.readOnly = "true";
		    }
		    else if(buttonId === "updateexecbtn") {
		    	console.log("수정");
		    }
		    else if(buttonId === "deleteexecbtn") {
		    	console.log("삭제");
		    }
		    else console.log("그 외 버튼")
	  	}
	  	else {
	  		console.error('요청 실패:', xhr.status);
	  	}
		buttonId = null;
	};

xhr.onerror = function () {console.error('요청 중 오류 발생');};
	
const insertexecbtn=document.getElementById("insertexecbtn");
const username = document.getElementById("username");
const password = document.getElementById("password");
const email = document.getElementById("email");

const div = document.getElementById("result");
insertexecbtn.addEventListener("click",(event) => {
	
	buttonId = event.target.id;
	xhr.open('POST', '/api/member', true);
	xhr.setRequestHeader("Content-Type","application/json");
	let data2 = JSON.stringify({"username":username.value,"password":password.value,"email":email.value});
	xhr.send(data2);
	
	username.value="";
	password.value="";
	email.value="";
});

const selectAllexecbtn = document.getElementById("selectAllexecbtn");
selectAllexecbtn.addEventListener("click",(event) => {
	//http://localhost:8888/api/members
	//buttonId = event.target.id;
	console.log(buttonId);
	xhr.open('GET', '/api/members', true);
	xhr.send();
});

const findusername = document.getElementById("findusername")
const selectByUsernameexecbtn = document.getElementById("selectByUsernameexecbtn");
selectByUsernameexecbtn.addEventListener("click",(event) => {
	buttonId = event.target.id;
	xhr.open('GET', '/api/member/json?username='+findusername.value, true);
	xhr.send();
});

const updateexecbtn = document.getElementById("updateexecbtn");
updateexecbtn.addEventListener("click",(event) => {
	buttonId = event.target.id;
	xhr.open('PUT', '/api/member', true);
	xhr.setRequestHeader("Content-Type","application/json");
	let data = JSON.stringify({"username":username.value,"password":password.value,"email":email.value});
	xhr.send(data);
});

const deleteexecbtn = document.getElementById("deleteexecbtn");
deleteexecbtn.addEventListener("click",(event) => {
	buttonId = event.target.id;
	xhr.open('DELETE', '/api/member?username='+findusername.value, true);
	xhr.send();
	username.value="";
	password.value="";
	email.value="";
	
	updateexecbtn.style.display = "none";
	deleteexecbtn.style.display = "none";
	back.style.display = "none";
	insertexecbtn.style.display = "inline";
	username.readOnly = "false";
});
const backbtn = document.getElementById("back");
backbtn.addEventListener("click",(event) => {
	buttonId = event.target.id;
	username.value="";
	password.value="";
	email.value="";
	
	updateexecbtn.style.display = "none";
	deleteexecbtn.style.display = "none";
	back.style.display = "none";
	insertexecbtn.style.display = "inline";
});

</script>

</body>
</html>