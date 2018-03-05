<%@ page language="java" contentType="text/html;charset=UTF-8" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1" cellspacing="0" cellpadding="10">
		<tr>
			<th>Emp-Id</th>
			<th>Emp-Name</th>
		</tr>	
			<c:forEach items="${emps }" var="emp">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
			</tr>
			</c:forEach>
		
	</table>

</body>
</html>