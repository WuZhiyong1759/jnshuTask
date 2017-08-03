<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="company" id="current_nav">
<div id="companyApp" ng-app="companyApp">
	<div ng-controller="companyController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>Company管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addCompany(company)">新增</span>
		    </span>
	
			<paging url="/web/a/company">
				<table class="table table-striped table-bordered table-hover">
					<tr>
									                    <td>自增长ID</td>
			        				                    <td>公司名字</td>
			        				                    <td>公司图标</td>
			        				                    <td>公司签名</td>
			        				                    <td>公司人数</td>
			        				                    <td>公司信箱</td>
			        				                    <td>公司电话</td>
			        				                    <td>公司地址</td>
			        				                    <td>职位标签</td>
			        				                    <td>公司地图</td>
			        				                    <td>公司介绍</td>
			        				                    <td>融资规模</td>
			        				                    <td>市编码</td>
			        				                    <td>县编码</td>
			        				                    <td>认证状态</td>
			        				                    <td>在招职位数</td>
			        				                    <td>行业类型</td>
			        				                    <td>冻结状态</td>
			        				                    <td>发布时间</td>
			        				                    <td>创建时间</td>
			        				                    <td></td>
			        				                    <td></td>
			        				                    <td></td>
			        							<th>操作</th>
					</tr>
					<tr ng-repeat="company in data">				
									                    <td ng-bind="company.id" ></td>
			        				                    <td ng-bind="company.name" ></td>
			        				                    <td ng-bind="company.logo" ></td>
			        				                    <td ng-bind="company.sign" ></td>
			        				                    <td ng-bind="company.number" ></td>
			        				                    <td ng-bind="company.email" ></td>
			        				                    <td ng-bind="company.phone" ></td>
			        				                    <td ng-bind="company.address" ></td>
			        				                    <td ng-bind="company.tagId" ></td>
			        				                    <td ng-bind="company.map" ></td>
			        				                    <td ng-bind="company.introduce" ></td>
			        				                    <td ng-bind="company.financing" ></td>
			        				                    <td ng-bind="company.city" ></td>
			        				                    <td ng-bind="company.county" ></td>
			        				                    <td ng-bind="company.approved" ></td>
			        				                    <td ng-bind="company.jobs" ></td>
			        				                    <td ng-bind="company.industry" ></td>
			        				                    <td ng-bind="company.freezed" ></td>
			        				                    <td ng-bind="company.releasedAt" ></td>
			        				                    <td ng-bind="company.createAt" ></td>
			        				                    <td ng-bind="company.createBy" ></td>
			        				                    <td ng-bind="company.updateAt" ></td>
			        				                    <td ng-bind="company.updateBy" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateCompany(company.id)" /> 
							<input type="button" value="删除" ng-click="deleteCompany(company.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/carrots-zangai-home-service/company/companyList.js"></script>
