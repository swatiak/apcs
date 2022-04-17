package com.apcs.frqs;

import java.util.ArrayList;

/* 
This question involves reasoning about pairs of words that are represented by the following WordPair class.
*/

public class WordPairList {

    /** The list of word pairs, initialized by the constructor. */
    private ArrayList<WordPair> allPairs;

    public static void main(String[] args) {
        String[] wordNums = { "one", "two", "three" };
        WordPairList exampleOne = new WordPairList(wordNums);
        // new WordPairList(wordNums);

        String[] moreWords = { "the", "red", "fox", "the", "red" };
        WordPairList wordpairlist = new WordPairList(moreWords);

        int matches = wordpairlist.numMatches();

    }

    /**
     * Constructs a WordPairList object as described in part (a). * Precondition:
     * words.length >= 2
     */
    public WordPairList(String[] words) {
        ArrayList<WordPair> allPairs = new ArrayList<WordPair>();
         
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {

              WordPair wordPair =  new WordPair(words[i], words[j]);
               // allPairs.add(new WordPair(words[i], words[j]));

               allPairs.add(wordPair);
            }
        } 

        /*
         * allPairs = new ArrayList<WordPair>();
         * 
         * for (int i = 0; i < words.length-1; i++) { 
         * //System.out.println("i:" + i); 
         * 
         * for(int j = 0; j < words.length; j++) { 
         * //System.out.println("j:" + j);
         * String first = words[i];
         * //String second = words[j];
         * 
         * //WordPair wordPair = new WordPair(first, second);
         * 
         * allPairs.add(new WordPair(words[i], words[j]));
         * 
         * //System.out.println(wordPair.getFirst() + ", " +wordPair.getSecond()); //
         * allPairs.add(wordPair);
         * 
         * }
         * 
         * 
         * }
         */

        /* to be implemented in part (a) */ }

    /** Returns the number of matches as described in part (b). */
    public int numMatches() {
        System.out.println("allPairs size:" + allPairs.size());

        int matches = 0;

        for (WordPair wordPair : allPairs) {
            if (wordPair.getFirst().equals(wordPair.getSecond())) {
                matches++;
            }

        }

        System.out.println("matches:" + matches);
        return matches;
    }

}
