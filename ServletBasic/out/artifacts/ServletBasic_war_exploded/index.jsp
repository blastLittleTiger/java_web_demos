<%--
  Created by IntelliJ IDEA.
  User: prayjourney
  Date: 2016/6/24
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
        language="java" %>
<%@ page import="beanstest.TestBeans" %>
<br>
<head>
    <title></title>
</head>
<br>
<!--jsp声明语句以“< %”开始,以“% >”结束(去除空格) -->

<h1>我来测试Servlet！</h1>

<p>
    今天是:<%=(new java.util.Date()).toLocaleString()%>
    <%--JSP注释 --%>
    <!--HTML注释-->
    //这个也是注释
</p>

<%
    //声明变量
    int i = 100;
%>
<%
    //使用out输出到网页
    out.println("Your IP address is " + request.getRemoteAddr());
%>

<p>控制流语句</p>
<%
    //控制流语句
    if (i >= 100)
    {
        out.print("Hello World!");
    } else if (i < 200)
    {
        out.print("200");
    } else
    {
        out.print("haha");
    }
%>

<p>switch语句</p>
<%
    //switch语句
    int day = 1;//声明变量
    switch (day)
    {
        case 0:
            out.println("NONE!");
            break;
        case 1:
            out.println("Monday!");
            break;
        case 2:
            out.println("Tuesday!");
            break;
        default:
            out.println("oops!");
    }
%>

<div class="test2">
    <!--嵌套的问题-->
    <%
        //在html的元素之中嵌套jsp标签是可以的，但是在jsp的标签内嵌套html标签貌似是不行的。
        //如同<p>你好</p>，是错误的！
        //声明jsp的时候，每一块都要被jsp声明的标识符号包裹起来，
    %>
</div>

<p>for循环</p>
<!--for循环1-->
<%
    for (int ig = 0; ig < 10; ig++)
    {
        out.println(ig);
    }
%>
<!--for循环2-->
<%
    //每一块都要被jsp声明的标识符号包裹起来，
    for (int fontSize = 1; fontSize <= 3; fontSize++)
    {
%>
<font color="green" size="<%= fontSize %>">
    JSP Tutorial
</font><br/>
<%}%>


<p>while循环</p>
<!--while循环1-->
<%
    int t = 6;
    while (i > 2)
    {
        out.println(i);
        i--;
    }
%>
<!--while循环2-->
<%
    int fontSize=2;
    while (fontSize<=5)
    {
%>
<font color="green" size="<%= fontSize %>">
    JSP Tutorial
</font><br/>
<%
    fontSize++;
%>
<%}%>

<p>定义和使用方法</p>
<!--定义一个方法-->
<%!
    public int mul(int a,int b)
    {
        return a*b;
    }
%>
<!--调用方法-->
<%= mul(2, 2) %>

<!--定义和使用数组-->
<p>定义和使用数组</p>
<%
    String[] arr={"apple","orange","cherry"};
%>
<%
    int j;
    out.println("<p>数组中所有元素是：</p>");
    for(j=0;j<arr.length;j++){
    out.println(arr[j]);
    }
%>
<!--定义和使用JavaBean-->
<p>定义和使用JavaBean</p>
<jsp:useBean id="bt" scope="page" class="beanstest.TestBeans" />
<jsp:setProperty name="bt" property="age" value="24" />
Get Age: <jsp:getProperty name="bt" property="age" /><BR>

<jsp:setProperty name="bt" property="grade" value="92" />
Get Grade: <jsp:getProperty name="bt" property="grade" /><BR>

<jsp:setProperty name="bt" property="name" value="renjiaxin" />
Get Name: <jsp:getProperty name="bt" property="name" /><BR>

<jsp:setProperty name="bt" property="addr" value="Chongqing,Shapingba" />
Get Name: <jsp:getProperty name="bt" property="addr" /><BR>





<br>
<br>
<p>
    html注释:<"!-- xxx-->(去掉")<br>
    jsp 注释:<"%-- xxx-->(去掉")<br>
    jsp单行注释：使用//xxx<br>

    jsp表达式：<"%= java代码%>(去掉")<br>
    jsp声明：<"%! java代码%>(去掉")<br>
    jsp脚本：<"% java代码%>(去掉")<br>

    注意：jsp声明和脚本可以包含多个语句，每个语句使用";"分隔开，声明主要用于声明方法！！！<br>
         jsp表达式只能有1个表达式

</p>
</br>
<a href="session1.jsp">跳转到session1.jsp</a>
<a href="cookie1.jsp">跳转到cookie1.jsp</a>

<br>
<a href="testinclude.jsp">跳转到测试include指令的页面</a>
</body>
</html>
