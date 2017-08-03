<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="companyLabel" id="current_nav">
<div id="companyLabelApp" ng-app="companyLabelApp">
	<div ng-controller="companyLabelController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>CompanyLabel管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addCompanyLabel(companyLabel)">新增</span>
		    </span>
	
			<paging url="/web/a/companyLabel">
				<table class="table table-striped table-bordered table-hover">
					<tr>
									                    <td>标签id</td>
			        				                    <td>公司id</td>
			        				                    <td>标签内容</td>
			        				                    <td></td>
			        				                    <td></td>
			        				                    <td></td>
			        				                    <td></td>
			        							<th>操作</th>
					</tr>
					<tr ng-repeat="companyLabel in data">				
									                    <td ng-bind="companyLabel.id" ></td>
			        				                    <td ng-bind="companyLabel.cId" ></td>
			        				                    <td ng-bind="companyLabel.content" ></td>
			        				                    <td ng-bind="companyLabel.createBy" ></td>
			        				                    <td ng-bind="companyLabel.updateBy" ></td>
			        				                    <td ng-bind="companyLabel.updateAt" ></td>
			        				                    <td ng-bind="companyLabel.createAt" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateCompanyLabel(companyLabel.id)" /> 
							<input type="button" value="删除" ng-click="deleteCompanyLabel(companyLabel.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/carrots-zangai-home-service/companyLabel/companyLabelList.js"></script>
