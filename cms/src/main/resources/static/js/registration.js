/**
 * 
 */
angular.module('registrationApp', [])
.controller('registrationController', function($scope, $http) {
    $http.get('http://localhost:8080/registration').
        then(function(response) {
            $scope.greeting = response.data;
        });
});