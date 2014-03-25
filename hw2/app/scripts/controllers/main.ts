/// <reference path='../refs.ts'/>

module auction.controllers {
    'use strict';

    export class MainController {
        static $inject = ['$scope'];

        constructor($scope) {

            $scope.templateUrl = 'views/main.html';

            $scope.goSearch = function () {
                $scope.templateUrl = 'views/search_results.html';
            }

            $scope.goHome = function () {
                $scope.templateUrl = 'views/main.html';
            }

            // test data (begin)

            $scope.all_items = [
                {
                    title: "Item's title",
                    image: "images/01.jpg",
                    description: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio ex hic nam provident unde. Accusantium cumque dignissimos doloremque error est facere itaque minima nesciunt nihil non, possimus repellat soluta veniam!"
                },
                {
                    title: "Item's title",
                    image: "images/02.jpg",
                    description: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio ex hic nam provident unde. Accusantium cumque dignissimos doloremque error est facere itaque minima nesciunt nihil non, possimus repellat soluta veniam!"
                },
                {
                    title: "Item's title",
                    image: "images/03.jpg",
                    description: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio ex hic nam provident unde. Accusantium cumque dignissimos doloremque error est facere itaque minima nesciunt nihil non, possimus repellat soluta veniam!"
                },
                {
                    title: "Item's title",
                    image: "images/04.jpg",
                    description: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio ex hic nam provident unde. Accusantium cumque dignissimos doloremque error est facere itaque minima nesciunt nihil non, possimus repellat soluta veniam!"
                },
                {
                    title: "Item's title",
                    image: "images/05.jpg",
                    description: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio ex hic nam provident unde. Accusantium cumque dignissimos doloremque error est facere itaque minima nesciunt nihil non, possimus repellat soluta veniam!"
                },
                {
                    title: "Item's title",
                    image: "images/06.jpg",
                    description: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio ex hic nam provident unde. Accusantium cumque dignissimos doloremque error est facere itaque minima nesciunt nihil non, possimus repellat soluta veniam!"
                }
            ];

            $scope.result_items = [
                {
                    title: "Item's title",
                    image: "images/03.jpg",
                    description: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio ex hic nam provident unde. Accusantium cumque dignissimos doloremque error est facere itaque minima nesciunt nihil non, possimus repellat soluta veniam!",
                    elapsed: 1,
                    price: 1111,
                    watchers: 11
                },
                {
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

    angular.module('auction').controller('MainCtrl', MainController);
}
