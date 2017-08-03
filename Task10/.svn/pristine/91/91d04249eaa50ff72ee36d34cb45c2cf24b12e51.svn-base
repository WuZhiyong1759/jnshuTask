<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../includes/includes.jsp"%>
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

        <c:forEach items="${professionData}" var="professionDataMap">
			<json:object >
		
								
               
                    <json:property name="companyId" value="${professionDataMap.companyId}"></json:property>

                    <json:property name="companyName" value="${professionDataMap.companyName}"></json:property>

                    <json:property name="companyLogo" value="${professionDataMap.companyLogo}"></json:property>

                    <json:property name="companyIndustry" value="${professionDataMap.companyIndustry}"></json:property>

                    <json:property name="professionId" value="${professionDataMap.professionId}"></json:property>

                    <json:property name="professionName" value="${professionDataMap.professionName}"></json:property>


                    <json:property name="salary" value="${professionDataMap.salary}"></json:property>


                    <json:property name="city" value="${professionDataMap.city}"></json:property>


               
                    <json:property name="county" value="${professionDataMap.county}"></json:property>
           

                    <json:property name="education" value="${professionDataMap.education}"></json:property>
           

               
                    <json:property name="workexp" value="${professionDataMap.workexp}"></json:property>
           
           
	   
                    			
               
                    <json:property name="releasedAt" value="${professionDataMap.releasedAt}"></json:property>
           
           
	   
                    			
               
                    <json:property name="education" value="${professionDataMap.education}"></json:property>
           
           
	   
                    			
               
                    <json:property name="salary" value="${professionDataMap.salary}"></json:property>
           
           
	   
                    			
               
                    <json:property name="companyLabel" value="${professionDataMap.companyLabel}"></json:property>
           
           
	   

           

	 
			</json:object>
        </c:forEach>
    </json:array>
</json:object>


