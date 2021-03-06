<%--
  Created by IntelliJ IDEA.
  User: lzn312
  Date: 2017/7/20
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="../../includes/includes.jsp" %>
<json:object escapeXml="false">
    <json:property name="code" value="${code}"></json:property>
    <json:property name="message">
        <spring:message code="${code}"/>
    </json:property>
    <json:property name="size" value="${size}"></json:property>
    <json:property name="total" value="${total}"></json:property>
    <json:object name="data">
        <%--公司信息--%>
        <json:property name="companyName" value="${company.name}"></json:property>
        <json:property name="industry" value="${company.industry}"></json:property>
        <json:property name="city" value="${company.city}"></json:property>
        <json:property name="county" value="${company.county}"></json:property>
        <json:property name="financing" value="${company.financing}"></json:property>
        <json:property name="approved" value="${company.approved}"></json:property>
        <json:property name="freezed" value="${company.freezed}"></json:property>
        <json:property name="companyId" value="${company.id}"></json:property>
        <json:property name="logo" value="${company.logo}"></json:property>
        <json:property name="sign" value="${company.sign}"></json:property>
        <json:property name="email" value="${company.email}"></json:property>
        <json:property name="number" value="${company.number}"></json:property>
        <json:property name="address" value="${company.address}"></json:property>
        <json:property name="map" value="${company.map}"></json:property>
        <json:property name="introduce" value="${company.introduce}"></json:property>
        <json:property name="address" value="${company.address}"></json:property>
        <json:property name="jobs" value="${company.jobs}"></json:property>

        <%--公司标签信息--%>
        <json:array name="companyLabelist">
            <c:forEach items="${companyLabelList}" var="companyLabel">
                <json:object>
                    <json:property name="content" value="${companyLabel.content}"></json:property>
                </json:object>
            </c:forEach>
        </json:array>

        <json:array name="producterList">
            <c:forEach items="${producterList}" var="producter">
                <json:object>
                    <json:property name="producterId" value="${producter.id}"></json:property>
                    <json:property name="sign" value="${producter.sign}"></json:property>
                    <json:property name="name" value="${producter.name}"></json:property>
                    <json:property name="logo" value="${producter.logo}"></json:property>
                    <json:property name="introduce" value="${producter.introduce}"></json:property>
                </json:object>
            </c:forEach>
        </json:array>

        <json:array name="professionList">
            <c:forEach items="${professionList}" var="profession">
                <json:object>
                    <json:property name="name" value="${profession.name}"></json:property>
                    <json:property name="workexp" value="${profession.workexp}"></json:property>
                    <json:property name="releasedAt" value="${producter.releasedAt}"></json:property>
                </json:object>
            </c:forEach>
        </json:array>


    </json:object>
</json:object>