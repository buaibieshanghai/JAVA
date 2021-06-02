package com.example.tongxunpudatabase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

class MyJFrame extends JFrame implements ActionListener {
    // 南北两个容器
    // 卡片布局 两个界面
    JPanel jPanel_mima = new JPanel();
    JPanel jPanel_data = new JPanel();
    private JPanel jPanel_N = new JPanel();
    private JPanel jPanel_S = new JPanel();
    JPanel jPanel = new JPanel();
    JTextField jTextField_zhanghao;
    JTextField jTextField_mima;
    JLabel jLabel_tip;
    MyJPanel_Delete MyJPanel_Delete;
    MyJPnal_Add myJPnal_Add;
    MyJPanel_show myJPanel_show;


    MyJFrame(String name, int l1, int l2, int l3, int l4) throws SQLException {
        super(name);
        setBounds(l1, l2, l3, l4); // 设置位置和大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setComponernt();
        setVisible(true); // 设置可见
    }

    // 设置布局
    private void setComponernt() throws SQLException {
        jPanel_data.setLayout(new BorderLayout());
        CardLayout card = new CardLayout();
        jPanel_N.setLayout(card);
        myJPnal_Add = new MyJPnal_Add("添加好友");
        jPanel_N.add(myJPnal_Add, "添加好友");
        MyJPanel_Delete = new MyJPanel_Delete("删除好友");
        jPanel_N.add(MyJPanel_Delete, "删除好友");
        myJPanel_show = new MyJPanel_show("显示好友");
        jPanel_N.add(myJPanel_show,"显示好友");

        jPanel_S.setLayout(new GridLayout(1, 2));

        jPanel_S.add(southJButton("显示好友"));
        jPanel_S.add(southJButton("添加好友"));
        jPanel_S.add(southJButton("删除好友"));
        jPanel_S.setPreferredSize(new Dimension(0, 50));
        jPanel_data.add(jPanel_N, BorderLayout.CENTER);
        jPanel_data.add(jPanel_S, BorderLayout.SOUTH);
        // 三行
        JPanel jPanel0 = new JPanel();
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        JPanel jPanel4 = new JPanel();
        JButton jButton = southJButton("登录");
        jButton.setText("登录");
        jPanel_mima.setLayout(new GridLayout(6, 1));
        jTextField_zhanghao = (JTextField) setCompane.setMyObject(new JTextField(16));
        jTextField_mima = (JTextField) setCompane.setMyObject(new JTextField(16));
        jTextField_zhanghao.setText("admin");
        jTextField_mima.setText("admin");
        jPanel0.add((JLabel) setCompane.setMyObject(new JLabel("登录界面")));
        jPanel1.add(jTextField_zhanghao);
        jPanel2.add(jTextField_mima);
        jPanel4.add(jButton);
        jPanel_mima.add(jPanel0);
        jPanel_mima.add(jPanel1);
        jPanel_mima.add(jPanel2);
        jPanel_mima.add(jPanel3);
        jPanel_mima.add(jPanel4);
        jPanel.setLayout(new CardLayout());
        jPanel.add(jPanel_mima, "登录界面");
        jPanel.add(jPanel_data, "数据");
        add(jPanel);
    }

    public JButton southJButton(String name) {
        JButton jButton = new JButton(name);
        jButton.setActionCommand(name);
        jButton.addActionListener(this);
        return jButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (str.equals("登录")) {
            String user = "admin";
            String password = "admin";
            if (user.equals(jTextField_zhanghao.getText()) && password.equals(jTextField_mima.getText())) {
                ((CardLayout) jPanel.getLayout()).show(jPanel, "数据");
            }
        }

        if (str.equals("添加好友")) {
            ((CardLayout) jPanel_N.getLayout()).show(jPanel_N, "添加好友");
        }
        if (str.equals("删除好友")) {
            ((CardLayout) jPanel_N.getLayout()).show(jPanel_N, "删除好友");
        }
        if(str.equals("显示好友")){
            try {
                myJPanel_show.find();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            ((CardLayout)jPanel_N.getLayout()).show(jPanel_N,"显示好友");
        }
    }


}
