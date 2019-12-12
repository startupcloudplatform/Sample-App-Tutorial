'use strict';

//we request the necessary providers(for example the $route Provider)
//to be injected into our configuration function and then use their methods to
//specify the behavior of the corresponding services.
angular.
    module('sampleApp').
    config(['$routeProvider',
        function config($routeProvider) {
        $routeProvider.
            when('/main', {
                templateUrl: '/app-main/app-main.template.html'
                //아래와 같이 선언하거나, html쪽에 선언하거나 한 군데에만 해야함, 그렇지 않으면 컨트롤러를 중복으로 호출함
                //controller: 'appMain as main'
            }).

            when('/forms', {
                templateUrl: '/app-form/app-form.template.html'
                //controller: 'appForm as form'
            }).

            when('/results', {
                templateUrl: '/app-result/app-result.template.html'
                // controller: 'appResult'
            }).
            //rediect
            otherwise('/main');
        }
    ]);
