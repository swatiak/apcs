package com.apcs.unit9.interface1;

/* 
interface class should have an interface keyword
it should define only an empty method signature (no body)
you cannot instantiate intrface. you can only implement it

all methods in interface by default are abstract means no body

you dont have to specify abstract keyword in method
interface class is the standard
only public access modifiers


*/

public interface ISchool {
   public static final String coach = "James";

    public abstract int getStudentCount();

    public  String getStudentHistory();

    public boolean isCovidTested();
        
}
