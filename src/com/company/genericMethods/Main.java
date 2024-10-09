package com.company.genericMethods;

public class Main {
    public static void main(String[] args) {
        String []strArray ={"Hello", "World","Goodbye"};
        Integer []intArray ={1,3,5,7,8};//generic methods take wrapper class of primitive variables
        Printer.print(strArray);
        Printer.print(intArray);
    }
}
