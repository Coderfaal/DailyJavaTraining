package Day7Training.BankingWithExceptions.Day2Training;



public class CreateAccounts {

    public static void main(String[] args) {

        Account account = new Account();// gives an object with default state


        account.setAccountNumber(1001);
        account.setAccountHolder("fal");
        account.setBalance(10000);

        System.out.println(account.getBalance());
        System.out.println(account.getAccountHolder());
        System.out.println(account.getAccountNumber());

        System.out.println("___________________");

        Account account2 =new Account(23,5555,"bingo");
        System.out.println(account2.getBalance());
        System.out.println(account2.getAccountHolder());
        System.out.println(account2.getAccountNumber());


        System.out.println("___________________");
        System.out.println(account2);
        System.out.println(account);

        System.out.println("___________________");

        System.out.println("comparing objects");
        boolean result= account == account2;//new has a new hashcode
        System.out.println(result);

        result= account.hashCode()== account2.hashCode()    ;
        System.out.println(result);

        result  =account.equals(account2);//equals-->inherited from object class
        System.out.println(result);


//        String a3= new String("hi fal");
//        if(account instanceof Object){
//            result=account==(Object)a3;
//        }

        System.out.println("___________________");
        Account a4=account;
        a4.setBalance(a4.getBalance()+3452);
        System.out.println(account.getBalance());


        result=a4==account;
        System.out.println(result);



        //ways to create objects
    }
}
