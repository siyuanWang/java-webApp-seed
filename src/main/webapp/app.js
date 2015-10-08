'use strict';
define(['angular','angular-route'], function(angular) {
    var app = angular.module('myApp',['ngRoute','routeResolverServices']);
    app.run(['$rootScope','$location', '$routeParams', function($rootScope, $location, $routeParams) {
        $rootScope.$on('$routeChangeSuccess', function(e, current, pre) {
            console.log('Current route name: ' + $location.path());
            var path = $location.path();//获得当前路由地址

        })
    }]);
    
    app.config(['$routeProvider', 'routeResolverProvider','$controllerProvider','$compileProvider',
            '$provide','$filterProvider', function($routeProvider, routeResolverProvider, $controllerProvider, $compileProvider, $provide, $filterProvider) {
                console.log('app config.');
                app.register = {
                    controller: $controllerProvider.register,
                    directive: $compileProvider.directive,
                    filter: $filterProvider.register,
                    factory: $provide.factory,
                    service: $provide.service
                };
                var route = routeResolverProvider.route;
                //app路由
                $routeProvider
                    .when('/test', route.resolve('testController','test','test','vm', false));
                
    	}
    ]);

    return app;
});