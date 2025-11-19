package Day8TrainingSYNCHRONIZATION.Day2Training;

public class UPI extends Thread {

   String name;
   Bank bank;

    public UPI(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
    }

   @Override
   public synchronized void run() {
       bank.deposit(250,2000);
       System.out.println("Amount deposited through UPI:" +bank.balanceEnquiry(250));

     //  System.out.println("Current Balance : "+bank.balanceEnquiry(250));

      // System.out.println("_____________________");

//       System.out.println("_____________________");
//        bank.withdraw(250,500);
//       System.out.println("Amount  withdraw through UPI   :" +bank.balanceEnquiry(250));

    }




}

