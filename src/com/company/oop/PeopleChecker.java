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
            String name=person.substring(2,person.indexOf(spaces[1]));
            String surname=person.substring(person.indexOf(spaces[1])+1,person.indexOf(spaces[2]));
            String country=person.substring(person.indexOf(spaces[2])+1);
            tourists[t1]=new Tourist(name,surname,country);
            t1++;
        }else if(personStatus.equals("s")||personStatus.equals("S")){
            String[] spaces=person.split(" ");
            String[] dashes=person.split("-");
            String name=person.substring(2,person.indexOf(spaces[1]));
            String surname=person.substring(person.indexOf(spaces[1])+1,person.indexOf(spaces[2]));
            int day=Integer.parseInt(person.substring(person.indexOf(spaces[2])+1,person.indexOf(dashes[0])));
            int month=Integer.parseInt(person.substring(person.indexOf(dashes[0])+1,person.indexOf(dashes[1])));
            int year=Integer.parseInt(person.substring(person.indexOf(dashes[1])+1,person.indexOf(spaces[3])));
            Date birthDate= new Date(year,month,day);
            String birthPlace=person.substring(person.indexOf(spaces[3])+1,person.indexOf(spaces[4]));
            int id=Integer.parseInt(person.substring(person.indexOf(spaces[4])+1,person.indexOf(spaces[5])));
            double averagePoint=Double.parseDouble(person.substring(person.indexOf(spaces[5])+1,person.indexOf(spaces[6])));
            String clazz=person.substring(person.indexOf(spaces[6])+1);
            studentNews[s1]=new StudentNew(name,surname,birthDate,birthPlace,id,averagePoint,clazz);
            s1++;
        }

    }
}
