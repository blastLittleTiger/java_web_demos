package dbutil;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:DBConnection
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

import java.sql.*;

public class DBConnection
{
    private static final String TAG = "DBConnection";
    private static final String DBDRIVER = "com.mysql.jdbc.Driver";
    private static final String DBURL = "jdbc:mysql://localhost:3306/javaweb";
    private static final String DBUSER = "root";
    private static final String DBPASSWORD = "renjiaxin";

    public static Connection getConnection()//获得conn连接对象
    {
        Connection conn = null;
        try
        {
            Class.forName(DBDRIVER);
            conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Connection conn)//关闭conn连接对象
    {
        if (conn != null)
        {
            try
            {
                conn.close();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void close(PreparedStatement pstmt)//关闭pstmt预处理对象
    {
        if (pstmt != null)
        {
            try
            {
                pstmt.close();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet rs)//关闭rs结果集对象
    {
        if (rs != null)
        {
            try
            {
                rs.close();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }

}