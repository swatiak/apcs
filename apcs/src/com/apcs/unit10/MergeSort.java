package com.apcs.unit10;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        /* int[] arr1 = { 86, 3, 43 };
        System.out.println(Arrays.toString(arr1));
        mergeSort(arr1);
        System.out.println(Arrays.toString(arr1));
 */
        int[] arr2 = {1, 5, 2, 4, 1};
        array(arr2);
    

    }

    public static void mergeSort(int[] elements) {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n - 1, temp);
    }

    private static void mergeSortHelper(int[] elements, int from, int to, int[] temp) {
        if (from < to) {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }

    private static void merge(int[] elements, int from, int mid, int to, int[] temp) {
        int i = from;
        int j = mid + 1;
        int k = from;

        while (i <= mid && j <= to) {
            if (elements[i] < elements[j]) {
                temp[k] = elements[i];
                i++;
            } else {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = elements[i];
            i++;
            k++;
        }

        while (j <= to) {
            temp[k] = elements[j];
            j++;
            k++;
        }

        for (k = from; k <= to; k++) {
            elements[k] = temp[k];
        }
    }

    public static void array(int[] elements){
        for (int j = 0; j < elements.length - 1; j++)
{
  int minIndex = j;
  for (int k = j + 1; k < elements.length; k++)
  {
    if (elements[k] < elements[minIndex])
    { // comparison performed
      minIndex = k;
    }
  }
    
  int temp = elements[j];
  elements[j] = elements[minIndex];
  elements[minIndex] = temp;
 }

    }
   

}
