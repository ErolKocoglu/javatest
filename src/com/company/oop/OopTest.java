package com.company.oop;

import com.company.School;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OopTest {
    public static void main(String[] args) {
        JFrame myObj = new JFrame();
        myObj.setVisible(true);
        myObj.setSize(100,200);

        myObj.setTitle("First Frame");

        JFrame secondFrame= new JFrame();
        secondFrame.setVisible(true);
        secondFrame.setLocation(500,300);
        secondFrame.setSize(800,800);
        secondFrame.setTitle("Second Frame");

        myObj.getContentPane().setBackground(Color.BLUE);
        Scanner tara = new Scanner(System.in);
        System.out.println("First frame gir");
        String firstFrame=tara.nextLine();
        myObj.setTitle(firstFrame);
//        String myEmail="      mustafa@hotmail.com";
//        String yourEmail="mustafa1@hotmail.com";
//        System.out.println(yourEmail.hashCode());
//        System.out.println(myEmail.trim());
//
//
//        if(myEmail.isEmpty()!=true) {
//            if (myEmail.contains("@")) {
//                System.out.println(myEmail.substring(0, myEmail.indexOf("@")).trim());
//            }
//        }

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
//        Geometry geometry=new Geometry();
//        geometry.readRadiusFromConsole();
//        geometry.calculateAreaOfCircle();
//        geometry.calculateCircumferenceOfCircle();
//
//        geometry.readEdgeLengthFromConsole();
//        geometry.calculateAreaOfSquare();
//        geometry.calculateCircumferenceOfSquare();
//
//        geometry.readRectangleFromConsole();
//        geometry.calculateAreaOfRectangle();
//        geometry.calculateCircumferenceOfRectangle();
//        System.out.println("My first git test");
        try{
            File myFile= new File("C:\\Users\\HP\\IdeaProjects\\untitled2\\src\\com\\company\\oop\\deneme.txt");
            Scanner myReader= new Scanner(myFile);
            OopTest newObject=new OopTest();
            while(myReader.hasNextLine()){
                String email=myReader.nextLine();
                System.out.println(myReader.nextLine() +newObject.isValid(email));

            }
            myReader.close();
        }catch (FileNotFoundException e){
            System.out.println("Hata meydana geldi");
            e.printStackTrace();
        }




    }

    public boolean isValid(String email){
        boolean valid;
        if(email.contains("@")==true&&email.substring(0,email.indexOf("@")).isEmpty()==false&&email.substring(email.indexOf("@")).contains(".")==true&&email.substring(email.indexOf("@"),email.indexOf(".")).isEmpty()==false&&email.substring(email.indexOf("."),email.indexOf(".",email.indexOf("."))).isEmpty()==false){
            valid=true;
        }else{
            valid=false;
        }
        return valid;
    }


}
