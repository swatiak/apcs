package com.apcs.unit4;

import java.util.Scanner;

/*
Unit 4 - Iterration
Lesson 1: While Loops
Lesson 1 1/2: Tracing Code
Lesson 2: Algorithms for Numbers
Lesson 3: The For Loop
Lesson 4: Algorithms for Strings
Lesson 5: Nested Loops
Lesson 6: Algorithm Efficiency

*/
public class Unit4 {

  static String x;

  // commands

  public static void main(final String[] args) {

    // testnumber();
    // testnestedif();
    // testwhile();
    // testfor();
    // testfor1();
    // testwhile1();
    // testbreak();
    // testwhile3();
    // testdivision();
    // testAlgorithm2();
    // testjava8for();
    // testStringArrays();
    //String first = "cat";
    //System.out.println(first.substring(0));
    //testArray();
    num();

  }

  /**
   * Input an int and test if it is NOT between 45 and 78
   */

   public static void num(){
    
    System.out.println(0.9999999*20);
   }
  
public static void testArray(){
  int[] myArray = {2, 6, 4, 1, 7, 6, 8};
  int index = 0;
  while(myArray[index] <7){
    myArray[index] += 3;
    index++;  
  }
  System.out.println(myArray);
}
  private static void testnumber() {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    if (!(n >= 45 && n <= 78)) {
      System.out.println(n + " is not between 45 and 78");
    } else {
      System.out.println(n + " is between 45 and 78");
    }

  }

  /**
   * Input an int and test if it is NOT between 45 and 78
   */

  private static void testnestedif() {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    System.out.println(n + " is not between 45 and 78");

    if (n > 45) {
      if (n > 78) {
        System.out.println(n + " is not between 45 and 78");
      }
    } else {
      System.out.println(n + " is between 45 and 78");
    }

  }

  private static void testwhile() {
    Scanner scan = new Scanner(System.in);
    int x = 0;
    while (x != -1) {
      System.out.print("Enter -1 to stop");
      x = scan.nextInt();
    }
  }

  private static void testOldfor() {

    for (int i = 0; i < 10; i++) {
      System.out.print(i + " ");

    }
  }

  private static void testjava8for() {

    int[] numbers = { 10, 20, 30, 40 };

    for (int i : numbers) {
      System.out.print(i + " ");

    }
  }

  /**
   * Java Arrays Arrays are used to store multiple values in a single variable,
   * instead of declaring separate variables for each value.
   * 
   * To declare an array, define the variable type with square brackets:
   * 
   */
  private static void testStringArrays() {
    String[] cars = { "Toyota", "Mazda", "Honda" };
    for (String car : cars) {
      // System.out.println(car);

      System.out.println(cars[1]);
    }
  }

  private static void testfor1() {
    String str = "hello";
    for (int i = 0; i < 5; i++) {
      System.out.println("word: " + str.substring(i, i + 1));
    }
  }

  private static void testwhile1() {
    int i = 0;
    String str = "hello";
    while (i < str.length()) {
      System.out.println(str.substring(i, i + 1));
      i++;

      if (i == 2) {
        break;
      }
    }
  }

  private static void testbreak() {

    int i = 0;

    while (i < 10) {

      i++;

      if (i == 5) {
        break;
      }
      System.out.println(i);
    }
  }

  private static void testwhile3() {
    Scanner scan = new Scanner(System.in);
    int c = 0;
    int x = 0;
    while (x > -1) {
      System.out.println("you entered: " + x);
      x = scan.nextInt();
      c++;
    }
    c--;

    System.out.println("you entered " + c + " numbers.");
  }

  private static void testdivision() {
    int num = 13475;
    double output = 0.0;

    output = num / 10;
    System.out.println(output);

    output = (double) num / 10;
    System.out.println(output);

  }

  public static void testAlgorithm() {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a: ");
    int a = scan.nextInt();

    System.out.print("Enter b: ");
    int b = scan.nextInt();

    if (b % a == 0) {
      System.out.println("a divides b");
    }
  }

  public static void testAlgorithm2() {
    int a = 10;
    int b = 25;
    int count = 0;
    while (b != 0) {
      count++;
      System.out.println("*****: " + count);
      System.out.println("a: " + a);
      System.out.println("b: " + b);
      int r = a % b;
      System.out.println("r: " + r);
      a = b;
      b = r;
      System.out.println("a: " + a);
      System.out.println("b: " + b);
    }
    System.out.println(a);
  }

  public static void recur1(int n) {
    if (n % 10 != 0) {
      recur1(n - 7);
    }
    System.out.println(n / 10);
  }

}
