package JAVA8;
@FunctionalInterface
interface Compute{
    public static void m (){
        System.out.println("from m ");
    }
    public default void  m1(){
        System.out.println("from default m1 ");
    }
    public double product(double a, double b);


}
@FunctionalInterface
interface Convert{
    double toRupee(double dollars);
}
@FunctionalInterface
interface ConvertWithT<T>{
    double toRupees(double d);
}

public class LambdasTest {
    public static void main(String[] args) {

        ConvertWithT <Double>ct = (double d) ->{return d*88;};
        System.out.println(ct.toRupees(500));

        System.out.println("_____________________________________");

        Convert convert = new Convert() {
            @Override
            public double toRupee(double dollars) {
                return dollars*88;
            }
        };
        System.out.println(convert.toRupee(100));

        System.out.println("_____________________________________________-");


        Compute c= new Compute()     //anynomus
        {
            public double product(double x, double y) {
                return x*y;
            }
        };

        System.out.println(c.product(15,20));

        Compute c1=(double p,double q)->{return p*q;}; ///created a lambda
        System.out.println(c1.product(50.18,60.12));
        System.out.println("______________________________________");

        Runnable r = ()->{
            for(int i=1;i<=5;i++){
                System.out.println(i);try {
                    Thread.sleep(1000);
                }catch(InterruptedException e){e.printStackTrace();}
                }
            }; //r.run();// never call run()
            new Thread(r).start();   ///here r is an implementayion of runnable


    }


    }

