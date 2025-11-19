package Day2Training;

public class Bank {

    private Account accounts[]= new Account[10];
    int indexVal =-1;
//
//    public Bank(Account[] accounts) {
//        this.accounts = accounts;
//    }
    public Bank(){

    }

    public Account[] getAccounts() {
        return this.accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account acc){

        if(indexVal<accounts.length-1){
            indexVal++;
            this.accounts[indexVal]= acc;
        } else
            System.out.println("array size is insufficent");




    }


    public double deposit(int accountNumber,double amount){
       double newBal=0.0;
        for (Account act: accounts) {
                if (act != null && act.getAccountNumber() == accountNumber) {
                    act.setBalance(act.getBalance() + amount);
                    newBal = act.getBalance();
                    break;
                }
            }

        return newBal;
    }

    public double withdraw(int accountNumber,double amount){
        double withdrawlAmount = 0.0;
        if(amount>0){
        for (Account acct : accounts){
                if(acct!= null&& acct.getAccountNumber()==accountNumber && acct.getBalance()!=0)
                {
                acct.setBalance(acct.getBalance()-amount);
                withdrawlAmount=acct.getBalance();
                break;
                }

        }
        }
        else {
            System.out.println("no balance");
        }
        return withdrawlAmount;

    }


    public double balanceEnquiry(int accountNumber){
        double balanceAmount=0.0;
        for(Account act : accounts){
            if(act!=null&& act.getAccountNumber()==accountNumber){
                balanceAmount=act.getBalance();
                break;
            }
        }return balanceAmount;

    }
}
