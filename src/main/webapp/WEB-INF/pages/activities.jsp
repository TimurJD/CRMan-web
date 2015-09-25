<%-- 
    Document   : activities
    Created on : Sep 14, 2015, 10:11:22 AM
    Author     : Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html data-ng-app="app">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <%@ include file="../jspf/css.jspf"%>

        <title>Activities</title>
    </head>
    <body>
        <%@ include file="../jspf/header.jspf" %>

        <div class="container" data-ng-controller="TableController" data-ng-init="init('activities')">

            <div data-ng-controller="FilterController">
                <div class="text-center check-element animate-show ng-hide-add col-lg-7 col-lg-push-3" data-ng-show="data.filterVisibility">
                    <p class="text-info text-center">Filters</p>
                    <div>
                        <div class="input-group-sm btn-group">
                            <select class="btn dropdown" size="1"></select>
                            <select class="btn" size="1"></select>
                            <input class="btn" type="text" />
                            <button class="btn btn-success">Add</button>
                        </div>
                        <table class="table table-responsive table-condensed table-hover" >
                            <tbody>
                                <tr data-ng-repeat="entry in fData.filters">
                                    <td>{{ entry.columnName}}</td>
                                    <td>{{ entry.condition}}</td>
                                    <td>{{ entry.value}}</td>

                                    <td class="text-right btn-group-xs">
                                        <button class="btn btn-info glyphicon glyphicon-duplicate" title="Clone" data-ng-click="cloneFilter(entry.activityId)"></button>
                                        <button class="btn btn-info glyphicon glyphicon-edit" title="Edit" data-ng-click="editFilter(entry.activityId)"></button>
                                        <button class="btn btn-danger glyphicon glyphicon-remove" title="Delete" data-ng-click="deleteFilter(entry.activityId)"></button>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                        <button class="btn btn-success">Apply filters</button>
                    </div>
                </div>
                <div class="animate-show ng-hide ng-hide-remove" data-ng-hide="data.filterVisibility" ></div>
            </div>

            <div class="panel panel-title panel-table-management col-lg-12">
                <div class="btn-group">
                    <button class="btn btn-success" title="Add" data-ng-click="add()"><i class="glyphicon glyphicon-plus"></i></button>
                    <button class="btn btn-danger" title="Remove selected" data-ng-click="deleteSelected()"><i class="glyphicon glyphicon-remove"></i></button>
                </div>
                <div class="btn-group pull-right">
                    <button class="btn btn-info" title="Filters" data-ng-click="toggleFilters()"><i class="glyphicon glyphicon-filter"></i></button>
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
                        <tr data-ng-repeat="entry in data.tableData| filter:search">
                            <td><input type="checkbox" data-ng-model="entry.selected"></td>
                            <td>{{ entry.title}}</td>
                            <td>{{ entry.description}}</td>
                            <td>{{ entry.startDate | date:'dd.MM.yyyy HH:mm' }}</td>
                            <td>{{ entry.dueDate | date:'dd.MM.yyyy HH:mm' }}</td>
                            <td>{{ entry.createdOn | date:'dd.MM.yyyy HH:mm' }}</td>
                            <td>{{ entry.createdBy.login}}</td>
                            <td class="text-right btn-group-xs">
                                <button class="btn btn-info glyphicon glyphicon-duplicate" title="Clone" data-ng-click="clone(entry.activityId)"></button>
                                <button class="btn btn-info glyphicon glyphicon-edit" title="Edit" data-ng-click="edit(entry.activityId)"></button>
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
