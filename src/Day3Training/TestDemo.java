package Day3Training;

public class TestDemo {
    public static void main(String[] args) {


    Demo d1 =new Demo();

    d1.setConnection("MySQL Connection");
    System.out.println(d1.getConnection());

    Demo d2= new Demo();
    System.out.println(d2.getConnection());

    Demo.setConnection("Oracle connection");
       System.out.println(d1.getConnection());
       Demo d3=new Demo();
        System.out.println(d3.getConnection());


        System.out.println("_____________________________");

        Demo d =new Demo();
        Demo.InnerClass1 i1= d.new InnerClass1();
        i1.method(10);

        System.out.println("_____________________________");

        Demo.InnerClass2 i2 =new Demo.InnerClass2();
        i2.method2();


        System.out.println(Math.PI);

        System.out.println("_____________________________END________________________________");
}
}