package com.company.innerClasses;

public class Main {
    public static void main(String[] args) {
        Computer c= new Computer();
        c.compute(5,2,"+");
        c.compute(10,2,"-");

        //Anonymous inner class example

        Computer c1=new Computer(){
            @Override
            public void compute(int var1, int var2, String operation) {
                System.out.println("Overridden function");
                super.compute(var1, var2, operation);
            }
        };
        c1.compute(2,4,"+");
        c1.compute(9,1,"-");
    }
}
