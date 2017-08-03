<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../includes/includes.jsp"%>
<%@page contentType="text/html;charset=utf-8"%>

<json:object escapeXml="false">
<json:property name="code" value="${code}"></json:property>
	<json:property name="message">
		<spring:message code="${code}" />
	</json:property>
	<json:property name="size" value="${size}"></json:property>
	<json:property name="total" value="${total}"></json:property>
	<json:array name="data">
		<c:forEach items="${companyList}" var="company">
			<json:object>
					
               

           
           
	   
        			
               
                    <json:property name="name" value="${company.name}"></json:property>
           
           
	   
        			
               
                    <json:property name="logo" value="${company.logo}"></json:property>
           
           
	   
        			
               
                    <json:property name="sign" value="${company.sign}"></json:property>
           
           
	   
        			
               
                    <json:property name="number" value="${company.number}"></json:property>
           
           
	   
        			
               
                    <json:property name="email" value="${company.email}"></json:property>
           
           
	   
        			
               
                    <json:property name="phone" value="${company.phone}"></json:property>
           
           
	   
        			
               
                    <json:property name="address" value="${company.address}"></json:property>
           
           
	   
        			
               
                    <json:property name="tagId" value="${company.tagId}"></json:property>
           
           
	   
        			
               
                    <json:property name="map" value="${company.map}"></json:property>
           
           
	   
        			
               
                    <json:property name="introduce" value="${company.introduce}"></json:property>
           
           
	   
        			
               
                    <json:property name="financing" value="${company.financing}"></json:property>
           
           
	   
        			
               
                    <json:property name="city" value="${company.city}"></json:property>
           
           
	   
        			
               
                    <json:property name="county" value="${company.county}"></json:property>
           
           
	   
        			
               
                    <json:property name="approved" value="${company.approved}"></json:property>
           
           
	   
        			
               
                    <json:property name="jobs" value="${company.jobs}"></json:property>
           
           
	   
        			
               
                    <json:property name="industry" value="${company.industry}"></json:property>
           
           
	   
        			
               
                    <json:property name="freezed" value="${company.freezed}"></json:property>
           
           
	   
        			
               
                    <json:property name="releasedAt" value="${company.releasedAt}"></json:property>
           
           
	   
        			
               
                    <json:property name="createAt" value="${company.createAt}"></json:property>
           
           
	   
        			
               
                    <json:property name="createBy" value="${company.createBy}"></json:property>
           
           
	   
        			
               
                    <json:property name="updateAt" value="${company.updateAt}"></json:property>
           
           
	   
        			
               
                    <json:property name="updateBy" value="${company.updateBy}"></json:property>
           
           
	   
        			</json:object>
		</c:forEach>
	</json:array>
</json:object>


