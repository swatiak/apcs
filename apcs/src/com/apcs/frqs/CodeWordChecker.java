package com.apcs.frqs;

    public class CodeWordChecker implements StringChecker{
        public static void main(String[] args) {
            
        }
      private int minimum=0;
      private int maximum=0;
      private String notIn;
    
      public CodeWordChecker(int min, int max, String notOccur)
      {
        minimum = min;
       maximum = max;
       notIn = notOccur;
      }
    
      public CodeWordChecker(String notIn)
      {
        int min = 6;
        int max = 20;
        String notOccur = notIn;

      }
    
      public boolean isValid(String str)
      {
        return str.length()>maximum && str.length()<minimum;
      } 
    }   

