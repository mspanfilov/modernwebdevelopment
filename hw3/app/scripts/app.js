'use strict';

var auction = angular.module('auction', ['ngRoute']);

auction.config(function($routeProvider) {
    $routeProvider
    .when('/', {
        templateUrl : 'views/main.html',
        controller  : 'MainCtrl'
    })
    .when('/search', {
        templateUrl : 'views/search_results.html',
        controller  : 'SearchCtrl'
    })
    .when('/product/:id_product', {
        templateUrl : 'views/product.html',
        controller  : 'ProductCtrl'
    })
    .otherwise({
        redirectTo: '/'
    });

});


