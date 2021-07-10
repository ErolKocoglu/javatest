package com.company;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("Kaç öğrenci girmek istersiniz?");
        Scanner tara=new Scanner(System.in);
        String[] ismler=new String[tara.nextInt()];
        for(int i=0; i<ismler.length; i++){
            System.out.println("Öğrenci ismini girin");
            ismler[i]=tara.next();
        }
//        System.out.println("Sorgulamak istediğin öğrenci sırasını gir");
//        int sira =tara.nextInt();
//        while(sira!=-1){
//            System.out.println(ismler[sira]);
//            sira=tara.nextInt();
//        }
        if(ismler.length>2){
            System.out.println("Çok fazla öğrenci var");
        }else if(ismler.length==1){
            System.out.println("1 tane öğrenciniz var");
        }
        else{
            System.out.println("Çok az öğrenci var");
        }
    }
}
