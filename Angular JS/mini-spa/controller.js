angular.module('spa.module')
    .controller('homeController',['$scope',function ($scope) {
        $scope.home={
            data:"Welcome to Home"
        }
    }])
    .controller('aboutController',['$scope',function ($scope) {
        $scope.about={
            data:"In About"
        }
    }])
    .controller('careerController',['$scope',function ($scope) {
        $scope.career = {
            data: "In Career"
        }
    }])