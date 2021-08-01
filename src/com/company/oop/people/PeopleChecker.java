package com.company.oop.people;

import com.company.oop.Organisation;

import java.util.ArrayList;
import java.util.Date;

public class PeopleChecker {
    private final String VALUE_SEPERATOR = ";";
    private final String DATE_SEPERATOR = "-";

    public void peopleChecker(String person) {
        String personStatus = person.substring(0, 1);
        ArrayList<StudentNew> studentNewList = new ArrayList<>();
        ArrayList<Officer> officerArrayList = new ArrayList<>();
        ArrayList<Tourist> touristArrayList = new ArrayList<>();

        if (personStatus.equals("t") || personStatus.equals("T")) {
            touristArrayList.add(parseTouristFrom(person));
        } else if (personStatus.equals("s") || personStatus.equals("S")) {
            studentNewList.add(parseStudentFrom(person));
        } else {
            officerArrayList.add(parseOfficerFrom(person));
        }
    }

    private Date parseDate(String birthDate) {
        String[] dashes = birthDate.split(DATE_SEPERATOR);
        int day = Integer.parseInt(dashes[0]);
        int month = Integer.parseInt(dashes[1]);
        int year = Integer.parseInt(dashes[2]);
        return new Date(year - 1900, month - 1, day);
    }

    private Tourist parseTouristFrom(String person) {
        String[] spaces = person.split(VALUE_SEPERATOR);
        String name = spaces[1];
        String surname = spaces[2];
        String country = spaces[3];
        return new Tourist(name, surname, country);

    }

    private StudentNew parseStudentFrom(String person) {
        String[] spaces = person.split(VALUE_SEPERATOR);
        String name = spaces[1];
        String surname = spaces[2];
        Date birthDate = parseDate(spaces[3]);
        String birthPlace = spaces[4];
        int id = Integer.parseInt(spaces[5]);
        double averagePoint = Double.parseDouble(spaces[6]);
        String clazz = spaces[7];
        return new StudentNew(name, surname, birthDate, birthPlace, id, averagePoint, clazz);
    }

    private Officer parseOfficerFrom(String person) {
        String[] spaces = person.split(VALUE_SEPERATOR);
        String name = spaces[1];
        String surname = spaces[2];
        String birthPlace = spaces[4];
        String orgName = spaces[5];
        String orgAddress = spaces[6];
        Organisation organisation = new Organisation(orgName, orgAddress);
        int age = Integer.parseInt(spaces[7]);
        return new Officer(name, surname, parseDate(spaces[3]), birthPlace, organisation, age);
    }
}
