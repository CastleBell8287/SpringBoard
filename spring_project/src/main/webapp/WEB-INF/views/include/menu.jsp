<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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

 </head>
<body>
    <c:set var="path" value="${pageContext.request.contextPath }"/>
    <nav class="nav">
        <div class="nav_logo">
            <i class="fa-brands fa-yandex-international"></i>
            <a href="${path }/">eonsung</a>
        </div>
            <ul class="nav_menu">
                <li><a href="#">Home</a></li>
                <li><a href="${path}/board/list">게시판</a></li>
                <li><a href="#">Home</a></li>
                <li><a href="#">Home</a></li>
                <li><a href="#">Home</a></li>
            </ul>
            <ul class="nav_check">
                <c:choose>
                    <c:when test="${sessionScope.userId==null }">
                    <div class="dropdown">
                        <a class="dropbtn">메뉴 <span style="font-size:8px;">▼</span></a>
                        	<div class="dropdown-content">
                        		<a href="${path }/login/login">로그인</a>
                        		<a href="${path }/member/write">회원가입</a>
                        	</div>
                    </div>
                    </c:when>
                    <c:otherwise>
                    <div class="dropdown">
                        <a class="dropbtn">${sessionScope.userName }님 <span style="font-size:8px;">▼</span> </a> 
                        <div class="dropdown-content">
                        		<a href="${path}/login/logout">로그아웃 </a>
                        		<a href="${path }/member/view?userId=${sessionScope.userId}">내정보</a>
                        	</div>
                        </div>	
                    </c:otherwise>
                </c:choose>
                
            </ul>
            <a href="#" class="nav_toggle">
                <i class='bx bx-menu'></i>
            </a>
    </nav>
</body>
</html>