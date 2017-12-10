<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- reference our stylesheet -->
	<link type="text/css"
		   rel="stylesheet"
		   href="${pageContext.request.contextPath}/resources/css/style.css" />

<title>List Customer </title>
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	
	</div>

	<div id ="container"> 
		<div id = "content">
			<!-- Add our html here        -->
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>email</th>
				</tr>
			<!-- loop over and print our customer -->
				<C:forEach var="tempCustomers" items="${customers}">
					<tr>
						<td>${tempCustomers.firstName}</td>
						<td>${tempCustomers.lastName}</td>
						<td>${tempCustomers.email}</td>
					</tr>
				
				</C:forEach>			
			</table>
		
		</div>
	
	</div>
</body>
</html>