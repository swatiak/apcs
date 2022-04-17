package com.apcs.frqs.RandomGuess;

import java.util.Scanner;
import java.util.InputMismatchException;

public class RandomGuess4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guess = 0;
        int randNum = (int) (Math.random() * 10) + 1;

    System.out.println("Enter a guess from 1 to 10:");
guess = scan.nextInt();
if(guess==randNum){
    System.out.println("Congrats! You guessed it!");
}
while (guess != randNum) 
{
    try{
    if (guess > randNum) {
        System.out.println("Your number is too high");
    } 
    
    else {
        System.out.println("Your number is too low");
    }
   
    System.out.print("Guess is wrong, try again:");
    
    guess = scan.nextInt();
}




    catch (InputMismatchException e)
   {
    System.out.print("Not an integer, try again: ");
    scan.nextLine();
     
   }    
   
   
        
        
}
        

    }

}


