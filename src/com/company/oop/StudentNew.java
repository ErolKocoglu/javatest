package com.company.oop;

public class StudentNew {
    private String name;
    private String surname;
    private String birthDate;
    private String birthPlace;
    private int id;
    private double averagePoint;
    private String clazz;

    public StudentNew(String name, String surname, String birthDate, String birthPlace, int id, double averagePoint, String clazz){
        this.name=name;
        this.surname=surname;
        this.birthDate=birthDate;
        this.birthPlace=birthPlace;
        this.id=id;
        this.averagePoint=averagePoint;
        this.clazz=clazz;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public String getBirthDate(){
        return birthDate;
    }

    public void setBirthDate(String birthDate){
        this.birthDate=birthDate;
    }

    public String getBirthPlace(){
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace){
        this.birthPlace=birthPlace;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
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
}
