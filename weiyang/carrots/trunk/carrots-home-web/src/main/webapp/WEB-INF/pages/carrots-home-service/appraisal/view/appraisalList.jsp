<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="appraisal" id="current_nav">
<div id="appraisalApp" ng-app="appraisalApp">
	<div ng-controller="appraisalController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>Appraisal管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addAppraisal(appraisal)">新增</span>
		    </span>
	
			<paging url="/web/a/appraisal">
				<table class="table table-striped table-bordered table-hover">
					<tr>
									                    <td>自增长ID</td>
			        				                    <td>人才id</td>
			        				                    <td>姓名</td>
			        				                    <td>职位</td>
			        				                    <td>工作经验</td>
			        				                    <td>省</td>
			        				                    <td>市</td>
			        				                    <td>县</td>
			        				                    <td>工作状态</td>
			        				                    <td>说明</td>
			        				                    <td>技能图例</td>
			        				                    <td>知识结构</td>
			        				                    <td>知识结构超过</td>
			        				                    <td>项目评语</td>
			        				                    <td>职业素养</td>
			        				                    <td>职业素养超过</td>
			        				                    <td>素养评语</td>
			        				                    <td>项目经验</td>
			        				                    <td>项目经验超过</td>
			        				                    <td>素养评语</td>
			        				                    <td>项目加分项</td>
			        				                    <td>基础信息调查</td>
			        				                    <td>工作履历调查</td>
			        				                    <td>工作能力程度</td>
			        				                    <td>岗位匹配程度</td>
			        				                    <td>人才等级</td>
			        				                    <td>综合评定</td>
			        				                    <td>得分总计</td>
			        				                    <td>最少薪资</td>
			        				                    <td>最大薪资</td>
			        				                    <td>创建时间</td>
			        				                    <td>更新时间</td>
			        				                    <td>创建人id</td>
			        				                    <td>更新人id</td>
			        							<th>操作</th>
					</tr>
					<tr ng-repeat="appraisal in data">				
									                    <td ng-bind="appraisal.id" ></td>
			        				                    <td ng-bind="appraisal.talentId" ></td>
			        				                    <td ng-bind="appraisal.name" ></td>
			        				                    <td ng-bind="appraisal.profession" ></td>
			        				                    <td ng-bind="appraisal.experience" ></td>
			        				                    <td ng-bind="appraisal.province" ></td>
			        				                    <td ng-bind="appraisal.city" ></td>
			        				                    <td ng-bind="appraisal.county" ></td>
			        				                    <td ng-bind="appraisal.workCondition" ></td>
			        				                    <td ng-bind="appraisal.comment" ></td>
			        				                    <td ng-bind="appraisal.skillExplain" ></td>
			        				                    <td ng-bind="appraisal.knowledge" ></td>
			        				                    <td ng-bind="appraisal.knowledge_exceed" ></td>
			        				                    <td ng-bind="appraisal.projectRemark" ></td>
			        				                    <td ng-bind="appraisal.professionQuality" ></td>
			        				                    <td ng-bind="appraisal.professionExceed" ></td>
			        				                    <td ng-bind="appraisal.qualityRemark" ></td>
			        				                    <td ng-bind="appraisal.project" ></td>
			        				                    <td ng-bind="appraisal.projectExceed" ></td>
			        				                    <td ng-bind="appraisal.skillRemark" ></td>
			        				                    <td ng-bind="appraisal.skillAwardMarks" ></td>
			        				                    <td ng-bind="appraisal.basicInformation" ></td>
			        				                    <td ng-bind="appraisal.workRecord" ></td>
			        				                    <td ng-bind="appraisal.workAbility" ></td>
			        				                    <td ng-bind="appraisal.post" ></td>
			        				                    <td ng-bind="appraisal.talentGrade" ></td>
			        				                    <td ng-bind="appraisal.synthesize" ></td>
			        				                    <td ng-bind="appraisal.sourcesSum" ></td>
			        				                    <td ng-bind="appraisal.minPay" ></td>
			        				                    <td ng-bind="appraisal.maxPay" ></td>
			        				                    <td ng-bind="appraisal.createAt" ></td>
			        				                    <td ng-bind="appraisal.updateAt" ></td>
			        				                    <td ng-bind="appraisal.createBy" ></td>
			        				                    <td ng-bind="appraisal.updateBy" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateAppraisal(appraisal.id)" /> 
							<input type="button" value="删除" ng-click="deleteAppraisal(appraisal.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/carrots-home-service/appraisal/appraisalList.js"></script>
