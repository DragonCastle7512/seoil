<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="board.Writing"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@page import="lombok.ToString"%>
<%@page import="lombok.Getter"%>
<%@page import="lombok.Setter"%>
<%@page import="lombok.AllArgsConstructor"%>
<%@page import="lombok.NoArgsConstructor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
/*
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Writing {
	int id;
	String title;
	String author;
	Date createDate;
	String content;
	String attachment;
	int viewcnt;
	String type;
} 
*/
%>
<%
//sql연결하기 위한 설정
Class.forName("oracle.jdbc.driver.OracleDriver");
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "night";
String password = "night";
Connection conn = DriverManager.getConnection(url, user, password);
//System.out.println(conn);

int totalCount = 0; //글의 전체 개수
//String sql = "select count(*) from board";
String sql = "select count(*) count from board";
PreparedStatement pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();
if(rs.next()) {
	//totalCount = rs.getInt("count(*)");
	totalCount = rs.getInt("count");
}
System.out.println("글의 전체 개수: "+totalCount);

int pagePreCount = 10; //1페이지 당 글의 개수
int totalPage = (totalCount <= 0) ? 0 : (totalCount-1)/pagePreCount+1; //전체페이지 수
System.out.printf("전체 페이지: %d\n", totalPage);
//요청 페이지 값이 전달되는 경우
String _requestPage = request.getParameter("requestPage");
int requestPage = (_requestPage != null) ? Integer.parseInt(_requestPage) : 1; //요청 페이지 or 현재 페이지 

int startnum = (requestPage-1)*pagePreCount+1; //글의 시작 번호
int endnum = requestPage*pagePreCount; //글의 끝 번호
System.out.printf("요청 페이지: %d\n", requestPage);
System.out.printf("글시작번호: %d\n", startnum);
System.out.printf("글 끝번호: %d\n", endnum);

//시나리오: 요청한 페이지가 1페이지일 때 시작페이지1, 끝페이지5
//시나리오: 요청한 페이지가 6페이지일 때 시작페이지6, 끝페이지10
int pageCount = 5; //한 페이지에 표기될 페이지 개수
int startPage = (requestPage-1)/pageCount*pageCount+1; //네비게이트 시작번호
int endPage = startPage+(pageCount-1); //네비게이트 끝 번호
if(endPage > totalPage)
	endPage = totalPage;
System.out.println("시작 번호: "+startPage+"\n끝 번호: "+endPage);
//이전 페이지 다음 페이지 표시 여부
boolean isPre = (requestPage > pageCount) ? true : false;
boolean isNext = (totalPage > endPage) ? true : false;
System.out.println("이전 링크 표시: "+isPre+"\n다음 링크 표시: "+isNext);
//요청한 페이지의 게시판 리스트
List<Writing> list = new ArrayList<Writing>();
sql = "select * from (select rownum rid, t1.* from (select * from board order by id asc) t1) where 11 <= rid and rid <= 20";
StringBuffer sb = new StringBuffer();
sb.append("select * from ");
sb.append("(select rownum rid, t1.* from ");
sb.append("(select * from board order by id asc) t1) ");
sb.append("where ? <= rid and rid <= ?");
pstmt = conn.prepareStatement(sb.toString());
pstmt.setInt(1, startnum);
pstmt.setInt(2, endnum);
rs = pstmt.executeQuery();
while(rs.next()) {
	Writing write = new Writing();
	write.setId(rs.getInt("id"));
	write.setTitle(rs.getString("title"));
	write.setAuthor(rs.getString("author"));
	write.setCreateDate(rs.getDate("createDate"));
	write.setViewcnt(rs.getInt("viewcnt"));
	list.add(write);
}
request.setAttribute("list", list);
System.out.println(list);
rs.close();
pstmt.close();
conn.close();
%>

<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>게시판</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="p-4">

  <div class="container">
    <h2 class="mb-4">📋 게시판</h2>
	<div><%=totalCount%>개의 글(<%=requestPage%>/<%=totalPage%>)</div>
    <!-- 게시판 테이블 -->
    <table class="table table-bordered table-hover text-center align-middle">
      <thead class="table-light">
        <tr>
          <th scope="col">ID</th>
          <th scope="col">제목</th>
          <th scope="col">작성자</th>
          <th scope="col">작성일</th>
          <th scope="col">조회수</th>
        </tr>
      </thead>
      <tbody>
        <!-- 예시 데이터 -->
        <c:forEach var="board" items="${list}">
        	<tr>
	          <td name="id">${board.id}</td>
	          <td name="title">${board.title}</td>
	          <td name="author">${board.author}</td>
	          <td name="createdate">${board.createDate}</td>
	          <td name="viewcnt">${board.viewcnt}</td>
	        </tr>
        </c:forEach>
      </tbody>
    </table>

    <!-- 페이지 네비게이션 -->
    <nav aria-label="페이지 네비게이션">
      <ul class="pagination justify-content-center">
      	<!-- 이전 페이지 -->
        <li class="page-item <%=isPre ? "" : "disabled"%>">
          <a class="page-link " href="/list.jsp?requestPage=<%=startPage-pageCount%>" tabindex="-1">이전</a>
        </li>
        <!-- 페이지 이동 -->
        <% for(int i=startPage; i<=endPage; i++) { %>
	        <li class="page-item active">
	        	<a class="page-link active" href="/list.jsp?requestPage=<%=i%>"><%=i%></a>
	        </li>
	    <% } %>
	    <!-- 다음 페이지 -->
        <li class="page-item <%=isNext ? "" : "disabled"%>">
          <a class="page-link" href="/list.jsp?requestPage=<%=startPage+pageCount%>">다음</a>
        </li>
      </ul>
    </nav>
  </div>
</body>
</html>

