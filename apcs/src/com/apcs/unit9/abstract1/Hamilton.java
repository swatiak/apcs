package com.apcs.unit9.abstract1;

public class Hamilton extends ASchool {
    public String getSchoolBanner(){

        String schoolBanner = "Hamilton" +" "+getDistrictName() + " "+getDistrictHead();

        return schoolBanner;
    }

}
