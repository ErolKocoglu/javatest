package com.company.oop;

public class Circle {
    private int radius;

    public Circle(int radius){
        this();
        this.radius=radius;
    }
    private Circle(){
        System.out.println(23232);
    }

    public void printCircumference(){
        System.out.println("Dairenin çevresi: " +getCircumference());
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    public void printArea(){
        System.out.println("Dairenin alanı: " +getArea());
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }

    //printArea void
    //getArea double
    //circumference
    //email checker class txt file 1 email her satır isValid method email>boolean print
    // student name,surname, birthdate-place, id, sınıf, ortalama, org>name,address
    // officer name, surname, birthdate-place, org
    // organisation
    //tourist name surname country
}
