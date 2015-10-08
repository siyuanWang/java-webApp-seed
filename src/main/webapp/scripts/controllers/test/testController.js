define(['app'], function(app) {
    var injectParams = ['$scope', '$http', '$location', '$window'];
    var testController = function($scope, $http, $location, $window) {

    };
    testController.$inject = injectParams;
    app.register.controller('testController', testController);
});