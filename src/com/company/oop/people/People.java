package com.company.oop.people;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class People {
    public static void main(String[] args) {
        try {
            File personListFile = new File("C:\\Users\\HP\\IdeaProjects\\untitled2\\src\\com\\company\\oop\\people\\People.txt");
            Scanner personScanner = new Scanner(personListFile);
            PeopleChecker peopleChecker = new PeopleChecker();

            while (personScanner.hasNextLine()) {
                String person = personScanner.nextLine();
                peopleChecker.peopleChecker(person);
            }
            peopleChecker.peopleContainChecker();
            personScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Hata!");
            e.printStackTrace();
        }


// input 1.t 2.name control contains

    }

}
