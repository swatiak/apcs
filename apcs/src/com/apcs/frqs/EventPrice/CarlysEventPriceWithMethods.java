package com.apcs.frqs.EventPrice;

import java.util.Scanner;

public class CarlysEventPriceWithMethods {
  public static void main(String[] args) {
    System.out.println("How many guests? ");
    getNumGuests();
    CarlysMotto2.getMotto();
    getPrice();
  }  

  public static int getNumGuests(){
    
    Scanner scan = new Scanner(System.in);
    int numGuests = scan.nextInt();
    return numGuests;
  }

  
  public static void getPrice() {
    int price = 35;
    boolean isBigEvent;
    Scanner scan = new Scanner(System.in);
    int numGuests = scan.nextInt();
    int total = numGuests * price;

    if (numGuests >= 50) {
        isBigEvent = true;
    }

    else {
        isBigEvent = false;
    }

}
}
