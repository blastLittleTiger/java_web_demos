package servletdemo;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:${NAME}
// Date:2016/6/24.
// Copyright="(c) renjiaxin.jesse 2016'
// Licence = "prayjourney 2016"
//
//                ┏ ┓       ┏ ┓
//              ┏┛ ┻━━━━┛ ┻┓
//              ┃    #
//              ┃   ┳┛  ┗*━   ┃    蹉跎错，消磨过，最是光阴化浮沫。
//              ┃      ┻  ┃
//              ┗━┓       ┏━━┛
//                 ┃         ┗━━━━━━┓
//                 ┃  神兽保佑             ┣━┓
//                 ┃  永无BUG！         ┏┛
//                 ┗┓━┓ ┏━━━━┳━┓┓┛
//                  ┃━┫━┫    ┃━┫━ ┫
//                  ┗━┻━┛    ┗━┻ ━┛
//
// ---------------------------------------------------------------

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet
{
    public void init() throws ServletException
    {
        System.out.println("Servlet is initing!");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.write("<h1>Hello Servlet!</h1>");
        System.out.println("Servlet does sth!");


    }

    public void destroy()
    {
        System.out.println("Servlet is destorying!");
    }
}
