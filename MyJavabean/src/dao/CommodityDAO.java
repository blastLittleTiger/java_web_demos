package dao;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:CommodityDAO
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

import java.util.List;

public interface CommodityDAO
{
    public void addCommodity(Commodity commodity);              //添加商品
    public void updateCommodity(Commodity commodity);           //修改商品
    public void deleteCommodity(int commodityId);               //删除商品
    public List<Commodity> findAllCommodity();                  //查询所有商品
    public Commodity findCommodityById(int commodityId);        //按ID查询商品

} 