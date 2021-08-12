package com.company.oop.people;

import com.company.oop.Organisation;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PeopleChecker {
    private final String VALUE_SEPERATOR = ";";
    private final String DATE_SEPERATOR = "-";
    ArrayList<StudentNew> studentNewList = new ArrayList<>();
    ArrayList<Officer> officerArrayList = new ArrayList<>();
    ArrayList<Tourist> touristArrayList = new ArrayList<>();

    public void peopleChecker(String person) {
        String personStatus = person.substring(0, 1);


        if (personStatus.equals("t") || personStatus.equals("T")) {
            touristArrayList.add(parseTouristFrom(person));
        } else if (personStatus.equals("s") || personStatus.equals("S")) {
            studentNewList.add(parseStudentFrom(person));
        } else {
            officerArrayList.add(parseOfficerFrom(person));
        }
    }
    public void peopleContainChecker(){
        Scanner scan=new Scanner(System.in);
        for(;;){
            System.out.println("Sorgulamak istediğiniz kişiyi girin. Sorgulamadan çıkmak için çıkış yazın.");
            String userInput=scan.nextLine();
            if(userInput.equals("çıkış")){
                break;
            }
            String personType=userInput.substring(0,1);
            String name=userInput.split(" ")[1];
            if(personType.equals("t")||personType.equals("T")){
                boolean touristExist=false;
                for(int i=0; i<touristArrayList.size();i++){
                    Tourist tourist=touristArrayList.get(i);
                    if(name.equals(tourist.getName())){
                        System.out.println(tourist);
                        touristExist=true;
                    }
                }
                if(!touristExist){
                    System.out.println("Bu isimde bir turist yok!");
                }
            }else if(personType.equals("s")||personType.equals("S")){
                boolean studentExist=false;
                for(int i =0;i<studentNewList.size();i++){

                    StudentNew studentNew = studentNewList.get(i);
                    if(name.equals(studentNew.getName())){
                        System.out.println(studentNew);
                        studentExist=true;
                    }
                }
                if(!studentExist){
                    System.out.println("Bu isimde bir öğrenci yok!");
                }
            }else{
                boolean officerExist=false;
                for(int i=0; i<officerArrayList.size(); i++){
                    Officer officer=officerArrayList.get(i);
                    if(name.equals(officer.getName())){
                        System.out.println(officer);
                        officerExist=true;
                    }
                }
                if(!officerExist){
                    System.out.println("Sistemde böyle bir memur yok!");
                }
            }
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
        int id=Integer.parseInt(spaces[8]);
        return new Officer(name, surname, parseDate(spaces[3]), birthPlace, organisation, age,id);
    }
}
