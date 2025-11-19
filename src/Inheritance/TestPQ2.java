package Inheritance;

public class TestPQ2 {
    public static void main(String[] args) {
        Q q= new Q();
        q.method(0,0);

        P p = q;
       String result  = p.method(0,0);//differeing the execution
        System.out.println(result);

        p.method2();// no dynamic method dispatch


    }
}
