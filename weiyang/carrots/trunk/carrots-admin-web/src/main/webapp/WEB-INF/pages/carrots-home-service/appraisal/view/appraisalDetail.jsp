<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
    <input type="hidden" value="appraisal" id="current_nav">
	<div id="appraisalDetailApp" ng-app="appraisalDetailApp">
		<div ng-controller="appraisalDetailController">
			
			<div class="portlet">
			    <div class="portlet-title">
			        <div class="caption"><i class="fa fa-cogs"></i>
											  	<c:choose>
					   		<c:when test="${id > 0}">编辑</c:when> 
					   	    <c:otherwise>新增</c:otherwise>
				   	    </c:choose>		
					</div>
			    </div>
		
		
			    <form class="form-horizontal" role="form" name="appraisalForm">
			   	 	
				  
				 				 
				 				      <input type="hidden" name="id" id="appraisalId" ng-model="appraisal.id" ng-bind="appraisal.id" value="${id}">
			      				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="talentId" class="col-sm-2 control-label">人才id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="talentId" ng-model="appraisal.talentId" ng-bind="appraisal.talentId" placeholder="请输入人才id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="name" class="col-sm-2 control-label">姓名</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="name" ng-model="appraisal.name" ng-bind="appraisal.name" placeholder="请输入姓名" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="profession" class="col-sm-2 control-label">职位</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="profession" ng-model="appraisal.profession" ng-bind="appraisal.profession" placeholder="请输入职位" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="experience" class="col-sm-2 control-label">工作经验</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="experience" ng-model="appraisal.experience" ng-bind="appraisal.experience" placeholder="请输入工作经验" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="province" class="col-sm-2 control-label">省</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="province" ng-model="appraisal.province" ng-bind="appraisal.province" placeholder="请输入省" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="city" class="col-sm-2 control-label">市</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="city" ng-model="appraisal.city" ng-bind="appraisal.city" placeholder="请输入市" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="county" class="col-sm-2 control-label">县</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="county" ng-model="appraisal.county" ng-bind="appraisal.county" placeholder="请输入县" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="workCondition" class="col-sm-2 control-label">工作状态</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="workCondition" ng-model="appraisal.workCondition" ng-bind="appraisal.workCondition" placeholder="请输入工作状态" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="comment" class="col-sm-2 control-label">说明</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="comment" ng-model="appraisal.comment" ng-bind="appraisal.comment" placeholder="请输入说明" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="skillExplain" class="col-sm-2 control-label">技能图例</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="skillExplain" ng-model="appraisal.skillExplain" ng-bind="appraisal.skillExplain" placeholder="请输入技能图例" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="knowledge" class="col-sm-2 control-label">知识结构</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="knowledge" ng-model="appraisal.knowledge" ng-bind="appraisal.knowledge" placeholder="请输入知识结构" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="knowledge_exceed" class="col-sm-2 control-label">知识结构超过</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="knowledge_exceed" ng-model="appraisal.knowledge_exceed" ng-bind="appraisal.knowledge_exceed" placeholder="请输入知识结构超过" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="projectRemark" class="col-sm-2 control-label">项目评语</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="projectRemark" ng-model="appraisal.projectRemark" ng-bind="appraisal.projectRemark" placeholder="请输入项目评语" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="professionQuality" class="col-sm-2 control-label">职业素养</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="professionQuality" ng-model="appraisal.professionQuality" ng-bind="appraisal.professionQuality" placeholder="请输入职业素养" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="professionExceed" class="col-sm-2 control-label">职业素养超过</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="professionExceed" ng-model="appraisal.professionExceed" ng-bind="appraisal.professionExceed" placeholder="请输入职业素养超过" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="qualityRemark" class="col-sm-2 control-label">素养评语</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="qualityRemark" ng-model="appraisal.qualityRemark" ng-bind="appraisal.qualityRemark" placeholder="请输入素养评语" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="project" class="col-sm-2 control-label">项目经验</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="project" ng-model="appraisal.project" ng-bind="appraisal.project" placeholder="请输入项目经验" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="projectExceed" class="col-sm-2 control-label">项目经验超过</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="projectExceed" ng-model="appraisal.projectExceed" ng-bind="appraisal.projectExceed" placeholder="请输入项目经验超过" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="skillRemark" class="col-sm-2 control-label">素养评语</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="skillRemark" ng-model="appraisal.skillRemark" ng-bind="appraisal.skillRemark" placeholder="请输入素养评语" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="skillAwardMarks" class="col-sm-2 control-label">项目加分项</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="skillAwardMarks" ng-model="appraisal.skillAwardMarks" ng-bind="appraisal.skillAwardMarks" placeholder="请输入项目加分项" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="basicInformation" class="col-sm-2 control-label">基础信息调查</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="basicInformation" ng-model="appraisal.basicInformation" ng-bind="appraisal.basicInformation" placeholder="请输入基础信息调查" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="workRecord" class="col-sm-2 control-label">工作履历调查</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="workRecord" ng-model="appraisal.workRecord" ng-bind="appraisal.workRecord" placeholder="请输入工作履历调查" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="workAbility" class="col-sm-2 control-label">工作能力程度</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="workAbility" ng-model="appraisal.workAbility" ng-bind="appraisal.workAbility" placeholder="请输入工作能力程度" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="post" class="col-sm-2 control-label">岗位匹配程度</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="post" ng-model="appraisal.post" ng-bind="appraisal.post" placeholder="请输入岗位匹配程度" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="talentGrade" class="col-sm-2 control-label">人才等级</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="talentGrade" ng-model="appraisal.talentGrade" ng-bind="appraisal.talentGrade" placeholder="请输入人才等级" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="synthesize" class="col-sm-2 control-label">综合评定</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="synthesize" ng-model="appraisal.synthesize" ng-bind="appraisal.synthesize" placeholder="请输入综合评定" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="sourcesSum" class="col-sm-2 control-label">得分总计</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="sourcesSum" ng-model="appraisal.sourcesSum" ng-bind="appraisal.sourcesSum" placeholder="请输入得分总计" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="minPay" class="col-sm-2 control-label">最少薪资</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="minPay" ng-model="appraisal.minPay" ng-bind="appraisal.minPay" placeholder="请输入最少薪资" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="maxPay" class="col-sm-2 control-label">最大薪资</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="maxPay" ng-model="appraisal.maxPay" ng-bind="appraisal.maxPay" placeholder="请输入最大薪资" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="createBy" class="col-sm-2 control-label">创建人id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="createBy" ng-model="appraisal.createBy" ng-bind="appraisal.createBy" placeholder="请输入创建人id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="updateBy" class="col-sm-2 control-label">更新人id</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="updateBy" ng-model="appraisal.updateBy" ng-bind="appraisal.updateBy" placeholder="请输入更新人id" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            					  <div class="form-group">
			        <div class="col-sm-offset-2 col-sm-10">
			          <button class="btn btn-primary col-sm-2" type="submit" ng-click="updateAppraisal(appraisal)">保存</button>
			          <a class="btn btn-primary col-sm-2 col-sm-offset-2" ng-href="/web/c/appraisal">取消</a>
			        </div>
			      </div>
			     
			    </form>
			 </div>
		 </div>
	 </div>
	 
	 <script src="/r/js-src/web/carrots-home-service/appraisal/appraisalDetail.js"></script>
