package com;

import java.util.Scanner;

public class StudyGuide {
    public static void main(String[] args) {
        // Which of the following expressions does NOT evaluate to 0.2?
        System.out.println((1.0 * 2) / (1.0 * 10));
        System.out.println(2.0 / 10);
        System.out.println((double) 2 / 10);
        System.out.println((double) (2 / 10)); // 0.0. The paranthesis (2/10) yields first and then casts to double
        System.out.println(Math.sqrt(4) / Math.sqrt(100));

        //print "Friends"
        System.out.println("\"Friends\"");

        /* 2. Assume the following variable declarations have been made:
double r = Math.random();
int c;
Which of the following assigns a value to c that is uniformly distributed between -10 <= c < 10 ?
(int) (r * 20 - 10) */
    }

}
