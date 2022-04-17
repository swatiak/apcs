package com.apcs.unit9.abstract1;

public class Basis extends ASchool {

    public String getSchoolBanner(){

        String schoolBanner = "Basis" +" "+getDistrictName() + " "+getDistrictHead();

        return schoolBanner;
    }
}
