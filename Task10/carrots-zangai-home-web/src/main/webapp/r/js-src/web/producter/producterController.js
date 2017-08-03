'use strict';
angular.module('carrots_zangai')
    .controller('producterCtrl', function($state,$scope, $rootScope,$cookies,commonUtil, producterService) {

        var vm = $scope.vm = {};
        
         vm.params = {    
                   	     id: $state.params.id
	                              ,  
                     	     cId: $state.params.cId
	                              ,  
                     	     name: $state.params.name
	                              ,  
                     	     sign: $state.params.sign
	                              ,  
                     	     logo: $state.params.logo
	                              ,  
                     	     introduce: $state.params.introduce
	                	     createBy: $state.params.createBy
	                	     updateBy: $state.params.updateBy
	                	     updateAt: $state.params.updateAt
	                	     createAt: $state.params.createAt
	                         };


    producterService.getList(vm.params).then(function(res) {
        if (res.data.code === 0) {
            vm.list = res.data.data;
            vm.page = {
                next: res.data.next || 0,
                size: res.data.size || 0,
                page: res.data.page || 0,
                total: res.data.total || 0
            };
        } else {
            $rootScope.alert(res.data.message);
        }
    });
  

    vm.search = function() {
        
        $state.go("field.producterList", vm.params,{reload:true});
    };
    });
