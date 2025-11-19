package Day6Training;

public class Account{

    Currency currency= Currency.DOLLAR;

    public void setCurrency(Currency currency){
        this.currency=currency;
    }
}

class TestAccount{
    public static void main(String[] args) {
        Account a= new Account();
    a.setCurrency(Currency.EURO);
    }
}
