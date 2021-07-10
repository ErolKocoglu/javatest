package com.company.oop;

import com.company.School;

public class OopTest {
    public static void main(String[] args) {
        String myEmail="      mustafa@hotmail.com";
        String yourEmail="mustafa1@hotmail.com";
        System.out.println(yourEmail.hashCode());
        System.out.println(myEmail.trim());


        if(myEmail.isEmpty()!=true) {
            if (myEmail.contains("@")) {
                System.out.println(myEmail.substring(0, myEmail.indexOf("@")).trim());
            }
        }

//        School[] okullar = new School[2];
//        for (int number = 0; number < okullar.length; number++) {
//            School okul = new School();
//            okul.readSchoolValuesFromConsole();
//            okul.readClassValuesFromConsole();
//            okul.readStudentValuesFromConsole();
//            okullar[number] = okul;
//        }
//        System.out.println("Printing all students");
//        for(int sayi=0; sayi< okullar.length;sayi++){
//            School okul=okullar[sayi];
//            System.out.println("Printing students in:"+okullar[sayi].name);
//            for(int sayi2=0; sayi2<okul.students.length;sayi2++) {
//                okul.students[sayi2].printStudentValues();
//
//            }
//            System.out.println("--------------------------------");
//
//
//        }
        Geometry geometry=new Geometry();
        geometry.readRadiusFromConsole();
        geometry.calculateAreaOfCircle();
        geometry.calculateCircumferenceOfCircle();
        geometry.readEdgeLengthFromConsole();
        geometry.calculateAreaOfSquare();
        geometry.calculateCircumferenceOfSquare();
        geometry.readRectangleFromConsole();
        geometry.calculateAreaOfRectangle();
        geometry.calculateCircumferenceOfRectangle();
    }




}
