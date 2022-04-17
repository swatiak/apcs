package com.apcs.unit9;

public class Student {
    public static void main(String[] args) {
        Student s = new GradStudent();
        System.out.println(s.getInfo());
    }
    public String getFood() {
        return "Pizza";
    }

    public String getInfo() {
        
        return "Studying";
    }
}
