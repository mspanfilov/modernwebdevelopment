/// <reference path='../refs.ts'/>

module auction.controllers {
    'use strict';

    export interface IMainScope extends ng.IScope {
        model: MainController;
    }

    export class MainController {
        static $inject = ['$scope'];

        constructor($scope) {
            //this.$scope.model = this;


            $scope.templateUrl = 'views/main.html';

            $scope.goSearch = function () {
                $scope.templateUrl = 'views/search.html';
            }

            $scope.goHome = function () {
                $scope.templateUrl = 'views/main.html';
            }

        }
    }

    angular.module('auction').controller('MainCtrl', MainController);
}
