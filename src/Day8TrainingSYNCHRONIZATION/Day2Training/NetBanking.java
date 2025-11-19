package Day8TrainingSYNCHRONIZATION.Day2Training;

public class NetBanking extends Thread{

    String name;
    Bank bank;

    public NetBanking(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
    }
    @Override
    public synchronized void run() {

        bank.deposit(250,2000);
        System.out.println("Amount  deposit  through NetBanking  :" + bank.balanceEnquiry(250));
       // System.out.println("Current Balance : "+bank.balanceEnquiry(250));
      //  System.out.println("_____________________");

//        System.out.println("_____________________");
//        bank.withdraw(250, 100);
//        System.out.println("Amount  withdraw through NetBanking  :" + bank.balanceEnquiry(250));

    }}
