package test;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:JavaBeanTest
// Date:2016/7/21.
// Copyright="(c) renjiaxin.jesse 2016'
// Licence = "prayjourney 2016"
//
//               ┏ ┓    ┏ ┓
//              ┏┛ ┻━━━━┛ ┻━━━┓
//              ┃    #
//              ┃   ┳┛  ┗*━   ┃    蹉跎错，消磨过，最是光阴化浮沫。
//              ┃      ┻      ┃
//              ┗━━┓       ┏━━┛
//                 ┃         ┗━━━━━━━━━━┓
//                 ┃  神兽保佑           ┣━┓
//                 ┃  永无BUG！         ┏┛
//                 ┗┓━┓ ┏━━━━━━━━━┳━┓━┓┛
//                  ┃━┫━┫         ┃━┫━┫
//                  ┗━┻━┛         ┗━┻━┛
//
// ---------------------------------------------------------------

import bean.Commodity;
import dao.CommodityDAO;
import dao.CommodityDAOFactory;

import java.util.List;

public class JavaBeanTest
{
    private static final String TAG = "JavaBeanTest";

    public static void main(String[] args)
    {
        int flag = 1;
        CommodityDAOFactory cdf = new CommodityDAOFactory();
        CommodityDAO cdo = cdf.getCommodityDAOInstance();
        List<Commodity> commodityList = cdo.findAllCommodity();
        if (commodityList.size() == 0 && flag == 0)
        {
            System.out.println("此时没有对象！");
        } else
        {
            Commodity c1 = new Commodity();
            Commodity c2 = new Commodity();
            Commodity c3 = new Commodity();
            c1.setCommodityId(1);
            c1.setCommodityName("Apple");
            c1.setPrice(6288.99);
            c1.setAgio(0);

            c2.setCommodityId(2);
            c2.setCommodityName("奥迪");
            c2.setPrice(426288.99);
            c2.setAgio(0.8);

            c3.setCommodityId(3);
            c3.setCommodityName("我的世界");
            c3.setPrice(88.99);
            c3.setAgio(0.8);

            cdo.addCommodity(c1);
            cdo.addCommodity(c2);
            cdo.addCommodity(c3);

            List<Commodity> commodityList2 = cdo.findAllCommodity();
            if (commodityList2.size() > 0)
            {
                for (Commodity cl : commodityList2)
                {
                    System.out.println("ID:" + cl.getCommodityId() + ",Name:" + cl.getCommodityName() + ",Price:" + cl.getPrice() + ",Agio:" + cl.getAgio());
                }
            }
            if (cdo.findCommodityById(2)!=null)
            {
                Commodity cid2=cdo.findCommodityById(2);
                System.out.println("修改前");
                System.out.println("ID:" + cid2.getCommodityId() + ",Name:" + cid2.getCommodityName() + ",Price:" + cid2.getPrice() + ",Agio:" + cid2.getAgio());

                cid2.setCommodityName("COOC");
                cid2.setPrice(99999999.99);
                cid2.setAgio(0.92);
                cdo.updateCommodity(cid2);

                System.out.println("修改后");
                Commodity cid2_new=cdo.findCommodityById(2);
                System.out.println("ID:" + cid2_new.getCommodityId() + ",Name:" + cid2_new.getCommodityName() + ",Price:" + cid2_new.getPrice() + ",Agio:" + cid2_new.getAgio());

            }
            if (cdo.findCommodityById(12)!=null)
            {
                System.out.println("总的容量为"+cdo.findAllCommodity().size());
                Commodity cid12=cdo.findCommodityById(12);
                System.out.println("ID为12");
                System.out.println("ID:" + cid12.getCommodityId() + ",Name:" + cid12.getCommodityName() + ",Price:" + cid12.getPrice() + ",Agio:" + cid12.getAgio());
                cdo.deleteCommodity(12);
                System.out.println("总的容量为"+cdo.findAllCommodity().size());


            }


        }

    }

} 