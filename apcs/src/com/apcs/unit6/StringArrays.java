package com.apcs.unit6;
import java.util.Scanner;

public class StringArrays {
    public static void main(String[] args) {
        // testStringArray();
        // testMovieLength();
        // testWordOrder();
        // testStringCompareto();
        // testWordLength();
        // testHardWord();
        // testIngWords();

        String[] words = {"remain", "believe", "argue", "antagonize"};
        findA(words);

    }

    public static void testStringArray() {
        Scanner scan = new Scanner(System.in);
        String[] movies = new String[3];
        movies[2] = "Don’t Eat the Daisies";
        for (int i = 0; i < movies.length; i++) {
            System.out.println("Enter a movie title:");
            movies[i] = scan.nextLine();
            // Prints the length of the first movie title
            System.out.println(movies[0].length());
        }
    }

    public static void testMovieLength() {
        String[] movie = new String[3];
        movie[0] = "Protection Program";
        for (int i = 0; i < movie.length; i++) {
            String firstLetter = movie[i].substring(0, 1);
            // Review substring if the line below is confusing
            String lastLetter = movie[i].substring(movie[i].length() - 1);
            System.out.println(firstLetter + lastLetter);
        }
    }

    public static void testWordOrder() {
        String[] word = { "algorithm", "boolean", "int", "double" };
        for (int i = 0; i < word.length / 2; i++) {
            word[i] = word[word.length - 1 - i];
            word[word.length - 1 - i] = word[i];
        }
        for (int i = 0; i < word.length; i++) {
            System.out.print(word[i] + " ");
        }
    }

    public static void testStringCompareto() {
        String[] words = { "BEAUTIFY", "BENEVOLENCE", "BENIGN", "BEQUEST", "BERATE", "BEREFT", "BEWILDER" };
        for (int i = 0; i < words.length; i++) {
            if (words[i].substring(0, 3).compareTo("BEN") != 0) {
                System.out.print(words[i] + " ");
            }
        }
    }

    public static void testWordLength() {
        String[] words = { "BEAUTIFY", "BENEVOLENCE", "BENIGN", "BEQUEST", "BERATE", "BEREFT", "BEWILDER" };
        int s = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[s].length() < words[i].length()) {
                s = i;
            }
        }
        System.out.println(words[s]);

        int w = words.length - 1;
        for (int i = 0; i < words.length; i++) {
            if (words[w].length() > words[i].length()) {
                w = i;
            }
        }
        System.out.println(words[s]);
    }

    /*
     * The following code is intended to count how many “hard” spelling words are
     * assigned in a week. A hard spelling word is defined as having more than 5
     * letters. Consider the following code: Which could be used to replace missing
     * code so that it works as intended?
     */
    public static void testHardWord() {
        String[] list = { "Benefit", "Butterfly", "Mango", "Strawberry" };
        int hard = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].length() > 5) {
                hard++;
            }
        }
        System.out.println("Hard words: " + hard);
    }
    /*
     * A student is having trouble remembering how to spell words that end in –ing.
     * She needs a program to count how many ing words she has each week in her
     * spelling list.
     * 
     * Which of the following could be used to replace missing code so that this
     * works as intended?
     */

    public static void testIngWords() {
        String[] list = { "Running", "Jumping", "Mango", "Strawberry" };
        int ing = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].length() > 3) {
                if (list[i].substring(list[i].length() - 3, list[i].length()).equals("ing")) {
                    ing++;
                }
            }
        }
        System.out.println("Number of ing words: " + ing);
    }

    public static String findA(String[] arr)
{
  for (int i = 0; i < arr.length; i++)
  {
    if (arr[i].substring(0, 1).equals("a"))
    {
      return arr[i];
    }
  }
  return "";
}
}
