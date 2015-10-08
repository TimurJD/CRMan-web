/* 
 * Якщо цей код працює, його написав Василь Гошовський!
 * Якщо ні, то, напевно, хтось інший...
 */


(function () {
    'use strict';

    angular.module('app').controller('TableController', ['$scope', 'DataService', 'ShareService', function ($scope, dataService, shareService) {

            $scope.data = dataService;
            $scope.shared = shareService;

            $scope.init = init;
            $scope.addToTable = addToTable;
            $scope.deleteSelected = deleteSelected;


                $scope.clone = function (id) {
                    console.log('clone ' + id); //TODO
                };
                $scope.edit = function (id) {
                    console.log('edit' + id); //TODO
                };
                $scope.delete = function (id) {
                    console.log('delete ' + id); //TODO
                };

            
            /**
             * Add new element to the table
             * @returns {undefined}
             */
            function addToTable() {
                console.log('add new ' + shareService.getCurrentTable()); //TODO
            };

            /*
             * Delete all selected elements from table
             * @returns {undefined}
             */
            function deleteSelected() {
                console.log('deleteSelected'); //TODO
            }

            /**
             * Initializes table name in scope
             * @param {type} tableName
             * @returns {undefined}
             */
            function init(tableName) {
                shareService.setCurrentTable(tableName);
                initData(tableName);
            }

            /**
             * Fetch data for specified table
             * @param {type} tableName
             * @returns {undefined}
             */
            function initData(tableName) {
                dataService.all(tableName).query(function (response) {
                    $scope.data.tableData = response;
                });
            }

        }]);


}());