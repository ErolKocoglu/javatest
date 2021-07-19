package com.company.oop;

public class Circle {
    private int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public void calculateCircumferenceCircle(){
        //2.pi.r
        double circumference= 2*Math.PI*radius;
        System.out.println("Dairenin çevresi: " +circumference);
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
}
