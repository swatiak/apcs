package com.apcs.frqs.RandomGuess;

import java.util.ArrayList;

public class RandomStringChooser
{
  private ArrayList<String> words;
  public static void main(String[] args) {
    String[] wordArray = {"wheels", "on", "the", "bus"};
    RandomStringChooser sChooser = new RandomStringChooser(wordArray);

    for (int k = 0; k < 6; k++)
    {
      System.out.print(sChooser.getNext() + " ");
    }
    System.out.println();
}

 

  public RandomStringChooser(String[] arr)
  {
    ArrayList<String> words = new ArrayList<String>();
    for (String s : arr)
      words.add(s);
  }

  public String getNext()
  {
    if(words.size() ==0){
        return "NONE";
    }
    int rand = (int) (Math.random()*words.size());
    String r = words.get(rand);
    words.remove(rand);
    return r;
  }
}