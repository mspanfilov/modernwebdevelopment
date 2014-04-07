/// <reference path='refs.ts'/>

module auction {
    'use strict';

    angular.module('auction', ['ngRoute'])
        .config(function ($routeProvider) {
            $routeProvider
                .when('/', {
                    templateUrl: 'views/main.html',
                    controller: 'MainCtrl'
                })
                .when('/search', {
                    templateUrl: 'views/search_results.html',
                    controller: 'SearchCtrl'
                })
                .when('/product/:id_product', {
                    templateUrl: 'views/product.html',
                    controller: 'ProductCtrl'
                })
                .otherwise({
                    redirectTo: '/'
                });
        })
}


