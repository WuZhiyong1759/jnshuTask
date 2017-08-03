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
		<c:forEach items="${talentSkillRelationList}" var="talentSkillRelation">
			<json:object>
					
               
                    <json:property name="id" value="${talentSkillRelation.id}"></json:property>
           
           
	   
        			
               
                    <json:property name="skillId" value="${talentSkillRelation.skillId}"></json:property>
           
           
	   
        			
               
                    <json:property name="talentId" value="${talentSkillRelation.talentId}"></json:property>
           
           
	   
        			
               
                    <json:property name="degree" value="${talentSkillRelation.degree}"></json:property>
           
           
	   
        			
               
                    <json:property name="createBy" value="${talentSkillRelation.createBy}"></json:property>
           
           
	   
        			
               
                    <json:property name="updateBy" value="${talentSkillRelation.updateBy}"></json:property>
           
           
	   
        			
               
                    <json:property name="updateAt" value="${talentSkillRelation.updateAt}"></json:property>
           
           
	   
        			
               
                    <json:property name="createAt" value="${talentSkillRelation.createAt}"></json:property>
           
           
	   
        			</json:object>
		</c:forEach>
	</json:array>
</json:object>


