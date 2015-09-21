<%-- 
    Document   : activities
    Created on : Sep 14, 2015, 10:11:22 AM
    Author     : Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html data-ng-app="activitiesApp">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <%@ include file="../jspf/css.jspf"%>

        <title>Activities</title>
    </head>
    <body data-ng-controller="tableController">
        <%@ include file="../jspf/header.jspf" %>


        <div class="container">

            <div>

                <table class="table table-responsive table-condensed table-hover">
                    <thead>
                        <tr>
                            <td></td>
                            <td>Title</td>
                            <td>Description</td>
                            <td>Start date</td>
                            <td>Due Date</td>
                            <td>Created on</td>
                            <td>Created by</td>
                        </tr>
                    </thead>
                    <tbody>
                        <tr data-ng-repeat="entry in activities">
                            <td></td>
                            <td>{{entry.title}}</td>
                            <td>{{entry.description}}</td>
                            <td>{{entry.startDate}}</td>
                            <td>{{entry.dueDate}}</td>
                            <td>{{entry.createdOn}}</td>
                            <td>{{entry.createdBy.login}}</td>
                            <td>
                                <button>Add</button>
                                <button>Edit</button>
                                <button>Delete</button>
                            </td>
                        </tr>
                    </tbody>
                </table>

            </div>

        </div>

        <%@ include file="../jspf/footer.jspf" %>
        <spring:url var="activitiesNG" value="/resources/js/ng.activities.js" />
        <script type="text/javascript" src="${activitiesNG}"></script>
    </body>
</html>
