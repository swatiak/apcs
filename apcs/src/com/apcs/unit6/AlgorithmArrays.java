package com.apcs.unit6;

/* 
Inserting an Element: Putting a value somewhere in the middle of the array. This algorithm bumps off the last element in the array.
Notice the loop iterates backwards.
Deletion: Removing a value in the middle of an array.
Shifting Elements Right: Like insertion but move the last element to the front of the array.
Shifting Elements Left: Like deletion, but we move the first element to the end of the array.
Reversing The Elements: This algorithm loops through half the array, and uses careful indices to swap all elements.

*/

public class AlgorithmArrays {

    public static void main(String[] args) {
        // int[] arr = {2, 3, 7, 11, 4, 8};
        // insert(arr, 10, 3);

        // int[] arr = { 7, 4, 8, 12, 1 };
        // delete(arr, 2);

        // int[] arr = { 2, 3, 6, 8 };
        // mystery(arr);

        //shiftright();
        //reverse();

       
        }

    

    public static void insert(int[] nums, int val, int pos) {
        for (int i = nums.length - 1; i > pos; i--) {
            nums[i] = nums[i - 1];
        }
        nums[pos] = val;
    }

    public static void delete(int[] nums, int pos) {
        for (int i = pos; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }

    }

    public static void mystery(int[] nums) {
        for (int i = 0; i < nums.length; i += 2) {
            nums[i] *= 2;
        }
    }

    /*
     * The following code segment is intended to shift all Strings in the array arr
     * one place to the right, replacing the first String in the array with the last
     * String in the array.
     */
    public static void shiftright() {
        String[] arr = { "abc", "def", "ghi", "jkl" };
        String temp = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
    }

    // The following code segment is intended to reverse the order of the elements
    // in nums.
    public static void reverse() {
        double[] nums = { 2.7, 0.3, 1.8, 9.2, 10.5, 5.4 };
        for (int i = 0; i < nums.length / 2; i++) {
            int j = nums.length - i - 1; // index of element in end half
            double temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    
}
