package bean;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:Commodity
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

public class Commodity
{
    private static final String TAG = "Commodity";
    private int commodityId;
    private String commodityName;
    private double price;

    public int getCommodityId()
    {
        return commodityId;
    }

    public void setCommodityId(int commodityId)
    {
        this.commodityId = commodityId;
    }

    public String getCommodityName()
    {
        return commodityName;
    }

    public void setCommodityName(String commodityName)
    {
        this.commodityName = commodityName;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getAgio()
    {
        return agio;
    }

    public void setAgio(double agio)
    {
        this.agio = agio;
    }

    private double agio;

} 