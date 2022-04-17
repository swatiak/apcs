package com.apcs.unit9.abstract1;



public class Acp extends ASchool {


    public String getSchoolBanner(){

        String schoolBanner = "ACP" +" "+getDistrictName() + " "+getDistrictHead();

        return schoolBanner;
    }
   

}
