<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="professionLabel" id="current_nav">
<div id="professionLabelApp" ng-app="professionLabelApp">
	<div ng-controller="professionLabelController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>ProfessionLabel管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addProfessionLabel(professionLabel)">新增</span>
		    </span>
	
			<paging url="/web/a/professionLabel">
				<table class="table table-striped table-bordered table-hover">
					<tr>
									                    <td>自增长ID</td>
			        				                    <td></td>
			        				                    <td></td>
			        				                    <td></td>
			        				                    <td></td>
			        				                    <td></td>
			        				                    <td></td>
			        							<th>操作</th>
					</tr>
					<tr ng-repeat="professionLabel in data">				
									                    <td ng-bind="professionLabel.id" ></td>
			        				                    <td ng-bind="professionLabel.pId" ></td>
			        				                    <td ng-bind="professionLabel.content" ></td>
			        				                    <td ng-bind="professionLabel.createBy" ></td>
			        				                    <td ng-bind="professionLabel.updateBy" ></td>
			        				                    <td ng-bind="professionLabel.updateAt" ></td>
			        				                    <td ng-bind="professionLabel.createAt" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateProfessionLabel(professionLabel.id)" /> 
							<input type="button" value="删除" ng-click="deleteProfessionLabel(professionLabel.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/carrots-zangai-home-service/professionLabel/professionLabelList.js"></script>
