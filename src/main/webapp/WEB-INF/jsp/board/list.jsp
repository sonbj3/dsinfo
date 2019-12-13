<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시판 리스트</h1>
		<table>
			<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			</tr>
			<c:forEach var="junList" items="${list}">
			<tr>
			<td>${junList.seq }</td>
			<td>${junList.title }</td>
			<td>${junList.name }</td>
			</tr>
			</c:forEach>		 
		</table>
</body>
</html>