package com.apcs.unit2;
import java.util.ArrayList;
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

Lesson 4: Number Calculations
*/
public class Unit2 {

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

    // printStreettName();
    // printName();
    // testIntegerOverflow();
    // performOperators();
    lesson3StringFuntions();
    // L3 String funtions

    String s = "swati";
    // datatype value order low to high
    // boolean, int, double, String

  }

  /*
   * integer overflow What is the largest value you can store in an int variable?
   * 2^31 - 1
   */
  private static void testIntegerOverflow() {
    int x = Integer.MAX_VALUE;
    x = x + 2;
    System.out.println(x);

    int y = Integer.MIN_VALUE;
    y = y - 1;
    System.out.println(y);
  }

  private static void testFinalVariable() {

    final double pi = 3.14159265;
    System.out.println(pi);

    // you cannot change final value
    // pi = pi + 1;
  }

  private static void printName() {
    // Suppose the variable n is used to store the String "Maeve" as shown:
    // print "Hello my name is Maeve"?
    String n = "Maeve";
    System.out.println("Hello my name is " + n);

  }

  private static void printStreettName() {
    Scanner scan = new Scanner(System.in);
    String streetName;
    System.out.println("Enter Street name");
    streetName = scan.nextLine();
  }

  private void namingStandard() {
    // To declare a String variable x and set it equal to "Help" you would type:
    String x = "Help";
  }

  /*
   * //Primitive data types are stored directly in a variable,
   * 
   * 
   */
  private void primitiveType() {
    int i = 0;
    double d = 0.0;
    boolean b = false;
    char c = 'c';
    byte by;
    float f = 0;
    short s = 0;
    long l = 0;

  }
  /*
   * while reference data type variables store a memory reference to where the
   * data is stored.
   */

  private void referenceType() {
    String s = "s";
    ArrayList a = new ArrayList();
    // Class c = new Class();
    Integer i;
    Double d;

  }

  /**
   * Arithmetic Operators Compound Assignment Operators operator precedence
   */

  private static void performOperators() {

    // Arithmetic Operators
    int x = 10;
    int y = 25;
    int z = x + y;
    int a = x - y;
    int b = y - x;
    int c = x * y;
    double d = 1.0 * x / y;

    System.out.println(x + " + " + y + " = " + z);
    System.out.println(x + " - " + y + " = " + a);
    System.out.println(y + " - " + x + " = " + b);
    System.out.println(x + " * " + y + " = " + c);
    System.out.println(x + " / " + y + " = " + d);

    // Compound Assignment Operators
    int f = 34;
    f += 6;
    System.out.println("34" + "+6 = " + f);
    // operator precedence
    // s =
    double t = (x / y) * 1.0;
    double s = (x * y) + t;
    System.out.println(s);

  }

  /**
   * String functions
   */
  private static void lesson3StringFuntions() {
    System.out.println("\\/\n\n''");
    // How do we know the length of a string?
    String name = null;
    name = "Swati Kumar";
    int l = name.length();
    System.out.println("Length of " + name + "'s name = " + l);

    // How do we test if two Strings are equal?
    // .equals tests if the contents are equal, and returns a boolean value
    String name1 = "Swati";
    String name2 = "Swati";
    boolean namecompare = name1.equals(name2);
    System.out.println("namecompare: " + namecompare);

    // substring(beginningIndex, ending Index)
    // pulls off a section of a string from start to stop -1
    //

    String fullname = "Swati Kumar";
    String firstname = fullname.substring(0, 5);
    System.out.println("firstname: " + firstname);

    String lengthCheck = fullname.substring(5, 6);
    System.out.println("lengthCheck: " + lengthCheck);

    // .toUpperCase()
    // Changes the String to all upper case letters
    String uppercasename = name.toUpperCase();
    System.out.println("UpperCase: " + uppercasename);

    String lowercasename = name.toLowerCase();
    System.out.println("lowercasename: " + lowercasename);

    // .compareTo(other)
    // Compares two strings alphabetically
    String s = "Swati";
    String k = "Sz";
    int strCompareIndex = s.compareTo(k);
    System.out.println("strCompareIndex: " + strCompareIndex);

    Integer i = 800;
    Integer j = 800;

    int compareIndex = j.compareTo(i);
    System.out.println("compareIndex: " + compareIndex);

    String n1 = "Swati";
    String n2 = "Anish";

    strCompareIndex = n1.compareTo(n2);

    System.out.println("strCompareIndex " + strCompareIndex);

    String w1;
    String w2 = "apple";
    String w3 = "banana";
    // What is stored in w1 by the following?
    w1 = w2 + " sauce";
    System.out.println(w1);
    // What is stored in w1 by the following?
    //n+1
    w1 = w3.substring(1, 3);
    System.out.println(w1);
    w1 = w3.substring(2);
    System.out.println(w1);
    //What is the output?
System.out.println(w3.compareTo("fruit"));
System.out.println(w2.compareTo(w3));


    // .indexOf(str)
    // put in a string, tells where it is

  }

  /**
   * method overloading . you can have same method name but different parameter In
   * order to overload a method, the argument lists of the methods must differ in
   * either of these: 1. Number of parameters.
   * 
   * @param name
   */
  public void getName(String name) {

  }

  public void getName(int name) {

  }

}
