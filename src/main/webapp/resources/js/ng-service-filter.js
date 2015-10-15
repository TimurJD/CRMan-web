/* 
 * Якщо цей код працює, його написав Василь Гошовський!
 * Якщо ні, то, напевно, хтось інший...
 */

(function () {

    angular.module('app').factory('FilterService', ['$http', filterService]);


    function filterService($http) {

        var data = {
            findFilters: findFilters,
            editFilter: editFilter,
            deleteFilter: deleteFilter
        };

        data.filters = [];
        data.filterRowSettings = [];

        return data;

        // --------Filter share functions----------




        // --------Filter crud functions---------

        function findFilters(tableName) {
            $http({
                method: "GET",
                url: restPath + 'filters/' + tableName
            }).then(function (response) {
                console.log(response);
                data.filters = response.data;

            }, function (error) {
                console.error(error);
            });
        }

        function editFilter(filter) {
            $http({
                method: "POST",
                url: restPath + 'filters/edit'
            }).then(function (response) {
                console.log(response);
            }, function (error) {
                console.error(error);
            });
        }

        function deleteFilter(id) {
            $http({
                method: "DELETE",
                url: restPath + 'filters/delete/' + id
            }).then(function (response) {
                console.log(response);
            }, function (error) {
                console.error(error);
            });
        }


    }

}());
