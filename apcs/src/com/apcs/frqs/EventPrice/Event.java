package com.apcs.frqs.EventPrice;

import java.util.Scanner;

public class Event {
    public final static int lowPrice = 35;
    public final static int highPrice = 50;
    private String eventNumber;
    private int guests;
    private int price;
    private double guestPrice;
    public String getEventNumber;
    public String getPhoneNum;

    public Event() {
        this("A000", 0);
    }

    public Event(String eventNum, int guests) {
        setEventNumber(eventNum);
        setGuests(guests);
    }

    public void setEventNumber(String eventNum) {
        String eventNumber = "A000";
        eventNumber.toUpperCase();
        eventNumber = eventNum;
    }

    public void setGuests(int amountOfGuests) {
        guests = amountOfGuests;
        price = guests * lowPrice;
        if (isLargeEvent()) {
            guestPrice = lowPrice;
        } else {
            guestPrice = highPrice;
        }
    }

    public int getNumberOfGuests() {
        return guests;
    }

    public boolean isLargeEvent() {
        boolean isBigEvent;
        Scanner scan = new Scanner(System.in);
        int numGuests = scan.nextInt();
        int total = numGuests * price;

        if (numGuests >= 50) {
            return true;
        }

        else {
            return false;
        }

    }

    public void setContactNum(String phone) {
        
        String phoneNum=phone;
        if (phone.length() < 10 || phone.length() < 10) {
            phoneNum = "0000000000";
        } else {
            phoneNum = phone;
        }
    }

    public String getContactNum(){
        String input = Integer.toString(1234567890);
       String phone = "(" + input.substring(0, 3) + ") " + input.substring(3, 6) + "-" + input.substring(6, 10);
       return phone;
    }

    public double getPrice() {

        return price;

    }
}
