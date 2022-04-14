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
		MadLibs
	</header>
	<nav>
		<a href="/story">Story</a>
	</nav>
	
	<main>
		<div class="large">
			<c:out value="${title}"/>
		</div>
		
		<div>
			<h2>
				Entries
			</h2>
			<!-- form start, action, method -->
			<form action="/process" method="GET">
				<!-- number -->
				<label for="num">
					Pick any number from 5 to 25:
				</label>
				<input type="number" name="num" min="5" max="25">
				<!-- place -->
				<label for="place">
					Place:
				</label>
				<input type="text" name="place" value="Easter Island">
				<!-- name -->
				<label for="name">
					Name:
				</label>
				<input type="text" name="name" value="easter bunny">
				<!-- hobby -->
				<label for="hobby">
					Hobby:
				</label>
				<input type="text" name="hobby" value="hunting eggs">
				<!-- thing -->
				<label for="thing">
					Thing (noun):
				</label>
				<input type="text" name="thing" value="egg">
				<!-- greeting -->
				<textarea name="greet" rows="4" cols="20">HOPPY Easter to all my PEEPS.</textarea>
				<!-- submit -->
				<input type="submit" value="hop on in">
			</form>
		</div>
	</main>
</body>
</html>