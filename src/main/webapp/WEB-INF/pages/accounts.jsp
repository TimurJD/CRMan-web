<%-- 
    Document   : accounts
    Created on : September 23, 2015
    Author     : Timur Berezhnoi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html data-ng-app="accountsApp">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accounts</title>

        <%@ include file="../jspf/css.jspf"%>
    </head>
    <body>
        <%@ include file="../jspf/header.jspf"%>




        <div class="container"  data-ng-controller="TableController " data-ng-init="init('accounts')">

            <%@ include file="../jspf/filter.jspf" %>

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
                            <td>Name</td>
                            <td>Industry</td>
                            <td>Employees count</td>
                            <td>Revenue</td>
                            <td>Created on</td>
                            <td>Created by</td>
                            <td></td>
                        </tr>
                    </thead>
                    <tbody>
                        <tr data-ng-repeat="entry in data.tableData| filter:search">
                            <td><input type="checkbox" data-ng-model="entry.selected"></td>
                            <td>{{ entry.accountName}}</td>
                            <td>{{ entry.industryId.name}}</td>
                            <td>{{ entry.employeesCount}}</td>
                            <td>{{ entry.annualRevenue}}</td>
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

    </body>
</html>