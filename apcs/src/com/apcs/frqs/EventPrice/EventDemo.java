package com.apcs.frqs.EventPrice;

import java.util.EventObject;
import java.util.Scanner;

public class EventDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Event[] objEvents = new Event[3];

        for (int i = 0; i < objEvents.length; i++) {
            Event eventOne = new Event();
            System.out.println(
                    "Event Number: " + eventOne.getEventNumber + "Number of Guests: " + eventOne.getPhoneNum+eventOne.getNumberOfGuests()+ eventOne.getContactNum());

            for (int x = 0; x < objEvents[i].getNumberOfGuests(); x++) {
                System.out.println("Please come to my event! ");
            }

        }

    }

    public final static int pricePerGuest = 35;
    public final static int cutOffVal = 50;
    private String eventNumber;
    private int guests;
    private int price;


    public String getEventNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter event number: ");
        String eventNumber = scan.nextLine();
        return eventNumber;
    }

    public static Event largestEvent(Event event1, Event event2) {
        if (event1.getNumberOfGuests() > event2.getNumberOfGuests()) {
            return event1;
        } else {
            return event2;
        }
    }

    public int getNumberOfGuests() {
        Scanner scan = new Scanner(System.in);
        final int minGuests = 5;
        final int maxGuests = 100;
        System.out.print("Please enter number of guests: ");
        guests = scan.nextInt();
        while (guests < minGuests || guests > maxGuests) {
            System.out.println("Please enter a number between " + minGuests + " and " + maxGuests);
            System.out.print("Re-nter a number: ");
            guests = scan.nextInt();
        }
        scan.nextLine();
        return guests;
    }

    public double getPrice() {
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

        return price;
    }

    public static String getPhoneNum() {
        Scanner scan = new Scanner(System.in);
        String phone = scan.nextLine();
        System.out.print("Enter phone number: ");

        return phone;
    }
}
