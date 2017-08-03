<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="profession" id="current_nav">
<div id="professionApp" ng-app="professionApp">
	<div ng-controller="professionController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>Profession管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addProfession(profession)">新增</span>
		    </span>
	
			<paging url="/web/a/profession">
				<table class="table table-striped table-bordered table-hover">
					<tr>
									                    <td>自增长ID</td>
			        				                    <td>公司id</td>
			        				                    <td>职位名称</td>
			        				                    <td>工作经验</td>
			        				                    <td>职位类别</td>
			        				                    <td>学历</td>
			        				                    <td>薪资</td>
			        				                    <td>状态-1下架 1上架</td>
			        				                    <td>职责</td>
			        				                    <td>所需技能</td>
			        				                    <td>公司福利</td>
			        				                    <td>市编码</td>
			        				                    <td>县编码</td>
			        				                    <td>行业</td>
			        				                    <td>职位标签</td>
			        				                    <td>是否推荐</td>
			        				                    <td>发布时间</td>
			        				                    <td></td>
			        				                    <td></td>
			        				                    <td></td>
			        				                    <td></td>
			        							<th>操作</th>
					</tr>
					<tr ng-repeat="profession in data">				
									                    <td ng-bind="profession.id" ></td>
			        				                    <td ng-bind="profession.cId" ></td>
			        				                    <td ng-bind="profession.name" ></td>
			        				                    <td ng-bind="profession.workexp" ></td>
			        				                    <td ng-bind="profession.catgory" ></td>
			        				                    <td ng-bind="profession.education" ></td>
			        				                    <td ng-bind="profession.salary" ></td>
			        				                    <td ng-bind="profession.status" ></td>
			        				                    <td ng-bind="profession.duty" ></td>
			        				                    <td ng-bind="profession.skill" ></td>
			        				                    <td ng-bind="profession.welfare" ></td>
			        				                    <td ng-bind="profession.city" ></td>
			        				                    <td ng-bind="profession.county" ></td>
			        				                    <td ng-bind="profession.industry" ></td>
			        				                    <td ng-bind="profession.tagId" ></td>
			        				                    <td ng-bind="profession.recommend" ></td>
			        				                    <td ng-bind="profession.releasedAt" ></td>
			        				                    <td ng-bind="profession.createBy" ></td>
			        				                    <td ng-bind="profession.updateBy" ></td>
			        				                    <td ng-bind="profession.updateAt" ></td>
			        				                    <td ng-bind="profession.createAt" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateProfession(profession.id)" /> 
							<input type="button" value="删除" ng-click="deleteProfession(profession.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/carrots-zangai-home-service/profession/professionList.js"></script>
