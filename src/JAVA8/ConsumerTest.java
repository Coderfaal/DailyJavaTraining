package JAVA8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {

        ArrayList<String> arraylist=new ArrayList<>();
        arraylist.addAll(Arrays.asList("java","python","go","c++","ruby on rails","c","Scalar"));

        Consumer<ArrayList<String>>consumer = (l)->{
            for(String s : l){
                System.out.println(s);
            }

        };
        consumer.accept(arraylist);









    }
}
