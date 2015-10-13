define(['app'], function(app) {
    var injectParams = ['$scope', '$http', '$location'];
    var sysUserController = function($scope, $http, $location, indexService) {
        $("#example").DataTable();
    };
    sysUserController.$inject = injectParams;
    app.register.controller('sysUserController', sysUserController);
});