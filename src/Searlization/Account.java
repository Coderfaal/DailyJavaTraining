package Searlization;

import java.io.Serializable;

/**
 *
 */
public class Account implements Serializable {

    private int accountNo;
    static String name;
    transient double balance;

    public Account(int accountNo, double balance, String name) {
        this.accountNo = accountNo;
        this.balance = balance;
        Account.name = name;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



}
