<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인</h1>
	<form action='<c:url value="/member/actionLogin.do"/>' method="post" name="frm">
		<table>
			<tr>
				<td>아이디 :</td>
				<td><input type="text" name="id" id="id"></td>
			<tr>
				<td>비밀번호 :</td>
				<td><input type="password" name="password" id="password"></td>
			<tr>
				<td><input type="submit" value="로그인"></td>
			</tr>
		</table>
	</form>
</body>
</html>