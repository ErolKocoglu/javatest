package com.company.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class People {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            File myFile=new File("C:\\Users\\HP\\IdeaProjects\\untitled2\\src\\com\\company\\oop\\People.txt");
            Scanner myReader=new Scanner(myFile);
            PeopleChecker people=new PeopleChecker();
            while(myReader.hasNextLine()){
                String person=myReader.nextLine();
                int s=0;
                int o=0;
                int t=0;
                while(myReader.hasNextLine()){
                    String person1=myReader.nextLine();
                    String personStatus=person1.substring(0,1);
                    if(personStatus.equals("t")||personStatus.equals("T")){
                        t++;
                    }else if(personStatus.equals("s")||personStatus.equals("S")){
                        s++;
                    }else{
                        o++;
                    }
                }
                people.peopleChecker(person,s,o,t);

            }myReader.close();
        } catch (FileNotFoundException e){
            System.out.println("Hata!");
            e.printStackTrace();
        }



    }

}
