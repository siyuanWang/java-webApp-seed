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
        'library': 'bower_components'
    },
    shim:{
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
            deps:['jquery']
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
        'bootstrap-treeview'
    ],
    function(angular, app) {
        angular.bootstrap(document, ['myApp']);
        var tree = [
                    {
                      text: "Parent 1",
                      nodes: [
                        {
                          text: "Child 1",
                          nodes: [
                            {
                              text: "Grandchild 1"
                            },
                            {
                              text: "Grandchild 2"
                            }
                          ]
                        },
                        {
                          text: "Child 2"
                        }
                      ]
                    },
                    {
                      text: "Parent 2"
                    },
                    {
                      text: "Parent 3"
                    },
                    {
                      text: "Parent 4"
                    },
                    {
                      text: "Parent 5"
                    }
                  ];
        $('#nav').treeview({
        	data: tree,         // data is not optional
        	levels: 5,
        	injectStyle: true,
            color: 'grey',
            selectedColor: 'black',
            selectedBackColor: '#f5f5f5'
    	});
    }
);
