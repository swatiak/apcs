package com.apcs.unit9.interface1;

public class Basis implements ISchool {

    public int getStudentCount() {
        return 100;
    }

    public String getStudentHistory() {
        return "Basis History";
    }

    public boolean isCovidTested() {
        return false;
    }
}
