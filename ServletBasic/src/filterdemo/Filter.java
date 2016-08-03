package filterdemo;
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

import javax.servlet.*;
import java.io.IOException;

public class Filter implements javax.servlet.Filter
{
    public void destroy()
    {
        System.out.println("destory filter!");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException
    {
        System.out.println("execute filter!");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException
    {
        System.out.println("init filter!");
    }

}
