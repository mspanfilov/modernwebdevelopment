/// <reference path='../refs.ts'/>

module auction.controllers {
    'use strict';

    export class MainController {
        static $inject = ['$scope'];

        constructor($scope) {

            console.log("init MainController");

            // todo: for test only

            $scope.all_items = [
                {
                    id_product: 1,
                    title: "Item's title",
                    image: "images/01.jpg",
                    description: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio ex hic nam provident unde. Accusantium cumque dignissimos doloremque error est facere itaque minima nesciunt nihil non, possimus repellat soluta veniam!"
                },
                {
                    id_product: 2,
                    title: "Item's title",
                    image: "images/02.jpg",
                    description: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio ex hic nam provident unde. Accusantium cumque dignissimos doloremque error est facere itaque minima nesciunt nihil non, possimus repellat soluta veniam!"
                },
                {
                    id_product: 3,
                    title: "Item's title",
                    image: "images/03.jpg",
                    description: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio ex hic nam provident unde. Accusantium cumque dignissimos doloremque error est facere itaque minima nesciunt nihil non, possimus repellat soluta veniam!"
                },
                {
                    id_product: 4,
                    title: "Item's title",
                    image: "images/04.jpg",
                    description: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio ex hic nam provident unde. Accusantium cumque dignissimos doloremque error est facere itaque minima nesciunt nihil non, possimus repellat soluta veniam!"
                },
                {
                    id_product: 5,
                    title: "Item's title",
                    image: "images/05.jpg",
                    description: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio ex hic nam provident unde. Accusantium cumque dignissimos doloremque error est facere itaque minima nesciunt nihil non, possimus repellat soluta veniam!"
                },
                {
                    id_product: 6,
                    title: "Item's title",
                    image: "images/06.jpg",
                    description: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio ex hic nam provident unde. Accusantium cumque dignissimos doloremque error est facere itaque minima nesciunt nihil non, possimus repellat soluta veniam!"
                }
            ];
        }
    }

    export class SearchController {
        static $inject = ['$scope'];

        constructor($scope) {

            console.log("init SearchController");

            // todo: for test only
            $scope.result_items = [
                {
                    id_product: 3,
                    title: "Item's title",
                    image: "images/03.jpg",
                    description: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio ex hic nam provident unde. Accusantium cumque dignissimos doloremque error est facere itaque minima nesciunt nihil non, possimus repellat soluta veniam!",
                    elapsed: 1,
                    price: 1111,
                    watchers: 11
                },
                {
                    id_product: 4,
                    title: "Item's title",
                    image: "images/04.jpg",
                    description: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio ex hic nam provident unde. Accusantium cumque dignissimos doloremque error est facere itaque minima nesciunt nihil non, possimus repellat soluta veniam!",
                    elapsed: 2,
                    price: 2222,
                    watchers: 22
                }
            ];
        }
    }

    export class ProductController {
        static $inject = ['$scope', '$routeParams'];

        constructor($scope,$routeParams) {

            console.log("init ProductController");

            // todo: for test only
            $scope.product =
            {
                id_product: $routeParams.id_product,
                title: "Item's title",
                image: "images/0" + $routeParams.id_product + ".jpg",
                description: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio ex hic nam provident unde. Accusantium cumque dignissimos doloremque error est facere itaque minima nesciunt nihil non, possimus repellat soluta veniam!",
                elapsed: 1,
                price: 1111,
                watchers: 11
            }
        }
    }

    angular.module('auction').controller('SearchCtrl', SearchController);
    angular.module('auction').controller('MainCtrl', MainController);
    angular.module('auction').controller('ProductCtrl', ProductController);
}
