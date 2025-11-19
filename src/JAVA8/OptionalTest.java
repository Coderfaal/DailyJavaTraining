package JAVA8;

import java.util.Optional;

public class OptionalTest {

    static void m1 (Optional<String>op){} //without return type
    static String  m (Optional<String >op){
        if(op.isPresent()) {
            return op.get();
        }else {
            return op.orElse("String not initialized");}
    }

    public static Optional<Integer>m2(Optional<Integer> op)   //parameter and return type
    {

        if(op.isPresent()){
            int i= op.get();
            Optional<Integer>temp=Optional.ofNullable(i++);
            return temp;
        }else
            return op;
    }




    public static void main(String[] args) {


        System.out.println((m2(Optional.ofNullable(100)).get()));

        Optional<String>op = Optional.ofNullable(null);
       String r = m(op);
        System.out.println(r);

        System.out.println("_____________________________");


        Optional<String> op1 = Optional.of("test");

        if(op1.isPresent()){
            System.out.println(op1.get());}else{
            System.out.println("object not initialized");}

        System.out.println("____________________________________");

        Optional<String>op2= Optional.ofNullable(null);
        if(op2.isPresent()){
        System.out.println(op2.get());}
        else{
            System.out.println("object not initialized");
        }





    }
}
