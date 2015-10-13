define(['app'], function(app) {
    var injectParams = ['$scope', '$http', '$location', 'indexService'];
    var indexController = function($scope, $http, $location, indexService) {
        $scope.queryMenuData = function() {
            indexService.queryMenus().then(function(data) {
                scope.menuData = data;
                console.log(menuData);
                //ע��һ���㲥��directive�˽��չ㲥
                $scope.$broadcast("menuDataPrepared");
            }, function(error) {
                alert(error);
            });
        };
    };
    indexController.$inject = injectParams;
    app.register.controller('indexController', indexController);
});