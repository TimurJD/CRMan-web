function helloWord() {
    alert('hello');
}

function timeConverter(UNIX_timestamp){
  var a = new Date(UNIX_timestamp * 1000);
  var months = ['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec'];
  var year = a.getFullYear();
  var month = months[a.getMonth()];
  var date = a.getDate();
  var hour = a.getHours();
  var min = a.getMinutes();
  var sec = a.getSeconds();
  var time = date + ' ' + month + ' ' + year + ' ' + hour + ':' + min + ':' + sec ;
  return time;
}

var acctivitiesAppModule = angular.module('activitiesApp', ['ngResource']);

acctivitiesAppModule.controller('TableController', ['$scope', 'DataService', function ($scope, dataService) {
        $scope.data = {};
        dataService.all().query(function (response) {
            $scope.data.activities = response;
        });
        
        $scope.delete = function(id){
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