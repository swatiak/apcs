package com.apcs.unit6;
import java.util.Scanner;

/* 
Traversing an Array:  iterate through an array using a for loop.
break statement: ends for loop early if we find the value we are looking for
*/
public class AlgorithmsSearching {
public static void main(String[] args) {

    //testNames();
    //testHighScores();
    //testPerfectScores();
  
}

public static void testNames(){

    String[ ] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia"};

     int index = 1;
     System.out.println(names[index - 1]);
     index++;
     System.out.println(names[index]);
     System.out.println(names[index/2]);
     names[index] = "Rafi";
     index--;
     System.out.println(names[index+1]);
     //Jamal, Destiny, Emily, Rafi
    
}

public static void testHighScores(){
    int[] highScores = {10, 9, 8, 11};
    for(int i = 0; i<highScores.length; i++){
        System.out.println(highScores[3]);
    }
}

public static void testArrayForLoop(){
Scanner scan = new Scanner(System.in);
double [] vals = {1.8, 3.4, 7.2, 4.4, 0.3, 2.9, 1.1, 9.5, 6.2, 0.8, 2.4, 5.7};
double num = scan.nextDouble();
int location = -1;
for (int i = 0; i < vals.length; i++)
{
  if (num == vals[i])
  {
    location = i;
    break;
  }
}
System.out.println(location);
    
}
public static void testPerfectScores(){
    int[] d = {3, 22, 100, 88, 25, 100, 72, 99, 88};
    int perfect = 0;
    for (int i = 0; i < d.length; i++)
    {
      if (d[i] == 100)
      {
        perfect++;
      }
    }
    System.out.println("Number of perfect scores: " + perfect);
}






    
}
