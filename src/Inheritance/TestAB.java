package Inheritance;

public class TestAB {

    public static void main(String[] args) {

A a = new A();
a.calculate(5);

      //  B b= new B();//creating an object of subclass
        //A a= new A();// creating object from superclass

       B b=new B(25);
        B b2 = new B(25,35);

        b2.calculate(5);
    }
}
