package com.apcs.mcq;

public class MCQ2018 {

    public static void main(String[] args) {

        // testWhileLoop();
        testRecursion(4321);
        testRecursionStringComparison("baab");

    }

    public static boolean find(int[] a, int val) {
        boolean temp = false;
        int count = 0;
        for (int testVal : a) {
            if (testVal == val) {
                temp = true;
                return temp;
            }
        }
        return temp;
    }

    public static void testWhileLoop() {
        int p = 5;
        int q = 2;
        int sum = 0;

        while (p <= 8) {

            int rem = p % q;
            sum += p % q;
            p++;
            q++;
        }
        System.out.println(sum);

    }

    // precondition: x >=0
    /*
     * Recursion
     */
    public static void testRecursion(int x) {

        System.out.print(x % 10);

        int rem = x % 10;
        if ((x / 10) != 0) {

            testRecursion(x / 10);
        }
    }

    public static boolean testRecursionStringComparison(String s) {
        boolean result = false;
        // aba -false
        // (true) && false || b
        // baab
        String input = s;
        boolean lengthcompare = s.length() >= 2;
        boolean substringcompare = s.substring(0, 1).equals(s.substring(1, 2));

        boolean recusrsionComppare = testRecursionStringComparison(s.substring(1));

        if (s.length() >= 2
                && (s.substring(0, 1).equals(s.substring(1, 2)) || testRecursionStringComparison(s.substring(1)))) {
            result = true;
        }

        System.out.println("result: " + result);

        return result;
    }

}


