package com.company.oop;

public class PeopleChecker {
    public void peopleChecker(String person,int s,int o, int t){
        String personStatus=person.substring(0,1);
        StudentNew[] studentNews=new StudentNew[s];
        Officer[] officers=new Officer[o];
        Tourist[] tourists=new Tourist[t];
        int s1=0;
        int o1=0;
        int t1=0;
        if(personStatus.equals("t")|| personStatus.equals("T")){
            String[] spaces=person.split(" ");
            String name=person.substring(2,person.indexOf(spaces[1]));
            String surname=person.substring(person.indexOf(spaces[1])+1,person.indexOf(spaces[2]));
            String country=person.substring(person.indexOf(spaces[2])+1);
            tourists[t1]=new Tourist(name,surname,country);
            t1++;
        }
        
    }
}
