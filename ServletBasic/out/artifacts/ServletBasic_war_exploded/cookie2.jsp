<%--
  Created by IntelliJ IDEA.
  User: prayjourney
  Date: 2016/6/28
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    String name = request.getParameter("name");
    Cookie cookie = new Cookie("name", name);
    response.addCookie(cookie);
    cookie.setMaxAge(50 * 50); //Time is in Minutes
%>
<a href="cookie3.jsp">Continue</a>

</body>
</html>
