/* 
 * Якщо цей код працює, його написав Василь Гошовський!
 * Якщо ні, то, напевно, хтось інший...
 */


(function () {
    'use strict';

    angular.module('app').controller('FilterController', ['$scope', 'DataService', 'ShareService', filterController]);


    function filterController($scope, filterService, shareService) {
        var vm = this;
        
        vm.filter = filterService;
        vm.shared = shareService;
        
        vm.filterData = {};
        vm.filterData.newFilter = {};
        vm.filterData.existingFilter = {};

        vm.editEntry = editEntry;
        vm.saveEntry = saveEntry;
        vm.cancelEdition = cancelEdition;
        vm.deleteEntry = deleteEntry;
        vm.addFilter = addFilter;

        initFilters();

        function initFilters() {
            vm.filter.findFilters();
            
        }

        /**
         * This function sets additional array that contains mirror of filter rows
         * This is an indicator of the row that is currently under edition
         * 
         * @returns {undefined}
         */
        function initRowSetting() {
            for (var i = vm.filterData.filters.length - 1; i >= 0; i--) {
                vm.filterData.rowSettings[vm.filterData.filters[i].filterId] = false;
            }
        }

        /**
         * Indicator switcher for selected entry
         * 
         * @param {object} entry
         * @returns {undefined}
         */
        function editEntry(entry) {
            initRowSetting();
            vm.filterData.rowSettings[entry.filterId] = true;
            
            
        }

        /**
         * Save edited data from model and switch an indicator for selected entry
         * 
         * @param {type} entry
         * @returns {undefined}
         */
        function saveEntry(entry) {
            vm.filterData.rowSettings[entry.filterId] = false;
            
        }
        
        /**
         * Exit edit mode
         * 
         * @param {type} entry
         * @returns {undefined}
         */
        function cancelEdition(entry) {
            vm.filterData.rowSettings[entry.filterId] = false;
        }
        
        /**
         * Delete selected entry from DB
         * 
         * @param {type} entry
         * @returns {undefined}
         */
        function deleteEntry(entry) {
            
        }
        
        /**
         * Add new filter from model
         * 
         * @returns {undefined}
         */
        function addFilter () {
            
        }


    }

}());