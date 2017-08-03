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
		<c:forEach items="${professionList}" var="profession">
			<json:object>
					
               
                    <json:property name="id" value="${profession.id}"></json:property>
           
           
	   
        			
               
                    <json:property name="cId" value="${profession.cId}"></json:property>
           
           
	   
        			
               
                    <json:property name="name" value="${profession.name}"></json:property>
           
           
	   
        			
               
                    <json:property name="workexp" value="${profession.workexp}"></json:property>
           
           
	   
        			
               
                    <json:property name="catgory" value="${profession.catgory}"></json:property>
           
           
	   
        			
               
                    <json:property name="education" value="${profession.education}"></json:property>
           
           
	   
        			
               
                    <json:property name="salary" value="${profession.salary}"></json:property>
           
           
	   
        			
               
                    <json:property name="status" value="${profession.status}"></json:property>
           
           
	   
        			
               
                    <json:property name="duty" value="${profession.duty}"></json:property>
           
           
	   
        			
               
                    <json:property name="skill" value="${profession.skill}"></json:property>
           
           
	   
        			
               
                    <json:property name="welfare" value="${profession.welfare}"></json:property>
           
           
	   
        			
               
                    <json:property name="city" value="${profession.city}"></json:property>
           
           
	   
        			
               
                    <json:property name="county" value="${profession.county}"></json:property>
           
           
	   
        			
               
                    <json:property name="industry" value="${profession.industry}"></json:property>
           
           
	   
        			
               
                    <json:property name="tagId" value="${profession.tagId}"></json:property>
           
           
	   
        			
               
                    <json:property name="recommend" value="${profession.recommend}"></json:property>
           
           
	   
        			
               
                    <json:property name="releasedAt" value="${profession.releasedAt}"></json:property>
           
           
	   
        			
               
                    <json:property name="createBy" value="${profession.createBy}"></json:property>
           
           
	   
        			
               
                    <json:property name="updateBy" value="${profession.updateBy}"></json:property>
           
           
	   
        			
               
                    <json:property name="updateAt" value="${profession.updateAt}"></json:property>
           
           
	   
        			
               
                    <json:property name="createAt" value="${profession.createAt}"></json:property>
           
           
	   
        			</json:object>
		</c:forEach>
	</json:array>
</json:object>

