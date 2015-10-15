/* 
 * Якщо цей код працює, його написав Василь Гошовський!
 * Якщо ні, то, напевно, хтось інший...
 */


(function () {
    'use strict';

    angular.module('app').controller('TableController', ['$scope', 'DataService', 'ShareService', function ($scope, dataService, shareService) {
    		
    		var vm = this;
    		
            vm.data = dataService;
            vm.shared = shareService;

            vm.init = init;
            vm.addToTable = addToTable;
            vm.deleteSelected = deleteSelected;


            vm.clone = function (id) {
                    console.log('clone ' + id); // TODO
            };
                
            vm.edit = function (id) {
            	console.log('***********');
            };
            
            vm.delete = function (id) {
            	console.log('delete ' + id); // TODO
            };

            
            /**
			 * Add new element to the table
			 * 
			 * @returns {undefined}
			 */
            function addToTable() {
                console.log('add new ' + shareService.getCurrentTable()); // TODO
            };

            /*
			 * Delete all selected elements from table @returns {undefined}
			 */
            function deleteSelected() {
                console.log('deleteSelected'); // TODO
            }

            /**
			 * Initializes table name in scope
			 * 
			 * @param {type}
			 *            tableName
			 * @returns {undefined}
			 */
            function init(tableName) {
                shareService.setCurrentTable(tableName);
                initData(tableName);
            }

            /**
			 * Fetch data for specified table
			 * 
			 * @param {type}
			 *            tableName
			 * @returns {undefined}
			 */
            function initData(tableName) {
                dataService.all(tableName).query(function (response) {
                	vm.data.tableData = response;
                });
            }

        }]);


}());