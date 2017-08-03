<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="recommend" id="current_nav">
<div id="recommendApp" ng-app="recommendApp">
	<div ng-controller="recommendController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>Recommend管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addRecommend(recommend)">新增</span>
		    </span>
	
			<paging url="/web/a/recommend">
				<table class="table table-striped table-bordered table-hover">
					<tr>
									                    <td>自增ID</td>
			        				                    <td>公司ID</td>
			        				                    <td>人才ID</td>
			        				                    <td>职位ID</td>
			        				                    <td>姓名</td>
			        				                    <td>职位名称</td>
			        				                    <td>公司名称</td>
			        				                    <td>薪资</td>
			        				                    <td>公司联系人</td>
			        				                    <td>联系电话</td>
			        				                    <td>推荐时间</td>
			        				                    <td>状态</td>
			        				                    <td>面试时间</td>
			        				                    <td>入职时间</td>
			        				                    <td>转正时间</td>
			        				                    <td>入职薪资</td>
			        				                    <td>服务费</td>
			        				                    <td>备注</td>
			        				                    <td>创建人</td>
			        				                    <td>更新人</td>
			        				                    <td>创建时间</td>
			        				                    <td>更新时间</td>
			        							<th>操作</th>
					</tr>
					<tr ng-repeat="recommend in data">				
									                    <td ng-bind="recommend.id" ></td>
			        				                    <td ng-bind="recommend.companyId" ></td>
			        				                    <td ng-bind="recommend.talentId" ></td>
			        				                    <td ng-bind="recommend.professionId" ></td>
			        				                    <td ng-bind="recommend.name" ></td>
			        				                    <td ng-bind="recommend.occupationType" ></td>
			        				                    <td ng-bind="recommend.companyName" ></td>
			        				                    <td ng-bind="recommend.salary" ></td>
			        				                    <td ng-bind="recommend.contactPerson" ></td>
			        				                    <td ng-bind="recommend.contactNumber" ></td>
			        				                    <td ng-bind="recommend.recommendatory" ></td>
			        				                    <td ng-bind="recommend.status" ></td>
			        				                    <td ng-bind="recommend.reserveTime" ></td>
			        				                    <td ng-bind="recommend.hireDate" ></td>
			        				                    <td ng-bind="recommend.effectiveDate" ></td>
			        				                    <td ng-bind="recommend.officiallySalary" ></td>
			        				                    <td ng-bind="recommend.serviceCharge" ></td>
			        				                    <td ng-bind="recommend.tips" ></td>
			        				                    <td ng-bind="recommend.createBy" ></td>
			        				                    <td ng-bind="recommend.updateBy" ></td>
			        				                    <td ng-bind="recommend.createAt" ></td>
			        				                    <td ng-bind="recommend.updateAt" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateRecommend(recommend.id)" /> 
							<input type="button" value="删除" ng-click="deleteRecommend(recommend.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/carrots-home-service/recommend/recommendList.js"></script>
