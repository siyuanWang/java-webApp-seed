'use strict';
define(['app'], function(app) {
    app.factory('indexService', ['$http','$q', function($http, $q) {

        function queryMenus() {
            var defer = $q.defer();
            $http.get('/web-seed/menu/query')
                .success(function(data, status, headers, config) {
                    defer.resolve(data);
                })
                .error(function(response, status, headers, config) {
                    defer.reject(response);
                });
            return defer.promise;
        }

        return {
            queryMenus: queryMenus
        }
    }]);
});