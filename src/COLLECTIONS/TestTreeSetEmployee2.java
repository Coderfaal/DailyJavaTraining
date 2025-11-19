package COLLECTIONS;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetEmployee2 {

    public static void main(String[] args) {


        TreeSet<String> ts = new TreeSet<>();
        ts.add("Hello");
        ts.add("Fal");
        ts.add("Zello");
        ts.add("kello");
        System.out.println(ts);

        Employee e1 = new Employee(21,"Fal",75000);
        Employee e2 = new Employee(22,"Harry",50000);
        Employee e3 = new Employee(10,"Draco",85000);
        Employee e4 = new Employee(10,"Draco",85000);

        TreeSet<Employee> empTreeSet = new TreeSet<>();
         empTreeSet.add(e4);
        empTreeSet.add(e3);
        empTreeSet.add(e2);
        empTreeSet.add(e1);

        System.out.println(empTreeSet.size());


        System.out.println("_________________________________");
        System.out.println(empTreeSet);
        System.out.println("____________Celing()_____________________");

        System.out.println(empTreeSet.ceiling(e2));

        System.out.println("__________________Descending method()___________________________");
        Set<Employee> descendingSet = empTreeSet.descendingSet();
        System.out.println(descendingSet);




        System.out.println("_____________ITERATOR____________________");
        Iterator<Employee> i = empTreeSet.descendingIterator();
        while (i.hasNext()){
            Employee employee = i.next();
            System.out.println(employee);
        }



        System.out.println("______________Using Comparator___________________");
        TreeSet<Employee>employeeTreeSt2 = new TreeSet<>(new EmployeeComparator());
        employeeTreeSt2.add(e2);
        employeeTreeSt2.add(e1);
        employeeTreeSt2.add(e3);

        System.out.println(employeeTreeSt2);



    }
}
