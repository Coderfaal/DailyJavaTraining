package Day11Training;

import java.util.*;

public class TestLinkedList {

    public static void main(String[] args) {

        LinkedList<String>data = new LinkedList<>();

        data.add("one");
        data.add("two");
        data.add("three");
        data.add("four");
        data.add("five");
        data.add(null);

        System.out.println(data.size());
        System.out.println(data);
        System.out.println("_________________________________");
        //System.out.println(data.reversed());
        LinkedList<String>reverse = data.reversed();
        System.out.println(reverse);
        System.out.println("_________________________________");
        ListIterator<String> lit = reverse.listIterator(); // failedfast
        while(lit.hasNext()){
            String s = lit.next();
            //reverse.add(s+"modified inside iterator");
           // reverse.remove(s+ "removed");

        }
        System.out.println(reverse);
        Iterator<String>it= reverse.descendingIterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);

        }


        System.out.println("________________________");
        //System.out.println(data.listIterator(1));







    }
}
