package COLLECTIONS;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(Integer.valueOf(240));
        list.add((10.1));
        list.add("String");
        list.add(Arrays.asList(1,2,3));
        System.out.println(list.size());
        System.out.println(list);
       // Collections.sort(list);


        for(Object obj :list){
            if(obj instanceof Integer in){
                System.out.println(in.toBinaryString(in));
            } else if (obj instanceof String s) {
                System.out.println(s.endsWith("ing"));
            } else if (obj instanceof List l1) System.out.println(l1.size());
        }






    }
}
