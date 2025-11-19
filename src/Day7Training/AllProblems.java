package Day7Training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AllProblems {
    //clauses
    static void p() throws ArithmeticException{
        System.out.println("p()");
        throw  new ArithmeticException("from p()");
    }

    static void p1() //throws FileNotFoundException
    {
try{
        FileInputStream fs= new FileInputStream("fal");

        System.out.println("p2()");}catch (FileNotFoundException e){
    e.printStackTrace();
        }
        System.out.println("p1() exited normally");
    }




static void p2() throws FileNotFoundException
{

    FileInputStream fs= new FileInputStream("fal");

    System.out.println("p2()");

            System.out.println();

    System.out.println("p2() exited normally");
}


    static void p3() throws FileNotFoundException {

        System.out.println("p3()");
        FileInputStream fs = null;
        try{
            fs = new FileInputStream("faall"); /// this = operator will never be executed,
            // theres no gauntee that the left hand code will execute as theres and excepetion on the
            // righthand side--->


        }catch(FileNotFoundException e){
            if(fs==null){
                throw new FileNotFoundException("file not found");///---indicates that it is failing -->throwing it because the progarmm should not
                // degarde further, so the program stops here only
            }
            e.printStackTrace();
        }

        System.out.println();

        System.out.println("p2() exited normally");
    }
    static void p0() throws Exception {
        throw new Exception("yo"); // we should never throw generic exception
        //upward heirarchy is there , no downward heirarchy
    }









    public static void main(String[] args) throws FileNotFoundException ,ArithmeticException{
      //  p();
        p1();
        try{
        p2();}
        catch   (FileNotFoundException e ){
            e.printStackTrace();
        }
       // p2() ;
        p3();
        System.out.println("exiting the main ()-->exception is handled");
    }













}






