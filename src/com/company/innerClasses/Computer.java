package com.company.innerClasses;

public class Computer {

    // Take variables and oeration type and print the result
    public void compute(int var1, int var2, String operation) {
        Cpu c = new Cpu();
        if (operation.equals("+")) {
            c.sum(var1, var2);
        } else if (operation.equals("-")) {
            c.subtract(var1, var2);
        }
    }



    private class Cpu {

        private int coreCount=1;
        void sum(int var1, int var2) {
            System.out.println(var1 + var2);
        }
        void subtract(int var1, int var2) {
            System.out.println(var1 - var2);
        }


    }
}
