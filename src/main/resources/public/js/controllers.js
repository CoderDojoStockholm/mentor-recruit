var mentorControllers = angular.module('mentorControllers', []);

mentorControllers.controller('ListCtrl', ['$scope', '$http',
    function($scope, $http) {
        $http.get('/api/mentors').success(function(data){
            $scope.mentors = data;
        });
        $scope.name = "World";
    }]);

mentorControllers.controller('MentorCtrl', ['$scope', '$routeParams', '$http',
    function($scope, $routeParams, $http){
        $http.get('/api/mentors/' + $routeParams.mentorId).success(function(data){
            $scope.mentor = data;
        });
    }]);