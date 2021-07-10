package com.company;

public class Student {
    public String name;
    public String surname;
    public int age;
    public String clazz;


    public Student(String name,String surname, int age, String clazz){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.clazz=clazz;

    }

    public void printStudentValues(){
        String studentsValues=this.name +"-"+surname+"-"+age+"-"+clazz;
        System.out.println(studentsValues);
    }

}
