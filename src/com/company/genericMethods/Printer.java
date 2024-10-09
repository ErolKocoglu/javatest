package com.company.genericMethods;

public class Printer {
    public static <T> void print(T []arr){
        for(T t : arr){
            System.out.println(t);
        }
    }
}
