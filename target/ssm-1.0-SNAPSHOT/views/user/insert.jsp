<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/9 0009
  Time: 4:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>用户添加</title>
</head>
<body>
<form action="<%=path%>/user/insert.do" method="post">
    <table>
        <tr>
            <td>姓名<input type="text" name="name"></td>
        </tr>
        <tr>
            <td>年龄<input type="text" name="age"></td>
        </tr>
        <tr>
            <td>
                性别
                <input type="radio" name="gender" value="1" checked>男
                <input type="radio" name="gender" value="2">女
            </td>
        </tr>
        <tr>
            <td>手机<input type="text" name="phone"></td>
        </tr>
        <tr>
            <td>生日<input type="date" name="birthday"></td>
        </tr>
        <tr>
            <td>住址<textarea name="address"></textarea></td>
        </tr>
        <tr>
            <td><input type="submit" value="添加"></td>
        </tr>
    </table>
</form>
</body>
</html>
