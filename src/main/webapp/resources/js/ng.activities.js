var app = angular.module('app', ['ngResource']);

app.controller('TableController', ['$scope', 'DataService', 'ShareService', function ($scope, dataService, shareService) {
        $scope.data = {
            filterVisibility: false,
        };

        function initData(tableName) {
            dataService.all(tableName).query(function (response) {
                $scope.data.tableData = response;
            });
        }

        $scope.clone = function (id) {
            console.log('clone ' + id); //TODO
        };
        $scope.edit = function (id) {
            console.log('edit' + id); //TODO
        };
        $scope.delete = function (id) {
            console.log('delete ' + id); //TODO
        };

        $scope.add = function () {
            console.log('add new ' + shareService.getCurrentTable()); //TODO
        };

        /*
         * Delete all selected elements
         * @returns {undefined}
         */
        $scope.deleteSelected = function () {
            console.log('deleteSelected'); //TODO
        };

        /**
         * Turns filters on|off
         * @returns {undefined}
         */
        $scope.toggleFilters = function () {
            $scope.data.filterVisibility = !$scope.data.filterVisibility;
        };

        /**
         * Initializes table name in scope
         * @param {type} tableName
         * @returns {undefined}
         */
        $scope.init = function (tableName) {
            shareService.setCurrentTable(tableName);
            initData(tableName);
        };


    }]);

app.controller('FilterController', ['$scope', 'DataService', 'ShareService', function ($scope, dataService, shareService) {

        $scope.fData = {};

        dataService.filters(shareService.getCurrentTable()).query(function (response) {
            $scope.fData.filters = response;
        });

    }]);


app.factory('DataService', ['$resource', function ($resource) {
        return {
            all: function (tableName) {
                return $resource(restPath + tableName + '/all');
            },
            filtered: function () {
                return "smth"; //TODO
            },
            filters: function (tableName) {
                return $resource(restPath + 'filters/' + tableName);
            }
        };
    }]);

app.factory('ShareService', function () {
    var data = {
        currentTable: ''
    };

    return {
        getCurrentTable: function () {
            return data.currentTable;
        },
        setCurrentTable: function (currentTable) {
            data.currentTable = currentTable;
        }
    };
});
