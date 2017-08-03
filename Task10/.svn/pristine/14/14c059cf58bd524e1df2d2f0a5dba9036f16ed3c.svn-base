'use strict';
angular.module('carrots_zangai')
    .controller('companyCtrl', function($state,$scope, $rootScope,$cookies,commonUtil, companyService) {

        var vm = $scope.vm = {};
        
         vm.params = {    
                   	     id: $state.params.id
	                              ,  
                     	     name: $state.params.name
	                              ,  
                     	     logo: $state.params.logo
	                              ,  
                     	     sign: $state.params.sign
	                              ,  
                     	     number: $state.params.number
	                              ,  
                     	     email: $state.params.email
	                	     phone: $state.params.phone
	                	     address: $state.params.address
	                	     tagId: $state.params.tagId
	                	     map: $state.params.map
	                	     introduce: $state.params.introduce
	                	     financing: $state.params.financing
	                	     city: $state.params.city
	                	     county: $state.params.county
	                	     approved: $state.params.approved
	                	     jobs: $state.params.jobs
	                	     industry: $state.params.industry
	                	     freezed: $state.params.freezed
	                	     releasedAt: $state.params.releasedAt
	                	     createAt: $state.params.createAt
	                	     createBy: $state.params.createBy
	                	     updateAt: $state.params.updateAt
	                	     updateBy: $state.params.updateBy
	                         };


    companyService.getList(vm.params).then(function(res) {
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
        
        $state.go("field.companyList", vm.params,{reload:true});
    };
    });
