package com.example.tongxunpudatabase;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class PeopleInformation {
    int id;
    String name;
    boolean sex;// 1是男 0是女
    int age;
    String country;// 城市
    boolean music;
    boolean movie;
    boolean run;
    public PeopleInformation() {
    };
    public PeopleInformation(String name){
       this.name = name;

    }
    public void setnamesex(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public void setaihao(String country, boolean music, boolean movie, boolean run) {
        this.run = run;
        this.country = country;
        this.music = music;
        this.movie = movie;
    }// 保存信息到默认路径
    //将好友信息类，添加到通讯数据库中
    //如果好友名字已经存在，则进行覆盖
    //好友名字不存在，则添加

    public void save() throws SQLException {
        String sql = "select * from Communication where name = ? ";

        ResultSet resultSet = JDBCUtils.Find(sql,this.name);
        if(resultSet.next()){
            //已经存在
            String sql0 = "update Communication set name=?,sex=?,country=?,music=?,movie=?,run=?,age=? where name=?" ;
            JDBCUtils.Update(sql0,this.name,this.sex,this.country,this.music,this.movie,this.run,this.age,this.name);
        }else{
            String sql1 = "insert into Communication(name,sex,country,music,movie,run,age)value(?,?,?,?,?,?,?)";
            JDBCUtils.Update(sql1,this.name,this.sex,this.country,this.music,this.movie,this.run,this.age);
            //写入到数据库中
        }

    }
    public boolean delete() throws SQLException {
        String sql = "delete from Communication where name = ?";
        if(name ==null){
            return false;
        }
        if(find()==false){
            return false;
        }
        JDBCUtils.Update(sql,this.name);
        return true;
        //删除

    }
    //利用已有的名字，进行查询并且写入操作
    public boolean find() throws SQLException {
        if (name == null) {
            return false;
        } else {
            String sql = "select * from Communication where name = ?";
            ResultSet resultSet = null;
            resultSet = JDBCUtils.Find(sql, name);
            if (resultSet.next()) {
                id = resultSet.getInt(1);
                name = resultSet.getString(2);
                sex = resultSet.getBoolean(3);

                country = resultSet.getString(4);
                music = resultSet.getBoolean(5);
                movie = resultSet.getBoolean(6);
                run = resultSet.getBoolean(7);
                age = resultSet.getInt(8);
                return true;
            } else {
                return false;
            }

        }


    }
}

