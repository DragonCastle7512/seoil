# seoil
5/7<br>
VO: ValueObject의 약자. 값 저장용 객체<br>
프로시저 함수: 리턴값이 void<br>
리턴 함수: 리턴값이 void 이외<br>
기능 설계서(입력, 전체출력, 선택출력, 수정, 삭제)<br><br>

5/8<br>
요구/분석 -> 설계 -> 구현 -> 테스트 -> 유지보수<br>
vsc html문서 -> "ctrl + /": 주석문<br>
html 문서는 head와 body로 구성된다.<br>
태그는 네모박스<br>
태그의 구성요소: 너비(width) 높이(height)를 지니고, 테두리(border), 배경(background), 내용물(font)를 포함하고 있음<br>
테두리의 구성요소: 모양, 굵기, 색깔<br>
배경의 구성요소: 모양, 색깔<br>
내용물의 구성요소: 색깔, 굵기, 크기를 가지고 있고, 좌우 정렬과 세로정렬이 가능<br>
display 속성<br>
block속성 - 크기를 정할 수 있음, 한 줄 차지("<p> <div>" 등)<br>
inline속성 - 크기를 정할 수 없음 내용물의 크기에 자동 맞춤(<a> <span> 등)<br>
inline-block속성 - 크기를 정할 수 있음 width, height에 따른 블럭 크기만큼 차지<br>
flex속성 - 컨테이너 공간에 맞춤<br>
li태그에 flex를 적용하면, 가로로 나열 가능<br>
코드 내에서 줄바꿈을 하게되면, 간격으로 적용됨<br>
따라서<br>
1.<br>
```
<li>menu1</li><li>menu2</li>
```
2.<br>
```
#<li>menu1</li>
#<li>menu2</li>
```
(menu1과 menu2 사이에 간격 존재)<br>
두 코드는 다름<br><br>

5/9<br>
웹의 기본 동작 원리<br>
서버에 request(요청) 클라이언트에 response(응답)<br>
db에 접속하기 위해 필요한 3가지<br>
1. url<br>
2. id<br>
3. password<br>
Class.forName() - 데이터베이스 불러오기<br>
DriverManager.getConnection() - 연결<br>
PreParedStatment() - 요청 사항 설정(sql)<br>
executeQuery - 요청<br>
ResultSet - 응답 결과 저장<br>
html 레이아웃의 기본 구조<br>
```
<header>
<nav>
<main> - section, article, aside 포함
<footer>
```
