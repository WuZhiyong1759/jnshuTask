<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
<%@page contentType="text/html;charset=utf-8"%>

<json:object escapeXml="false">
	<json:property name="code" value="${code}"></json:property>
	<json:property name="message">
		<spring:message code="${code}" />
	</json:property>

			<json:object name="data">
		
								
               
                    <json:property name="id" value="${professionLabel.id}"></json:property>
           
           
	   
                    			
               
                    <json:property name="pId" value="${professionLabel.pId}"></json:property>
           
           
	   
                    			
               
                    <json:property name="content" value="${professionLabel.content}"></json:property>
           
           
	   
                    			
               
                    <json:property name="createBy" value="${professionLabel.createBy}"></json:property>
           
           
	   
                    			
               
                    <json:property name="updateBy" value="${professionLabel.updateBy}"></json:property>
           
           
	   
                    			
               
                    <json:property name="updateAt" value="${professionLabel.updateAt}"></json:property>
           
           
	   
                    			
               
                    <json:property name="createAt" value="${professionLabel.createAt}"></json:property>
           
           
	   
                    				
	 
			</json:object>
		
</json:object>


