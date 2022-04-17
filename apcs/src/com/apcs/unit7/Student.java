package com.apcs.unit7;

public class Student {

    private String name;
    private int age;
    private int grade;

    public Student(){
        
    }

    public Student(String newname, int newage, int newgrade) {
        name = newname;
        age = newage;
        grade = newgrade;
    }

    // toString() method
    public String toString() {
        return "name: " + name + ", " + "age: " + age + ", " + "grade: " + grade;
    }


    public String getName(){

        return name;
    }

    public void setName(String inputname){

        name = inputname;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int inputage){
        age = inputage;
    }

    public int getGrade(){
        return grade;
    }

    public void setGrade(int inputgrade){
        grade = inputgrade;
    }


    }





