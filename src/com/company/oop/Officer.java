package com.company.oop;

public class Officer {
    private String name;
    private String surname;
    private String birthDate;
    private String birthPlace;
    private String orgName;
    private String orgAddress;

    public Officer(String name, String surname, String birthDate, String birthPlace, String orgName, String orgAddress){
        this.name=name;
        this.surname=surname;
        this.birthDate=birthDate;
        this.birthPlace=birthPlace;
        this.orgName=orgName;
        this.orgAddress=orgAddress;
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

    public String getOrgName(){
        return orgName;
    }

    public void setOrgName(String orgName){
        this.orgName=orgName;
    }

    public String getOrgAddress(){
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress){
        this.orgAddress=orgAddress;
    }

}
