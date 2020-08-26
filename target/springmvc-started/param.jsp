<%--
  Created by IntelliJ IDEA.
  User: Cheng
  Date: 2020/8/13 0013
  Time: 下午 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试参数</title>
</head>
<body>
    <a href="param/testParam?username=张成杰&password=1">测试参数绑定</a>

    <br/>
    <a href="param/testPathVariable/111">测试PathVariable</a>

    <br/>
    <a href="param/testRequestHeader">测试RequestHeader</a>

    <br/>
    <a href="param/testCookieValue">测试CookieValue</a>

    <br/>

    <form action="/param/testModelAttribute" method="post">
        用户名：<input name="userName" id="username" type="text"><br>
        地址：<input name="address" id="address" type="text"><br>
        <input type="submit" value="提交">
    </form>
    <br/>
    <br/>
    <a href="param/testSetSession">测试设置Session</a>
    <br/>
    <br/>
    <a href="param/testGetSession">测试获取Session</a>

</body>
</html>
