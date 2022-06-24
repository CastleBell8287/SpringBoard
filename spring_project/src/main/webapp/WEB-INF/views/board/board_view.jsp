<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="https://kit.fontawesome.com/9e2dfa9e38.js"
	crossorigin="anonymous"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@200&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css">
<script src="https://code.jquery.com/jquery-3.6.0.js"
	integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
	crossorigin="anonymous"></script>
<script src="${pageContext.request.contextPath }/resources/js/my.js"></script>
<script src="${pageContext.request.contextPath }/resources/js/main.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/board.css">
<title>Insert title here</title>
<%@ include file="../include/header.jsp"%>
</head>
<style>
p {
	margin: 0;
}
</style>
<body>
	<%@ include file="../include/menu.jsp"%>

	<section class="notice">
	<div class="page-title">
		<div class="container">
			<h3>글 상세 내용</h3>
		</div>
	</div>
	<div class="container">
		<c:choose>
			<c:when test="${sessionScope.userName == dto.userName}">
				<form name="form1">
					<table border="1">
						<tr>
							<td>번호</td>
							<td><p>${dto.boardId }</p></td>
							<td>제목</td>
							<td><input name="title" value="${dto.title}"></td>
						</tr>
						<tr>
							<td height="350px">내용</td>
							<td height="350px" colspan="3"><input
								style="width: 95%; height: 95%;" name="content"
								value="${dto.content}"></td>
						</tr>
						<tr>
							<td>작성자</td>
							<td width="15%"><p>${dto.userName }</p></td>
							<td>작성일</td>
							<td><fmt:formatDate value="${dto.regDate }"
									pattern="yyyy-MM-dd HH:mm:ss" /></td>
						</tr>
						<tr>
							<td colspan="4" align="center"><input name="boardId"
								value="${dto.boardId }" hidden="hidden"> <input
								type="submit" value="수정" class="btn btn-dark"
								formaction="${path}/board/update"> <input type="submit"
								value="삭제" class="btn btn-dark"
								formaction="${path}/board/delete"></td>
						</tr>
					</table>
				</form>
			</c:when>

			<c:otherwise>
				<form name="form1">
					<table border="1">
						<tr>
							<td>번호</td>
							<td><p>${dto.boardId }</p></td>
							<td>제목</td>
							<td><input name="title" value="${dto.title}"
								readonly="readonly"></td>
						</tr>
						<tr>
							<td height="350px">내용</td>
							<td height="350px" colspan="3"><input
								style="width: 95%; height: 95%;" name="content"
								readonly="readonly" value="${dto.content}"></td>
						</tr>
						<tr>
							<td>작성자</td>
							<td width="15%"><p>${dto.userName }</p></td>
							<td>작성일</td>
							<td><fmt:formatDate value="${dto.regDate }"
									pattern="yyyy-MM-dd HH:mm:ss" /></td>
						</tr>
					</table>
				</form>
			</c:otherwise>
		</c:choose>
	</div>
	<div class="container">
	<form name="form2" 
		action="${path }/reply/insert?boardId=${dto.boardId}"
		style="margin:auto;">
		<input class="content" name="content" type="text"> <input
			name="boardId" value="${dto.boardId }" hidden="hidden"> <input
			name="userName" value="${sessionScope.userName }" hidden="hidden">
		<br> <input type="submit" value="댓글쓰기">
	</form>
	</div>
	<div class="container">
	<c:forEach var="list2" items="${list2}">
		<div class="box-reply">
			<div class="box-reply-user">
				<p>${list2.userName}</p>
				<p class="reply-date">
					<fmt:formatDate value="${list2.reg_date}"
						pattern="yyyy-MM-dd hh:mm:ss" />
				</p>
			</div>
			<div class="box-reply-text">
				<p>${list2.content}</p>
			</div>
			<div class="box-reply-icon">
				<i class="fa-solid fa-pen"></i><i class="fa-solid fa-trash"></i>
			</div>
		</div>
	</c:forEach>
	</div> 
	</section>
</body>
<%@ include file="../include/footer.jsp"%>

</html>