<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="500" border="1">
		<tr>
			<td>상품명</td>
			<td>가격</td>
			<td>설명</td>
		</tr>
		<c:forEach items="${content_view}" var="dto">
			<tr>
				<td>${dto.name}</td>
				<td>${dto.price}</td>
				<td>${dto.description}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>