<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
    <input type="hidden" value="recommend" id="current_nav">
	<div id="recommendDetailApp" ng-app="recommendDetailApp">
		<div ng-controller="recommendDetailController">
			
			<div class="portlet">
			    <div class="portlet-title">
			        <div class="caption"><i class="fa fa-cogs"></i>
											  	<c:choose>
					   		<c:when test="${id > 0}">编辑</c:when> 
					   	    <c:otherwise>新增</c:otherwise>
				   	    </c:choose>		
					</div>
			    </div>
		
		
			    <form class="form-horizontal" role="form" name="recommendForm">
			   	 	
				  
				 				 
				 				      <input type="hidden" name="id" id="recommendId" ng-model="recommend.id" ng-bind="recommend.id" value="${id}">
			      				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="companyId" class="col-sm-2 control-label">公司ID</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="companyId" ng-model="recommend.companyId" ng-bind="recommend.companyId" placeholder="请输入公司ID" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="talent_id" class="col-sm-2 control-label">人才ID</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="talent_id" ng-model="recommend.talentId" ng-bind="recommend.talent_id" placeholder="请输入人才ID" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="professionId" class="col-sm-2 control-label">职位ID</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="professionId" ng-model="recommend.professionId" ng-bind="recommend.professionId" placeholder="请输入职位ID" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="name" class="col-sm-2 control-label">姓名</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="name" ng-model="recommend.name" ng-bind="recommend.name" placeholder="请输入姓名" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="professionName" class="col-sm-2 control-label">职位名称</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="occupationType" ng-model="recommend.occupationType" ng-bind="recommend.occupationType" placeholder="请输入职位名称" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="companyName" class="col-sm-2 control-label">公司名称</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="companyName" ng-model="recommend.companyName" ng-bind="recommend.companyName" placeholder="请输入公司名称" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="salary" class="col-sm-2 control-label">薪资</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="salary" ng-model="recommend.salary" ng-bind="recommend.salary" placeholder="请输入薪资" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="contactPerson" class="col-sm-2 control-label">公司联系人</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="contactPerson" ng-model="recommend.contactPerson" ng-bind="recommend.contactPerson" placeholder="请输入公司联系人" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="contactNumber" class="col-sm-2 control-label">联系电话</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="contactNumber" ng-model="recommend.contactNumber" ng-bind="recommend.contactNumber" placeholder="请输入联系电话" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="recommendatory" class="col-sm-2 control-label">推荐时间</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="recommendatory" ng-model="recommend.recommendatory" ng-bind="recommend.recommendatory" placeholder="请输入推荐时间" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="status" class="col-sm-2 control-label">状态</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="status" ng-model="recommend.status" ng-bind="recommend.status" placeholder="请输入状态" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="reserveTime" class="col-sm-2 control-label">面试时间</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="reserveTime" ng-model="recommend.reserveTime" ng-bind="recommend.reserveTime" placeholder="请输入面试时间" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="hireDate" class="col-sm-2 control-label">入职时间</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="hireDate" ng-model="recommend.hireDate" ng-bind="recommend.hireDate" placeholder="请输入入职时间" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="effectiveDate" class="col-sm-2 control-label">转正时间</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="effectiveDate" ng-model="recommend.effectiveDate" ng-bind="recommend.effectiveDate" placeholder="请输入转正时间" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="officiallySalary" class="col-sm-2 control-label">入职薪资</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="officiallySalary" ng-model="recommend.officiallySalary" ng-bind="recommend.officiallySalary" placeholder="请输入入职薪资" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="serviceCharge" class="col-sm-2 control-label">服务费</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="serviceCharge" ng-model="recommend.serviceCharge" ng-bind="recommend.serviceCharge" placeholder="请输入服务费" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="tips" class="col-sm-2 control-label">备注</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="tips" ng-model="recommend.tips" ng-bind="recommend.tips" placeholder="请输入备注" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="createBy" class="col-sm-2 control-label">创建人</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="createBy" ng-model="recommend.createBy" ng-bind="recommend.createBy" placeholder="请输入创建人" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="updateBy" class="col-sm-2 control-label">更新人</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="updateBy" ng-model="recommend.updateBy" ng-bind="recommend.updateBy" placeholder="请输入更新人" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            					  <div class="form-group">
			        <div class="col-sm-offset-2 col-sm-10">
			          <button class="btn btn-primary col-sm-2" type="submit" ng-click="updateRecommend(recommend)">保存</button>
			          <a class="btn btn-primary col-sm-2 col-sm-offset-2" ng-href="/web/c/recommend">取消</a>
			        </div>
			      </div>
			     
			    </form>
			 </div>
		 </div>
	 </div>
	 
	 <script src="/r/js-src/web/carrots-home-service/recommend/recommendDetail.js"></script>
