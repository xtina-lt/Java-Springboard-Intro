<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>XTINA.CODES</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link href="https://fonts.googleapis.com/css2?family=Barlow+Condensed&family=Lobster&display=swap" rel="stylesheet">
</head>
<body>
	<header>
		Counter
	</header>
	<nav>
		<a href="/">Home</a>
		<a href="/xtina.codes" target="#">xtina.codes</a>
	</nav>
	
	<main>
		<div class="large">
			Session Count is :
			<br>
			<span class="larger">
				<c:out value="${current}"/>
			</span>
		</div>
	</main>
</body>
</html>