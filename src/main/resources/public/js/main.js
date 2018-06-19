var app = angular.module("springDemo", []);

app.controller("AppCtrl", function($scope, $http) {
    $scope.websites = [];

    $http({
        method: 'GET',
        url: 'http://localhost:8099/api/stackoverflow'
    }).then(function successCallback(response) {
       $scope.websites = response.data;
    }, function errorCallback(response){

    });
});