<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action='<c:url value="/member/joinForm"/>' method="post" name="frm">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"> 
				<input type="button" value="중복 확인" onclick="idCheck()"></td>
			<tr>
				<td>비밀번호</td>
				<td><input type="text" name="password"></td>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="email1">@<input type="text" name="email2"> <select>
						<option>선택하세요</option>
						<option>naver.com</option>
						<option>nate.com</option>
				</select></td>
			<tr>
				<td><input type="submit" value="가입"></td>
				<td><input type="reset" value="취소"></td>
			</tr>
		</table>
	</form>
</body>
</html>