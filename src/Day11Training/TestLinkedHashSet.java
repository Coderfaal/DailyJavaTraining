package Day11Training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class TestLinkedHashSet {

    public static void main(String[] args) {



        List <Integer>list = Arrays.asList(10,40,80,80,75,45);
        LinkedHashSet<Integer>listNumber = new LinkedHashSet<>(list);
        System.out.println(listNumber);


        LinkedHashSet<Integer>numbers = new LinkedHashSet<>();
        numbers.add(Integer.valueOf(10));
        numbers.add(Integer.valueOf(90));
        numbers.add(Integer.valueOf(25));
        numbers.add(Integer.valueOf(80));
        numbers.add(Integer.valueOf(60));
        numbers.add(Integer.valueOf(90));

        System.out.println(numbers.size());
        System.out.println(numbers);



    }





}
