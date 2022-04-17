package com.apcs.frqs;

import java.util.Arrays;
import java.util.List;

public class StringFormatter {
    public static void main(String[] args) {
         int len = 20;

        String[][] wordLists = {
                {"AP", "COMP", "SCI", "ROCKS"},
                {"GREEN", "EGGS", "AND", "HAM"},
                {"BEACH", "BALL"}
        };

        for (String[] wordList : wordLists) {
            System.out.println(StringFormatter.format(Arrays.asList(wordList), len));
        }
    }

    private static char[] format(List<String> asList, int len) {
        return null;
    }

    public static int totalLetters(List<String> wordList) {
        int total = 0;

        for (int i = 0; i < wordList.size(); i++) {
            total = total + wordList.get(i).length();
        }

        return total;
    }

    public static int basicGapWidth(List<String> wordList, int formattedLen) {
        int letters = totalLetters(wordList);
        int spaces = formattedLen - letters;
        int gaps = wordList.size() - 1;

        return spaces / gaps;
    }

}
