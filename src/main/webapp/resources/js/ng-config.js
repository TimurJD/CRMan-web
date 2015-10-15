/* 
 * Якщо цей код працює, його написав Василь Гошовський!
 * Якщо ні, то, напевно, хтось інший...
 */

/* global angular */

(function () {
    'use strict';

    angular.module('app', [])
    	.config(function ($httpProvider) {
//	        $httpProvider.defaults.headers.common["X-Domain"] = "";
	        $httpProvider.defaults.headers.common['Content-Type'] = 'application/json'
		});
}());
