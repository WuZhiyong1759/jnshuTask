<%--
  Created by IntelliJ IDEA.
  User: lzn312
  Date: 2017/7/15
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
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
        <c:forEach items="${compantData}" var="company">
            <json:object>






                <json:property name="companyName" value="${company.companyName}"></json:property>





                <json:property name="industry" value="${company.industry}"></json:property>





                <json:property name="city" value="${company.city}"></json:property>





                <json:property name="county" value="${company.county}"></json:property>





                <json:property name="financing" value="${company.financing}"></json:property>





                <json:property name="approved" value="${company.approved}"></json:property>





                <json:property name="freezed" value="${company.freezed}"></json:property>








            </json:object>
        </c:forEach>
    </json:array>
</json:object>


