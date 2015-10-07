/* 
 * Якщо цей код працює, його написав Василь Гошовський!
 * Якщо ні, то, напевно, хтось інший...
 */


(function () {
    'use strict';

    angular.module('app').controller('FilterController', ['$scope', 'DataService', 'ShareService', function ($scope, dataService, shareService) {

            $scope.fData = {};

            dataService.filters(shareService.getCurrentTable()).query(function (response) {
                $scope.fData.filters = response;
            });
            
            
            
            

        }]);




}());