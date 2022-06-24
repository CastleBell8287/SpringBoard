<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://kit.fontawesome.com/9e2dfa9e38.js" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@200&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link rel="stylesheet" href="https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css">
    <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
 	<script src="${pageContext.request.contextPath }/resources/js/main.js"></script>
    <title>로그인</title>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h3>로그인</h3>
<hr>
<form name="form1" method="post" action="${path }/login/loginCheck">
<div class="login">
	<div class="loginId">
		아이디    <input type="text" name="userId" id="userId">
	</div>
	<div class="loginPw">	
		비밀번호  <input type="password" name="userPw" id="userPw">
	</div>
	<div class="loginBtn">
		<input type="submit" value="로그인" id="btnLogin">
		<input type="reset" value="취소">
	</div>
	<c:if test="${msg=='실패' }">
	<div>아이디와 비밀번호가 일치하지 않습니다.</div>
	</c:if>
	<c:if test="${msg=='logout' }">
	<div>로그아웃 성공</div>
	</c:if>	
</div>
</form>
<hr>
</body>
<%@ include file="../include/footer.jsp" %>
</html>