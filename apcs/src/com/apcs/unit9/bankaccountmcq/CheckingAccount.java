package com.apcs.unit9.bankaccountmcq;

public class CheckingAccount extends BankAccount {
    /**
     * 
     * 
     * 6. Redefining the withdraw method in the CheckingAccount class is an example of
(A) method overloading.
(B) method overriding.
(C) downcasting.
(D) dynamic binding (late binding).
(E) static binding (early binding).
     */

    private static final double FEE = 2.0;
    private static final double MIN_BALANCE = 50.0;

    public CheckingAccount(double acctBalance) {
        /* implementation not shown */ }

    /**
     * FEE of $2 deducted if withdrawal leaves balance less than MIN_BALANCE. Allows
     * for negative balance.
     */
    public void withdraw(double amount) {
        /* implementation not shown */ }

}
