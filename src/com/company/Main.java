package com.company;

public class Main {

    public static void main(String[] args) {
        int birinciSayı = 18;
        System.out.println("yaş:" + birinciSayı);
        int integerDegerim = 2020;
        double doubleDegerim = 531.88;
        short shortDegerim = 27655;
        System.out.println("BYTE EN KÜÇÜK DEĞERİ:" + Byte.MIN_VALUE + " BYTE EN BÜYÜK DEĞERİ:" + Byte.MAX_VALUE + " KAÇ BİT:" + Byte.SIZE);
        //char ve boolean
        char harf = 'a';
        System.out.println("harf değeri:" + harf);
        boolean cevap = false;
        System.out.println("cevap:" + cevap);
        // type casting
        int sayi = 15;
        float ondalikliSayi = 531.8f;
        sayi = (int) ondalikliSayi;
        System.out.println("sayı değeri" + sayi);
        byte byteDegeri = 2;
        byteDegeri = (byte) ondalikliSayi;
        System.out.println("byte değeri " + byteDegeri);


    }
}
