package com.apcs.unit5.constructor;

/**
 * method: access modifier, return type, name of method, (), { } consructor:
 * access modifier, name of method = class name, (), { } variable, constructor,
 * method
 */

public class School {
    //variable
    private String schoolName;

    //constructor

    public School(String inputSchoolName) {
        System.out.println("Constructor is invoked");
        schoolName = inputSchoolName;
        System.out.println("schoolName: "+schoolName);
    }

    /*
    print school detail method
    */
    public void printSchoolDetail(){
        //variable
        int numStudents=0;

        if(schoolName.equalsIgnoreCase("ACP")){
            numStudents = 7000;
            
        }else if (schoolName.equalsIgnoreCase("Hamilton")){
            numStudents = 10000;
        }else if(schoolName.equalsIgnoreCase("Basis")){
            numStudents = 5000;
        }else{
            System.out.println("Unknown School Name");
        }

      
        System.out.println("numStudents: "+numStudents);

    }


    /*
    print staff detail
    */
    public void printStaffetail(){
        //variable
        String principalName = " ";

        if(schoolName.equalsIgnoreCase("ACP")){
            principalName = "Thomas Pale";

            
        }else if (schoolName.equalsIgnoreCase("Hamilton")){
            principalName = "Jane Barret";
        }else if(schoolName.equalsIgnoreCase("Basis")){
            principalName = "Indira Joshi";
        }else{

            System.out.println("Unknown School Name");

            
        }

        System.out.println("principalName: "+principalName);

    }


    public static void iamStatic(){

    }

    public void iamNonStatic(){

    }
}
