package com.company.oop;

public class Rectangle {
    private int shortEdge;
    private int longEdge;
    public Rectangle(int shortEdge,int longEdge){
        this.shortEdge=shortEdge;
        this.longEdge=longEdge;
    }
    public int getShortEdge(){
        return shortEdge;
    }
    public void setShortEdge(int shortEdge){
        this.shortEdge=shortEdge;
    }
    public int getLongEdge(){
        return longEdge;
    }
    public void setLongEdge(int longEdge){
        this.longEdge=longEdge;
    }
}
