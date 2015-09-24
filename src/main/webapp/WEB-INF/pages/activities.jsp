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
    <body data-ng-controller="TableController">
        <%@ include file="../jspf/header.jspf" %>


        <div class="container">

            <div class="panel panel-title panel-table-management">
                <div class="btn-group">
                    <button class="btn btn-success" title="Add"><i class="glyphicon glyphicon-plus"></i></button>
                    <button class="btn btn-danger" title="Remove selected"><i class="glyphicon glyphicon-remove"></i></button>
                </div>
                <div class="btn-group pull-right">
                    <button class="btn btn-info" title="Add"><i class="glyphicon glyphicon-filter"></i></button>
                </div>
            </div>

            <div>

                <table class="table table-striped table-responsive table-condensed table-hover" >
                    <thead class="well">
                        <tr>
                            <td></td>
                            <td>Title</td>
                            <td>Description</td>
                            <td>Start date</td>
                            <td>Due Date</td>
                            <td>Created on</td>
                            <td>Created by</td>
                            <td></td>
                        </tr>
                    </thead>
                    <tbody>
                        <tr data-ng-repeat="entry in data.activities| filter:search">
                            <td><input type="checkbox" data-ng-model="entry.selected"></td>
                            <td>{{ entry.title}}</td>
                            <td>{{ entry.description}}</td>
                            <td>{{ entry.startDate | date:'dd.MM.yyyy HH:mm' }}</td>
                            <td>{{ entry.dueDate | date:'dd.MM.yyyy HH:mm' }}</td>
                            <td>{{ entry.createdOn | date:'dd.MM.yyyy HH:mm' }}</td>
                            <td>{{ entry.createdBy.login}}</td>
                            <td class="text-right btn-group-xs">
                                <button class="btn btn-info glyphicon glyphicon-duplicate" title="Clone"></button>
                                <button class="btn btn-info glyphicon glyphicon-edit" title="Edit"></button>
                                <button class="btn btn-danger glyphicon glyphicon-remove" title="Delete" data-ng-click="delete(entry.activityId)"></button>
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
