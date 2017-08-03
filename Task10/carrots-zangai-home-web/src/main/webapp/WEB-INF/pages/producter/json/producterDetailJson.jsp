<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
<%@page contentType="text/html;charset=utf-8"%>

<json:object escapeXml="false">
	<json:property name="code" value="${code}"></json:property>
	<json:property name="message">
		<spring:message code="${code}" />
	</json:property>

			<json:object name="data">
		
								
               
                    <json:property name="id" value="${producter.id}"></json:property>
           
           
	   
                    			
               
                    <json:property name="cId" value="${producter.cId}"></json:property>
           
           
	   
                    			
               
                    <json:property name="name" value="${producter.name}"></json:property>
           
           
	   
                    			
               
                    <json:property name="sign" value="${producter.sign}"></json:property>
           
           
	   
                    			
               
                    <json:property name="logo" value="${producter.logo}"></json:property>
           
           
	   
                    			
               
                    <json:property name="introduce" value="${producter.introduce}"></json:property>
           
           
	   
                    			
               
                    <json:property name="createBy" value="${producter.createBy}"></json:property>
           
           
	   
                    			
               
                    <json:property name="updateBy" value="${producter.updateBy}"></json:property>
           
           
	   
                    			
               
                    <json:property name="updateAt" value="${producter.updateAt}"></json:property>
           
           
	   
                    			
               
                    <json:property name="createAt" value="${producter.createAt}"></json:property>
           
           
	   
                    				
	 
			</json:object>
		
</json:object>


