<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
    <input type="hidden" value="talentSkillRelation" id="current_nav">
	<div id="talentSkillRelationDetailApp" ng-app="talentSkillRelationDetailApp">
		<div ng-controller="talentSkillRelationDetailController">
			
			<div class="portlet">
			    <div class="portlet-title">
			        <div class="caption"><i class="fa fa-cogs"></i>
											  	<c:choose>
					   		<c:when test="${id > 0}">编辑</c:when> 
					   	    <c:otherwise>新增</c:otherwise>
				   	    </c:choose>		
					</div>
			    </div>
		
		
			    <form class="form-horizontal" role="form" name="talentSkillRelationForm">
			   	 	
				  
				 				 
				 				      <input type="hidden" name="id" id="talentSkillRelationId" ng-model="talentSkillRelation.id" ng-bind="talentSkillRelation.id" value="${id}">
			      				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="skillId" class="col-sm-2 control-label">技能树id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="skillId" ng-model="talentSkillRelation.skillId" ng-bind="talentSkillRelation.skillId" placeholder="请输入技能树id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="talentId" class="col-sm-2 control-label">人才id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="talentId" ng-model="talentSkillRelation.talentId" ng-bind="talentSkillRelation.talentId" placeholder="请输入人才id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="degree" class="col-sm-2 control-label">等级</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="degree" ng-model="talentSkillRelation.degree" ng-bind="talentSkillRelation.degree" placeholder="请输入等级" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="createBy" class="col-sm-2 control-label">创建人id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="createBy" ng-model="talentSkillRelation.createBy" ng-bind="talentSkillRelation.createBy" placeholder="请输入创建人id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="updateBy" class="col-sm-2 control-label">更新人id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="updateBy" ng-model="talentSkillRelation.updateBy" ng-bind="talentSkillRelation.updateBy" placeholder="请输入更新人id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            					  <div class="form-group">
			        <div class="col-sm-offset-2 col-sm-10">
			          <button class="btn btn-primary col-sm-2" type="submit" ng-click="updateTalentSkillRelation(talentSkillRelation)">保存</button>
			          <a class="btn btn-primary col-sm-2 col-sm-offset-2" ng-href="/web/c/talentSkillRelation">取消</a>
			        </div>
			      </div>
			     
			    </form>
			 </div>
		 </div>
	 </div>
	 
	 <script src="/r/js-src/web/carrots-home-service/talentSkillRelation/talentSkillRelationDetail.js"></script>
