<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>정보 테이블</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
  <h2 class="mb-4">회원 정보 📝</h2>
  <!-- <div><button onclick="location.href='/phonebook/insertform'">전화번호부 입력</div> -->
  <table class="table table-bordered table-hover text-center align-middle">
    <thead class="table-primary">
      <tr>
        <th scope="col">아이디</th>
        <th scope="col">이름</th>
        <th scope="col">전화번호</th>
        <th scope="col">이메일</th>
        <th scope="col">메모</th>
      </tr>
    </thead>
    <tbody>
		<c:forEach var="pb" items="${list}">
			<tr>
		        <td>${pb.id}</td>
		        <td>${pb.name}</td>
		        <td>${pb.hp}</td>
		        <td>${pb.email}</td>
		        <td>${pb.memo}</td>
		      </tr>
	    </c:forEach>
    </tbody>
  </table>
  <button class="btn btn-primary">전화번호부 입력</button>
	</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<script>
let btns = document.getElementsByTagName("button");
/* collection은 배열이 아니므로 아래와 같이 수정
btns.forEach((btn) => {
	console.log(btn.innerText);
})
*/
Array.from(btns).forEach((btn) => {
	console.log(btn);
	btn.addEventListener("click", (e) => {
		switch(e.target.textContent) {
			case "전화번호부 입력": location.href = "/phonebook/insertform"; break;
		}
	});
});

//tr의 리스트를 가지고 온 후 이벤트 등록
//querySelector의 반환 값은 배열이므로 Array.from() 사용 안해도됨
let trs = document.querySelectorAll("tbody > tr");
trs.forEach((tr) => {
	console.log(tr.children[1].innerText);
	let id = tr.children[0].textContent;
	tr.addEventListener("click", function(e) {
		//jstl에서 백틱 사용법
		location.href = `/phonebook/view?id=${'${id}'}`;
	});
});

</script>
</body>
</html>
