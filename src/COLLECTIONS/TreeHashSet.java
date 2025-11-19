package COLLECTIONS;

import java.util.Arrays;
import java.util.HashSet;

public class TreeHashSet {


    public static void main(String[] args) {


        HashSet<Integer> ids = new HashSet<>();

        ids.add(10);
        ids.add(20);
        ids.add(30);
        ids.add(40);
        ids.add(50);
        ids.add(50);
        ids.add(null);
        ids.add(null);

        System.out.println(ids);
        System.out.println(ids.contains(30));
        System.out.println(ids.size());
        System.out.println(ids.toArray());


        Object data1[]= ids.toArray();
        for(Object o :data1){
            System.out.println(o);
        }

//        Arrays.sort(data1);
//        System.out.println(data1);

        int idsArray[]= new int[ids.size()];
        ids.toArray();








    }
}
