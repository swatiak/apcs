package com.apcs.unit9.abstractinterface;

public class Acp extends ASchool implements ISchool {
    public int getStudentCount() {
        return 50;
    } 

    public String getStudentHistory() {
        return "ACP History";
    }

    public boolean isCovidTested() {
        return true;
    }

    public String getSchoolBanner(){

        String schoolBanner = "ACP" +" "+getDistrictName() + " "+getDistrictHead();

        return schoolBanner;
    }

}
