function helloWord() {
    alert('hello');
}


var acctivitiesAppModule = angular.module('activitiesApp', ['ngResource']);

acctivitiesAppModule.controller('TableController', ['$scope', 'DataService', function ($scope, dataService) {
        $scope.data = {};
        dataService.all().query(function (response) {
            $scope.data.activities = response;
        });

        $scope.delete = function (id) {
            console.log('delete ' + id); //TODO
        };

    }]);

acctivitiesAppModule.factory('DataService', ['$resource', function ($resource) {
        return {
            all: function () {
                return $resource(restPath + 'activities/all');
            },
            filtered: function () {
                return "smth";
            }
        };
    }]);