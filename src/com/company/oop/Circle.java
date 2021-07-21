package com.company.oop;

public class Circle {
    private int radius;
    private double circumference;
    private double area;
    public Circle(int radius){
        this.radius=radius;
    }
    public void calculateCircumferenceCircle(){
        //2.pi.r
        double circumference= 2*Math.PI*radius;
        this.circumference=circumference;
        System.out.println("Dairenin çevresi: " +circumference);
    }
    public void calculateAreaCircle(){
        double area=Math.PI*radius*radius;
        this.area=area;
        System.out.println("Dairenin alanı: " +area);
    }
    public double getArea(){
        return area;
    }
    public void printArea(){
        System.out.println(area);
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
