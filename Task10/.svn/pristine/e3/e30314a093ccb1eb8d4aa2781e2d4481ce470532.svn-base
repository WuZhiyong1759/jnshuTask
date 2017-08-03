<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../includes/includes.jsp"%>
<%@page contentType="text/html;charset=utf-8"%>

<json:object escapeXml="false">
	<json:property name="code" value="${code}"></json:property>
	<json:property name="message">
		<spring:message code="${code}" />
	</json:property>
    <json:property name="page"  value="${page}"></json:property>
    <json:property name="size"  value="${size}"></json:property>
    <json:property name="total"  value="${total}"></json:property>
    <json:array name="data">
        <c:forEach items="${companyDataList}" var="companyDataMap">
			<json:object>



                    <json:property name="companyName" value="${companyDataMap.companyName}"></json:property>

           
	   
                    			
               
                    <json:property name="companyLogo" value="${companyDataMap.companyLogo}"></json:property>
           
           
	   
                    			
               
                    <json:property name="companyFinancing" value="${companyDataMap.companyFinancing}"></json:property>
           
           
	   
                    			
               
                    <json:property name="companyCity" value="${companyDataMap.companyCity}"></json:property>
           
           
	   
                    			
               
                    <json:property name="companyIndustry" value="${companyDataMap.companyIndustry}"></json:property>
           
           
	   

               
                    <json:property name="companySign" value="${companyDataMap.companySign}"></json:property>
           
           

               
                    <json:property name="jobs" value="${companyDataMap.jobs}"></json:property>
           

                    				
	 
			</json:object>
</c:forEach>
</json:array>
</json:object>

