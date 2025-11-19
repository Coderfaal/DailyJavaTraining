package JAVA8;

import java.util.function.Function;

public class FunctionalTest {


    public static void main(String[] args) {


        Function<Integer,Integer>f =(a)->{return a*a;};


        System.out.println(f.apply(20));
    }
}
