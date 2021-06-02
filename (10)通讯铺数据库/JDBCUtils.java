package com.example.tongxunpudatabase;

import javax.rmi.CORBA.Util;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    //返回数据库的一个连接
    public static Connection getConnection() throws SQLException {
        Driver driver = new com.mysql.cj.jdbc.Driver();
        String url ="jdbc:mysql://localhost:3306/dataofsongyusheng";
        Properties info = new Properties();
        info.setProperty("user" ,"root");
        info.setProperty("password","336699369sys");
        Connection connection = driver.connect(url,info);
        System.out.println(connection);
        return connection;

    }
    //增删改
    public static void Update(String sql, Object ...args) throws SQLException {
         Connection con   = getConnection();
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        //得到预编译sql
        //根据args的个数设置对应的织
        for(int i=0; i<args.length; i++){
            preparedStatement.setObject(i+1,args[i]);
        }
        //执行sql语句
        preparedStatement.execute();
        //关闭资源

        con.close();
        preparedStatement.close();
    }
//  查
    public static ResultSet Find(String sql, Object ...args) throws SQLException {
        Connection con = getConnection();
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        for(int i=0; i<args.length; i++){
            preparedStatement.setObject(i+1,args[i]);
        }
        ResultSet resultSet =  preparedStatement.executeQuery();
       // preparedStatement.close();
      // con.close();
        return resultSet;
    }

}
