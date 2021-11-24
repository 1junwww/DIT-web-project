<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h2>멤버 목록</h2>
	<br/>
	<table class="table table-striped table-hover">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>email</th>
			<th>joinDate</th>
		</tr>
	<c:forEach var="dto" items = "${dtos}">
		<tr>
			<td><a href="view.do?id=${dto.id}">${dto.id}</a></td>	
			<td>${dto.name}</td>
			<td>${dto.email}</td>
			<td><fmt:formatDate value="${dto.joinDate0}"/></td>
		</tr>
	<c:forEach>		
	</table>
	<input type="button" value ="홈으로" onclick = "location.href='index.html'">
	<input type="button" value ="멤버 등록" onclick = "location.href='insertForm.do'">
</div>
</body>
</html>