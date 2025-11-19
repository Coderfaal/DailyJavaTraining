package Day8TrainingSYNCHRONIZATION.Day2Training;

public class CreateBankAccounts {

    public static void main(String[] args) {
      // Account acc[]=new Account[5];
       Bank b = new Bank();
       Account an1= new Account(2501,27000,"doe");
       Account an2 = new Account(2502,4000,"grrr");
       Account an3 =new Account(2503,18000,"john");

       b.addAccount(an1);
       b.addAccount(an2);
       b.addAccount(an3);

       double result1 =b.deposit(2502,500);
        System.out.println();
        System.out.println("the new balance is "+result1);

        System.out.println("_____________________________________");
        double result = b.withdraw(2503,8000);
        System.out.println("balance before withdrawl  "+result1);
        System.out.println("balance after withdrawl is "+ result);

        System.out.println("_____________________________________");

        System.out.println("Checking for balance ");
        result=b.balanceEnquiry(2503);
        System.out.println("balance is " +result);
        System.out.println("_____________________________________");

        double result4= b.deposit(2503,500);
        System.out.println("balance after deposit is :"+result4);

        System.out.println("_____________________________________");

        ATM atm =new ATM(b,500,"whitefield",true,500,300,200);
        atm.dispense(2503,10000,10,10,30);


    }
}
