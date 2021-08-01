package com.company.oop;

import java.util.Date;

public class PeopleChecker {
    public int s1 = 0;
    public int o1 = 0;
    public int t1 = 0;
    private final String VALUE_SEPERATOR = ";";
    private final String DATE_SEPERATOR = "-";

    public void peopleChecker(String person, int s, int o, int t) {
        String personStatus = person.substring(0, 1);
        StudentNew[] studentNews = new StudentNew[s];
        Officer[] officers = new Officer[o];
        Tourist[] tourists = new Tourist[t];

        if (personStatus.equals("t") || personStatus.equals("T")) {
            tourists[t1++] = parseTouristFrom(person);
        } else if (personStatus.equals("s") || personStatus.equals("S")) {
            studentNews[s1++] = parseStudentFrom(person);
        } else {
            officers[o1++] = parseOfficerFrom(person);
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
