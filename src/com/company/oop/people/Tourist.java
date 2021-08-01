package com.company.oop.people;

public class Tourist extends Human {
    private String country;

    public Tourist(String name,String surname, String country){
        super(name,surname);
        this.country=country;

    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country=country;
    }

}
