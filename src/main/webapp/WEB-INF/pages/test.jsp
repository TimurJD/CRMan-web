<%-- 
    Document   : test
    Created on : Aug 23, 2015, 2:24:56 PM
    Author     : VH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <spring:url value="/resources/css/bootstrap.min.css" var="mainCss" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href=${mainCss} />
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar-btn">
            <ul>
                <li>1</li>
                <li>2</li>
                <li>3</li>
            </ul>
        </nav>
        <div class="alert-info">
            <h1>Congratulations! Spring MVC is working</h1>
            <button class="btn-success">Click</button>
        </div>
        
        <button class="btn-success">Click me</button>
    </body>
</html>
