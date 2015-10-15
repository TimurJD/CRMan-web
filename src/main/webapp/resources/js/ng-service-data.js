/* 
 * Якщо цей код працює, його написав Василь Гошовський!
 * Якщо ні, то, напевно, хтось інший...
 */

(function () {

    angular.module('app').factory('DataService', ['$http', dataService]);

    function dataService($http) {

        var data = {
            findAll: findAll,
            findFilteredData: findFiltered,
            editEntry: editEntry,
            deleteEntry: deleteEntry
        };

        return data;


        //------Data--------------------------

        //TODO add handlers to onSuccess functions that will refresh table
        //Maybe execute findFiltered (but I'm not sure about efficiency)

        function findAll(tableName) {
            $http({
                method: "GET",
                url: restPath + tableName + '/all'
            }).then(function (response) {
                console.log(response);
                data.all = response;
            }, function (error) {
                console.error(error);
            });
        }

        function findFiltered(tableName) {
            $http({
                method: "GET",
                url: restPath + tableName + '/filtered'
            }).then(function (response) {
                console.log(response);
                data.filteredData = response;
            }, function (error) {
                console.error(error);
            });
        }

        function editEntry(tableName) {
            $http({
                method: "POST",
                url: restPath + tableName + '/edit'
            }).then(function (response) {
                console.log(response);
            }, function (error) {
                console.error(error);
            });
        }


        function deleteEntry(tableName, id) {
            $http({
                method: "DELETE",
                url: restPath + tableName + '/delete/' + id
            }).then(function (response) {
                console.log(response);
            }, function (error) {
                console.error(error);
            });
        }


    }

}());
