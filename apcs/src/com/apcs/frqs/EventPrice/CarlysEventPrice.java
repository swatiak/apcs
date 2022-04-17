package com.apcs.frqs.EventPrice;

import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        String motto = "Carly’s makes the food that makes it a party.";

        System.out.println("*********************************************");
        System.out.println(motto);
        System.out.println("*********************************************");

    }

    public static void Price() {
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
