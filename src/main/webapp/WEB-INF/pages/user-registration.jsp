<%-- 
    Document   : user-registration
    Created on : September 14, 2015
    Author     : Timur Berezhnoi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Registration</title>

        <spring:url value="/resources/css/bootstrap.min.css" var="coreCss" />

        <!-- Bootstrap core CSS -->
        <link href="${coreCss}" rel="stylesheet" />

    <body>
        <div class="container">
            <form:form commandName="sys_user" cssClass="form-horizontal registrationForm">

                <%-- <c:if test="${success eq true}">
                        <div class="alert alert-success">Registration successful!</div>
                        <meta http-equiv="refresh" content="3;URL=http://localhost:8080/CRManWeb/" />
                </c:if> --%>

                <div class="form-group">
                    <label for="login" class="col-sm-2 control-label">User login-name:</label>	
                    <div class="col-sm-10">
                        <form:input path="login" cssClass="form-control" />
                        <form:errors path="login" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="firstName" class="col-sm-2 control-label">First name:</label>	
                    <div class="col-sm-10">
                        <input name="firstName" class="form-control" />
                        <form:errors path="firstName" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="lastName" class="col-sm-2 control-label">Last name:</label>	
                    <div class="col-sm-10">
                        <input name="lastName" class="form-control" />
                        <form:errors path="lastName" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="middleName" class="col-sm-2 control-label">Middle name:</label>	
                    <div class="col-sm-10">
                        <input name="middleName" class="form-control" />
                        <form:errors path="middleName" />
                    </div>
                </div>
                <%-- <div class="form-group">
                        <label for="email" class="col-sm-2 control-label">User email:</label>	
                                <div class="col-sm-10">
                                <form:input path="email" cssClass="form-control" />
                                <form:errors path="email" />
                        </div>
                </div> --%>
                <div class="form-group">
                    <label for="passwordHash" class="col-sm-2 control-label">User password:</label>	
                    <div class="col-sm-10">
                        <form:password path="passwordHash" cssClass="form-control" />
                        <form:errors path="passwordHash" />
                    </div>
                </div>
                <div class="form-group">	
                    <div class="col-sm-10">
                        <input type="submit" value="Register" class="btn btn-lg btn-primary" />
                    </div>
                </div>
            </form:form>
        </div>
    </body>
</head>