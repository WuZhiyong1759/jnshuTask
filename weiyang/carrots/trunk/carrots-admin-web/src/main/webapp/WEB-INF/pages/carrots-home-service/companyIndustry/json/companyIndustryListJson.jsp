<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
<%@page contentType="text/html;charset=utf-8"%>

<json:object escapeXml="false">
<json:property name="code" value="${code}"></json:property>
	<json:property name="message">
		<spring:message code="${code}" />
	</json:property>
	<json:property name="size" value="${size}"></json:property>
	<json:property name="total" value="${total}"></json:property>
	<json:array name="data">
		<c:forEach items="${companyIndustryList}" var="companyIndustry">
			<json:object>
					
               
                    <json:property name="id" value="${companyIndustry.id}"></json:property>
           
           
	   
        			
               
                    <json:property name="companyId" value="${companyIndustry.companyId}"></json:property>
           
           
	   
        			
               
                    <json:property name="industry" value="${companyIndustry.industry}"></json:property>
           
           
	   
        			
               
                    <json:property name="createBy" value="${companyIndustry.createBy}"></json:property>
           
           
	   
        			
               
                    <json:property name="updateBy" value="${companyIndustry.updateBy}"></json:property>
           
           
	   
        			
               
                    <json:property name="updateAt" value="${companyIndustry.updateAt}"></json:property>
           
           
	   
        			
               
                    <json:property name="createAt" value="${companyIndustry.createAt}"></json:property>
           
           
	   
        			</json:object>
		</c:forEach>
	</json:array>
</json:object>


