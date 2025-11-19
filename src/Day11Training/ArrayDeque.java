package Day11Training;

import java.util.Arrays;

public class ArrayDeque {


    public static void main(String[] args) {


        java.util.ArrayDeque<Integer>a= new java.util.ArrayDeque<>(Arrays.asList(25,35,45,76,89,65,33,21,43));

        a.add(10);
        a.addLast(66);
        a.addFirst(56);
        System.out.println(a.size());
        System.out.println(a);

        for(int i= 0;i<a.size();i++){}


    }
}
