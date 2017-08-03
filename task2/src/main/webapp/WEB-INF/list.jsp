<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.ptteng.entity.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	<title>Hello World</title>
    </head>
    <body>
   		<h1>线下Java学院列表<a href="/info/add">添加</a></h1>

   		<table width="60%" border=1px cellpadding="0" cellspacing="0">
   		<tr>
        	<td>&nbsp;id</td>
        	<td>name</td>
			<td>sign</td>
			<td>操作</td>
      	</tr>
      	<%
        List<Student> list=(List)request.getAttribute("list");
        for(int i=0;i<list.size();i++){
          Student stu=list.get(i);

        %>
        <tr class=row<%=(i%2)+1 %>>
        	<td><%=stu.getId() %></td>
        	<td><%=stu.getStu_name() %></td>
        	<td><%=stu.getSign() %></td>
			<td><a href='/info/delete/<%=stu.getId()%>'>删除</a></td>
			<%--<td><a href='/delete?id=<%=stu.getId()%>'>删除</a></td>--%>
		<%--onclick="return confirm('确定删除<%stu.getStu_name()%>吗')"--%>
		</tr>
      	<%} %>
   		</table>
    </body>
</html>



