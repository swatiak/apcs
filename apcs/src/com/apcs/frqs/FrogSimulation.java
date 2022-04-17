package com.apcs.frqs;

public class FrogSimulation {
    public static void main(String[] args) {
        FrogSimulation sim = new FrogSimulation(24, 5);
        System.out.println(sim.simulate());
        System.out.println(sim.runSimulations(50));
    }

    /** Distance, in inches, from the starting position to the goal. */
    private int goalDistance;
    /** Maximum number of hops allowed to reach the goal. */
    private int maxHops;

    /**
     * Constructs a FrogSimulation where dist is the distance, in inches, from the
     * starting position to the goal, and numHops is the maximum number of hops
     * allowed to reach the goal. Precondition: dist > 0; numHops > 0
     */
    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    /**
     * Returns an integer representing the distance, in inches, to be moved when the
     * frog hops.
     */
    private int hopDistance() {
        /* implementation not shown */
        int max = 10;
        int min = -10;
        return (int) (Math.random() * (max)) + min;
    }

    /**
     * Simulates a frog attempting to reach the goal as described in part (a).
     * Returns true if the frog successfully reached or passed the goal during the
     * simulation; * false otherwise.
     */
    public boolean simulate() {
        /* to be implemented in part (a) */
        int pos = 0;

        for (int i = 0; i < maxHops; i++) {
            pos = pos + hopDistance();
            if (pos >= goalDistance) {
                return true;
            } 
        }
        return false;
    }

    /**
     * Runs num simulations and returns the proportion of simulations in which the
     * frog successfully reached or passed the goal. Precondition: num > 0
     */
    public double runSimulations(int num) {
        /* to be implemented in part (b) */
        int success = 0;
        for (int i = 0; i < num; i++) {
            if (simulate() == true) {
                success++;
            }
        }
        return (double) success / num;
    }
}
