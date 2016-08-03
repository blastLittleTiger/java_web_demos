<%--
  Created by IntelliJ IDEA.
  User: prayjourney
  Date: 2016/6/28
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="beanstest.TestProject" %>
<html>
<head>
    <title>删除Cookies</title>
</head>
<body>
<%
    Cookie cookie = new Cookie("name", "");
    cookie.setMaxAge(0);
%>
<p>
    JSP中使用包 - 示例
</p>
<%
    TestProject ts = new TestProject();
    String str = ts.show("你好！！！");
    out.println(str);
%>

</body>
</html>
