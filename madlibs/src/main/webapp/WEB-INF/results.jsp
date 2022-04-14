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
		<a href="/">Home</a>
		<a href="/story">Story</a>
	</nav>
	
	<main>
		<div>
			<h2>
				<c:out value="${title}"/>
			</h2>
		</div>
		
		<div>
			I woke up early Easter morning, no one else was up.
			I picked up my Easter basket and went outside to look for Easter eggs.
			<br>
			<br>
			First, I checked under the <span class="accent"><c:out value="${thing}"/>.</span> 
			<br>
			<br>
			Then, I checked over the <span class="accent"><c:out value="${thing}"/></span>.
			<br>
			<br>
			I might as well be <span class="accent"><c:out value="${hobby}"/></span> on one leg....
			<br>
			<br>
			I checked one more spot on <span class="accent"><c:out value="${place}"/></span>.
			<br>
			<br>
			Turns out the <span class="accent"><c:out value="${name}"/></span> was playing with my emotions.
			Just then someone came out and asked, "Why are you hunting for Easter eggs when easter is in <span class="accent"><c:out value="${num}"/></span> days?!"
			<p>
				<br>
				<span class="accent">**Easter Bunny pops out and says:**
				<br>
				<c:out value="${greet}"/>
				</span>
			</p>
		</div>
	</main>
</body>
</html>