package com.apcs.unit6;

/*
The general format of the enhanced for loop or a for-each loop looks like this:
for (type i : array)

*/

public class ForEachLoop {

     public static void main(String[] args) {
       int[] nums = { 10, 5, 8, 13 };
        for (int i : nums) {
            System.out.print(i + " ");
        }

        int[] arr = { 3, 5, 8, 10 };
        for (int n : arr) {
            n *= 2;
        }
        System.out.println(arr[2]);

        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        for (String s : days) {
            s = s.substring(0, 3);
        }
        System.out.println(days[0]);

    }
 
}
