package com.example.tongxunpudatabase;

import com.sun.javaws.exceptions.JRESelectException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class MyJPanel_show extends  MyJPanel{
    String name1[] = {"名字","性别","城市","音乐","电影","旅行","年龄"};
    JTable jTable = (JTable) setCompane.setMyObject(new JTable());
    JScrollPane pane;
    Object [][] tabledate ;
    MyJPanel_show(String name) throws SQLException {
        super(name);

        find();

        jTable = new JTable(tabledate,name1);

        pane=new JScrollPane(jTable);
        add(pane);

    }

    //查询所有人员信息，并且更新表格
    public void find() throws SQLException {
        String sql = "select * from Communication";
        ResultSet resultSet = JDBCUtils.Find(sql);
        String sql1 = "select count(*) from Communication";
        ResultSet resultSet1 = JDBCUtils.Find(sql1);
        int rowCount = 0;
        if(resultSet1.next()){
             rowCount = resultSet1.getInt(1);
        }


        System.out.println(rowCount);
        tabledate = new Object[rowCount][7];
        int j=0;
        while(resultSet.next()){
            System.out.println("测试"+j);
                tabledate[j][0] = resultSet.getString(2);
            if (resultSet.getBoolean(3)) {
                tabledate[j][1] = "男";
            }else{
                tabledate[j][1] = "女";
            }
                tabledate[j][2] = resultSet.getString(4);
                for(int z=3; z<6; z++){
                    if (resultSet.getBoolean(z+2)) {
                        tabledate[j][z] = "喜欢";
                    }else{
                        tabledate[j][z]= "不喜欢";
                    }
                }




            tabledate[j][6] = resultSet.getInt(8);
            j++;
        }

        DefaultTableModel tabModel = new DefaultTableModel(tabledate,name1);
        jTable.setModel(tabModel);
        jTable.setEnabled(true);

    }
}
