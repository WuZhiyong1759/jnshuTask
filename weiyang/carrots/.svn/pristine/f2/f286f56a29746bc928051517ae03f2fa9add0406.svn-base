<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="talentSkillRelation" id="current_nav">
<div id="talentSkillRelationApp" ng-app="talentSkillRelationApp">
	<div ng-controller="talentSkillRelationController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>TalentSkillRelation管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addTalentSkillRelation(talentSkillRelation)">新增</span>
		    </span>
	
			<paging url="/web/a/talentSkillRelation">
				<table class="table table-striped table-bordered table-hover">
					<tr>
									                    <td>自增长ID</td>
			        				                    <td>技能树id</td>
			        				                    <td>人才id</td>
			        				                    <td>等级</td>
			        				                    <td>创建人id</td>
			        				                    <td>更新人id</td>
			        				                    <td>更新时间</td>
			        				                    <td>创建时间</td>
			        							<th>操作</th>
					</tr>
					<tr ng-repeat="talentSkillRelation in data">				
									                    <td ng-bind="talentSkillRelation.id" ></td>
			        				                    <td ng-bind="talentSkillRelation.skillId" ></td>
			        				                    <td ng-bind="talentSkillRelation.talentId" ></td>
			        				                    <td ng-bind="talentSkillRelation.degree" ></td>
			        				                    <td ng-bind="talentSkillRelation.createBy" ></td>
			        				                    <td ng-bind="talentSkillRelation.updateBy" ></td>
			        				                    <td ng-bind="talentSkillRelation.updateAt" ></td>
			        				                    <td ng-bind="talentSkillRelation.createAt" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateTalentSkillRelation(talentSkillRelation.id)" /> 
							<input type="button" value="删除" ng-click="deleteTalentSkillRelation(talentSkillRelation.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/carrots-home-service/talentSkillRelation/talentSkillRelationList.js"></script>
