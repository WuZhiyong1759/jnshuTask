'use strict';
angular.module('carrots_zangai')
    .controller('professionLabelCtrl', function($state,$scope, $rootScope,$cookies,commonUtil, professionLabelService) {

        var vm = $scope.vm = {};
        
         vm.params = {    
                   	     id: $state.params.id
	                              ,  
                     	     pId: $state.params.pId
	                              ,  
                     	     content: $state.params.content
	                              ,  
                     	     createBy: $state.params.createBy
	                              ,  
                     	     updateBy: $state.params.updateBy
	                              ,  
                     	     updateAt: $state.params.updateAt
	                	     createAt: $state.params.createAt
	                         };


    professionLabelService.getList(vm.params).then(function(res) {
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
        
        $state.go("field.professionLabelList", vm.params,{reload:true});
    };
    });
