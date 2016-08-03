package listenerdemo;//
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

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class FirstListener implements ServletContextListener
{

    // Public constructor is required by servlet spec
    public FirstListener()
    {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce)
    {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */
        System.out.println("init ServletContext!");
    }

    public void contextDestroyed(ServletContextEvent sce)
    {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
        System.out.println("destory ServletContext!");

    }


}
