package com.apcs.unit9.abstract1;

public class CUSD {
    public static void main(String[] args) {
        // old way
        ASchool basis2 = new Basis();

        // BASIS
        // new way
        ASchool cusdschhol = new Basis();
        String cusdhead = cusdschhol.getDistrictHead();
        System.out.println("cusdhead: " + cusdhead);
        Basis basis = new Basis();

        String basisbanner = basis.getSchoolBanner();
        System.out.println("basisbanner: " + basisbanner);

        Hamilton hamilton = new Hamilton();
        String hamiltonbanner = hamilton.getSchoolBanner();
        System.out.println("hamiltonbanner: " + hamiltonbanner);

        Acp acp = new Acp();
        String acpbanner = acp.getSchoolBanner();
        System.out.println("acpbanner: " + acpbanner);

        
    }

}
