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
		<c:forEach items="${appraisalList}" var="appraisal">
			<json:object>
					
               
                    <json:property name="id" value="${appraisal.id}"></json:property>
           
           
	   
        			
               
                    <json:property name="talentId" value="${appraisal.talentId}"></json:property>
           
           
	   
        			
               
                    <json:property name="name" value="${appraisal.name}"></json:property>
           
           
	   
        			
               
                    <json:property name="profession" value="${appraisal.profession}"></json:property>
           
           
	   
        			
               
                    <json:property name="experience" value="${appraisal.experience}"></json:property>
           
           
	   
        			
               
                    <json:property name="province" value="${appraisal.province}"></json:property>
           
           
	   
        			
               
                    <json:property name="city" value="${appraisal.city}"></json:property>
           
           
	   
        			
               
                    <json:property name="county" value="${appraisal.county}"></json:property>
           
           
	   
        			
               
                    <json:property name="workCondition" value="${appraisal.workCondition}"></json:property>
           
           
	   
        			
               
                    <json:property name="comment" value="${appraisal.comment}"></json:property>
           
           
	   
        			
               
                    <json:property name="skillExplain" value="${appraisal.skillExplain}"></json:property>
           
           
	   
        			
               
                    <json:property name="knowledge" value="${appraisal.knowledge}"></json:property>
           
           
	   
        			
               
                    <json:property name="knowledge_exceed" value="${appraisal.knowledge_exceed}"></json:property>
           
           
	   
        			
               
                    <json:property name="projectRemark" value="${appraisal.projectRemark}"></json:property>
           
           
	   
        			
               
                    <json:property name="professionQuality" value="${appraisal.professionQuality}"></json:property>
           
           
	   
        			
               
                    <json:property name="professionExceed" value="${appraisal.professionExceed}"></json:property>
           
           
	   
        			
               
                    <json:property name="qualityRemark" value="${appraisal.qualityRemark}"></json:property>
           
           
	   
        			
               
                    <json:property name="project" value="${appraisal.project}"></json:property>
           
           
	   
        			
               
                    <json:property name="projectExceed" value="${appraisal.projectExceed}"></json:property>
           
           
	   
        			
               
                    <json:property name="skillRemark" value="${appraisal.skillRemark}"></json:property>
           
           
	   
        			
               
                    <json:property name="skillAwardMarks" value="${appraisal.skillAwardMarks}"></json:property>
           
           
	   
        			
               
                    <json:property name="basicInformation" value="${appraisal.basicInformation}"></json:property>
           
           
	   
        			
               
                    <json:property name="workRecord" value="${appraisal.workRecord}"></json:property>
           
           
	   
        			
               
                    <json:property name="workAbility" value="${appraisal.workAbility}"></json:property>
           
           
	   
        			
               
                    <json:property name="post" value="${appraisal.post}"></json:property>
           
           
	   
        			
               
                    <json:property name="talentGrade" value="${appraisal.talentGrade}"></json:property>
           
           
	   
        			
               
                    <json:property name="synthesize" value="${appraisal.synthesize}"></json:property>
           
           
	   
        			
               
                    <json:property name="sourcesSum" value="${appraisal.sourcesSum}"></json:property>
           
           
	   
        			
               
                    <json:property name="minPay" value="${appraisal.minPay}"></json:property>
           
           
	   
        			
               
                    <json:property name="maxPay" value="${appraisal.maxPay}"></json:property>
           
           
	   
        			
               
                    <json:property name="createAt" value="${appraisal.createAt}"></json:property>
           
           
	   
        			
               
                    <json:property name="updateAt" value="${appraisal.updateAt}"></json:property>
           
           
	   
        			
               
                    <json:property name="createBy" value="${appraisal.createBy}"></json:property>
           
           
	   
        			
               
                    <json:property name="updateBy" value="${appraisal.updateBy}"></json:property>
           
           
	   
        			</json:object>
		</c:forEach>
	</json:array>
</json:object>


