package com.apcs.unit5;


/*
A method in class that builds the class in memory
sets values in variables
Has same name as class
Can have more than one constructor for a class
*/
public class Constructor {
//variable
  private String str;
  private int i;

  //default constructtor
  public Constructor(){
    System.out.println("I am empty contsructor");
  }


  public Constructor(String newstr){
    str = newstr;
   System.out.println("I am initializing a 1 variable");
   System.out.println(str);
 }

 public Constructor(String newstr, int newi){
   str = newstr;
    i = newi;
   System.out.println("I am initializing a 2 variables");
   System.out.println(str+ " " + i);
 } 
//method
  public String getName(){
    return str;
  }

  //method
  public int getAge(){
    return i;
  }



}
