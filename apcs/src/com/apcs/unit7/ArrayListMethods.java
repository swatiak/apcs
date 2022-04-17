package com.apcs.unit7;
import java.util.ArrayList;

/*  Do not need to be memorized- reference sheet will be givn on test day
int size() returns the number of elements in the list

boolean add(E obj) appends obj to the end of the list and returns true

E remove(int index) removes the item at the index and shifts remaining items to the left (to a lower index)

void add(int index, E obj) moves any current objects at index or beyond to the right (to a higher index) and inserts obj at the index

E get(int index) returns the item in the list at the index

E set(int index, E obj) replaces the item at index with obj

*/

public class ArrayListMethods {
    private ArrayList<String> nameList;
    public static void main(String[] args) {
        addMethod();
    }
    
public static void addMethod(){
    
    ArrayList<String> nameList = new ArrayList<String>();
    nameList.add("Diego");
    nameList.add("Grace");
    nameList.add("Deja");
    System.out.println(nameList);
    System.out.println(nameList.get(0));
    System.out.println(nameList.get(1));
    System.out.println(nameList.get(2));
    nameList.set(0, "Swati");
    System.out.println(nameList);

}






}
