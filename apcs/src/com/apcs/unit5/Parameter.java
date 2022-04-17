package com.apcs.unit5;

/*

 parameters, which are input for methods.

 A parameter is the local variable in a method header that
holds the data sent in.
The data type of the parameter makes a difference - think
primitive versus class type.

primitive holds the value. eg: int, double
Because primitives are stored in memory directly, if they are changed in a void method, 
those changes are not preserved.

class holds the memory address. eg:String, Integer, Double
Because class data types are stored as references, if they are changed in a void method those changes are preserved.
*/
public class Parameter {

  public int age;
  public Integer number;

  public static void main(String[] args) {

    Parameter parameter = new Parameter();
    parameter.setMyAge("Swati");

    // Here "ACP" is arguement

    parameter.getSchoolLocation("ACP");
    parameter.printAge(17);
    parameter.printAge2(17);

    int x = 9;
    addOne(x);
    System.out.println(x);
  }

/**
 * class type parameter num
 * @param num
 */

  public static void addNumber(Integer num) 
{
  int result = num.intValue()+5;
  System.out.println(result);
}
/**
 * primitive type parameter 
 * @param c
 */

  public static void addOne(int c) {
    c++;
    System.out.println(c);
  }

  /*
   * nonstatic method - no keyword(static)
   * 
   */

  public void setMyAge(String name) {
    if (name.equals("Swati")) {

      age = 17;

      System.out.println(age);
    }

  }

  public String getSchoolLocation(String schoolName) {

    String location = null;
    if (schoolName.equals("ACPS")) {

      location = "Chandler";
    }

    return location;
  }

  public void printAge(Integer age) {

    System.out.println(age);
  }

  public void printAge2(int age) {
    System.out.println(age);
  }

}
