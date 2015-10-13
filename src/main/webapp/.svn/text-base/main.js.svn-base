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
        'bootstrap-treeview': 'bower_components/bootstrap-treeview/public/js/bootstrap-treeview',
        'indexService': 'scripts/services/indexService',
        'directive': 'scripts/directives/registerDirectives',
        'datatables': 'bower_components/DataTables/media/js/jquery.dataTables.min',
        'library': 'bower_components'
    },
    shim:{
        'jquery': {
            exports:'jquery'
        },
        'angular':{
            exports:'angular'
        },
        'angular-route': {
            deps:['angular'],
            exports:'angular-route'
        },
        'bootstrap-js': {
            deps:['jquery'],
            exports: 'bootstrap-js'
        },
        'bootstrap-treeview': {
            deps: ['jquery']
        }
    }
});

require(
	[
	 	'angular',
        'app',
        'route-resolver',
        'jquery',
        'bootstrap-js',
        'bootstrap-treeview',
        'indexService',
        'directive',
        'datatables'
    ],
    function(angular, app) {
        angular.bootstrap(document, ['myApp']);
    }
);
