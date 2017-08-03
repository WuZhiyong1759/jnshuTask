<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
    <input type="hidden" value="company" id="current_nav">
	<div id="companyDetailApp" ng-app="companyDetailApp">
		<div ng-controller="companyDetailController">
			
			<div class="portlet">
			    <div class="portlet-title">
			        <div class="caption"><i class="fa fa-cogs"></i>
											  	<c:choose>
					   		<c:when test="${id > 0}">编辑</c:when> 
					   	    <c:otherwise>新增</c:otherwise>
				   	    </c:choose>		
					</div>
			    </div>
		
		
			    <form class="form-horizontal" role="form" name="companyForm">
			   	 	
				  
				 				 
				 				      <input type="hidden" name="id" id="companyId" ng-model="company.id" ng-bind="company.id" value="${id}">
			      				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="name" class="col-sm-2 control-label">公司名字</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="name" ng-model="company.name" ng-bind="company.name" placeholder="请输入公司名字" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="logo" class="col-sm-2 control-label">公司图标</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="logo" ng-model="company.logo" ng-bind="company.logo" placeholder="请输入公司图标" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="sign" class="col-sm-2 control-label">公司签名</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="sign" ng-model="company.sign" ng-bind="company.sign" placeholder="请输入公司签名" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="number" class="col-sm-2 control-label">公司人数</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="number" ng-model="company.number" ng-bind="company.number" placeholder="请输入公司人数" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="email" class="col-sm-2 control-label">公司信箱</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="email" ng-model="company.email" ng-bind="company.email" placeholder="请输入公司信箱" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="phone" class="col-sm-2 control-label">公司电话</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="phone" ng-model="company.phone" ng-bind="company.phone" placeholder="请输入公司电话" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="address" class="col-sm-2 control-label">公司地址</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="address" ng-model="company.address" ng-bind="company.address" placeholder="请输入公司地址" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="tagId" class="col-sm-2 control-label">职位标签</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="tagId" ng-model="company.tagId" ng-bind="company.tagId" placeholder="请输入职位标签" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="map" class="col-sm-2 control-label">公司地图</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="map" ng-model="company.map" ng-bind="company.map" placeholder="请输入公司地图" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="introduce" class="col-sm-2 control-label">公司介绍</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="introduce" ng-model="company.introduce" ng-bind="company.introduce" placeholder="请输入公司介绍" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="financing" class="col-sm-2 control-label">融资规模</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="financing" ng-model="company.financing" ng-bind="company.financing" placeholder="请输入融资规模" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="city" class="col-sm-2 control-label">市编码</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="city" ng-model="company.city" ng-bind="company.city" placeholder="请输入市编码" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="county" class="col-sm-2 control-label">县编码</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="county" ng-model="company.county" ng-bind="company.county" placeholder="请输入县编码" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="approved" class="col-sm-2 control-label">认证状态</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="approved" ng-model="company.approved" ng-bind="company.approved" placeholder="请输入认证状态" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="jobs" class="col-sm-2 control-label">在招职位数</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="jobs" ng-model="company.jobs" ng-bind="company.jobs" placeholder="请输入在招职位数" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="industry" class="col-sm-2 control-label">行业类型</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="industry" ng-model="company.industry" ng-bind="company.industry" placeholder="请输入行业类型" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="freezed" class="col-sm-2 control-label">冻结状态</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="freezed" ng-model="company.freezed" ng-bind="company.freezed" placeholder="请输入冻结状态" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="releasedAt" class="col-sm-2 control-label">发布时间</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="releasedAt" ng-model="company.releasedAt" ng-bind="company.releasedAt" placeholder="请输入发布时间" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="createBy" class="col-sm-2 control-label"></label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="createBy" ng-model="company.createBy" ng-bind="company.createBy" placeholder="请输入" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="updateBy" class="col-sm-2 control-label"></label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="updateBy" ng-model="company.updateBy" ng-bind="company.updateBy" placeholder="请输入" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            					  <div class="form-group">
			        <div class="col-sm-offset-2 col-sm-10">
			          <button class="btn btn-primary col-sm-2" type="submit" ng-click="updateCompany(company)">保存</button>
			          <a class="btn btn-primary col-sm-2 col-sm-offset-2" ng-href="/web/c/company">取消</a>
			        </div>
			      </div>
			     
			    </form>
			 </div>
		 </div>
	 </div>
	 
	 <script src="/r/js-src/web/carrots-zangai-home-service/company/companyDetail.js"></script>
