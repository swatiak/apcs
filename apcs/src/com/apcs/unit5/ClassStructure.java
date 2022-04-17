package com.apcs.unit5;

//define class structure
//access modifier +keyword class+class name+{}
// class can contain variables, constructors and methods

/**
 * Classes are really useful for representing things with multiple data attached to them. 
 * For example, if we wanted to write a program dealing with lots of books, we might want to store an author, 
 * publisher, date published, etc. for each book. 

The class name is capitalized
The class should go in its own file in the same directory as the rest of our files for a given project
The file name should match the class name exactly, followed by a .java extension

How to access a class?
we can instantiate a new Class object. Instantiation is when we create a new space in memory to hold a reference 

Book.java
instantiate the class
Book book = new Book();
book is the object
you can create mulitple instances.

Book schoolBook =  new Book()
Book collegeBook = new Book();
 */

public class ClassStructure {
    // class level variable
    // access modifier+data type+variable+;
    private int age;

    // dafault constructor
    public ClassStructure() {

    }
    // constructor with parameter inputage
    public ClassStructure(int inputage) {
        age = inputage;
    }

    public static void main(String[] args) {

        //default initialization
        ClassStructure classstructure = new ClassStructure();
        ClassStructure classtructure2 = new ClassStructure(1);
    }
    // method
    // method can contains variables
    public int getAge() {

      

        return age;
    }

    private double calculateArea(double radius){
//local variable- scope of variable is local. inside method
        double pi = 3.14;
        double area = pi*radius*radius;

        return area;
    }

    

    /**
 *  This method calculates the difference between a circle and a rectangle area.
 *  @param circ a Integer object
 *  @param rect a Integer object
 *  @return a double representing the difference in area between the two shapes.
 */
//public double areaDiff(Integer circ, Integer rect)

}
