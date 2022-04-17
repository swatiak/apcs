package com.apcs.unit1;
import java.util.Scanner;

/*
Block comment
Unit 1 Primitive Types
Lesson 1: Output in Java
Lesson 2: User Input and Variables
    Scanner
    Variables-declare, initialization, naming standards
    Concatenation
    Operators
    Comments
Lesson 3: Data Types
*/
public class Unit1 {
  // This tells the computer to allocate space for a String and call that space
  // ‘x’.and assign value a

  // Naming Variables
  // We can only use letter/number characters and the special characters _ and $.
  // No spaces or other characters are allowed.
  // Your variable can't start with a number (so num1 is ok as a variable name but
  // 1num is not).
  // You can't use names which already have a meaning in Java (e.g. we can't name
  // our variable String or System).
  static String x;

  // commands

  public static void main(final String[] args) {
    // main method

    //lesson1();

   
    double a = 12.0;
    double b = 12;
    double c = 12.0d;
   
  }

  public static void lesson2() {

    printStreettName();
    printName();


  }

  private static void printName(){
        // Suppose the variable n is used to store the String "Maeve" as shown:
    // print "Hello my name is Maeve"?
    String n = "Maeve";
    System.out.println("Hello my name is " + n);

  }

  private static void printStreettName(){
    Scanner scan = new Scanner(System.in);
    String streetName;
    System.out.println("Enter Street name");
    streetName = scan.nextLine();
  }

  public static void lesson1() {

    x = "Swati";
    x = "Kumar";
    // statement
    System.out.print("Hi");
    System.out.println("There");
    System.out.println("*********");

    System.out.println("one ");
    System.out.println("two ");
    System.out.print("three ");
    System.out.println("four");

    System.out.println("");
    System.out.println("*********");
    // declare variable n and initilized
    String n = "John";
    // declare m
    String m;
    // assign a value to m
    m = "Matthew";
    m = "Rob";

    // Combining Strings

    System.out.println("*******Combining Strings********");

    // Hello is literal string. n variable string
    // concatenation +
    System.out.println("Hello " + n + " how are you?");

    System.out.println("Hello " + m + " how are you?");

  }
  public static void lesson4(){
    
  }

}
