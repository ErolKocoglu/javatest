package com.company.oop.people;

import java.util.Date;

public class StudentNew extends Citizen{



    private double averagePoint;
    private String clazz;

    public StudentNew(String name, String surname, Date birthDate, String birthPlace, int id, double averagePoint, String clazz){
        super(name,surname,id,birthDate,birthPlace);
        this.averagePoint=averagePoint;
        this.clazz=clazz;
    }




    public double getAveragePoint(){
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint){
        this.averagePoint=averagePoint;
    }

    public String getClazz(){
        return clazz;
    }

    public void setClazz(String clazz){
        this.clazz=clazz;
    }

    public String toString(){
        return getName() +" " +getSurname()+" " + getBirthDate() +" "+ getBirthPlace()+" " + getId()+" " + getAveragePoint()+" " + getClazz();
    }
}
