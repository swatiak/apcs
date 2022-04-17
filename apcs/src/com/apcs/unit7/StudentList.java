package com.apcs.unit7;

import java.util.ArrayList;
//import java.util.jar.Attributes.Name;

/* 
ArrayLists can be traversed with an enhanced for each loop, or a while or for loop using an index.

Since the indices for an ArrayList start at 0 and end at the number of elements − 1, 
accessing an index value outside of this range will result in an ArrayIndexOutOfBoundsException being thrown.

Changing the size of an ArrayList while traversing it using an enhanced for loop can result in a 
ConcurrentModificationException being thrown. 
you should not add or remove elements when using an enhanced for loop to traverse an ArrayList
*/

public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> roster = new ArrayList<Student>();

       // Student student1 = new Student("Swati", 17, 11);
        //Student student2 = new Student("Amy", 16, 10);

         /* Student student1 = new Student();

        student1.setName("Swati");
        student1.setAge(17);
        student1.setGrade(11);

        Student student2 = new Student();

        student2.setName("Amy");
        student2.setAge(16);
        student2.setGrade(10);

        roster.add(student1);
        roster.add(student2);  */

         Student student = new Student();

        student.setName("Swati");
        student.setAge(17);
        student.setGrade(11);

        roster.add(student);

        student = new Student();

        student.setName("Amy");
        student.setAge(16);
        student.setGrade(10);

        roster.add(student); 

        // for (int i = 0; i < roster.size(); i++) {
        // System.out.println(roster.get(i));
        // }

        // OR

    

        for (Student s : roster) {

            if(s.getAge() > 16){


            }
            System.out.println(s.getName());
            System.out.println(s.getAge());
            System.out.println(s.getGrade());
        }

        // name: Swati, age: 17, grade: 11
        // name: Amy, age: 16, grade: 10

    }

}
