package com.company.oop;

import com.company.School;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public class OopTest {
    public static void main(String[] args) {
//        JFrame myObj = new JFrame();
//        myObj.setVisible(true);
//        myObj.setSize(100, 200);
//
//        myObj.setTitle("First Frame");
//
//        JFrame secondFrame = new JFrame();
//        secondFrame.setVisible(true);
//        secondFrame.setLocation(500, 300);
//        secondFrame.setSize(800, 800);
//        secondFrame.setTitle("Second Frame");
//
//        myObj.getContentPane().setBackground(Color.BLUE);
//        Scanner tara = new Scanner(System.in);
//        System.out.println("First frame gir");
//        String firstFrame = tara.nextLine();
//        myObj.setTitle(firstFrame);
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
//        System.out.println("Yarıçapı girin");
//        Scanner tara=new Scanner(System.in);
//        int radius= tara.nextInt();
//        Circle circle=new Circle(radius);
//        circle.printArea();
//        circle.printCircumference();


//        try {
//            File myFile = new File("C:\\Users\\HP\\IdeaProjects\\untitled2\\src\\com\\company\\oop\\deneme.txt");
//            Scanner myReader = new Scanner(myFile);
//            EmailChecker newObject=new EmailChecker();
//            while (myReader.hasNextLine()) {
//                String email = myReader.nextLine();
//                System.out.println(email +newObject.isValid(email));
//
//
//
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("Hata meydana geldi");
//            e.printStackTrace();
//        }
//        Circle circle=new Circle(4);
//        double area= circle.getArea();
//        System.out.println(area);
//        circle.setRadius(8);
//        System.out.println(circle.getArea());

        //

//        System.out.println("Ahmet said :\"Deniz is a bad person\"");
//        System.out.println("\\");
//        System.out.println("1\n 2\n 3");
//        System.out.println("Erol\tDeniz");
        //            File myFile = new File("C:\\Users\\HP\\IdeaProjects\\untitled2\\src\\com\\company\\oop\\deneme.txt");

//        Circle circle=new Circle(2);
//        System.out.println(circle.getArea());
//        circle.setRadius(5);
//        circle.printArea();
//
//        Rectangle rectangle=new Rectangle(3,5);
//        rectangle.printArea();
//        rectangle.printCircumference();
//
//        Square square= new Square(4);
//        square.printArea();
//        square.printCircumference();


        Organisation organisation=new Organisation("Kurum","Malatya");
        int age=25;
        Officer officer=new Officer("Erol","Koçoğlu",new Date(2002,3,12),"Malatya", organisation, age );
        System.out.println("The birth date of Erol: " +officer.getBirthDate());

        officer.getBirthDate().setDate(11);
        Date date1= officer.getBirthDate();
        officer.setBirthDate(new Date(2005,1,23));
        Date date2= officer.getBirthDate();
        date1.setMonth(3);
        date2.setMonth(9);
        officer.setBirthDate(date1);
        date2.setYear(1991);
        date1.setYear(1945);
        officer.getBirthDate().setYear(1988);
        date2.setDate(13);

        System.out.println(date1);
        System.out.println(date2);

        System.out.println("The birth date of Erol: " +officer.getBirthDate());








        organisation.setName("Jandarma");
        officer.setOrganisation(new Organisation("Kaymakamlık","İlçe merkezi"));
        officer.getOrganisation().setName("Belediye");
        officer.getOrganisation().setAddress("Şehir merkezi");

        Organisation secondOrganisation=officer.getOrganisation();
        secondOrganisation.setName("Belediye");
        secondOrganisation.setAddress("Şehir merkezi");

        officer.setAge(45);
            age=45;
        StudentNew studentNew= new StudentNew("Ahmet","Yılmaz",new Date(),"İstanbul",123456789,90.50,"12/A");

        Tourist tourist=new Tourist("John","Smith","UK");

    }


}
