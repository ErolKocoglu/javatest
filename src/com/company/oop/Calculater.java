package com.company.oop;

import javax.swing.*;
import java.awt.*;

public class Calculater {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(500, 600);
        jFrame.setLayout(null);
        jFrame.setTitle("Hesap Makinesi");
        JButton[] buttons = new JButton[10];
        JTextField textFieldSonuc = new JTextField();
        textFieldSonuc.setSize(200, 180);
        textFieldSonuc.setLocation(80, 10);
        textFieldSonuc.setVisible(true);
        textFieldSonuc.setEnabled(false);
        jFrame.add(textFieldSonuc);
        for (int i = 0; i < 10; i++) {
            String s = String.valueOf(i);
            JButton button = new JButton(s);
            button.setBackground(Color.white);
            int x = 0;
            int y = 0;
            if (i == 0) {
                button.setBounds(150, 360, 60, 50);
            } else {
                if (i == 1 || i == 4 || i == 7) {
                    x = 90;
                } else if (i == 2 || i == 5 || i == 8) {
                    x = 150;
                } else if (i == 3 || i == 6 || i == 9) {
                    x = 210;
                }

                if (i == 1 || i == 2 || i == 3) {
                    y = 210;
                } else if (i == 4 || i == 5 || i == 6) {
                    y = 260;
                } else if (i == 7 || i == 8 || i == 9) {
                    y = 310;
                }
                button.setBounds(x, y, 60, 50);
            }
            button.setVisible(true);
            buttons[i] = button;
            jFrame.add(button);

        }
        String[] symbols = {"+", "-", "x", "/", "="};
        JButton[] symbolButtons = new JButton[5];
        for (int i = 0; i < 5; i++) {
            JButton symbolButton = new JButton(symbols[i]);
            symbolButton.setBackground(Color.white);
            int x = 0;
            int y = 0;
            if(i==4){
                symbolButton.setBounds(300,310,120,50);
            }else{
                if(i==0||i==2){
                    x=300;
                }else if(i==1||i==3){
                    x=360;
                }

                if(i==0||i==1){
                    y=210;
                }else if(i==2||i==3){
                    y=260;
                }
                symbolButton.setBounds(x,y,60,50);
            }
            symbolButtons[i]=symbolButton;
            symbolButton.setVisible(true);
            jFrame.add(symbolButton);

        }

    }
}
