function HostCtrl($scope) {

    $scope.addHost = function() {
        $scope.hosts.push(
            {
                url:$scope.url,
                status:false,
                type:$scope.type,
                port:$scope.port,
                response:$scope.responseCode
            });
        $scope.url = '';
        $scope.type = '';
        $scope.port = '';
        $scope.responseCode = '';
    };

    $scope.removeHost = function(idx) {
        $scope.hosts.splice(idx,1);
    }

}