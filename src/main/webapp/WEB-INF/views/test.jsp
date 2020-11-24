<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>test.jsp</h4>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<c:forEach var="dto" items="${list }">
		num : <a href="delete?num=${dto.num }">${dto.num }</a><br>
		name : ${dto.name }<br>
		mydate : ${dto.mydate }<hr>	
	</c:forEach>

</body>
</html>