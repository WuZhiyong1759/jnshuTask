<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="skill" id="current_nav">
<div id="skillApp" ng-app="skillApp">
	<div ng-controller="skillController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>Skill管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addSkill(skill)">新增</span>
		    </span>
	
			<paging url="/web/a/skill">
				<table class="table table-striped table-bordered table-hover">
					<tr>
									                    <td>自增长ID</td>
			        				                    <td>人才id</td>
			        				                    <td>测评报告id</td>
			        				                    <td>职业id</td>
			        				                    <td>父id</td>
			        				                    <td>姓名</td>
			        				                    <td>技能介绍</td>
			        				                    <td>级别</td>
			        				                    <td>排序</td>
			        				                    <td>创建人id</td>
			        				                    <td>更新人id</td>
			        				                    <td>更新时间</td>
			        				                    <td>创建时间</td>
			        							<th>操作</th>
					</tr>
					<tr ng-repeat="skill in data">				
									                    <td ng-bind="skill.id" ></td>
			        				                    <td ng-bind="skill.talentId" ></td>
			        				                    <td ng-bind="skill.appraisalId" ></td>
			        				                    <td ng-bind="skill.occupationId" ></td>
			        				                    <td ng-bind="skill.parentId" ></td>
			        				                    <td ng-bind="skill.name" ></td>
			        				                    <td ng-bind="skill.content" ></td>
			        				                    <td ng-bind="skill.priority" ></td>
			        				                    <td ng-bind="skill.sort" ></td>
			        				                    <td ng-bind="skill.createBy" ></td>
			        				                    <td ng-bind="skill.updateBy" ></td>
			        				                    <td ng-bind="skill.updateAt" ></td>
			        				                    <td ng-bind="skill.createAt" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateSkill(skill.id)" /> 
							<input type="button" value="删除" ng-click="deleteSkill(skill.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/carrots-home-service/skill/skillList.js"></script>
