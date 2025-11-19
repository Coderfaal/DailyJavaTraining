package Day3Training;

public class Demo {

    public class InnerClass1{
        public void method(final int n){
            int x=10;

            System.out.println("from ()");
        }

    }
    static  public class InnerClass2{
        public void method2(){
            System.out.println("from 2()");
        }
    }


    private static  String connection;
    private double fee=5000;


    static {
        connection="intial connection";
        System.out.println("from  static block");
    }
    {
        System.out.println("from instance method");
    }


    public static void setConnection(String connection){
       Demo.connection =connection;
    }
    public static String getConnection(){
        return connection;
    }
    public void instanceMethod(){
       connection=null;
       connection= getConnection();
    }

}
