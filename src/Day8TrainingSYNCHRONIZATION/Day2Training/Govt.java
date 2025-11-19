package Day8TrainingSYNCHRONIZATION.Day2Training;

public class Govt extends Thread{


        String name;
        Bank bank;

        public Govt(String name, Bank bank) {
            this.name = name;
            this.bank = bank;
        }

        @Override
        public synchronized void run() {


            bank.withdraw(250,5000);
            System.out.println("Amount  withdraw through Govt   :" +bank.balanceEnquiry(250));
            //System.out.println(bank.balanceEnquiry(250));

           // System.out.println("Current Balance : "+bank.balanceEnquiry(250));

           // System.out.println("_____________________");
//            bank.deposit(250,100);
//            System.out.println("Amount deposited through Govt:" +bank.balanceEnquiry(250));
//            System.out.println("_____________________");


        }




    }



