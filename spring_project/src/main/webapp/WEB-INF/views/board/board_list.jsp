<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/board.css">
    <link rel="stylesheet" href="https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css">
    <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
 	<script src="${pageContext.request.contextPath }/resources/js/main.js"></script>
    <title>Document</title>
 </head>
 <style>

 </style>
<body>
<%@ include file="../include/menu.jsp" %>


<section class="notice">
  <div class="page-title">
        <div class="container">
            <h3>게시판</h3>
        </div>
    </div>
    <!-- board search area -->
    <div id="board-search">
        <div class="container">
            <div class="search-window">
                <form>
                    <div class="search-wrap">
                        <label for="search" class="blind">게시글 제목 검색</label>
                        <input id="search" type="search" name="search" placeholder="검색어를 입력해주세요." value="">
                        <button type="submit" class="btn btn-dark" formaction="${path}/board/search">검색</button>
                        <button type="submit" class="btn btn-dark" formaction="${path}/board/list" style="float:right;">전체보기</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
   
  <!-- board list area -->
    <div id="board-list">
        <div class="container">
            <table class="board-table">
                <thead>
                <tr>
                    <th scope="col" class="th-num">번호</th>
                    <th scope="col" class="th-title">제목</th>
                    <th scope="col" class="th-user">작성자</th>
                    <th scope="col" class="th-date">등록일</th>
                </tr>
                </thead>
                <tbody>
                	<c:forEach var="dto" items="${list}">
		<tr>
			<td>${dto.boardId }</td>
			<c:choose>
				<c:when test="${sessionScope.userId == null }">
					<td><a onclick="alert('로그인페이지로 이동합니다.')" href="${path}/login/login">${dto.title }</a></td>			
				</c:when>
				<c:otherwise>
					<td><a href="${path}/board/view?boardId=${dto.boardId}">${dto.title }</a></td>
				</c:otherwise>
			</c:choose>
			<td>${dto.userName }</td>
			<td><fmt:formatDate value="${dto.regDate }" pattern="yyyy-MM-dd"/></td>
		</tr>
	</c:forEach>
                </tbody>
            </table>
        </div>
    </div>
    <div class="container">
<c:if test="${sessionScope.userId != null }">
<form action="${path }/board/write">
	<button class="btn btn-write" type="submit">글쓰기</button>
</form>
</c:if>
</div>
</section>
</body>
</html>