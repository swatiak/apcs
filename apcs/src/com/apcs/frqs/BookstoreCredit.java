package com.apcs.frqs;
import java.util.Scanner;
public class BookstoreCredit {
    public static void main (String args[]) {
     //  BookstoreCredit bc = new BookstoreCredit();
        Scanner scan=new Scanner(System.in);
        String name ="";
        System.out.print("Enter your name: " + name);
        name = scan.nextLine();
        
        System.out.print("Enter your gpa: ");
        double gpa = scan.nextDouble();
      computeDiscount(name, gpa);
    }

    public static void computeDiscount(String name, double gpa) {
        double total = gpa*10;
        System.out.println(name+ ", your GPA is " + gpa +", so your credit is $" + total);
    }
}
