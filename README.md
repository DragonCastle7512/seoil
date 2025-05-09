# seoil
5/7
VO: ValueObject의 약자. 값 저장용 객체
프로시저 함수: 리턴값이 void
리턴 함수: 리턴값이 void 이외
기능 설계서(입력, 전체출력, 선택출력, 수정, 삭제)

5/8
요구/분석 -> 설계 -> 구현 -> 테스트 -> 유지보수
vsc html문서 -> "ctrl + /": 주석문
html 문서는 head와 body로 구성된다.
태그는 네모박스
태그의 구성요소: 너비(width) 높이(height)를 지니고, 테두리(border), 배경(background), 내용물(font)를 포함하고 있음
테두리의 구성요소: 모양, 굵기, 색깔
배경의 구성요소: 모양, 색깔
내용물의 구성요소: 색깔, 굵기, 크기를 가지고 있고, 좌우 정렬과 세로정렬이 가능
<display>
block속성 - 크기를 정할 수 있음, 한 줄 차지(<p> <div> 등)
inline속성 - 크기를 정할 수 없음 내용물의 크기에 자동 맞춤(<a> <span> 등)
inline-block속성 - 크기를 정할 수 있음 width, height에 따른 블럭 크기만큼 차지
flex속성 - 컨테이너 공간에 맞춤
<li>태그에 flex를 적용하면, 가로로 나열 가능
코드 내에서 줄바꿈을 하게되면, 간격으로 적용됨
따라서
1.
<li>menu1</li><li>menu2</li>
2.
<li>menu1</li>
<li>menu2</li>
(menu1과 menu2 사이에 간격 존재)
두 코드는 다름

5/9
웹의 기본 동작 원리
서버에 request(요청) 클라이언트에 response(응답)
db에 접속하기 위해 필요한 3가지
1. url
2. id
3. password
Class.forName() - 데이터베이스 불러오기
DriverManager.getConnection() - 연결
PreParedStatment() - 요청 사항 설정(sql)
executeQuery - 요청
ResultSet - 응답 결과 저장
html 레이아웃의 기본 구조
<header>
<nav>
<main> - section, article, aside 포함
<footer>
