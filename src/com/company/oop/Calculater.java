//package com.company.oop;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class Calculater {
//    private static double lastOperationResult=0.0;
//    private static String lastOperation;
//
//    public static void main(String[] args) {
//        Calculater calculater = new Calculater();
//        JFrame jFrame = new JFrame();
//        jFrame.setVisible(true);
//        jFrame.setSize(500, 600);
//        jFrame.setLayout(null);
//        Font font = new Font("SansSerif", Font.BOLD, 35);
//        jFrame.setTitle("Hesap Makinesi");
//        JButton[] buttons = new JButton[10];
//        JTextField textFieldSonuc = new JTextField();
//        textFieldSonuc.setSize(360, 180);
//        textFieldSonuc.setLocation(80, 10);
//        textFieldSonuc.setFont(font);
//        textFieldSonuc.setHorizontalAlignment(JTextField.LEFT);
//        textFieldSonuc.setDisabledTextColor(Color.black);
//        textFieldSonuc.setVisible(true);
//        textFieldSonuc.setEnabled(false);
//        jFrame.getContentPane().add(textFieldSonuc);
//        int number2 = 0;
//        double result = 0;
//        JButton clearButton = new JButton("clr");
//        clearButton.setBounds(210, 360, 60, 50);
//        clearButton.setVisible(true);
//        clearButton.addActionListener(e -> textFieldSonuc.setText(""));
//        jFrame.add(clearButton);
//
//        for (int i = 0; i < 10; i++) {
//            String s = String.valueOf(i);
//            JButton button = new JButton(s);
//            button.setBackground(Color.white);
//            int x = 0;
//            int y = 0;
//            if (i == 0) {
//                button.setBounds(150, 360, 60, 50);
//            } else {
//                if (i == 1 || i == 4 || i == 7) {
//                    x = 90;
//                } else if (i == 2 || i == 5 || i == 8) {
//                    x = 150;
//                } else if (i == 3 || i == 6 || i == 9) {
//                    x = 210;
//                }
//
//                if (i == 1 || i == 2 || i == 3) {
//                    y = 210;
//                } else if (i == 4 || i == 5 || i == 6) {
//                    y = 260;
//                } else if (i == 7 || i == 8 || i == 9) {
//                    y = 310;
//                }
//                button.setBounds(x, y, 60, 50);
//            }
//            button.addActionListener(e -> textFieldSonuc.setText(textFieldSonuc.getText().concat(s)));
//            button.setVisible(true);
//            buttons[i] = button;
//            jFrame.add(button);
//
//        }
//        String[] symbols = {"+", "-", "x", "/", "="};
//        JButton[] symbolButtons = new JButton[5];
//        for (int i = 0; i < 5; i++) {
//            JButton symbolButton = new JButton(symbols[i]);
//            symbolButton.setBackground(Color.white);
//            int x = 0;
//            int y = 0;
//            if (i == 4) {
//                symbolButton.setBounds(300, 310, 120, 50);
//            } else {
//                if (i == 0 || i == 2) {
//                    x = 300;
//                } else if (i == 1 || i == 3) {
//                    x = 360;
//                }
//
//                if (i == 0 || i == 1) {
//                    y = 210;
//                } else if (i == 2 || i == 3) {
//                    y = 260;
//                }
//                symbolButton.setBounds(x, y, 60, 50);
//            }
//            symbolButtons[i] = symbolButton;
//            symbolButton.setVisible(true);
//            jFrame.add(symbolButton);
//        }
//
//
//        for(int i=0;i<4;i++){
//            int a=i;
//            symbolButtons[i].addActionListener(e -> calculater.signClicked( textFieldSonuc, symbolButtons[a].getText()));
//        }
//        symbolButtons[4].addActionListener(e -> calculater.calculate( number2, result, textFieldSonuc));
//    }
//
//   // number1Assign(1,myTextFıeld,"erol","denız")
//
//   // int number1=1;
//  //  JTextField textFieldSonuc= myTextFıeld
//    // Strıng operator= erol
//    // Strıng text = denız
//
//    public void signClicked( JTextField textFieldSonuc, String text) {
//        if (lastOperation.isEmpty() == false) {
//            if(lastOperation.equals("+")){
//                lastOperationResult=lastOperationResult + Integer.parseInt(textFieldSonuc.getText());
//                lastOperation="";
//            }else if(lastOperation.equals("-")){
//                lastOperationResult=lastOperationResult - Integer.parseInt(textFieldSonuc.getText());
//                lastOperation="";
//            }else if(lastOperation.equals("x")){
//                lastOperationResult=lastOperationResult * Integer.parseInt(textFieldSonuc.getText());
//                lastOperation="";
//            }
//        }
//        lastOperation=text;
//        lastOperationResult=Integer.parseInt(textFieldSonuc.getText());
//        textFieldSonuc.setText("");
//
//
//
//    }
//
//    public void calculate(int number1, int number2, double result, JTextField textFieldSonuc, String operator) {
//        number2 = Integer.parseInt(textFieldSonuc.getText());
//        System.out.println(operator);
//        System.out.println(number2);
//        System.out.println(number1);
//
//        if (operator.equals("+")) {
//            result = (number1 + number2);
//        } else if (operator.equals("-")) {
//            result = (number1 - number2);
//        } else if (operator.equals("x")) {
//            result = (number1 * number2);
//        } else if (operator.equals("/")) {
//            result = (number1 / number2);
//        }
//        textFieldSonuc.setText(String.valueOf(result));
//    }
//}
