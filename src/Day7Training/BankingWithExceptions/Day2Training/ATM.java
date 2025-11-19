package Day7Training.BankingWithExceptions.Day2Training;





public class ATM {


    private int atmId;
    private String location;
    private boolean status;
    private int currency500, currency200, currency100;
    private Bank b;

    public ATM(Bank b,int atmId, String location, boolean status, int currency500, int currency200, int currency100) {
        System.out.println(b.getAccounts().length);
        this.b = b;
        this.atmId = atmId;
        this.location = location;
        this.status = status;
        this.currency500 = currency500;
        this.currency200 = currency200;
        this.currency100 = currency100;
    }



    public void dispense (int accountNo, int amount, int cashIn500, int cashIn200, int cashIn100){


        Account accounts[]= b.getAccounts();
        System.out.println(accounts.length);
        System.out.println(accounts[2]);
        loop:for(Account account :accounts){

            if(account.getAccountNumber()==accountNo){
                if(account.getBalance()>=amount){
                    if(amount == ((500*cashIn500) +(200*cashIn200 )+(100*cashIn100))){
                        if (this.currency500>=cashIn500 && this.currency200>=cashIn200 && this.currency100>=cashIn100){
                            account.setBalance(account.getBalance()-amount);
                            this.currency500-=cashIn500;
                            this.currency200-=cashIn200;
                            this.currency100-=cashIn100;
                            System.out.println("please collect cash");
                            break loop;

                        }
                        else{
                            System.out.println("invalid");
                        }
                    }
                }
            }
        }
    }
}


