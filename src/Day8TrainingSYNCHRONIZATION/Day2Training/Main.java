package Day8TrainingSYNCHRONIZATION.Day2Training;

public class Main{

    public static void main(String[] args) {
        System.out.println("STARTING MAIN THREAD_______________________");
        Bank b = new Bank();
        Account a1 = new Account(250,10000,"pepsi");
        b.addAccount(a1);
        UPI upi = new UPI("UPI", b);
        NetBanking nb = new NetBanking("NetBanking",b);
        Govt g = new Govt("Govt",b);

        upi.start();
        nb.start();
        g.start();

        System.out.println("ENDING MAIN THREAD____________________");
    }

}
