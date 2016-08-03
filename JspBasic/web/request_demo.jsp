<%--
  Created by IntelliJ IDEA.
  User: prayjourney
  Date: 2016/7/1
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
<head>
    <title>注册信息</title>
</head>
<body>
      <%
        String username=(String)request.getAttribute("username");
        String pwd=(String)request.getAttribute("pwd");
        String repwd=(String)request.getAttribute("repwd");
        String name=(String)request.getAttribute("name");
        String age=(String)request.getAttribute("age");
        String sex=(String)request.getAttribute("sex");
      %>
      用户名:<%=username%><br/>
      密码:<%=pwd%><br/>
      确认密码:<%=repwd%><br/>
      姓名:<%=name%><br/>
      年龄:<%=age%><br/>
      性别:<%=sex%><br/>

</body>
</html>
