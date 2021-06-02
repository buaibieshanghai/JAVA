package com.example.tongxunpudatabase;

import java.awt.*;
import java.sql.SQLException;


public class  test{
    public static  void main(String args[]) throws SQLException {
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int w = screensize.width;
        int h = screensize.height;
        int chang = 500;
        int kuan = 500;
        MyJFrame myJFrame = new MyJFrame("便捷通讯录", (w - chang) / 2, (h - kuan) / 2, chang, kuan);

    }
}