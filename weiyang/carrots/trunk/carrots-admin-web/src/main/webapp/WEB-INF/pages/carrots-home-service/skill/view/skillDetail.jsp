<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
    <input type="hidden" value="skill" id="current_nav">
	<div id="skillDetailApp" ng-app="skillDetailApp">
		<div ng-controller="skillDetailController">
			
			<div class="portlet">
			    <div class="portlet-title">
			        <div class="caption"><i class="fa fa-cogs"></i>
											  	<c:choose>
					   		<c:when test="${id > 0}">编辑</c:when> 
					   	    <c:otherwise>新增</c:otherwise>
				   	    </c:choose>		
					</div>
			    </div>
		
		
			    <form class="form-horizontal" role="form" name="skillForm">
			   	 	
				  
				 				 
				 				      <input type="hidden" name="id" id="skillId" ng-model="skill.id" ng-bind="skill.id" value="${id}">
			      				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="talentId" class="col-sm-2 control-label">人才id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="talentId" ng-model="skill.talentId" ng-bind="skill.talentId" placeholder="请输入人才id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="appraisalId" class="col-sm-2 control-label">测评报告id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="appraisalId" ng-model="skill.appraisalId" ng-bind="skill.appraisalId" placeholder="请输入测评报告id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="occupationId" class="col-sm-2 control-label">职业id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="occupationId" ng-model="skill.occupationId" ng-bind="skill.occupationId" placeholder="请输入职业id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="parentId" class="col-sm-2 control-label">父id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="parentId" ng-model="skill.parentId" ng-bind="skill.parentId" placeholder="请输入父id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="name" class="col-sm-2 control-label">姓名</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="name" ng-model="skill.name" ng-bind="skill.name" placeholder="请输入姓名" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="content" class="col-sm-2 control-label">技能介绍</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="content" ng-model="skill.content" ng-bind="skill.content" placeholder="请输入技能介绍" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="priority" class="col-sm-2 control-label">级别</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="priority" ng-model="skill.priority" ng-bind="skill.priority" placeholder="请输入级别" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="sort" class="col-sm-2 control-label">排序</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="sort" ng-model="skill.sort" ng-bind="skill.sort" placeholder="请输入排序" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="createBy" class="col-sm-2 control-label">创建人id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="createBy" ng-model="skill.createBy" ng-bind="skill.createBy" placeholder="请输入创建人id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="updateBy" class="col-sm-2 control-label">更新人id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="updateBy" ng-model="skill.updateBy" ng-bind="skill.updateBy" placeholder="请输入更新人id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            					  <div class="form-group">
			        <div class="col-sm-offset-2 col-sm-10">
			          <button class="btn btn-primary col-sm-2" type="submit" ng-click="updateSkill(skill)">保存</button>
			          <a class="btn btn-primary col-sm-2 col-sm-offset-2" ng-href="/web/c/skill">取消</a>
			        </div>
			      </div>
			     
			    </form>
			 </div>
		 </div>
	 </div>
	 
	 <script src="/r/js-src/web/carrots-home-service/skill/skillDetail.js"></script>
