<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="talent" id="current_nav">
<div id="talentApp" ng-app="talentApp">
	<div ng-controller="talentController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>Talent管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addTalent(talent)">新增</span>
		    </span>
	
			<paging url="/web/a/talent">
				<table class="table table-striped table-bordered table-hover">
					<tr>
									                    <td>自增ID</td>
			        				                    <td>候选人ID</td>
			        				                    <td>职业类别</td>
			        				                    <td>测评报告</td>
			        				                    <td>人才等级</td>
			        				                    <td>推荐职位数</td>
			        				                    <td>需要推荐</td>
			        				                    <td>状态</td>
			        				                    <td>姓名</td>
			        				                    <td>性别</td>
			        				                    <td>婚育状况</td>
			        				                    <td>出生年月</td>
			        				                    <td>电子邮箱</td>
			        				                    <td>联系电话</td>
			        				                    <td>现有地址</td>
			        				                    <td>学历</td>
			        				                    <td>毕业学校</td>
			        				                    <td>专业</td>
			        				                    <td>英语水平</td>
			        				                    <td>上家公司</td>
			        				                    <td>上家职位</td>
			        				                    <td>上家薪资</td>
			        				                    <td>工作经验</td>
			        				                    <td>BAT从业经验</td>
			        				                    <td>大数据高并发经验</td>
			        				                    <td>所属行业</td>
			        				                    <td>融资规模</td>
			        				                    <td>团队规模</td>
			        				                    <td>盈利情况</td>
			        				                    <td>用户量</td>
			        				                    <td>架构</td>
			        				                    <td>工作强度</td>
			        				                    <td>省编码</td>
			        				                    <td>市编码</td>
			        				                    <td>县编码</td>
			        				                    <td>期望薪资</td>
			        				                    <td>工作状态</td>
			        				                    <td>leader背景</td>
			        				                    <td>备注</td>
			        				                    <td>学习能力</td>
			        				                    <td>技术水平</td>
			        				                    <td>工作稳定</td>
			        				                    <td>简历是否真实</td>
			        				                    <td>人才标签</td>
			        				                    <td>备注</td>
			        				                    <td>个人简历</td>
			        				                    <td>个人头像</td>
			        				                    <td>创建人ID</td>
			        				                    <td>更新人ID</td>
			        				                    <td>创建时间</td>
			        				                    <td>更新时间</td>
			        							<th>操作</th>
					</tr>
					<tr ng-repeat="talent in data">				
									                    <td ng-bind="talent.id" ></td>
			        				                    <td ng-bind="talent.candidateId" ></td>
			        				                    <td ng-bind="talent.occupationType" ></td>
			        				                    <td ng-bind="talent.appraisal" ></td>
			        				                    <td ng-bind="talent.talentLevel" ></td>
			        				                    <td ng-bind="talent.recommendNum" ></td>
			        				                    <td ng-bind="talent.isRecommend" ></td>
			        				                    <td ng-bind="talent.isShelve" ></td>
			        				                    <td ng-bind="talent.name" ></td>
			        				                    <td ng-bind="talent.gender" ></td>
			        				                    <td ng-bind="talent.maritalStatus" ></td>
			        				                    <td ng-bind="talent.birth" ></td>
			        				                    <td ng-bind="talent.email" ></td>
			        				                    <td ng-bind="talent.phone" ></td>
			        				                    <td ng-bind="talent.address" ></td>
			        				                    <td ng-bind="talent.degree" ></td>
			        				                    <td ng-bind="talent.graduate" ></td>
			        				                    <td ng-bind="talent.major" ></td>
			        				                    <td ng-bind="talent.englishSkill" ></td>
			        				                    <td ng-bind="talent.exCompany" ></td>
			        				                    <td ng-bind="talent.exJob" ></td>
			        				                    <td ng-bind="talent.exSalary" ></td>
			        				                    <td ng-bind="talent.workExperience" ></td>
			        				                    <td ng-bind="talent.isBat" ></td>
			        				                    <td ng-bind="talent.isBigdata" ></td>
			        				                    <td ng-bind="talent.workIndustry" ></td>
			        				                    <td ng-bind="talent.workFinanceRound" ></td>
			        				                    <td ng-bind="talent.workGroupScale" ></td>
			        				                    <td ng-bind="talent.workProfitStatus" ></td>
			        				                    <td ng-bind="talent.workUserNumbers" ></td>
			        				                    <td ng-bind="talent.workJobType" ></td>
			        				                    <td ng-bind="talent.workIntensity" ></td>
			        				                    <td ng-bind="talent.province" ></td>
			        				                    <td ng-bind="talent.city" ></td>
			        				                    <td ng-bind="talent.county" ></td>
			        				                    <td ng-bind="talent.workSalary" ></td>
			        				                    <td ng-bind="talent.workStatus" ></td>
			        				                    <td ng-bind="talent.workLeaderBackground" ></td>
			        				                    <td ng-bind="talent.workTips" ></td>
			        				                    <td ng-bind="talent.commentStudyAbility" ></td>
			        				                    <td ng-bind="talent.commentSkillType" ></td>
			        				                    <td ng-bind="talent.commentWorkStable" ></td>
			        				                    <td ng-bind="talent.commentResumeReliability" ></td>
			        				                    <td ng-bind="talent.commentTalentTabs" ></td>
			        				                    <td ng-bind="talent.commentTips" ></td>
			        				                    <td ng-bind="talent.resume" ></td>
			        				                    <td ng-bind="talent.avatar" ></td>
			        				                    <td ng-bind="talent.createBy" ></td>
			        				                    <td ng-bind="talent.updateBy" ></td>
			        				                    <td ng-bind="talent.createAt" ></td>
			        				                    <td ng-bind="talent.updateAt" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateTalent(talent.id)" /> 
							<input type="button" value="删除" ng-click="deleteTalent(talent.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/carrots-home-service/talent/talentList.js"></script>
