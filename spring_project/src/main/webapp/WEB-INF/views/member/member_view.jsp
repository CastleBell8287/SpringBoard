<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://kit.fontawesome.com/9e2dfa9e38.js" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@200&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css">
    <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
 	<script src="${pageContext.request.contextPath }/resources/js/my.js"></script>
 	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/my.css">

<title>Insert title here</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h2>회원 상세 정보</h2>
<form name="form1">
<table border="1" width="700px">
	<tr>
		<td>아이디</td>
		<td><input name="userId" value="${dto.userId}" readonly="readonly"></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="password" name="userPw"></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input name="userName" value="${dto.userName}" readonly="readonly"></td>
	</tr>
	<tr>
		<td>이메일</td>
		<td><input name="userEmail" value="${dto.userEmail}"></td>
	</tr>
	<tr>
		<td>가입 일자</td>
		<td><fmt:formatDate value="${dto.userRegDate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	</tr>
	<tr>
		<td>최종 수정 일자</td>
		<td><fmt:formatDate value="${dto.userUpdateDate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	</tr>
	<tr>
	<td colspan="2" align="center">
		<input type="submit" value="수정" id="btnUpdate" formaction="${path}/member/update">
		<input type="submit" value="삭제" id="btnDelete" formaction="${path}/member/delete">
		<div style="color:red;">${message }</div>
	</td>
	</tr>
	</table>
	</form>
</body>
<%@ include file="../include/footer.jsp" %>

</html>