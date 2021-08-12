package com.company.oop.people;

import java.util.Date;

public class Citizen extends Human{
    private int id;
    private Date birthDate;
    private String birthPlace;

    public Citizen(String name, String surname, int id, Date birthDate, String birthPlace){
        super(name,surname);
        this.id=id;
        this.birthDate=birthDate;
        this.birthPlace=birthPlace;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public Date getBirthDate(){
        return birthDate;
    }

    public void setBirthDate(Date birthDate){
        this.birthDate=birthDate;
    }

    public String getBirthPlace(){
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace){
        this.birthPlace=birthPlace;
    }
}
