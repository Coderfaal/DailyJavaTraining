package Day7Training;

public class TestExceptions {


    public static void main(String[] args) {
       try{
        MyException ex = new MyException("cannot process the request");
        throw   ex;}catch(MyException e){
           System.err.println(e.getMessage());
       }
    }
}
