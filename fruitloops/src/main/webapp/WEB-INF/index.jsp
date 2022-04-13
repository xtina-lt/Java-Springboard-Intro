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
	    FRUIT LOOPS
	</header>
	
	<main>
		<div>
			<table>
				<tr>
					<th>
						Fruit
					</th>
					<th>
						Price
					</th>
				</tr>
			    <c:forEach var="i" items="${output}">
				    <tr>
				    	<td>
				    		${i.name}
				    	</td>
				    	<td>
				    		${i.price}
				    	</td>
				    </tr>
			    </c:forEach>
			</table>
	    </div>
	</main>
</body>

</html>
