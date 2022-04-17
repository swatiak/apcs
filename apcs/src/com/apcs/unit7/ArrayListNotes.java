package com.apcs.unit7;

import java.util.ArrayList;

/* 
What is an ArrayList?
1. A collection of objects.
2. Can only store objects, not primitive data
3. Similar to an array BUT it only holds references to the objects.

Size is not fixed
- Can add and remove elements
- mutable object -- it can be changed unlike an array
Has built in methods for many common operations
- Insertion, deletion, sorting, etc.

Built-in methods: 

list.add(e); 
Adds e to end of list

list.add(i, e);
Adds element e at location i

list.set(i, e);
Resets element at i with object e

list.get(i);
Returns the element at i

list.remove(i);
Removes element at i

list.size();
Returns number of elements in list

list.contains(e); 
Is it in there?
Returns true/false

list.clear(); 
Empties entire list
*/

public class ArrayListNotes {

    public static void main(String[] args) {
        // testDeclareArrayList();
        // testInteger();
        // testShopping(); //using get method
        testOceanAnimals(); // using set method

    }

    public static void testDeclareArrayList() {
        /*
         * creating a new ArrayList object using one of the ArrayList constructors no
         * parameters creates an empty ArrayList with no elements in it
         */
        ArrayList<ArrayListNotes> arraylistnotes = new ArrayList<ArrayListNotes>();

        // ArrayList with a set number of empty boxes
        ArrayList<ArrayListNotes> arraylistnotes1 = new ArrayList<ArrayListNotes>(10);

    }

    public static void testInteger() {
        // Wrapping Primitives For ArrayLists
        // unboxing and autoboxing
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(8);
        list.add(10);
        System.out.println(list);

        // [3, 8, 10]
    }

    // GET method
    public static void testShopping() {
        ArrayList<String> shopping = new ArrayList<String>();
        shopping.add("Banana");
        shopping.add("Fruits");
        shopping.add("Strawberry");
        System.out.println(shopping.get(1));
        System.out.println(shopping);

        // Fruits
        // [Banana, Fruits, Strawberry]
    }

    // SET method
    public static void testOceanAnimals() {
        ArrayList<String> oceanAnimals = new ArrayList<String>();
        oceanAnimals.add("Whale");
        oceanAnimals.add("Shark");
        oceanAnimals.add("Monkey");

        oceanAnimals.set(2, "Dolphin");

        System.out.println(oceanAnimals);

        // [Whale, Shark, Dolphin]

    }

}
