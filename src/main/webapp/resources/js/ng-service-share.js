/* 
 * Якщо цей код працює, його написав Василь Гошовський!
 * Якщо ні, то, напевно, хтось інший...
 */


(function () {

    angular.module('app').factory('ShareService', function () {
        var data = {
            currentTable: ''
        };

        var functional = {
            getCurrentTable: getCurrentTable,
            setCurrentTable: setCurrentTable

        };

        return functional;

        //--------------------------------

        function getCurrentTable() {
            return data.currentTable;
        }

        function setCurrentTable(currentTable) {
            data.currentTable = currentTable;
        }



    });


}());

