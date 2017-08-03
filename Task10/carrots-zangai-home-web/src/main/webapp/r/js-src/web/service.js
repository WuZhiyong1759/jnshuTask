'use strict';
angular.module('carrots_zangai')

    .factory('pathProject', function (commonUtil) {
        return {
                	     professionLabel: function (id) {
                if (!id) {
                    return "ajax/u/professionLabel";
                } else {
                    return "ajax/u/professionLabel/" + id;
                }
            },
          professionLabel_list: "ajax/u/professionLabel/search"
          
                                   ,  
                        
          
         
         	     professionLabel: function (id) {
                if (!id) {
                    return "ajax/u/professionLabel";
                } else {
                    return "ajax/u/professionLabel/" + id;
                }
            },
          professionLabel_list: "ajax/u/professionLabel/search"
          
                                   ,  
                        
          
         
         	     professionLabel: function (id) {
                if (!id) {
                    return "ajax/u/professionLabel";
                } else {
                    return "ajax/u/professionLabel/" + id;
                }
            },
          professionLabel_list: "ajax/u/professionLabel/search"
          
                                   ,  
                        
          
         
         	     professionLabel: function (id) {
                if (!id) {
                    return "ajax/u/professionLabel";
                } else {
                    return "ajax/u/professionLabel/" + id;
                }
            },
          professionLabel_list: "ajax/u/professionLabel/search"
          
                                   ,  
                        
          
         
         	     professionLabel: function (id) {
                if (!id) {
                    return "ajax/u/professionLabel";
                } else {
                    return "ajax/u/professionLabel/" + id;
                }
            },
          professionLabel_list: "ajax/u/professionLabel/search"
          
                                   ,  
                        
          
         
         	     professionLabel: function (id) {
                if (!id) {
                    return "ajax/u/professionLabel";
                } else {
                    return "ajax/u/professionLabel/" + id;
                }
            },
          professionLabel_list: "ajax/u/professionLabel/search"
          
                        
          
         
         
        }
    })
    
           
	    .factory('companyService', function ($http, pathProject) {
        return {
            add: function (params) {
                return $http.post(pathProject.company(), params);
            },
            update: function (id, params) {
              
                return $http.put(pathProject.company(id), params);
            },
            getList: function (params) {
                return $http.get(pathProject.company_list, {params: params});
            },
            get: function (id) {
                return $http.get(pathProject.company(id));
            },            
            del: function (id) {
                
                return $http.delete(pathProject.company(id));
            }
           
        }
    })
                
	    .factory('professionService', function ($http, pathProject) {
        return {
            add: function (params) {
                return $http.post(pathProject.profession(), params);
            },
            update: function (id, params) {
              
                return $http.put(pathProject.profession(id), params);
            },
            getList: function (params) {
                return $http.get(pathProject.profession_list, {params: params});
            },
            get: function (id) {
                return $http.get(pathProject.profession(id));
            },            
            del: function (id) {
                
                return $http.delete(pathProject.profession(id));
            }
           
        }
    })
                
	    .factory('producterService', function ($http, pathProject) {
        return {
            add: function (params) {
                return $http.post(pathProject.producter(), params);
            },
            update: function (id, params) {
              
                return $http.put(pathProject.producter(id), params);
            },
            getList: function (params) {
                return $http.get(pathProject.producter_list, {params: params});
            },
            get: function (id) {
                return $http.get(pathProject.producter(id));
            },            
            del: function (id) {
                
                return $http.delete(pathProject.producter(id));
            }
           
        }
    })
                
	    .factory('companyLabelService', function ($http, pathProject) {
        return {
            add: function (params) {
                return $http.post(pathProject.companyLabel(), params);
            },
            update: function (id, params) {
              
                return $http.put(pathProject.companyLabel(id), params);
            },
            getList: function (params) {
                return $http.get(pathProject.companyLabel_list, {params: params});
            },
            get: function (id) {
                return $http.get(pathProject.companyLabel(id));
            },            
            del: function (id) {
                
                return $http.delete(pathProject.companyLabel(id));
            }
           
        }
    })
                
	    .factory('articleService', function ($http, pathProject) {
        return {
            add: function (params) {
                return $http.post(pathProject.article(), params);
            },
            update: function (id, params) {
              
                return $http.put(pathProject.article(id), params);
            },
            getList: function (params) {
                return $http.get(pathProject.article_list, {params: params});
            },
            get: function (id) {
                return $http.get(pathProject.article(id));
            },            
            del: function (id) {
                
                return $http.delete(pathProject.article(id));
            }
           
        }
    })
                
	    .factory('professionLabelService', function ($http, pathProject) {
        return {
            add: function (params) {
                return $http.post(pathProject.professionLabel(), params);
            },
            update: function (id, params) {
              
                return $http.put(pathProject.professionLabel(id), params);
            },
            getList: function (params) {
                return $http.get(pathProject.professionLabel_list, {params: params});
            },
            get: function (id) {
                return $http.get(pathProject.professionLabel(id));
            },            
            del: function (id) {
                
                return $http.delete(pathProject.professionLabel(id));
            }
           
        }
    })
             
   
    ;






