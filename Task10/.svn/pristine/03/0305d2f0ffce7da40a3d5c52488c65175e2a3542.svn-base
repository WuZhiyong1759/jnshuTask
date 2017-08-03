<%--
  Created by IntelliJ IDEA.
  User: lzn312
  Date: 2017/7/20
  Time: 19:11
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

    <!-- 获取找职位页面竖向轮播图信息 -->
    <json:array name="data">
        <c:forEach items="${popularDataList}" var="popularDataMap">
            <json:object>
                <json:property name="companyId" value="${popularDataMap.companyId}"></json:property>
                <json:property name="companyName" value="${popularDataMap.companyName}"></json:property>
                <json:property name="companyLogo"
                               value="${popularDataMap.companyLogo}"></json:property>
                <json:property name="financing" value="${popularDataMap.financing}"></json:property>
                <json:property name="industry" value="${popularDataMap.industry}"></json:property>
                <json:property name="province" value="${popularDataMap.province}"></json:property>
                <json:property name="city" value="${popularDataMap.city}"></json:property>
                <json:property name="county" value="${popularDataMap.county}"></json:property>
                <json:property name="professionId" value="${popularDataMap.professionId}"></json:property>
                <json:property name="professionName" value="${popularDataMap.professionName}"></json:property>
            </json:object>
        </c:forEach>
    </json:array>

</json:object>
