package com.company.oop;

import javax.swing.*;

public class Calculater {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(700,800);
        JTextField field=new JTextField();
        field.setText("Hesap makinesi");
        field.setVisible(true);
        field.setSize(30,30);
        field.setEnabled(false);
        jFrame.add(field);



    }
}
