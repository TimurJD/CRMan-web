/* 
 * Якщо цей код працює, його написав Василь Гошовський!
 * Якщо ні, то, напевно, хтось інший...
 */


(function () {

    'use strict';

    angular.module('app').controller('TableController', ['$scope', 'DataService', 'ShareService', tableController]);


    function tableController($scope, dataService, shareService) {

        var vm = this;

        vm.data = dataService;
        vm.shared = shareService;

        vm.init = init;
        vm.addToTable = addToTable;
        vm.deleteSelected = deleteSelected;
        vm.fetchData = fetchData;  

        vm.editedObject = {};
        
        vm.clone = function (id) {
            console.log('clone ' + id); //TODO
        };
        
        vm.edit = function() {
        	vm.data.editEntry(vm.shared.getCurrentTable(), JSON.stringify(vm.editedObject));
            console.log('edit' + vm.editedObject); //TODO
        };
        vm.delete = function (id) {
            console.log('delete ' + id); //TODO
        };


        /**
         * Add new element to the table
         * @returns {undefined}
         */
        function addToTable() {
            console.log('add new ' + shareService.getCurrentTable()); //TODO
        }
        ;

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
            vm.shared.setCurrentTable(tableName);
            initData(tableName);
        }

        /**
         * Fetch data for specified table
         * @param {type} tableName
         * @returns {undefined}
         */
        function initData(tableName) {
            vm.data.findAll(tableName);
        }

        function fetchData(entry) {
        	console.log(entry);
        	vm.editedObject = entry;
        }
        
    }
}());