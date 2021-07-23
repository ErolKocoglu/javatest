package com.company.oop;

import java.util.Date;

public class Officer {
    private String name;
    private String surname;
    private Date birthDate;
    private String birthPlace;
    private Organisation organisation;
    private int age;

    public Officer(String name, String surname, Date birthDate, String birthPlace, Organisation organisation, int age){
        this.name=name;
        this.surname=surname;
        this.birthDate=birthDate;
        this.birthPlace=birthPlace;
        this.organisation=organisation;
        this.age=age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void setOrganisation(Organisation organisation){
        this.organisation=organisation;
    }

    public Organisation getOrganisation(){
        return organisation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname=surname;
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
