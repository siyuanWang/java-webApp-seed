'use strict';

requirejs.config({
    baseUrl: '/web-seed/',
    paths: {
        'jquery': 'bower_components/jquery/dist/jquery.min',
        'angular': 'bower_components/angular/angular.min',
        'angular-route': 'bower_components/angular-route/angular-route.min',
        'bootstrap-js':'bower_components/bootstrap/dist/js/bootstrap.min',
        'app': 'app',
        'route-resolver': 'scripts/routeResolver',
        'library': 'bower_components'
    },
    shim:{
        'angular':{
            exports:'angular'
        },
        'angular-route': {
            deps:['angular'],
            exports:'angular-route'
        }
    }
});

require(
	[
	 	'angular',
        'app',
        'route-resolver'
    ],
    function(angular, app) {
        angular.bootstrap(document, ['myApp']);
    }
);
