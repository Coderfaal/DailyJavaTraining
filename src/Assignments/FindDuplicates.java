package Assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,5,6,7,2,9,6,5,3,4,2,1);
        //list.stream().distinct().forEach(System.out::println);//using distinct() to get unique value only.
       List<Integer> newList = list.stream().filter(q-> Collections.frequency(list, q)<2).toList();
        System.out.println(newList);
    }
}
