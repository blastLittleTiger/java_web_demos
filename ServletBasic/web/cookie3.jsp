<%--
  Created by IntelliJ IDEA.
  User: prayjourney
  Date: 2016/6/28
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<p>显示Cookie的值：</p>
<%
    Cookie[] cookies = request.getCookies();
    for (int i = 0; i < cookies.length; i++)
    {
        if (cookies[i].getName().equals("name")) out.println("Hello" + cookies[i].getValue());
    }
%>

</body>
</html>
