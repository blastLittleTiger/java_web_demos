<%--
  Created by IntelliJ IDEA.
  User: prayjourney
  Date: 2016/6/28
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Session示例3</title></head>
<body>
<font>欢迎您，</font> <%= session.getAttribute("username") %>
</body>
</html>
