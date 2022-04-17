package com.apcs.unit6;

/* 
An array is an object that holds more than one thing in memory.
All items in the array are the same data type.
Arrays can hold primitive or class types

an object is a variable of a class type. It is different than a primitive type.
ex. String word (word is the object)

element - The box of the array. Each box holds a value. 
index - The address of the elements. Starts at 0 and ends at (length -1).
initialize - Stores known values in an array

Square brackets ([ ]) are used to access and modify an element in an array using an index
*/

public class OneDimensionalArrays {

    public static void main(String[] args) {
        // testBasicArray();
        // testIntArray();
        //testStringArray();
        // testScores();

    }

    public static void testBasicArray() {
        // declare null array
        int[] arr1;
        // declare array with empty spaces
        int[] arr2 = new int[4];
        // declare array with initial values
        int[] arr3 = { 5, 9, 4, 2 };
        System.out.println(arr3[2]);
    }

    /*
     * Declare an array of ten ints with the values 0 - 9 in order. Test your array
     * by printing out the numbers 0, 5, and 9.
     */
    public static void testIntArray() {
        int arr4[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(arr4[0] + " " + arr4[5] + " " + arr4[9]);

    }

    public static void testStringArray() {
        // String[] cars = new String[3];
        String[] cars = { "Honda", "Toyota", "BMW" };
        int carslArrayength = cars.length;
        System.out.println("Array names has been declared with size of " + carslArrayength); // length is a property of
                                                                                             // an array
        cars[0] = "Infinity";

        System.out.println("without for loop.getting value directy from string index");
        System.out.println(cars[0]);
//jdk8 and up

System.out.println("For loop new");
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println("For loop old");
        //old and new

        // Iteration 1: i= 0, 0<2, 1, cars[0]=Honda
        // Iteration 2 = i=1,1<2, 2, cars[1] = Toyota
        //Iteration 3= i=2,2<2, 3, cars[2] = BMW
        //Iteration 4 = i=3, 3<2=false end of loop

        for(int i=0; i <cars.length; i++){
            System.out.println(cars[i]);  
        }


    }

    public static void testScores() {
        int[] scores = { 98, 93, 79, 86, 97 };
        
        String[] names = { "Sarah", "John", "Sal", "Mary" };

        scores[0] = 99;
        System.out.println(names[0] + " has a score of " + scores[0]);
    }

}
