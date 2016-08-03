<%--
  Created by IntelliJ IDEA.
  User: prayjourney
  Date: 2016/6/28
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<html>
<head><title>Session示例2</title></head>
<body>
<%
    String name = request.getParameter("name");
    if ((name != null))
    {
        session.setAttribute("username", name);
    }
%>
<a href="session3.jsp">继续，跳转到session3.jsp</a>
</body>
</html>
