<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
</head>
<body>
    <form action="/ssm/user/query.do" method="post">
        <table>
            <tr>
                <td><input type="text" name="userName"></td>
                <td><input type="text"></td>
            </tr>
            <tr>
                <td><input type="submit"></td>
                <td><input type="reset" value="重置"></td>
            </tr>
        </table>
    </form>
</body>
</html>
