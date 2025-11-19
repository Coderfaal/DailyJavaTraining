package Day6Training;
class Attendance{
    Weekdays day =Weekdays.MONDAY;

    boolean isPresent(Weekdays day){
        if(day==Weekdays.SATURDAY || day == Weekdays.SUNDAY) {
            return false;}

        return true;
    }
}
public class TestENUMs {
    public static void main(String[] args) {


        System.out.println("________________________________________________________");


        Currency currency = Currency.DOLLAR;
        double amountInINR= currency.toINR(100);
        System.out.println("Currency :"+ currency +
                " , Symbol: "+currency.getSymbol()+
                " 100 "+ currency+
                " ,in INR : "+amountInINR);

        for(Currency c : Currency.values()){
            amountInINR= c.toINR(100);
            System.out.println("100 "+ c +" in INR: "+ amountInINR);
        }


        System.out.println("________________________________________________________");













        Fruit fruit = Fruit.MANGOES;
        System.out.println("Fruit :"+fruit + " Origin is from "+fruit.getFruitOrigin());

        for(Fruit f : Fruit.values()){
            System.out.println("vale @ "+f.ordinal() + " is "+f.name());
}

        System.out.println("________________________________________________________________________");
        Weekdays day1= Weekdays.MONDAY;
        Weekdays day2 = Weekdays.FRIDAY;

        System.out.println("day1 :"+ day1);
        System.out.println("day2 :"+ day2);

        if(day1!= day2){
            System.out.println(day1 +"and"+ day2 +"are different days");
        }

        switch (day1){
            case MONDAY :
                System.out.println("start of the work week");
                break;
                case FRIDAY:
                System.out.println("End of work week");
                break;
            default:
                System.out.println("other week days");
        }
        for (Weekdays day :Weekdays.values()){
            System.out.println("value @"+day.ordinal() +"is "+day.name());

        }
    }
}
