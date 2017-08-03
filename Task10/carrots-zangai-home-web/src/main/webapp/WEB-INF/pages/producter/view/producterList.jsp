<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="producter" id="current_nav">
<div id="producterApp" ng-app="producterApp">
	<div ng-controller="producterController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>Producter管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addProducter(producter)">新增</span>
		    </span>
	
			<paging url="/web/a/producter">
				<table class="table table-striped table-bordered table-hover">
					<tr>
									                    <td>自增长ID</td>
			        				                    <td>公司名称</td>
			        				                    <td>产品名称</td>
			        				                    <td>产品宣言</td>
			        				                    <td>产品logo</td>
			        				                    <td>产品介绍</td>
			        				                    <td></td>
			        				                    <td></td>
			        				                    <td></td>
			        				                    <td></td>
			        							<th>操作</th>
					</tr>
					<tr ng-repeat="producter in data">				
									                    <td ng-bind="producter.id" ></td>
			        				                    <td ng-bind="producter.cId" ></td>
			        				                    <td ng-bind="producter.name" ></td>
			        				                    <td ng-bind="producter.sign" ></td>
			        				                    <td ng-bind="producter.logo" ></td>
			        				                    <td ng-bind="producter.introduce" ></td>
			        				                    <td ng-bind="producter.createBy" ></td>
			        				                    <td ng-bind="producter.updateBy" ></td>
			        				                    <td ng-bind="producter.updateAt" ></td>
			        				                    <td ng-bind="producter.createAt" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateProducter(producter.id)" /> 
							<input type="button" value="删除" ng-click="deleteProducter(producter.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/carrots-zangai-home-service/producter/producterList.js"></script>
