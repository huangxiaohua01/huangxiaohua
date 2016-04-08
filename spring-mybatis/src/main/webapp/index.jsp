<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<title>Insert title here</title>
 	<script type="text/javascript" src="js/jquery-1.9.1.min.js" ></script> 
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
    <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
    <link href="css/style-metro.css" rel="stylesheet" type="text/css"/>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <link href="css/style-responsive.css" rel="stylesheet" type="text/css"/>
     <link href="css/uniform.default.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="css/DT_bootstrap.css" />
    <link rel="shortcut icon" href="image/favicon.ico" />
</head>
<body>
 	<table >
       	<c:forEach var="element" items="${user}">
       		<tr>
       			<td>${element.name}</td>
       			<td>${element.password}</td>
       		</tr>
       	</c:forEach>
     </table>
</body>
</html>