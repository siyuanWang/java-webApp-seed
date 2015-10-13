'use strict';
define(['app'], function(app) {
    app.directive('menuDirective', function () {
        return {
            restrict: 'A',
            scope: false,
            link: function (scope, element, attrs) {
                //monitor the broadCast 'paginationData'
                scope.$on("menuDataPrepared", function() {
                    var menuData = scope.menuData;
                    $(element).treeview({
                        data: menuData,         // data is not optional
                        levels: 5,
                        injectStyle: true,
                        color: 'grey',
                        selectedColor: 'black',
                        selectedBackColor: '#f5f5f5'
                    });
                })

            }
        };
    });
});