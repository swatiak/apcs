package com.apcs.frqs.AlienProject;

public class Alien {
    protected String name;
    protected int numArms;
    protected int numHeads;

    public Alien(String n, int arm, int head) {
        name = n;
        numArms = arm;
        numHeads = head;
    }

    public String toString() {
        System.out.println(name +" has " + numArms + " arms and " + numHeads + "heads!");
        return "";
    }

    

}
