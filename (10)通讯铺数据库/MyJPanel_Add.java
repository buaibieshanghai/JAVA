package com.example.tongxunpudatabase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

class MyJPnal_Add extends MyJPanel {
    JTextField jTextField_name = (JTextField)setCompane.setMyObject(new JTextField(5));;// 姓名
    JRadioButton boy = new JRadioButton("男");// 男
    JRadioButton girl = new JRadioButton("女");// 女
    JComboBox<Integer> jComboBox_age = new JComboBox<Integer>(); // 性别
    JCheckBox jCheckBox_1 = new JCheckBox("音乐"); // 爱好
    JCheckBox jCheckBox_2 = new JCheckBox("电影"); // 爱好
    JCheckBox jCheckBox_3 = new JCheckBox("旅行"); // 爱好
    JButton jButton_save = new JButton("保存");
    JComboBox<String> jComboBox = new JComboBox<String>(); // 下拉列表
    public MyJPnal_Add(String name) {
        super(name);
        jPanel_S.setLayout(new GridLayout(5, 1));
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        JPanel jPanel5 = new JPanel();
        JPanel jPanel6 = new JPanel();
        // 设置第一行
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add((JLabel) setCompane.setMyObject(new JLabel("请输入好友的姓名:")), BorderLayout.WEST);
        jPanel1.add(jTextField_name, BorderLayout.CENTER);
        // 设置第二行
        jPanel2.setLayout(new GridLayout(1, 2));
        boy = (JRadioButton) setCompane.setMyObject(boy);
        girl = (JRadioButton) setCompane.setMyObject(girl);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(boy);
        buttonGroup.add(girl);
        jPanel2.add((JLabel)setCompane.setMyObject(new JLabel("性别:")));
        jPanel2.add(boy);
        jPanel2.add(girl);
        // 设置第三行年龄 下拉城市
        jPanel3.setLayout(new GridLayout(1,4));
        jComboBox_age = (JComboBox<Integer>) setCompane.setMyObject(jComboBox_age);
        for (int i = 0; i < 100; i++) {
            jComboBox_age.addItem(i);
        }
        jComboBox =(JComboBox<String>) setCompane.setMyObject(jComboBox);
        jComboBox.addItem("北京");
        jComboBox.addItem("长春");
        jComboBox.addItem("上海");
        jComboBox.addItem("深圳");
        jPanel3.add((JLabel) setCompane.setMyObject(new JLabel("年龄:")));
        jPanel3.add(jComboBox_age);
        jPanel3.add((JLabel) setCompane.setMyObject(new JLabel("城市:")));
        jPanel3.add(jComboBox);
        // 设置第五行爱好
        jCheckBox_1 = (JCheckBox) setCompane.setMyObject(jCheckBox_1);
        jCheckBox_2 = (JCheckBox) setCompane.setMyObject(jCheckBox_2);
        jCheckBox_3 = (JCheckBox) setCompane.setMyObject(jCheckBox_3);
        jPanel5.setLayout(new GridLayout(1, 4));
        jPanel5.add((JLabel) setCompane.setMyObject(new JLabel("爱好:")));
        jPanel5.add(jCheckBox_1);
        jPanel5.add(jCheckBox_2);
        jPanel5.add(jCheckBox_3);
        // 设置第六行 按钮触发事件
        jPanel6.setLayout(new BorderLayout());
        jPanel6.add(jButton_save, BorderLayout.EAST);
        jButton_save.setActionCommand("保存");
        jButton_save.addActionListener(this);
        jPanel_S.add(jPanel1);
        jPanel_S.add(jPanel2);
        jPanel_S.add(jPanel3);
        jPanel_S.add(jPanel5);
        jPanel_S.add(jPanel6);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("保存")) {
            PeopleInformation peopleInformation = new PeopleInformation();
            // 获取单选框内容
            peopleInformation.setnamesex(jTextField_name.getText(), boy.isSelected(),
                    (int) jComboBox_age.getSelectedItem());
            try {
                peopleInformation.setaihao((String) jComboBox.getSelectedItem(), jCheckBox_1.isSelected(),
                        jCheckBox_2.isSelected(), jCheckBox_3.isSelected());
                peopleInformation.save();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}