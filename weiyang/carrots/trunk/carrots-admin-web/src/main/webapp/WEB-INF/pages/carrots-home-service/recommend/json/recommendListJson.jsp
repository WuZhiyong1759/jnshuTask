<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../../includes/includes.jsp"%>
<%@page contentType="text/html;charset=utf-8"%>

<json:object escapeXml="false">
<json:property name="code" value="${code}"></json:property>
	<json:property name="message">
		<spring:message code="${code}" />
	</json:property>
	<json:property name="page" value="${page}"></json:property>
	<json:property name="size" value="${size}"></json:property>
	<json:property name="total" value="${total}"></json:property>
	<json:array name="data">
		<c:forEach items="${recommendList}" var="recommend">
			<json:object>
					
               
                    <json:property name="id" value="${recommend.id}"></json:property>
           
           
	   
        			
               
                    <json:property name="companyId" value="${recommend.companyId}"></json:property>
           
           
	   
        			
               
                    <json:property name="talentId" value="${recommend.talentId}"></json:property>
           
           
	   
        			
               
                    <json:property name="professionId" value="${recommend.professionId}"></json:property>
           
           
	   
        			
               
                    <json:property name="name" value="${recommend.name}"></json:property>
           
           
	   
        			
               
                    <json:property name="occupationType" value="${recommend.occupationType}"></json:property>
           
           
	   
        			
               
                    <json:property name="companyName" value="${recommend.companyName}"></json:property>
           
           
	   
        			
               
                    <json:property name="salary" value="${recommend.salary}"></json:property>
           
           
	   
        			
               
                    <json:property name="contactPerson" value="${recommend.contactPerson}"></json:property>
           
           
	   
        			
               
                    <json:property name="contactNumber" value="${recommend.contactNumber}"></json:property>
           
           
	   
        			
               
                    <json:property name="recommendatory" value="${recommend.recommendatory}"></json:property>
           
           
	   
        			
               
                    <json:property name="status" value="${recommend.status}"></json:property>
           
           
	   
        			
               
                    <json:property name="reserveTime" value="${recommend.reserveTime}"></json:property>
           
           
	   
        			
               
                    <json:property name="hireDate" value="${recommend.hireDate}"></json:property>
           
           
	   
        			
               
                    <json:property name="effectiveDate" value="${recommend.effectiveDate}"></json:property>
           
           
	   
        			
               
                    <json:property name="officiallySalary" value="${recommend.officiallySalary}"></json:property>
           
           
	   
        			
               
                    <json:property name="serviceCharge" value="${recommend.serviceCharge}"></json:property>
           
           
	   
        			
               
                    <json:property name="tips" value="${recommend.tips}"></json:property>
           
           
	   
        			
               
                    <json:property name="createBy" value="${recommend.createBy}"></json:property>
           
           
	   
        			
               
                    <json:property name="updateBy" value="${recommend.updateBy}"></json:property>
           
           
	   
        			
               
                    <json:property name="createAt" value="${recommend.createAt}"></json:property>
           
           
	   
        			
               
                    <json:property name="updateAt" value="${recommend.updateAt}"></json:property>
           
           
	   
        			</json:object>
		</c:forEach>
	</json:array>
</json:object>


