package com.company;

import java.util.Scanner;

public class IfSwitchKullanimi {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 0;
        if (a > b) {
            c = a - b;
        } else {
            c= a + b;
        }
        System.out.println("c nin değeri : " + c);
        c = (a > b) ? (a - b) : (a + b);
        System.out.println("c nin yeni değeri : " + c);
        for(int sayi = 5; sayi<10; sayi++){
            System.out.println("sayi 10dan küçük");
        }

        int sayi2 = 5;
        while(sayi2 < 10){
            System.out.println("sayi2 değeri " +sayi2);
            sayi2++;
        }
        for(int yenisayi = 1;yenisayi<10; yenisayi++){
            if(yenisayi==4){
                break;
            }
            System.out.println("yeni sayı " +yenisayi);

        }
        distakiFor:
        for(int e = 0;e<5; e++){
            ictekiFor:
            for(int d = 0;d<4; d++){
                System.out.println("e:" +e+" d:"+d);
                if(e==1 && d==2){
                    break distakiFor;
                }

            }
        }



    }
}