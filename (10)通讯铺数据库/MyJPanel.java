package com.example.tongxunpudatabase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyJPanel extends JPanel implements ActionListener {
    JPanel jPanel_N = new JPanel();
    JPanel jPanel_S = new JPanel();
    MyJPanel(String name){
        setLayout(new BorderLayout());
        jPanel_N.add((JLabel)setCompane.setMyObject(new JLabel(name,JLabel.CENTER)));
        add(jPanel_N,BorderLayout.NORTH);
        add(jPanel_S,BorderLayout.CENTER);
    }
    @Override
    public void actionPerformed(ActionEvent e) { }
}
