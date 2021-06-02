package com.example.tongxunpudatabase;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
class MyJPanel_Delete extends MyJPanel {
    JPanel jPanel_S_N = new JPanel();//放按钮
    JTextField jTextField;//输入名字
    JButton jButton = new JButton("查询");
    JButton jButton1 = new JButton("删除");
    JPanel jPanel_S_S = new JPanel();//放提示和查询结果 jpanel1 和 2
    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JLabel jLabel; // 提示
    JLabel jLabel_name;
    JLabel jLabel_sexage;
    JLabel jLabel_aihao;
    JLabel jLabel_country;
    public MyJPanel_Delete(String name) {
        super(name);
        setJPanel_S_N();
        setJPanel_S_S();
        setJPanel2();
        jPanel_S.add(jPanel_S_N, BorderLayout.NORTH);
        jPanel_S.add(jPanel_S_S, BorderLayout.CENTER);
    }
    private void setJPanel2() {
        // 添加四个jlabel
        jPanel2.setLayout(new GridLayout(4, 1));
        jLabel_name = (JLabel) setCompane.setMyObject(new JLabel());
        jLabel_sexage = (JLabel) setCompane.setMyObject(new JLabel());
        jLabel_aihao = (JLabel) setCompane.setMyObject(new JLabel());
        jLabel_country = (JLabel) setCompane.setMyObject(new JLabel());
        jPanel2.add(jLabel_name);
        jPanel2.add(jLabel_sexage);
        jPanel2.add(jLabel_country);
        jPanel2.add(jLabel_aihao);
    }
    private void setJPanel_S_S() {
        jLabel = (JLabel) setCompane.setMyObject(new JLabel("", JLabel.CENTER));
        jPanel1.add(jLabel);
        jPanel_S_S.setLayout(new CardLayout());
        jPanel_S_S.add(jPanel1, "提示");
        jPanel_S_S.add(jPanel2, "查询界面");
    }

    private void setJPanel_S_N() {
        jPanel_S_N.setLayout(new GridLayout(1, 3));
        jButton.setActionCommand("查询");
        jButton1.setActionCommand("删除");
        jButton.addActionListener(this);
        jButton1.addActionListener(this);
        jTextField = (JTextField) setCompane.setMyObject(new JTextField(5));
        jPanel_S_N.add(jTextField);
        jPanel_S_N.add(jButton);
        jPanel_S_N.add(jButton1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("查询")) {

            PeopleInformation peopleInformation = new PeopleInformation(jTextField.getText());
            try {
                boolean b = peopleInformation.find();
                if(b){
                    jLabel_name.setText("姓名:" + peopleInformation.name);
                    jLabel_sexage.setText("性别:" + peopleInformation.sex + "      " + "年龄:" + peopleInformation.age);
                    jLabel_country.setText("城市:" + peopleInformation.country);
                    String str4 = "";
                    if (peopleInformation.music == true) {
                        str4 = str4 + "音乐";
                    }
                    if (peopleInformation.movie == true) {
                        str4 = str4 + "电影";
                    }
                    if (peopleInformation.run == true) {
                        str4 = str4 + "旅行";
                    }
                    jLabel_aihao.setText(str4);
                    ((CardLayout) jPanel_S_S.getLayout()).show(jPanel_S_S, "查询界面");

                }else{
                    jLabel.setText("查询失败,无此好友信息!");
                    ((CardLayout) jPanel_S_S.getLayout()).show(jPanel_S_S, "提示");
                }

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
                if (e.getActionCommand().equals("删除")) {

                    PeopleInformation peopleInformation = new PeopleInformation(jTextField.getText());
                    try {
                        boolean b= peopleInformation.delete();
                        if(b){
                            jLabel.setText("已删除好友信息:" + jTextField.getText());
                            ((CardLayout) jPanel_S_S.getLayout()).show(jPanel_S_S, "提示");

                        }else{
                            jLabel.setText("删除失败,无此好友信息!");
                            ((CardLayout) jPanel_S_S.getLayout()).show(jPanel_S_S, "提示");
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }

                }

        }
    }
