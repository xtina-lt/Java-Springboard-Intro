<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>XTINA.CODES</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/script.js"></script>
<link href="https://fonts.googleapis.com/css2?family=Barlow+Condensed&family=Lobster&display=swap" rel="stylesheet">
</head>
<body>
<header>
	Grace
</header>
<main>
<header>
	<a href="/xtina.codes" target="#">xtina.codes</a>
</header>
<div>
<table>
	<tr>
		<th colspan="2">
			Name: <c:out value="${name}"/>
		</th>
	</tr>
	<tr>
		<td>
			Item
		</td>
		<td>
			<c:out value="${itemName}"/>
		</td>
	</tr>
	<tr>
		<td>
			Price:
		</td>
		<td>
			<c:out value="${price}"/>
		</td>
	</tr>
	<tr>
		<td>
			Description:
		</td>
		<td>
			<c:out value="${description}"/>
		</td>
	</tr>
	<tr>
		<td>
			Vendor:
		</td>
		<td>
			<c:out value="${vendor}"/>
		</td>
	</tr>
</table>
</div>
</main>
</body>
</html>