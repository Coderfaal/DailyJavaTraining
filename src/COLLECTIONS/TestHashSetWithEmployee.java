package COLLECTIONS;

import java.util.HashSet;

public class TestHashSetWithEmployee {

    public static void main(String[] args) {

        Employee e1 = new Employee(21,"Fal",75000);
        Employee e2 = new Employee(22,"Harry",50000);
        Employee e3 = new Employee(10,"Draco",85000);
        Employee e4 = new Employee(10,"Draco",85000);
       // Employee e5 = new Employee(15,"Pepsi",95000);


        HashSet<Employee> empSet = new HashSet<>();

        empSet.add(e2);//== for an object of employee unique or not
        empSet.add(e4);
        empSet.add(e1);
        empSet.add(e3);
       // empSet.add(e5);


        System.out.println(empSet.size());
        System.out.println(empSet);
        System.out.println(empSet.contains(e3));
        //System.out.println(empSet.contains(e4.hashCode()));



    }
}
