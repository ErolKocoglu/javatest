package com.company;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        /*
        int sayi1 = 10;
        int sayi2 = ++sayi1;
        int sayi3 = sayi1--;
        System.out.println("Sonuçlar" + sayi1 + sayi2-- + --sayi3);
        System.out.println("Sonuçlar" + ((sayi1) + (sayi2--) + (--sayi3)));
        System.out.println(sayi3);
        int boy = 0;
        double kilo = 0;
        Scanner tara = new Scanner(System.in);
        System.out.println("Boyunuzu cm cinsinden girin");
        boy = tara.nextInt();
        System.out.println("Kilonuzu kg cinsinden girin");
        kilo = tara.nextDouble();
        double endeks = 0;
        double cmToMetre = (double)boy / 100;
        double boyunKaresi = Math.pow(cmToMetre,2);
        endeks = kilo / boyunKaresi;
        System.out.println("Vücut kitle endeksiniz:" +endeks);*/
        Scanner tara = new Scanner(System.in);
        System.out.println("Lütfen tahmininizi girin");
        int SansliSayi = (int)(Math.random() * 90 + 10);
        int TahminEdilenSayi = tara.nextInt();
        if(SansliSayi==TahminEdilenSayi){
            System.out.println("Tebrikler! Kazandınız.\nŞanslı sayı:" +SansliSayi +"\nTahmininiz:" +TahminEdilenSayi);
        }else{
            System.out.println("Kaybettiniz.\nŞanslı sayı:" +SansliSayi + "\nTahmininiz:" +TahminEdilenSayi);

        }
    }
}
