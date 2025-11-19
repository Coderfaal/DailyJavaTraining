package COLLECTIONS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class TestMapsEmployee {



        public static void main(String[] args) {
            HashMap<Integer, Employee> empMap = new HashMap<>();

            Employee e1 = new Employee(301, "Ron W", 75000);
            Employee e2 = new Employee(202, "Harry", 50000);
            Employee e3 = new Employee(101, "Draco Malfoy", 85000);
            Employee e4 = new Employee(101, "Draco Malfoy", 85000);

            empMap.put(e2.getEmpNumber(), e2);//== for an object of employee unique or not
            empMap.put(e4.getEmpNumber(), e4);
            empMap.put(e1.getEmpNumber(), e1);
            empMap.put(e3.getEmpNumber(), e3);


            String sql = "select * from empMap where name=Harry";
            String sql2 = "select * from empMap where empNumber =202";
            String sql3 = "select empSalary  from empMap where empNumber= 301";

            String[] query = sql2.split("=");
            System.out.println(empMap.get(Integer.parseInt(query[1])));
          //  String[] query1 = sql.split("=");
          //  System.out.println(empMap.get(""));

            System.out.println("____________select empSalary  from empMap where empNumber= 301______________________");

            if (empMap.containsKey(301)) {
                System.out.println("empSalary is :" + empMap.get(301));
            } else {
                System.out.println("not found");
            }

            System.out.println("__________________________________");


            String searchName = "Harry";
            System.out.println("__________________________________");
            for (Employee e : empMap.values()) {
                if (e.getEmpName() == searchName) {
                    System.out.println("found : " + e.getEmpName());
                    System.out.println("__________________________________");
                } else {
                    System.out.println("not found");
                }}
                //  System.out.println(empMap.size());
                //  System.out.println(empMap);


            }


        }
