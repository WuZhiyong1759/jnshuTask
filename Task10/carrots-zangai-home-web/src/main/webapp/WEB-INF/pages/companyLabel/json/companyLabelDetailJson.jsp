<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
<%@page contentType="text/html;charset=utf-8"%>

<json:object escapeXml="false">
	<json:property name="code" value="${code}"></json:property>
	<json:property name="message">
		<spring:message code="${code}" />
	</json:property>

			<json:object name="data">
		
								
               
                    <json:property name="id" value="${companyLabel.id}"></json:property>
           
           
	   
                    			
               
                    <json:property name="cId" value="${companyLabel.cId}"></json:property>
           
           
	   
                    			
               
                    <json:property name="content" value="${companyLabel.content}"></json:property>
           
           
	   
                    			
               
                    <json:property name="createBy" value="${companyLabel.createBy}"></json:property>
           
           
	   
                    			
               
                    <json:property name="updateBy" value="${companyLabel.updateBy}"></json:property>
           
           
	   
                    			
               
                    <json:property name="updateAt" value="${companyLabel.updateAt}"></json:property>
           
           
	   
                    			
               
                    <json:property name="createAt" value="${companyLabel.createAt}"></json:property>
           
           
	   
                    				
	 
			</json:object>
		
</json:object>

