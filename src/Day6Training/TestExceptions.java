package Day6Training;

public class TestExceptions {


//    static Exception method(){
//        return new RuntimeException("gonee....");
  //}


    static  void m(){
        System.out.println("m()");
        throw new ArithmeticException(("from m()"));
    }
    static void m1 (){
        System.out.println("m1()");
    try {
        m();
    }catch (ArithmeticException e){
        System.out.println("m1 handled the exception");
    }
        System.out.println("m1 exited normally");
    }
    static void m2(){
        System.out.println("m2()");m1();
        System.out.println("m2  exited normally");}

    public static void main(String[] args) {

        System.out.println("from main");
       try{ m2();}
       catch (ArithmeticException e){
           System.out.println( e.getMessage());
           e.printStackTrace();
           System.out.println();
       }
       catch (RuntimeException e){
           System.out.println( e.getMessage());
           e.printStackTrace();
           System.out.println();}
       catch (Exception e){
           System.out.println( e.getMessage());
           e.printStackTrace();
           System.out.println("this checks checked and unchecked exceptions");
       }
       catch(Throwable e) {
           System.out.println( e.getMessage());
           e.printStackTrace();
           System.out.println("This is a generic exception so we are putting this in the end");
       }
       finally{
           System.out.println("from finally");}
        System.out.println("Exiting MAin()");


       // // method();
        // // int a=10;
       // // int b=0;
       /* System.out.println("Before exception");
        try {
            System.exit(0); // terminates jvm
            int a = Integer.parseInt(args[0]);//add the inputs in program argumemts
            int b = Integer.parseInt(args[2]);
            int c = 0;
            if (b > 0 && (c = a / b) >= 0) {
                System.out.println("result :" + c);  // int c = a / b;//Airthematic Exception
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            try {
                throw new RuntimeException("unable to handle" + e);
            } catch (RuntimeException re) {
                re.printStackTrace();
            }
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block");
            System.out.println("Exception message : " + e.getMessage());
            System.out.println("Exception toString(): " + e.toString());
           System.out.println("StackTArce :");
            e.printStackTrace();
        } finally {
            System.out.println("Inside finally block");
        }

        System.out.println("After exception");

        */

    }
}
