<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>메인</title>
</head>
<body>
<header>
<%@ include file="include/menu.jsp" %>
</header>
<c:if test="${msg=='성공' }">
	<h2>${sessionScope.userName } (${sessionScope.userId })님 환영합니다.</h2>
</c:if>
<br>
<footer>
<%@ include file="include/footer.jsp" %>
</footer>
</body>

</html>