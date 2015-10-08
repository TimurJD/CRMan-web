<%-- 
    Document   : login
    Author     : Timur Berezhnoi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Sign in</title>

        <spring:url value="/resources/css/bootstrap.min.css" var="coreCss" />
        <spring:url value="/resources/css/login.css" var="loginCss" />
        <spring:url value="/resources/css/style.css" var="customCss" />

        <link href="${coreCss}" type="text/css" rel="stylesheet" />
        <link href="${loginCss}" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <spring:url value="/j_spring_security_check"  var="ssCheck" />
        <div class="container">
            <form class="form-group form-signin" name="form" action='${ssCheck}' method="POST">
                <h2 class="form-signin-heading">Please sign in</h2>
                <label class="control-label" for="login"></label>
                <input type="text" name="j_username" class="form-control" placeholder="Name" id="login" required autofocus> 
                <label class="control-label" for="pass"></label>
                <input type="password" name="j_password" class="form-control" placeholder="Password" id="pass" required> 
                <div class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me">Remember me
                    </label>
                </div>
                <br />
                <c:if test="${param.status=='error'}">
                    <label style="color:red">Invalid username or password!</label>
                </c:if>

                <c:if test="${param.status=='logout'}">
                    <label style="color:green">Logged out successfully!</label>
                </c:if>

                <button class="btn btn-lg btn-primary btn-block" type="submit">Let me in</button>
            </form>
        </div>

        <spring:url var="globalVars" value="/resources/js/global.js" />
        <spring:url var="extra" value="/resources/js/extra-scripts.js" />


    </body>
</html>