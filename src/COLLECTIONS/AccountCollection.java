package COLLECTIONS;



public class AccountCollection {
    private int accountNumber;
    private double balance;
    private String accountHolder;

    public AccountCollection() {
    }
    //this means current object
    public AccountCollection(int accountNumber, double balance, String accountHolder){
        this.accountNumber= accountNumber;
        this.balance=balance;
        this.accountHolder=accountHolder;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", accountHolder='" + accountHolder + '\'' +
                '}';
    }
}
