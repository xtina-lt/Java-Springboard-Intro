<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>XTINA.CODES</title>
</head>
<body>
<h1>SEER - Fortune Teller</h1>
<p><c:out value="${greet}"/></p>
<h2><%= new Date()%></h2>
</body>
</html>