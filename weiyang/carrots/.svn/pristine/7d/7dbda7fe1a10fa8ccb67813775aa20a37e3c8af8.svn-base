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
		<c:forEach items="${skillList}" var="skill">
			<json:object>
					
               
                    <json:property name="id" value="${skill.id}"></json:property>
           
           
	   
        			
               
        
           
           
	   
        			
               
                  <%--   <json:property name="appraisalId" value="${skill.appraisalId}"></json:property> --%>
           
           
	   
        			
               
                    <json:property name="occupationId" value="${skill.occupationId}"></json:property>
           
           
	   
        			
               
                    <json:property name="parentId" value="${skill.parentId}"></json:property>
           
           
	   
        			
               
                    <json:property name="name" value="${skill.name}"></json:property>
           
           
	   
        			
               
                    <json:property name="content" value="${skill.content}"></json:property>
           
           
	   
        			
               
                    <json:property name="priority" value="${skill.priority}"></json:property>
           
           
	   
        			
               
                    <json:property name="sort" value="${skill.sort}"></json:property>
           
           
	   
        			
               
                 <%--    <json:property name="createBy" value="${skill.createBy}"></json:property>
           
           
	   
        			
               
                    <json:property name="updateBy" value="${skill.updateBy}"></json:property>
           
           
	   
        			
               
                    <json:property name="updateAt" value="${skill.updateAt}"></json:property>
           
           
	   
        			
               
                    <json:property name="createAt" value="${skill.createAt}"></json:property> --%>
           
           
	   
        			</json:object>
		</c:forEach>
	</json:array>
</json:object>


