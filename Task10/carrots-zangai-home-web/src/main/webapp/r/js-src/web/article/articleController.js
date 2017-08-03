'use strict';
angular.module('carrots_zangai')
    .controller('articleCtrl', function($state,$scope, $rootScope,$cookies,commonUtil, articleService) {

        var vm = $scope.vm = {};
        
         vm.params = {    
                   	     id: $state.params.id
	                              ,  
                     	     title: $state.params.title
	                              ,  
                     	     url: $state.params.url
	                              ,  
                     	     image: $state.params.image
	                              ,  
                     	     type: $state.params.type
	                              ,  
                     	     statu: $state.params.statu
	                	     industry: $state.params.industry
	                	     indexId: $state.params.indexId
	                	     createBy: $state.params.createBy
	                	     updateBy: $state.params.updateBy
	                	     updateAt: $state.params.updateAt
	                	     createAt: $state.params.createAt
	                         };


    articleService.getList(vm.params).then(function(res) {
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
        
        $state.go("field.articleList", vm.params,{reload:true});
    };
    });
