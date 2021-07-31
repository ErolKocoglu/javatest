package com.company.oop;

import javax.swing.*;
import java.awt.*;

public class Calculater {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(500,600);
        jFrame.setLayout(null);
        JTextField field=new JTextField();
        field.setText("Hesap makinesi");
        field.setVisible(true);
        field.setSize(30,30);
        field.setEnabled(false);
        JButton button=new JButton("1");
        button.setVisible(true);
        button.setBounds(40,100,60,40);
        button.setBackground(Color.white);
        button.setText("5");
        jFrame.add(button);



    }
}
