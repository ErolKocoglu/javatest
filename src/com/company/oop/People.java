package com.company.oop;

import java.util.Date;
import java.util.Scanner;

public class People {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for(int a=0; a<3; a++){
            System.out.println("Tourist için t, officer için o, student için s girin");
            String status= scanner.next();
            System.out.println("Kişi sayısını girin");
            int countOfPeople=scanner.nextInt();
            if(status.equals("t")){
                Tourist[] tourists=new Tourist[countOfPeople];
                for(int i=0; i<countOfPeople; i++){
                    System.out.println("İsim girin");
                    String name=scanner.next();
                    System.out.println("Soyisim girin");
                    String surname=scanner.next();
                    System.out.println("Ülke girin");
                    String country=scanner.next();
                    tourists[i]=new Tourist(name,surname,country);
                }
            }else if(status.equals("o")){
                Officer[] officers=new Officer[countOfPeople];
                for(int i=0; i<countOfPeople; i++){
                    System.out.println("İsim girin");
                    String name= scanner.next();
                    System.out.println("Soyisim girin");
                    String surname=scanner.next();
                    System.out.println("Doğum tarihi girin");
                    System.out.println("Yıl:");
                    int year= scanner.nextInt();
                    System.out.println("Ay:");
                    int month=scanner.nextInt();
                    System.out.println("Gün:");
                    int day= scanner.nextInt();
                    Date birthDate=new Date(year,month,day);
                    System.out.println("Doğum yeri girin:");
                    String birthPlace=scanner.next();
                    System.out.println("Kurum adı girin:");
                    String nameOrg=scanner.next();
                    System.out.println("Kurum adresi girin:");
                    String nameAddress=scanner.nextLine();
                    Organisation organisation=new Organisation(nameOrg,nameAddress);
                    System.out.println("Yaşını girin:");
                    int age= scanner.nextInt();
                    officers[i]=new Officer(name,surname,birthDate,birthPlace,organisation,age);
                }
            }else if(status.equals("s")){
                StudentNew[] studentNews=new StudentNew[countOfPeople];
                for(int i=0; i<countOfPeople; i++) {
                    System.out.println("İsim girin:");
                    String name = scanner.next();
                    System.out.println("Soyisim girin:");
                    String surname = scanner.next();
                    System.out.println("Doğum tarihi girin");
                    System.out.println("Yıl:");
                    int year = scanner.nextInt();
                    System.out.println("Ay:");
                    int month = scanner.nextInt();
                    System.out.println("Gün:");
                    int day = scanner.nextInt();
                    Date birthDate = new Date(year, month, day);
                    System.out.println("Doğum yeri girin:");
                    String birthPlace = scanner.next();
                    System.out.println("ID girin:");
                    int id = scanner.nextInt();
                    System.out.println("Ortalama puanı girin:");
                    double averagePoint = scanner.nextDouble();
                    System.out.println("Sınıfı girin:");
                    String clazz = scanner.nextLine();
                }

            }
        }


    }
}
