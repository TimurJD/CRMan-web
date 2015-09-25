var accountsAppModule= angular.module('accountsApp', ['ngResource']);

accountsAppModule.controller('TableController', ['$scope', 'DataService', function ($scope, dataService) {
        $scope.data = {};
        dataService.all().query(function (response) {
            $scope.data.accounts = response;
        });

        $scope.delete = function (id) {
            console.log('delete ' + id); // TODO
        };

    }]);

accountsAppModule.factory('DataService', ['$resource', function ($resource) {
        return {
            all: function () {
                return $resource(restPath + 'accounts/all');
            },
            filtered: function () {
                return "smth";
            }
        };
    }]);