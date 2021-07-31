package com.company.oop;

import java.util.Date;

public class PeopleChecker {
    public int s1=0;
    public int o1=0;
    public int t1=0;
    public void peopleChecker(String person,int s,int o, int t){
        String personStatus=person.substring(0,1);
        StudentNew[] studentNews=new StudentNew[s];
        Officer[] officers=new Officer[o];
        Tourist[] tourists=new Tourist[t];

        if(personStatus.equals("t")|| personStatus.equals("T")){
            String[] spaces=person.split(" ");
            String name=spaces[1];
            String surname=spaces[2];
            String country=spaces[3];
            tourists[t1]=new Tourist(name,surname,country);
            t1++;
        }else if(personStatus.equals("s")||personStatus.equals("S")){
            String[] spaces=person.split(" ");
            String[] dashes=spaces[3].split("-");
            String name=spaces[1];
            String surname=spaces[2];
            int day=Integer.parseInt(dashes[0]);
            int month=Integer.parseInt(dashes[1]);
            int year=Integer.parseInt(dashes[2]);
            Date birthDate= new Date(year-1900,month-1,day);
            String birthPlace=spaces[4];
            int id=Integer.parseInt(spaces[5]);
            double averagePoint=Double.parseDouble(spaces[6]);
            String clazz=spaces[7];
            studentNews[s1]=new StudentNew(name,surname,birthDate,birthPlace,id,averagePoint,clazz);
            s1++;
        }else{
            String[] spaces=person.split(" ");
            String[] dashes=spaces[3].split("-");
            String name=spaces[1];
            String surname=spaces[2];
            int day=Integer.parseInt(dashes[0]);
            int month=Integer.parseInt(dashes[1]);
            int year=Integer.parseInt(dashes[2]);
            Date birthDate= new Date(year-1900,month-1,day);
            String birthPlace=spaces[4];
            String orgName=spaces[5];
            String orgAddress=spaces[6];
            Organisation organisation=new Organisation(orgName,orgAddress);
            int age=Integer.parseInt(spaces[7]);
            officers[o1]=new Officer(name,surname,birthDate,birthPlace,organisation,age);
            o1++;
        }

    }
}
