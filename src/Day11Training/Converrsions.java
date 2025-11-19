package Day11Training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Converrsions {
    public static void main(String[] args) {
        String d1[]= {"apple","dell","windows","mac","hp"};
        // [] arrays to collection
        Collection<String>collection= List.of(d1);
        ArrayList<String> al= new ArrayList<>(collection);
        System.out.println(al);
        //[] arrays to Implementations
        ArrayList<String>al2 = new ArrayList<>();
        Collections.addAll(al2,d1);
        System.out.println(al2);


        String d2[]= new String[al2.size()];
        al2.toArray(d2);

        for(String s : d2)
        {
            System.out.println(s);
        }




    }
}