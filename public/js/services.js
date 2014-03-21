
 var hostServices = angular.module('hostServices',['ngResource']);

 hostServices.factor('Host', ['$resource',
    function($resource) {
        return $resource('api/v1/host',{}, {
            query: {method: 'GET', params:{}, isArray: true}
        });
    }]);