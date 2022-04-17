package com.apcs.unit10;

import java.util.ArrayList;

/* 
unit10: Recursion
Lesson 1: Intro to Recursion
Recursion: when a method calls itself
Lesson 2: Recursive Functions with Returns
Every recursive method must have at least one base case which halts the recursion.

Lesson 3: Binary Search
we learned about two search algorithms, linear search and binary search. 
Linear search searches for an element in an array or ArrayList by checking each element in order. 
Binary search is more efficient (faster) because it starts at the middle of a sorted array or 
ArrayList and eliminates half of the array or ArrayList each pass through the algorithm. 
Binary search only works on sorted data. It can be written with iteration (using a loop) like below or recursively.

Lesson 4: Merge Sort
we looked at two sorting algorithms, Selection Sort and Insertion Sort. 
In this lesson, we will look at a third sorting algorithm, Merge Sort, which uses recursion. 
Merge Sort is actually more efficient (faster) than Selection Sort and Insertion Sort because it 
divides the problem in half each time like binary search. This is called a divide and conquer algorithm.
A merge sort recursively breaks the values to be sorted in half until there is only one value to be sorted and then it merges the two sorted lists into one sorted list.


*/

public class Recursion {
  public static void main(String[] args) {
    /*
     * System.out.println("factorial of 3 is: " + factorial(3));
     * System.out.println("factorial of 4 is: " + factorial(4));
     * System.out.println("factorial of 5 is: " + factorial(5));
     * 
     * int result = mystery2(6); System.out.println("result: " + result);
     * 
     * int[] arr1 = { -20, 3, 15, 81, 432 }; int index = binarySearch(arr1, 15);
     * System.out.println("Array index: " + index);
     * System.out.println("Element value: " + arr1[index]);
     */

    System.out.println("mystery: " + mystery(8));
    mystery("0123456789", 3);
    System.out.println("mystery1: " + mystery1(7));
    System.out.println("mystery: " + mystery(2, 5));
    System.out.println("mystery: " + recur("avocado"));
    System.out.println("mystery: " + recur1("community"));
    int[] arr = { 2, 3, 12, 34, 54 };
    int result = binarySearch(arr, 0, 4, 5);
    System.out.println("result: " + result);

    int target = 10;

    int[] arrWithDups = { 2, 3, 7, 8, 10, 10, 10, 20 };

    int target1 = 3;

int[] nums = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

int targetIndex = bSearch(nums, 0, nums.length - 1, target);

System.out.println(recur (66, 5));
System.out.println(repeat("gopher", 5));
System.out.println("m: " + m(2));
  }

  public static int m(int y){
    y=2*y+y;
    y=2*y+y;
    return y;
  }

  public static String repeat(String word, int a)
{
if (a > word.length())
{
return word;
}
return word + repeat(word.substring(0, word.length() - 1), a);
}

  public static int factorial(int n) {
    if (n == 0)
      return 1;
    else
      return n * factorial(n - 1);
  }

  public static int mystery2(int x) {

    if (x == 1)
      return 1;
    else
      return x + mystery2(x - 1);
  }
  /*
   * this searches an element array and finds out the middle element of the array
   */

  public static int binarySearch(int[] elements, int target) {
    int left = 0;
    int right = elements.length - 1;
    while (left <= right) {
      int middle = (left + right) / 2;
      if (target < elements[middle]) {
        right = middle - 1;
      } else if (target > elements[middle]) {
        left = middle + 1;
      } else {
        return middle;
      }
    }
    return -1;
  }

  public static double mystery(int n) {
    if (n > 0) {
      mystery(n - 1);
    }
    return n;
  }

  public static void mystery(String digits, int n) {
    System.out.println(digits);

    digits = digits.substring(n);

    if (n > 0) {
      mystery(digits, n - 1);
    }
  }

  public static int mystery1(int n) {
    n--;

    if (n > 0) {
      mystery(n);
    }
    return n * 2;
  }

  public static int mystery(int a, int b) {
    System.out.println(a + " " + b);

    if (a > b) {
      return mystery(a, Math.abs(b) + 1);
    } else if (b > a) {
      return mystery(Math.abs(a) + 1, b);
    }
    return 1;
  }

  public static String recur(String str) {
    int len = str.length();
    if (len >= 2) {
      String next = str.substring(0, len - 2);
      return str.substring(len - 2) + recur(next);
    } else {
      return str;
    }
  }

  public static String recur1(String s) {
    if (s.length() <= 1) {
      return "";
    }
    return recur1(s.substring(2)) + s.substring(1, 2);
  }

  public static int binarySearch(int[] arr, int low, int high, int target)

  {

    if (low > high)

    {

      return -1;

    }

    int middle = (low + high) / 2;

    if (target == arr[middle])

    {

      return middle;

    }

    else if (target < arr[middle])

    {

      return binarySearch(arr, low, middle - 1, target);

    }

    else

    {

      return binarySearch(arr, middle + 1, high, target);

    }

  }

  public static int bSearch(int[] arr, int left, int right, int x)

  {

    if (right >= left)

    {

      int mid = (left + right) / 2;

      if (arr[mid] == x)

      {

        return mid;

      }

      else if (arr[mid] > x)

      {

        return bSearch(arr, left, mid - 1, x);

      }

      else

      {

        return bSearch(arr, mid + 1, right, x);

      }

    }

    return -1;

  }

  public static int binarySearch(ArrayList<Integer> theList, int low, int high,

int target)

{

if (low > high)

{

return -1;

}

int middle = (low + high) / 2;

if (target == theList.get(middle))

{

return middle;

}

else if (target < theList.get(middle))

{

return binarySearch(theList, low, middle - 1, target);

}

else

{

return binarySearch(theList, middle + 1, high, target);

}

}

public static int bSearch(String[] arr, int left, int right, String str)

{

if (right >= left)

{

int mid = (left + right) / 2;

if (arr[mid].equals(str))

{

return mid;

}

else if (arr[mid].compareTo(str) > 0)

{

return bSearch(arr, left, mid - 1, str);

}

else

{

System.out.println("right");

return bSearch(arr, mid + 1, right, str);

}

}

return -1;

}
public static int calc(int n)

{

if (n <= 9)

{

return n;

}

else

{

return calc(n / 10);

}

}

public static String recur(int n, int b)
{
String oct = " " + n % b;
if (n / b > 0)
{
return recur (n/b, b) + oct;
}
return oct;
}

}
