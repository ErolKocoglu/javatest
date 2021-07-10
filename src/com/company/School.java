package com.company;

import java.util.Scanner;

public class School {
    public String name;
    public String address;
    public String manager;
    public Clazz[] classes;
    public Student[] students;
    public Teacher[] teachers;


    public void readSchoolValuesFromConsole(){
        Scanner tara=new Scanner(System.in);
        System.out.println("Lütfen okulun ismini girin");
        name = tara.next();
        System.out.println("Lütfen okulun adresini girin");
        address = tara.next();
        System.out.println("Lütfen okul müdürünün ismini girin");
        manager = tara.next();
    }

    public void readClassValuesFromConsole(){
        Scanner tara=new Scanner(System.in);
        System.out.println("Bu okulda kaç sınıf var?");
        int sinifSayisi = tara.nextInt();
        Clazz[] siniflar = new Clazz[sinifSayisi];
        for (int j = 0; j < siniflar.length; j++) {
            Clazz sinif = new Clazz();
            System.out.println("Sınıfı ve şubeyi girin ");
            sinif.branch = tara.next();
            System.out.println("Sınıf öğretmenini girin");
            sinif.teacher = tara.next();
            siniflar[j] = sinif;
        }

        classes = siniflar;

    }
    public void readStudentValuesFromConsole(){
        Scanner tara=new Scanner(System.in);
        System.out.println("Bu okulda kaç öğrenci var?");
        int ogrenciSayisi = tara.nextInt();
        Student[] ogrenciler = new Student[ogrenciSayisi];
        for (int k = 0; k < ogrenciSayisi; k++) {

            System.out.println("Öğrencinin adını girin");
            String name = tara.next();
            System.out.println("Öğrencinin soyadını girin");
            String surname = tara.next();
            System.out.println("Öğrencinin yaşını girin");
            int age = tara.nextInt();
            System.out.println("Öğrencinin sınıfını girin");
            String clazz = tara.next();
            ogrenciler[k] = new Student(name,surname,age,clazz);
        }
        students = ogrenciler;

    }

}
