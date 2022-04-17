package com.apcs.unit5;

/* 
Questions 18 and 19 deal with the problem of swapping two integer values. Three
methods are proposed to solve the problem, using primitive int types, 
Integer objects, and IntPair objects, where IntPair is defined as follows:
*/

public class IntPair {
    // this is a class variable
    private int firstValue;
    private int secondValue;

    // constructor
    public IntPair(int first, int second) {
        firstValue = first;
        secondValue = second;
    }

    // main method
    public static void main(String[] args) {

        // pass arguements
        swap1(1, 2);
        // creating an object
        // wrapper class
        Integer obj_a = new Integer(1);
        Integer obj_b = new Integer(2);
        // passing object
        swap2(obj_a, obj_b);

        //
        IntPair pair = new IntPair(1, 2);
        swap3(pair);
    }

    public int getFirst() {
        return firstValue;
    }

    public int getSecond() {
        return secondValue;
    }

    public void setFirst(int a) {
        firstValue = a;
    }

    public void setSecond(int b) {
        secondValue = b;
    }

    // 1
    public static void swap1(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a,b: " + a + " " + b);
    }

    // 2
    public static void swap2(Integer obj_a, Integer obj_b) {
        Integer temp = new Integer(obj_a.intValue());
        obj_a = obj_b;
        obj_b = temp;

        System.out.println("a,b obj: " + obj_a + " " + obj_b);
        System.out.println("a,b: " + obj_a.intValue() + " " + obj_b.intValue());
    }

    /**
     * option 3
     * 
     * @param pair
     */
    public static void swap3(IntPair pair) {
        int temp = pair.getFirst();
        pair.setFirst(pair.getSecond());
        pair.setSecond(temp);
        System.out.println("a,b: " + pair.getFirst() + " " + pair.getSecond());
    }

}
