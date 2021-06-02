package com.example.tongxunpudatabase;

import java.awt.*;

class setCompane {
    // 所有组件设置颜色,字体
    public static Object setMyObject(Object objold) {
        Object obj = objold;
        if (obj instanceof Component) {
            Component com = (Component) obj;
            com.setForeground(Color.BLACK);
            Font font = new Font("Monospaced", Font.BOLD, 25);// 设置字体格式和大小
            com.setFont(font);
            return com;
        }
        return obj;
    }
}