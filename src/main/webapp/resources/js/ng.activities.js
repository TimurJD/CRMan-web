/* global restPath, angular */

function helloWord() {
    alert('hello');
}

var acctivitiesAppModule = angular.module('activitiesApp', []);
acctivitiesAppModule.controller('tableController', function ($scope, $http) {
    $http.get(restPath + "activities/all").success(function(response){
       $scope.activities = response; 
    });
});