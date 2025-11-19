package COLLECTIONS;

import java.util.*;
import java.util.Map.Entry;

public class TestMaps {


    public static void main(String[] args) {

//Maps are also known as Associated arrays or Dictionary

        HashMap<String, String> countryCity = new HashMap<>();

        countryCity.put("India","New Delhi");
        countryCity.put("Japan","Tokyo");
        countryCity.put("USA","Washington DC");
        countryCity.put("South Korea","Seoul");
        countryCity.put("China","Bejing");

        System.out.println(countryCity);
        System.out.println(countryCity.size()+": is the size");
        System.out.println("__________________________________________________________");
        System.out.println("----if the value and key is present in map----");
        String capital= countryCity.put("India","New Delhi");
        System.out.println(capital);
        System.out.println("----if the value and key is not present  in map should give null(value og key is null)----");

        String capital1= countryCity.put("Brazil","Rio");
        System.out.println(capital1);
        System.out.println("__________________________________________________________");

        String capital2= countryCity.put("India","New Delhi");
        System.out.println(capital2);
        System.out.println("__________________________________________________________");


        System.out.println(countryCity.get("China"));
        System.out.println("__________________________________________________________");

        System.out.println(countryCity.size() +": is the size");
        System.out.println(countryCity);

        System.out.println("__________________________________________________________");
        countryCity.put(null,null);
        System.out.println(countryCity);
        System.out.println("__________________________________________________________");

        System.out.println("__________________________General for loop________________________________");

        Set<String> keys= countryCity.keySet();
       for(int i =0;i<keys.size();i++){
           System.out.println(i);
       }

       //Map views key,value
        System.out.println("__________________________________________________________");
            for(String a:keys){
                      System.out.println(a);
            }
        System.out.println("__________________________________________________________");
            Collection<String> values =countryCity.values();
        System.out.println(values);

        System.out.println("__________________________________________________________");

        Set<Entry<String,String>>kv=countryCity.entrySet();
        System.out.println(kv);

        System.out.println("_______________________Iterator________________");

        Iterator<Entry<String,String>> it =kv.iterator();
        while   (it.hasNext()){

            Entry<String,String> entry= it.next();
            System.out.println(entry.getKey()+":"+ entry.getValue());

        }













    }


}
