package com;

/* 
Unit 1 Getting Started and Primitive Types
Unit 2 Using Objects
Unit 3 If Statements
Unit 4 Iteration/Loops
Unit 5 Writing Classes
Unit 6 Arrays
Unit 7 ArrayLists
Unit 8 2D Arrays
Unit 9 Inheritance
Unit 10 Recursion

*/

public class APCS {
    public static int age=10;
	

    public static void main(final String[] args) {

        APCS.iamStatic();
        iamStatic();
        APCS apcs = new APCS();
        apcs.iamNonStatic();

    }

    /*
     * What is an static method ?: A static method is a method that belongs to a
     * class, but it does not belong to an instance of that class and this method
     * can be called without the instance or object of that class.
     */

    public static void iamStatic() {
        int age2= APCS.age;

    }

    /*
     * 
     * What is an non-static method ?: Every method in java defaults to a non-static
     * method without static keyword preceding it . non static method can be
     * accesssed using only instance of a class. Non-static methods can access any
     * static method and static variable, without creating an instance of the
     * object.
     */
    public void iamNonStatic() {
        iamStatic();
        int age2 = APCS.age;
        

    }

}
