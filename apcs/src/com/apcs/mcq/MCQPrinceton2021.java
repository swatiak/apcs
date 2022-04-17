package com.apcs.mcq;

public class MCQPrinceton2021 {
    public static void main(String[] args) {
        // mystery(3);
        // randNum();
        doSomething(5);
    }

    public static void mystery(int n) {

        for (int k = 0; k < n; k++) {
            mystery(k);
            System.out.println(k);
        }
    }

    public static void randNum() {
        int x = 3;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.println("Yo");
            }
        }
    }

    public static void doSomething(int val) {

        if (val % 2 == 0) {
            if (val % 3 == 0) {
                System.out.println(val / 2);
            } else {
                System.out.println(val - 1);
            }
        }
        

    }
}
