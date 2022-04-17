package com.apcs.unit5.constructor;

/*
Block comment

*/
public class TestConstructor {

  public TestConstructor(){

  }

  public static void main(final String[] args) {

    // Constructor constructorone = new Constructor();

    // Constructor constructortwo = new Constructor("swati");

    // Constructor constuctorthree = new Constructor("Swati", 17);

    // String name = constuctorthree.getName();

    // System.out.println("name: "+name);

    // int age = constuctorthree.getAge();

    // System.out.println("age: "+age);

    //instance of class
    //schoolacp-object
    School schoolAcp = new School("ACP");
    schoolAcp.printSchoolDetail();
    schoolAcp.printStaffetail();
    

    //School.iamStatic();
    //schoolAcp.iamNonStatic();


    School schoolHamilton = new School("Hamilton");
    schoolHamilton.printSchoolDetail();
    schoolHamilton.printStaffetail();

    School schoolBasis = new School("Basis");
    schoolBasis.printSchoolDetail();
    schoolBasis.printStaffetail();

    School schoolCorona = new School("Corona");
    schoolCorona.printSchoolDetail();
    schoolCorona.printStaffetail();
  }

  
}
