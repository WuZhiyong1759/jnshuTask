'use strict';
angular.module('carrots_zangai')
    .controller('professionCtrl', function($state,$scope, $rootScope,$cookies,commonUtil, professionService) {

        var vm = $scope.vm = {};
        
         vm.params = {    
                   	     id: $state.params.id
	                              ,  
                     	     cId: $state.params.cId
	                              ,  
                     	     name: $state.params.name
	                              ,  
                     	     workexp: $state.params.workexp
	                              ,  
                     	     catgory: $state.params.catgory
	                              ,  
                     	     education: $state.params.education
	                	     salary: $state.params.salary
	                	     status: $state.params.status
	                	     duty: $state.params.duty
	                	     skill: $state.params.skill
	                	     welfare: $state.params.welfare
	                	     city: $state.params.city
	                	     county: $state.params.county
	                	     industry: $state.params.industry
	                	     tagId: $state.params.tagId
	                	     recommend: $state.params.recommend
	                	     releasedAt: $state.params.releasedAt
	                	     createBy: $state.params.createBy
	                	     updateBy: $state.params.updateBy
	                	     updateAt: $state.params.updateAt
	                	     createAt: $state.params.createAt
	                         };


    professionService.getList(vm.params).then(function(res) {
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
        
        $state.go("field.professionList", vm.params,{reload:true});
    };
    });
