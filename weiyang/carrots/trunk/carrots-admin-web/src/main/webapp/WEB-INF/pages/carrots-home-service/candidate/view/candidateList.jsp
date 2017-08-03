<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>

<input type="hidden" value="candidate" id="current_nav">
<div id="candidateApp" ng-app="candidateApp">
	<div ng-controller="candidateController">

		<div class="portlet">
		    <div class="portlet-title">
		        <div class="caption"><i class="fa fa-cogs"></i>Candidate管理</div>
		    </div>
		    <span class="btn green fileinput-button">
		        <i class="fa fa-plus"></i>
		        <span ng-click="addCandidate(candidate)">新增</span>
		    </span>
	
			<paging url="/web/a/candidate">
				<table class="table table-striped table-bordered table-hover">
					<tr>
									                    <td>自增ID</td>
			        				                    <td>姓名</td>
			        				                    <td>应聘职位</td>
			        				                    <td>联系电话</td>
			        				                    <td>状态</td>
			        				                    <td>面试时间</td>
			        				                    <td>简历</td>
			        				                    <td>创建人</td>
			        				                    <td>更新人</td>
			        				                    <td>创建时间</td>
			        				                    <td>更新时间</td>
			        							<th>操作</th>
					</tr>
					<tr ng-repeat="candidate in data">				
									                    <td ng-bind="candidate.id" ></td>
			        				                    <td ng-bind="candidate.name" ></td>
			        				                    <td ng-bind="candidate.occupationType" ></td>
			        				                    <td ng-bind="candidate.phone" ></td>
			        				                    <td ng-bind="candidate.status" ></td>
			        				                    <td ng-bind="candidate.reserveTime" ></td>
			        				                    <td ng-bind="candidate.resume" ></td>
			        				                    <td ng-bind="candidate.createBy" ></td>
			        				                    <td ng-bind="candidate.updateBy" ></td>
			        				                    <td ng-bind="candidate.createAt" ></td>
			        				                    <td ng-bind="candidate.updateAt" ></td>
			        								
						<td>
							<input type="button" value="修改" ng-click="updateCandidate(candidate.id)" /> 
							<input type="button" value="删除" ng-click="deleteCandidate(candidate.id)" />
						</td>
					</tr>
				</table>		
			</paging>
	
		</div>
	</div>
</div>

<!-- Angular JS -->
<script src="/r/js-src/web/carrots-home-service/candidate/candidateList.js"></script>
