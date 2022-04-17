package com.apcs.unit9.abstractinterface;

public class CUSD {
    public static void main(String[] args) {
        // old way
       // ISchool basis2 = new Basis();

        // BASIS
        // new way
        Basis basis = new Basis();

        String basisbanner = basis.getSchoolBanner();
        System.out.println("basisbanner: " + basisbanner);

        int basiscount = basis.getStudentCount();
        System.out.println("basiscount: " + basiscount);

        boolean basisCovidTestStatus = basis.isCovidTested();
        System.out.println("basisCovidTestStatus: " + basisCovidTestStatus);

        // ACP
        Acp acp = new Acp();
        String acpbanner = acp.getSchoolBanner();
        System.out.println("acpbanner: " + acpbanner);

        int acpcount = acp.getStudentCount();
        System.out.println("acpcount: " + acpcount);

        boolean acpCovidTestStatus = acp.isCovidTested();
        System.out.println("acpCovidTestStatus: " + acpCovidTestStatus);

        //HAMILTON
        Hamilton hamilton = new Hamilton();
        String hamiltonbanner = hamilton.getSchoolBanner();
        System.out.println("hamiltonbanner: " + hamiltonbanner);

        int hamiltoncount = hamilton.getStudentCount();
        System.out.println("hamiltoncount: " + hamiltoncount);

        boolean hamiltonCovidTestStatus = hamilton.isCovidTested();
        System.out.println("hamiltonCovidTestStatus: " + hamiltonCovidTestStatus);

        // CUSD
        int totalcount = basiscount + acpcount + hamiltoncount;
    
        System.out.println("totalcount: " + totalcount);

        //find number school did covid tets and find number school didnt do it
        int numCovidTested = 0;
        int numNotCovidTested = 0;

        

        if(basis.isCovidTested()|| acp.isCovidTested() || hamilton.isCovidTested()){
            numCovidTested++;
        }
        else{
            numNotCovidTested++;
        }
        System.out.println("numCovidTested: " + numCovidTested);
        System.out.println("numNotCovidTested: " + numNotCovidTested);
    }

}
