<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
    <input type="hidden" value="profession" id="current_nav">
	<div id="professionDetailApp" ng-app="professionDetailApp">
		<div ng-controller="professionDetailController">
			
			<div class="portlet">
			    <div class="portlet-title">
			        <div class="caption"><i class="fa fa-cogs"></i>
											  	<c:choose>
					   		<c:when test="${id > 0}">编辑</c:when> 
					   	    <c:otherwise>新增</c:otherwise>
				   	    </c:choose>		
					</div>
			    </div>
		
		
			    <form class="form-horizontal" role="form" name="professionForm">
			   	 	
				  
				 				 
				 				      <input type="hidden" name="id" id="professionId" ng-model="profession.id" ng-bind="profession.id" value="${id}">
			      				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="cId" class="col-sm-2 control-label">公司id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="cId" ng-model="profession.cId" ng-bind="profession.cId" placeholder="请输入公司id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="name" class="col-sm-2 control-label">职位名称</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="name" ng-model="profession.name" ng-bind="profession.name" placeholder="请输入职位名称" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="workexp" class="col-sm-2 control-label">工作经验</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="workexp" ng-model="profession.workexp" ng-bind="profession.workexp" placeholder="请输入工作经验" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="catgory" class="col-sm-2 control-label">职位类别</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="catgory" ng-model="profession.catgory" ng-bind="profession.catgory" placeholder="请输入职位类别" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="education" class="col-sm-2 control-label">学历</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="education" ng-model="profession.education" ng-bind="profession.education" placeholder="请输入学历" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="salary" class="col-sm-2 control-label">薪资</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="salary" ng-model="profession.salary" ng-bind="profession.salary" placeholder="请输入薪资" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="status" class="col-sm-2 control-label">状态-1下架 1上架</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="status" ng-model="profession.status" ng-bind="profession.status" placeholder="请输入状态-1下架 1上架" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="duty" class="col-sm-2 control-label">职责</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="duty" ng-model="profession.duty" ng-bind="profession.duty" placeholder="请输入职责" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="skill" class="col-sm-2 control-label">所需技能</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="skill" ng-model="profession.skill" ng-bind="profession.skill" placeholder="请输入所需技能" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="welfare" class="col-sm-2 control-label">公司福利</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="welfare" ng-model="profession.welfare" ng-bind="profession.welfare" placeholder="请输入公司福利" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="city" class="col-sm-2 control-label">市编码</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="city" ng-model="profession.city" ng-bind="profession.city" placeholder="请输入市编码" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="county" class="col-sm-2 control-label">县编码</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="county" ng-model="profession.county" ng-bind="profession.county" placeholder="请输入县编码" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="industry" class="col-sm-2 control-label">行业</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="industry" ng-model="profession.industry" ng-bind="profession.industry" placeholder="请输入行业" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="tagId" class="col-sm-2 control-label">职位标签</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="tagId" ng-model="profession.tagId" ng-bind="profession.tagId" placeholder="请输入职位标签" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="recommend" class="col-sm-2 control-label">是否推荐</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="recommend" ng-model="profession.recommend" ng-bind="profession.recommend" placeholder="请输入是否推荐" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="releasedAt" class="col-sm-2 control-label">发布时间</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="releasedAt" ng-model="profession.releasedAt" ng-bind="profession.releasedAt" placeholder="请输入发布时间" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="createBy" class="col-sm-2 control-label"></label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="createBy" ng-model="profession.createBy" ng-bind="profession.createBy" placeholder="请输入" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="updateBy" class="col-sm-2 control-label"></label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="updateBy" ng-model="profession.updateBy" ng-bind="profession.updateBy" placeholder="请输入" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            					  <div class="form-group">
			        <div class="col-sm-offset-2 col-sm-10">
			          <button class="btn btn-primary col-sm-2" type="submit" ng-click="updateProfession(profession)">保存</button>
			          <a class="btn btn-primary col-sm-2 col-sm-offset-2" ng-href="/web/c/profession">取消</a>
			        </div>
			      </div>
			     
			    </form>
			 </div>
		 </div>
	 </div>
	 
	 <script src="/r/js-src/web/carrots-zangai-home-service/profession/professionDetail.js"></script>
