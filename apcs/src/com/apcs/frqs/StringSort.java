package com.apcs.frqs;


public class StringSort {
    public static void main(String[] args)
   {
      String[] values =  {"mouse", "dog", "cat", "horse", "cow",
         "moose", "tiger", "lion", "elephant", "bird", "hamster",
         "guinea pig", "leopard", "aardvark", "hummingbird"};
    
    printNumbers(values); 
   }

   public static void printNumbers(String[] values) {
       for (String value : values) {
           System.out.println(value);
}
}
    
}
