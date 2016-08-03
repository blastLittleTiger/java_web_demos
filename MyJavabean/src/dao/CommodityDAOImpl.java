package dao;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:CommodityDAOImpl
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
import dbutil.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommodityDAOImpl implements CommodityDAO
{
    private static final String TAG = "CommodityDAOImpl";

    @Override
    public void addCommodity(Commodity commodity)
    {
        Connection conn = DBConnection.getConnection();
        String addSQL = "insert into commodity(commodityName,price,agio)values(?,?,?)";
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(addSQL);
            pstmt.setString(1, commodity.getCommodityName());
            pstmt.setDouble(2, commodity.getPrice());
            pstmt.setDouble(3, commodity.getAgio());
            pstmt.executeUpdate();
        } catch (SQLException e)
        {
            e.printStackTrace();
        } finally
        {
            DBConnection.close(pstmt);
            DBConnection.close(conn);
        }
    }

    @Override
    public void updateCommodity(Commodity commodity)
    {
        Connection conn = DBConnection.getConnection();
        String updateSQL = "update commodity set commodityName=?,price=?,agio=? where commodityId=?";
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(updateSQL);
            pstmt.setString(1, commodity.getCommodityName());
            pstmt.setDouble(2, commodity.getPrice());
            pstmt.setDouble(3, commodity.getAgio());
            pstmt.setInt(4, commodity.getCommodityId());
            pstmt.executeUpdate();
        } catch (SQLException e)
        {
            e.printStackTrace();
        } finally
        {
            DBConnection.close(pstmt);
            DBConnection.close(conn);
        }
    }

    @Override
    public void deleteCommodity(int commodityId)
    {
        Connection conn = DBConnection.getConnection();
        String deleteSQL = "delete from commodity where commodityId=?";
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(deleteSQL);
            pstmt.setInt(1, commodityId);
            pstmt.executeUpdate();
        } catch (SQLException e)
        {
            e.printStackTrace();
        } finally
        {
            DBConnection.close(pstmt);
            DBConnection.close(conn);
        }

    }

    @Override
    public List<Commodity> findAllCommodity()
    {
        Connection conn = DBConnection.getConnection();
        String selectAllSQL = "select * from commodity";
        PreparedStatement pstmt = null;
        List<Commodity> commodityList = new ArrayList<Commodity>();
        try
        {
            pstmt = conn.prepareStatement(selectAllSQL);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next())
            {
                Commodity commodity = new Commodity();
                commodity.setCommodityId(rs.getInt(1));
                commodity.setCommodityName(rs.getString(2));
                commodity.setPrice(rs.getDouble(3));
                commodity.setAgio(rs.getDouble(4));
                commodityList.add(commodity);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        } finally
        {
            DBConnection.close(pstmt);
            DBConnection.close(conn);
        }
        return commodityList;
    }

    @Override
    public Commodity findCommodityById(int commodityId)
    {
        Connection conn = DBConnection.getConnection();
        String selectByIdSQL = "select * from commodity where commodityId=?";
        PreparedStatement pstmt = null;
        Commodity commodity = new Commodity();
        try
        {
            pstmt = conn.prepareStatement(selectByIdSQL);
            pstmt.setInt(1, commodityId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next())
            {
                commodity.setCommodityId(rs.getInt(1));
                commodity.setCommodityName(rs.getString(2));
                commodity.setPrice(rs.getDouble(3));
                commodity.setAgio(rs.getDouble(4));
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        } finally
        {
            DBConnection.close(pstmt);
            DBConnection.close(conn);
        }
        return commodity;
    }
}