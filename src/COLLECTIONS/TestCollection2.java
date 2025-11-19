package COLLECTIONS;

import java.util.*;

public class TestCollection2 {
    public static void main(String[] args) {


        List<String> colors = new ArrayList<>();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        colors.addAll(Arrays.asList("pink","purple","blue","mauve"));
        System.out.println(colors);

        System.out.println("___________________________");

        colors.addFirst("black"); //
        System.out.println(colors);



        Collection c = colors;
       boolean r =  colors.containsAll(c);
        System.out.println(r);

        List<String> fruits =  Arrays.asList("Apple","kiwi","mango","orange","banana");

        r=colors.containsAll(fruits);
        System.out.println(r);

        colors.addAll(fruits);
        r=colors.containsAll(fruits);
        System.out.println(r+"-"+colors);

        System.out.println("------------------------------");
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3));


        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(0,4,5,3));


         r=list1.retainAll(list2); //retain performs intersection set operation
        System.out.println(r);

        System.out.println(list1);

        System.out.println("------------------------------");

         r=colors.removeAll(fruits);
        System.out.println(r);
        System.out.println(colors);
        System.out.println("___________________");

        List l3=colors.subList(3,4);
        System.out.println(l3);





        //ArrayList<String> a = new ArrayList<>();


//        HashSet<Collection> hs = new HashSet<>();
//        hs.add(colors);
//        System.out.println(hs);
        int[] data ={10,22,33,23,45,67,65,89,98,90,3,55};

        List<Integer> dataList = new ArrayList<>();
        //general way of adding
        for(int a : data){
            dataList.add(a);
        }


        System.out.println(dataList);
       //using for loop easy
       // Collections.addAll(dataList, data);




    }
}
