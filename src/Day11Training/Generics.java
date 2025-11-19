package Day11Training;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Generics {

    static void m(List<?>list){

    }
    static void m1(List<Object>list){}



    static void m2(List<?extends Number>list){
        for(Number n : list){
            System.out.println(n);
        }
//        for(Integer i:list){
//
//        }

        //list.add(new Object());
       // list.add(Integer.valueOf(1000));

    }




    public static void main(String[] args) {

        ArrayList<Integer>ai = new ArrayList<>();
        ai.add(50);
        ai.add(2087);
        ai.add(170);
        ai.add(970);
        m2(ai);
        ArrayList<Object>al0 = new ArrayList<>();
        //m2(al0);














        m1(al0);
        ArrayList<String>al1 = new ArrayList<>();
        m(al1);



        ArrayList<Integer>al2 = new ArrayList<>();
        m(al2);


        ArrayDeque<String> a1 = new ArrayDeque<String>();

        ArrayDeque<Object> a2 = new ArrayDeque<>();


        a2.add("hello");

       // ArrayDeque<String> a3 = new ArrayDeque<Object>();
        Deque<String >a4 = new ArrayDeque<>();
    }
}
