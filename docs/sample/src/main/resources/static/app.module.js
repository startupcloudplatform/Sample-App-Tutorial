'use strict';

// Define the `sampleApp` module
angular.module('sampleApp', [
    // ...which depends on the `phoneList` module
    'ngRoute'
]).factory('dataService', function(){
    var formData = {};
    return formData;
});