package com.apcs.frqs;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;

public class QuizWithExceptionsCaught {
    public static void main(String[] args) {
        String q1 = "When did humans started cooking?\n"
                + "(a)1-1.3 million years ago\n(b)1.8-2.3 million years ago\n(c)1-1.3 billion years ago\n";

        String q2 = "Where did Hawaiian pizza come from?\n" 
        + "(a)Canada\n(b)Hawaii\n(c)Georgia\n";

        String q3 = "Where did German chocolate cake originate from?\n"
                + "(a) Texas\n(b)Germany\n(c)France\n";

        String q4 = "Which fruit are peaches essentially the same?\n" 
        + "(a)Grapes\n(b)Plum\n(c)Nectarines\n";

        String q5 = "What is SPAM a mash up of?\n" 
        + "(a)Spice\n(b)Ham\n(c)Spice and Ham\n";

        String q6 = "What type of root vegetable is wasabi made from?\n" 
        + "(a)Horseradish\n(b)Onion\n(c)Fennel\n";

        String q7 = "How many years do Pineapples take to grow\n" 
        + "(a)1 year\n(b)2-3 years\n(c)5 years\n";

        String q8 = "Which flavor is the coconut Girls Scout cookie?\n" 
        + "(a)Thin Mints\n(b)Samoas\n(c)Shortbread\n";

        String q9 = "Which vegetble has more vitamin C than oranges.\n" 
        + "(a)Carrot\n(b)Brocolli\n(c)Peppers\n";

        String q10 = "What is a single spaghetti noodle called?\n" 
        + "(a)spaghettio.\n(b)spaghetti nood\n(c)spaghetto.\n";

        Question[] questions = { new Question(q1, "b"), new Question(q2, "a"), new Question(q3, "a"),
                new Question(q4, "c"), new Question(q5, "c"), new Question(q6, "a"), new Question(q7, "b"),
                new Question(q8, "b"), new Question(q9, "c"), new Question(q10, "c") };

        Test(questions);

    }

    public static void Test(Question[] questions) {
        int score = 0;
        Scanner scan = new Scanner(System.in);
try{
        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i].question);
            String answer = scan.nextLine();
          
            if (answer.equals(questions[i].answer)) {
                System.out.println("Correct!");
                score++;
            }          
        
            else{
                System.out.println("The correct answer is " + questions[i].answer);
            }
        
        }
    
        System.out.println("You got " + score + "/" + questions.length);
    }

    catch (InputMismatchException e) {
        System.out.println("Your input is invalid. Please try again.");
        scan.nextLine();
    }
}
}
