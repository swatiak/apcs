package com.apcs.unit7;

import java.util.ArrayList;

/* 
Traversing an ArrayList
We can traverse an Arraylist using a for loop or a for-each loop. 
To use the for loop, we use .size() to limit our loop.


*/

public class TraversingArrayList {
    public static void main(String[] args) {
        testForLoop(); // used for-each loop too
        compareToMethod(); 

    }

    public static void testForLoop() {
        ArrayList<String> dogbreeds = new ArrayList<String>();
        dogbreeds.add("Dalmatian");
        dogbreeds.add("Bulldog");
        dogbreeds.add("Poodle");
        // [Dalmatian, Bulldog, Poodle]
        // we want each breed to appear on its own line by ising a FOR LOOP

        for (int i = 0; i < dogbreeds.size(); i++) {
            System.out.println(dogbreeds.get(i));

            // Dalmatian
            // Bulldog
            // Poodle
        }

        for (String s : dogbreeds) {
            System.out.println(s);

            // Dalmatian
            // Bulldog
            // Poodle
        }

    }

    public static void compareToMethod() {
        ArrayList<String> stuff = new ArrayList<String>();

        stuff.add("keyboard");
        stuff.add("mouse");
        stuff.add("speakers");
        stuff.add("scanner");
        stuff.add("screen");
        stuff.add("headphones");

        for (String s : stuff) {
            if (s.compareTo("m") > 0) {
                System.out.println(s.toUpperCase());
            }
        }
    }

}
