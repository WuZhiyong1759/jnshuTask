<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Tom
  Date: 2017/4/16
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/Task3/updateNow" method="post" modelAttribute="student">
    <table>
        <tr><td><table><form:hidden path="id"/></table></td></tr>
        <tr>
            <td><table>名字：</table></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><table>密码：</table></td>
            <td><form:password path="password"/></td>
        </tr>
        <tr>
            <td><table>抵达时间：</table></td>
            <td><form:input path="arrival_time"/></td>
        </tr>
        <tr>
            <td><table>qq：</table></td>
            <td><form:input path="qq"/></td>
        </tr>
        <tr>
            <td><table>学习类型：</table></td>
            <td><form:input path="study_type"/></td>
        </tr>
        <tr>
            <td><table>线上学号：</table></td>
            <td><form:input path="number_online"/></td>
        </tr>
        <tr>
            <td><table>日报链接：</table></td>
            <td><form:input path="diary_link"/></td>
        </tr>
        <tr>
            <td><table>毕业学校：</table></td>
            <td><form:input path="school"/></td>
        </tr>
        <tr>
            <td><table>立愿：</table></td>
            <td><form:input path="vow"/></td>
        </tr>
        <tr>
            <td><table>审核师兄：</table></td>
            <td><form:input path="assessor"/></td>
        </tr>
        <tr>
            <td><table>引荐师兄：</table></td>
            <td><form:input path="referee"/></td>
        </tr>
        <tr>
            <td><form:hidden path="create_at" /></td>
        </tr>
        <tr>
            <td><input id="submit" type="submit" value="更新"></td>
        </tr>
    </table>
</form:form>

</body>
</html>
