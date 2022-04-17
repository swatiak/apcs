package com.apcs.unit5;

    /*
     * Method: A method is a block of code which only runs when it is called. You
     * can pass data, known as parameters, into a method. Methods are used to
     * perform certain actions, and they are also known as functions.methods are behaviour.
     * To access a non static method in a class you must make an instance of the class.
     * To access a static method no need to make instance of the class you can directly access it.
     * 
     * Void methods: These pieces of code are given a name. The method goes above
     * main. The name lets Java find the correct piece of code.void methods, methods
     * that don’t have a return statement. in a method keyword void is used for empty return
     * 
     * Static Method: Static methods are the methods in Java that can be called
     * without creating an object of class. They are referenced by the class name
     * itself or reference to the Object of that class. IOException is an exception
     * which programmers use in the code to throw a failure in Input & Output
     * operations. It is a checked exception. ex. if you were trying to input
     * information in a file but the file was already deleted.
     * 
     * An argument is a value passed to a function when the function is called. 
     * Whenever any function is called during the execution of the program there are some values passed with the function. 
     * These values are called arguments.
     * 
     * In Java, a modifier is something that changes the behavior of variables or methods. 
     * We’ve already used the public and private modifiers plenty, 
     * but this lesson covers the static modifier.
     * 
     * When the static modifier is added to a variable or method, it means that only one copy exists for all objects
     *  of that class. 
     * This means that all objects of this class share access to the static entity.
     * 
     * Another handy use of the static modifier is to create a constant for your class.
     *  A constant is a value that does not change. 
     * 
     *  overloading methods
     *  Overloading a method is when several methods in the same class have 
     *  the same name but the parameter types, order, or number are different.
     * 
     *  overriding  Method 
     *  occurs when a public method in a subclass has the same method signature as a public method in the superclass.
     * This is called inherited method in sub class
     */

public class Methods {

    //static variable
    public static int age;

    public static final double pi=3.14;

    public int age2;


    public static void main(String[] args) {
        

        //method is object
        Methods method = new Methods();

    

//calling non static method
        int age = method.getAge("Swati");

        //calling static method
        int age2 = getAge2("Swati");

        String name = method.getName();

        //pass int num arguements

        int result = method.calculate(2, 4);
    }


    /* 
     Overloading a method is when several methods have 
    the same name but the parameter types, order, or number are different.
    data type different
    */
    public void getAge(int year){

    }
//overriding -number of parameters are different
    public void getAge(int year, String name){

    }
//overriding order is different
    public void getAge(String name, int year){

    }

     /**
      * javadoc
      * This non static method return given person age
      * @param name
      * @return age
      */

    public int getAge(String name) {

        if (name.equals("SWati"))
        {
          age = 17;

        } else if (name.equals("Rohit")) {
            age = 22;
        } else {
            age = 0;
        }

        return age;
    }

    public void printName(){
        System.out.println("Swati");
    }
    public String getName(){
        String name;
        name = "Swati";

        return name;
    }
    
    public int calculate(int num1, int num2){
        int result;
        result = num1 + num2;

        return result;
    }

    public static int getAge2(String name) {

        if (name.equals("SWati"))
        {
          age = 17;

        } else if (name.equals("Rohit")) {
            age = 22;
        } else {
            age = 0;
        }

        return age;
    }
    public static void printJava() {
        System.out.println("Java");
    }

    public static void doStuff() {
        System.out.println("This is a method ");
    }

    public void methods() {
        String name1 = "Swati";
        String name2 = "Nina";

        int index = name1.compareTo(name2);
        boolean isEqual = name1.equals(name2);
        int length = name1.length();

        Methods.iamStatic();
        iamStatic();
        Methods methods = new Methods();
        methods.iamNonStatic();
    }

    /*
     * What is an static method ?: A static method is a method that belongs to a
     * class, but it does not belong to an instance of that class and this method
     * can be called without the instance or object of that class. static method
     * must have static keyword.
     */

    public static void iamStatic() {
        int age2 = Methods.age;

    }

    /*
     * 
     * What is an non-static method ?: Every method in java defaults to a non-static
     * method without static keyword preceding it . non static method can be
     * accesssed using only creating an instance of a class.
     */
    public void iamNonStatic() {
        iamStatic();
        int age2 = Methods.age;

    }

}
