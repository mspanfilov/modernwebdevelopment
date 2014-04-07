/// <reference path='../refs.ts'/>

module auction.controller {
    'use strict';

    import m = auction.model;
    import s = auction.service;

    export interface IProductScope extends ng.IScope {
        model: ProductController;
    }

    export class ProductController {

        static $inject = ['$scope', '$routeParams', 'ProductService'];

        public product:m.ProductModel;

        constructor(private $scope:IProductScope, private $routeParams, private productService:s.IProductService) {

            this.$scope.model = this;
            this.productService.getById($routeParams.id_product)
                .then((product) => this.product = product);
        }
    }

    angular.module('auction').controller('ProductCtrl', ProductController);
}
