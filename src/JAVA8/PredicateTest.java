package JAVA8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.*;
public class PredicateTest {


    public static void main(String[] args) {
        //predicate takes object and returns boolean
        Predicate<String>lengthPredicate = (s)->{
            return s.length()>=8;
        };
        boolean r = lengthPredicate.test("too many doubts");
        System.out.println(r);

        ArrayList<String> list=new ArrayList<>();
        list.addAll(Arrays.asList("java","python","go","c++","ruby on rails","c"));

        for(String string: list){
            System.out.println(string + " :has lengths>=8 : "+lengthPredicate.test(string));
        }









    }


}
