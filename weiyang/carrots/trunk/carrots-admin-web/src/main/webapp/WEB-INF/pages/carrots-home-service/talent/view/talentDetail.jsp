<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
    <input type="hidden" value="talent" id="current_nav">
	<div id="talentDetailApp" ng-app="talentDetailApp">
		<div ng-controller="talentDetailController">
			
			<div class="portlet">
			    <div class="portlet-title">
			        <div class="caption"><i class="fa fa-cogs"></i>
											  	<c:choose>
					   		<c:when test="${id > 0}">编辑</c:when> 
					   	    <c:otherwise>新增</c:otherwise>
				   	    </c:choose>		
					</div>
			    </div>
		
		
			    <form class="form-horizontal" role="form" name="talentForm">
			   	 	
				  
				 				 
				 				      <input type="hidden" name="id" id="talentId" ng-model="talent.id" ng-bind="talent.id" value="${id}">
			      				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="candidateId" class="col-sm-2 control-label">候选人ID</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="candidateId" ng-model="talent.candidateId" ng-bind="talent.candidateId" placeholder="请输入候选人ID" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="occupationType" class="col-sm-2 control-label">职业类别</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="occupationType" ng-model="talent.occupationType" ng-bind="talent.occupationType" placeholder="请输入职业类别" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="appraisal" class="col-sm-2 control-label">测评报告</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="appraisal" ng-model="talent.appraisal" ng-bind="talent.appraisal" placeholder="请输入测评报告" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="talentLevel" class="col-sm-2 control-label">人才等级</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="talentLevel" ng-model="talent.talentLevel" ng-bind="talent.talentLevel" placeholder="请输入人才等级" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="recommondNum" class="col-sm-2 control-label">推荐职位数</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="recommendNum" ng-model="talent.recommendNum" ng-bind="talent.recommendNum" placeholder="请输入推荐职位数" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="isRecommond" class="col-sm-2 control-label">需要推荐</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="isRecommend" ng-model="talent.isRecommend" ng-bind="talent.isRecommend" placeholder="请输入需要推荐" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="isShelve" class="col-sm-2 control-label">状态</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="isShelve" ng-model="talent.isShelve" ng-bind="talent.isShelve" placeholder="请输入状态" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="name" class="col-sm-2 control-label">姓名</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="name" ng-model="talent.name" ng-bind="talent.name" placeholder="请输入姓名" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="gender" class="col-sm-2 control-label">性别</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="gender" ng-model="talent.gender" ng-bind="talent.gender" placeholder="请输入性别" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="maritalStatus" class="col-sm-2 control-label">婚育状况</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="maritalStatus" ng-model="talent.maritalStatus" ng-bind="talent.maritalStatus" placeholder="请输入婚育状况" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="birth" class="col-sm-2 control-label">出生年月</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="birth" ng-model="talent.birth" ng-bind="talent.birth" placeholder="请输入出生年月" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="email" class="col-sm-2 control-label">电子邮箱</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="email" ng-model="talent.email" ng-bind="talent.email" placeholder="请输入电子邮箱" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="phone" class="col-sm-2 control-label">联系电话</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="phone" ng-model="talent.phone" ng-bind="talent.phone" placeholder="请输入联系电话" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="address" class="col-sm-2 control-label">现有地址</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="address" ng-model="talent.address" ng-bind="talent.address" placeholder="请输入现有地址" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="degree" class="col-sm-2 control-label">学历</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="degree" ng-model="talent.degree" ng-bind="talent.degree" placeholder="请输入学历" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="graduate" class="col-sm-2 control-label">毕业学校</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="graduate" ng-model="talent.graduate" ng-bind="talent.graduate" placeholder="请输入毕业学校" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="major" class="col-sm-2 control-label">专业</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="major" ng-model="talent.major" ng-bind="talent.major" placeholder="请输入专业" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="englishSkill" class="col-sm-2 control-label">英语水平</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="englishSkill" ng-model="talent.englishSkill" ng-bind="talent.englishSkill" placeholder="请输入英语水平" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="exCompany" class="col-sm-2 control-label">上家公司</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="exCompany" ng-model="talent.exCompany" ng-bind="talent.exCompany" placeholder="请输入上家公司" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="exJob" class="col-sm-2 control-label">上家职位</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="exJob" ng-model="talent.exJob" ng-bind="talent.exJob" placeholder="请输入上家职位" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="exSalary" class="col-sm-2 control-label">上家薪资</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="exSalary" ng-model="talent.exSalary" ng-bind="talent.exSalary" placeholder="请输入上家薪资" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="workExperience" class="col-sm-2 control-label">工作经验</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="workExperience" ng-model="talent.workExperience" ng-bind="talent.workExperience" placeholder="请输入工作经验" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="isBat" class="col-sm-2 control-label">BAT从业经验</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="isBat" ng-model="talent.isBat" ng-bind="talent.isBat" placeholder="请输入BAT从业经验" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="isBigdata" class="col-sm-2 control-label">大数据高并发经验</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="isBigdata" ng-model="talent.isBigdata" ng-bind="talent.isBigdata" placeholder="请输入大数据高并发经验" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="workIndustry" class="col-sm-2 control-label">所属行业</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="workIndustry" ng-model="talent.workIndustry" ng-bind="talent.workIndustry" placeholder="请输入所属行业" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="workFinanceRound" class="col-sm-2 control-label">融资规模</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="workFinanceRound" ng-model="talent.workFinanceRound" ng-bind="talent.workFinanceRound" placeholder="请输入融资规模" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="workGroupScale" class="col-sm-2 control-label">团队规模</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="workGroupScale" ng-model="talent.workGroupScale" ng-bind="talent.workGroupScale" placeholder="请输入团队规模" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="workProfitStatus" class="col-sm-2 control-label">盈利情况</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="workProfitStatus" ng-model="talent.workProfitStatus" ng-bind="talent.workProfitStatus" placeholder="请输入盈利情况" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="workUserNumbers" class="col-sm-2 control-label">用户量</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="workUserNumbers" ng-model="talent.workUserNumbers" ng-bind="talent.workUserNumbers" placeholder="请输入用户量" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="workJobType" class="col-sm-2 control-label">架构</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="workJobType" ng-model="talent.workJobType" ng-bind="talent.workJobType" placeholder="请输入架构" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="workIntensity" class="col-sm-2 control-label">工作强度</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="workIntensity" ng-model="talent.workIntensity" ng-bind="talent.workIntensity" placeholder="请输入工作强度" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="province" class="col-sm-2 control-label">省编码</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="province" ng-model="talent.province" ng-bind="talent.province" placeholder="请输入省编码" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="city" class="col-sm-2 control-label">市编码</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="city" ng-model="talent.city" ng-bind="talent.city" placeholder="请输入市编码" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="county" class="col-sm-2 control-label">县编码</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="county" ng-model="talent.county" ng-bind="talent.county" placeholder="请输入县编码" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="workSalary" class="col-sm-2 control-label">期望薪资</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="workSalary" ng-model="talent.workSalary" ng-bind="talent.workSalary" placeholder="请输入期望薪资" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="workStatus" class="col-sm-2 control-label">工作状态</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="workStatus" ng-model="talent.workStatus" ng-bind="talent.workStatus" placeholder="请输入工作状态" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="workLeaderBackground" class="col-sm-2 control-label">leader背景</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="workLeaderBackground" ng-model="talent.workLeaderBackground" ng-bind="talent.workLeaderBackground" placeholder="请输入leader背景" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="workTips" class="col-sm-2 control-label">备注</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="workTips" ng-model="talent.workTips" ng-bind="talent.workTips" placeholder="请输入备注" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="commentStudyAbility" class="col-sm-2 control-label">学习能力</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="commentStudyAbility" ng-model="talent.commentStudyAbility" ng-bind="talent.commentStudyAbility" placeholder="请输入学习能力" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="commentSkillType" class="col-sm-2 control-label">技术水平</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="commentSkillType" ng-model="talent.commentSkillType" ng-bind="talent.commentSkillType" placeholder="请输入技术水平" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="commentWorkStable" class="col-sm-2 control-label">工作稳定</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="commentWorkStable" ng-model="talent.commentWorkStable" ng-bind="talent.commentWorkStable" placeholder="请输入工作稳定" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="commentResumeReliability" class="col-sm-2 control-label">简历是否真实</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="commentResumeReliability" ng-model="talent.commentResumeReliability" ng-bind="talent.commentResumeReliability" placeholder="请输入简历是否真实" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="commentTalentTabs" class="col-sm-2 control-label">人才标签</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="commentTalentTabs" ng-model="talent.commentTalentTabs" ng-bind="talent.commentTalentTabs" placeholder="请输入人才标签" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="commentTips" class="col-sm-2 control-label">备注</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="commentTips" ng-model="talent.commentTips" ng-bind="talent.commentTips" placeholder="请输入备注" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="resume" class="col-sm-2 control-label">个人简历</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="resume" ng-model="talent.resume" ng-bind="talent.resume" placeholder="请输入个人简历" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="avatar" class="col-sm-2 control-label">个人头像</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="avatar" ng-model="talent.avatar" ng-bind="talent.avatar" placeholder="请输入个人头像" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="createBy" class="col-sm-2 control-label">创建人ID</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="createBy" ng-model="talent.createBy" ng-bind="talent.createBy" placeholder="请输入创建人ID" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       	           
	                <div class="form-group">
			        <label for="updateBy" class="col-sm-2 control-label">更新人ID</label>
			        <div class="col-sm-6">
			          <input type="text" class="form-control" name="updateBy" ng-model="talent.updateBy" ng-bind="talent.updateBy" placeholder="请输入更新人ID" required>
			        </div>
			        </div>
	           
		   
	               			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            				 
				 			       				     
				     
				    
			        			      
				  				  
				    
				 
				
		   
	            					  <div class="form-group">
			        <div class="col-sm-offset-2 col-sm-10">
			          <button class="btn btn-primary col-sm-2" type="submit" ng-click="updateTalent(talent)">保存</button>
			          <a class="btn btn-primary col-sm-2 col-sm-offset-2" ng-href="/web/c/talent">取消</a>
			        </div>
			      </div>
			     
			    </form>
			 </div>
		 </div>
	 </div>
	 
	 <script src="/r/js-src/web/carrots-home-service/talent/talentDetail.js"></script>
