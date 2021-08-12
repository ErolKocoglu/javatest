package com.company.oop.people;

import com.company.oop.Organisation;

import java.util.Date;

public class Officer extends Citizen {
    private Organisation organisation;
    private int age;

    public Officer(String name, String surname, Date birthDate, String birthPlace, Organisation organisation, int age, int id) {
        super(name, surname, id, birthDate, birthPlace);
        this.organisation = organisation;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public String toString() {
        return getName() + " " + getSurname() + " " + getBirthDate() + " " + getBirthPlace() + " " + getOrganisation().getName() +" " +getOrganisation().getAddress() + " " + getAge() + " " + getId();
    }


}
