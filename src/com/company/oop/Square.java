package com.company.oop;

public class Square {
    private int edgeLength;

    public Square(int edgeLength){
        this.edgeLength=edgeLength;
    }

    public int getCircumference(){
        return 4*edgeLength;
    }

    public void printCircumference(){
        System.out.println("Karenin çevresi: " +getCircumference());
    }

    public int getArea(){
        return edgeLength*edgeLength;
    }

    public void printArea(){
        System.out.println("Karenin alanı: " +getArea());
    }
    public int getEdgeLength(){
        return edgeLength;
    }

    public void setEdgeLength(int edgeLength){
        this.edgeLength=edgeLength;
    }
}
