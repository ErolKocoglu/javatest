package com.company;

import java.util.Scanner;

public class Bolum5Alistirmalar {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        //Çözüm 1
        System.out.println("1. sayıyı girin");
        int sayi1 = tara.nextInt();
        System.out.println("2. sayıyı girin");
        int sayi2 = tara.nextInt();
        System.out.println("3. sayıyı girin");
        int sayi3 = tara.nextInt();
        System.out.println("Girdiğiniz sayıların ortalaması: ");
        double ortalama = (sayi1 + sayi2 + sayi3) / 3.0;
        System.out.printf("%.2f", ortalama );

        //Çözüm 2
        System.out.println("\n1. kenarı girin");
        int kenar1 = tara.nextInt();
        System.out.println("2. kenarı girin");
        int kenar2 = tara.nextInt();
        System.out.println("3. kenarı girin");
        int kenar3 = tara.nextInt();
        if( (kenar1==kenar2) && (kenar1==kenar3)){
            System.out.println("Bu bir eşkenar üçgendir");
        }else if( (kenar1!=kenar2)&&(kenar1!=kenar3)&&(kenar2!=kenar3)){
            System.out.println("Bu bir çeşitkenar üçgendir");
        }else{
            System.out.println("Bu bir ikizkenar üçgendir");
        }

        //Çözüm 3
        System.out.println("Vize notunuzu giriniz");
        int vizeNotu = tara.nextInt();
        System.out.println("Final notunuzu giriniz");
        int finalNotu = tara.nextInt();
        double gecmeNotu = (double)(vizeNotu*40/100) + (finalNotu*60/100);
        System.out.println("Geçme notunuz:" + gecmeNotu);
        if(gecmeNotu>=50){
            System.out.println("Tebrikler dersi geçtiniz");
        }else{
            System.out.println("Maalesef dersi geçemediniz");
        }

        //Çözüm 4
        for(int i =0; i<5; i++){
            System.out.println("Erol");
        }

        //Çözüm 5
        int toplam = 0;
        System.out.println("Alt sınırı giriniz");
        int altSinir = tara.nextInt();
        System.out.println("Üst sınırı giriniz");
        int ustSinir = tara.nextInt();
        for(int sayi =altSinir; sayi<ustSinir; sayi++){
            toplam+=sayi;
        }
        System.out.println("Toplam:" + toplam);

        //Çözüm 6
        for(int a =1; a<11; a++){
            System.out.print(a);
            if(a!=10){
                System.out.print(",");
            }
        }
        //Çözüm 7
        int faktoriyel=1;
        System.out.println("\nHangi sayının faktöriyelini almak istiyorsunuz?");
        int istenenSayi=tara.nextInt();
        for(int basSayi=1; basSayi<=istenenSayi; basSayi++){
            faktoriyel*=basSayi;
        }
        System.out.println(istenenSayi + " sayısının faktöriyeli:" + faktoriyel);

        //Çözüm 8
        System.out.println("x sayısını giriniz");
        int x =tara.nextInt();
        System.out.println("y sayısını giriniz");
        int y =tara.nextInt();
        int fonksiyon=0;
        if(x>0 && y<0){
            fonksiyon= 4*x + 2*y +4;
            System.out.println("fonksiyonun değeri: " + fonksiyon);
        }else if(x>0 && y==0){
            fonksiyon= 2*x -y +3;
            System.out.println("fonksiyonun değeri: " + fonksiyon);
        }else if(x<0 && y>0){
            fonksiyon= 3*x +4*y +3;
            System.out.println("fonksiyonun değeri: " + fonksiyon);
        }

        //Çözüm 9
        System.out.println("Notunuzu giriniz");
        int notDegeri= tara.nextInt();
        int notAraligi=notDegeri/10;
        if(notDegeri== 100){
            notAraligi=9;
        }
        switch (notAraligi){
            case 9:
                System.out.println("Notunuz AA");
                break;

            case 8:
                System.out.println("Notunuz BA");
                break;

            case 7:
                System.out.println("Notunuz BB");
                break;

            case 6:
                System.out.println("Notunuz CB");
                break;

            case 5:
                System.out.println("Notunuz CC");
                break;
                default:
                    System.out.println("Notunuz CC'den düşük.");


        }

        //Çözüm 10
        System.out.println("Çarpım Tablosu");
        for(int a =1; a<=10; a++){
            for(int b=1; b<=10; b++){
                System.out.println(a +"x" +b +"=" +(a*b) );
            }
        }

        //Çözüm 11
        int uretilenSayi= (int)(Math.random()*99 +1);
        int denemeSayisi=0;
        int tahmin = -1;
        while(tahmin!=uretilenSayi){
            System.out.println("Tahmininizi girin");
            tahmin=tara.nextInt();
            denemeSayisi++;
            if(tahmin==uretilenSayi){
                System.out.println("Tebrikler " +denemeSayisi +". seferde doğru bildiniz.");
            }else if(tahmin>uretilenSayi){
                System.out.println("Yüksek girdiniz düşürün");
            }else{
                System.out.println("Düşük girdiniz yükseltin");
            }

        }








    }
}
