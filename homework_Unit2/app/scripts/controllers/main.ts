/// <reference path='../refs.ts'/>

module auction.controllers {
  'use strict';

  export interface IMainScope extends ng.IScope {
        model: MainController;
  }

  export class MainController {
      static $inject = ['$scope'];

      constructor(private $scope: IMainScope) {
          this.$scope.model = this;
      }
  }

  angular.module('auction').controller('MainCtrl', MainController);
}
