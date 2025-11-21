package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsTest2 {
    public static void main(String[] args) {


//to remove duplicates using distinct - it is used to collect unique set
        List<Integer> list = Arrays.asList(1,2,3,4,25,25,88,99,5,6,7,5,7,8,5,4,3,2);
        list.stream().distinct().forEach(System.out::println);
        System.out.println("_______________________________________");
        //other way to remove duplicates without using list
        Set<Integer> duplicates = list.stream()
                .filter(q-> Collections.frequency(list,q)>1).collect(Collectors.toSet());
        System.out.println(duplicates);

        //removing duplicates using hashset
        //to-do where ever you see lambda expression change it to  predicate, to stay in touch with syntax
        System.out.println("_______________________________________");
        Set<Integer > dupNum = new HashSet<>();
        Set<Integer> duplicate2 = list.stream()
                .filter(d-> !dupNum.add(d)).collect(Collectors.toSet());
        System.out.println(duplicate2);
        // removed ! so it shows the unique elements
        System.out.println("_______________________________________");
        Set<Integer > dupNum1 = new HashSet<>();
        Set<Integer> duplicate3 = list.stream()
                .filter(d-> dupNum1.add(d)).collect(Collectors.toSet());
        System.out.println(duplicate3);
        System.out.println("_______________________________________");


        System.out.println("_______________________________________");
        System.out.println("_______________________________________");

    }

}
