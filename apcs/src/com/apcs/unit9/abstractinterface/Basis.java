package com.apcs.unit9.abstractinterface;

public class Basis extends ASchool implements ISchool {

    public int getStudentCount() {
        return 100;
    }

    public String getStudentHistory() {
        return "Basis History";
    }

    public boolean isCovidTested() {
        return false;
    }

    public String getSchoolBanner(){

        String schoolBanner = "Basis" +" "+getDistrictName() + " "+getDistrictHead();

        return schoolBanner;
    }
}
