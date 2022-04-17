package com.apcs.unit9.abstractinterface;

public class Hamilton extends ASchool implements ISchool {
    public int getStudentCount() {
        return 200;
    }

    public String getStudentHistory() {
        return "Hamilton History";
    }

    public boolean isCovidTested() {
        return true;
    }
    public String getSchoolBanner(){

        String schoolBanner = "Hamilton" +" "+getDistrictName() + " "+getDistrictHead();

        return schoolBanner;
    }
}
