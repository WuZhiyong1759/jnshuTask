<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="occupation" id="current_nav">
<div id="occupationApp" ng-app="occupationApp">
	<div ng-controller="occupationController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>Occupation管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addOccupation(occupation)">新增</span>
		    </span>
	
			<paging url="/web/a/occupation">
				<table class="table table-striped table-bordered table-hover">
					<tr>
									                    <td>自增长ID</td>
			        				                    <td>用户ID</td>
			        				                    <td>状态</td>
			        				                    <td>职业类型</td>
			        				                    <td>创建人ID</td>
			        				                    <td>更新人ID</td>
			        				                    <td>数据更新时间</td>
			        				                    <td>数据创建时间</td>
			        							<th>操作</th>
					</tr>
					<tr ng-repeat="occupation in data">				
									                    <td ng-bind="occupation.id" ></td>
			        				                    <td ng-bind="occupation.name" ></td>
			        				                    <td ng-bind="occupation.status" ></td>
			        				                    <td ng-bind="occupation.type" ></td>
			        				                    <td ng-bind="occupation.createBy" ></td>
			        				                    <td ng-bind="occupation.updateBy" ></td>
			        				                    <td ng-bind="occupation.updateAt" ></td>
			        				                    <td ng-bind="occupation.createAt" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateOccupation(occupation.id)" /> 
							<input type="button" value="删除" ng-click="deleteOccupation(occupation.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/carrots-home-service/occupation/occupationList.js"></script>
