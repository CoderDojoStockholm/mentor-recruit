var mentorRecruitApp = angular.module('mentorRecruitApp', [
    'ngRoute',
    'mentorControllers'
]);

mentorRecruitApp.config(['$routeProvider',
    function($routeProvider){
        $routeProvider.
            when('/', {
                templateUrl: 'partials/mentors.html',
                controller: 'ListCtrl'
            }).
            when('/mentors/:mentorId', {
                templateUrl: 'partials/mentor.html',
                controller: 'MentorCtrl'
            }).
            otherwise({
                redirectTo: '/bye'
            });
    }
]);
