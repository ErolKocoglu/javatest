package com.company.oop;

import java.util.Date;
import java.util.Scanner;

public class ReferenceTest {
    public static void main(String[] args) {

        //    değışken
        // prmıtıve    sadece değer tutar
        // ınt 0
        // double 0.0
        // long 0
        // char
        // float 0.0
        // boolean false
        // short 0
        // object      reference tutar
        // null






        // obje  new Sınıf Yenı adreslı bır nesne döner


//        Date date= new Date();
//        Date date11= date;
//        Date date12= date;
//        Date date13= date12;
//        Date date14= date13;
//        date13= new Date();
//
//
//
//
//
//
//
//        int myValue;
//        long myLong;
//        ReferenceTest referenceTest = new ReferenceTest();
//        Date tempDate;
//        Date date1= new Date(2002,3,12);
//        Date date2= new Date(1991,7,25);
//
//        Scanner scanner = new Scanner(System.in);
//        if (scanner.nextLine().equals("deniz")){
//            tempDate=date2;
//        }else{
//            tempDate=date1;
//        }
//
//        tempDate= new Date(1999,2,3);
//        Date date3= date2;
//        date2= new Date();
//
//        System.out.println(tempDate.toString());
//

        Date erolBirthday= new Date(2002,3,12);// yy
        Date denizBirthday= new Date(1991,7,25);// xx
        Date temp=erolBirthday;//yy
        erolBirthday=denizBirthday;//xx
        denizBirthday=temp;//yy
        System.out.println(erolBirthday);
        System.out.println(denizBirthday);


    }

    public Date getDate(){
        return new Date();
    }
}
