/* 
 * Якщо цей код працює, його написав Василь Гошовський!
 * Якщо ні, то, напевно, хтось інший...
 */

(function () {

    angular.module('app').factory('DataService', ['$resource', function ($resource) {

            var data = {
                all: findAll,
                filtered: findFiltered,
                filters: findFilters
            };

            return data;


            //--------------------------------

            function findAll(tableName) {
                return $resource(restPath + tableName + '/all');
            }

            function findFiltered() {

            }

            function findFilters(tableName) {
                return $resource(restPath + 'filters/' + tableName);
            }


        }]);
}());
