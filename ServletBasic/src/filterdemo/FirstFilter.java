package filterdemo;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:IP过滤，IP的拦截器
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

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "FirstFilter")
public class FirstFilter implements javax.servlet.Filter
{
    protected FilterConfig fc;
    protected String ip;

    public void init(FilterConfig config) throws ServletException
    {
        this.fc = config;//设置属性
        this.ip = config.getInitParameter("ip");//取得参数,这个要在初始化配置时候有对应的项
        System.out.println("init firstfilter!");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException
    {
        System.out.println("execute firstfilter!");
        String localip = req.getLocalAddr();//获取IP
        if (localip.equals(ip))//判断IP是否被禁止
        {
            resp.setContentType("text/html;charset=UTF-8");//设置ContenType
            resp.setCharacterEncoding("UTF-8");//设置输出编码
            PrintWriter pw = resp.getWriter();
            pw.write("<h1>此IP禁止访问,请联系管理员!</h1>");
        } else
        {
            chain.doFilter(req, resp);//向下传递

        }
    }


    public void destroy()
    {
        System.out.println("destory firstfilter!");
    }

}
