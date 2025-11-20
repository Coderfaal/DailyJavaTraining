package JAVA8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


class Employee{
    int empNumber;
    double empSalary;
    int age;

    public Employee(int empNumber, double empSalary ,int age) {
        this.empNumber = empNumber;
        this.empSalary = empSalary;
        this.age= age;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", empSalary=" + empSalary +
                ", age ="+age+
                '}';
    }
}
public class ComparatorTest {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(23,4,56,78,9,87,54,2,6,51);

        list.stream()
                .sorted(Comparator.comparingInt(z-> z))
                    .forEach(System.out::println);

        System.out.println("_____________________________________________________");
    List<Employee> empList = Arrays.asList(
                    new Employee(101,10000,23),
                    new Employee(102,20000,30),
                     new Employee(103,2500,35),
                     new Employee(104,12000,30),
                    new Employee(108,3000,25));
    empList.stream()
            .sorted(Comparator.comparingDouble(Employee::getEmpSalary))
                .forEach(System.out::println);
        System.out.println("_________________?");

    List<Employee>empSortedList =empList.stream()
            .sorted(Comparator.comparingInt(Employee::getAge)
                    .thenComparing(Employee::getEmpSalary))
                    .toList();

        System.out.println("_________________?");
    empSortedList.stream()
            .sorted(Comparator.comparingInt(Employee::getAge).reversed())
            .forEach(System.out::println);

           // .forEach(System.out::println);
        System.out.println("____________________________________________");
       Optional<Employee> opt= empSortedList.stream()
                .sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .findFirst();
        System.out.println(opt.get().getAge());
        System.out.println("____________________________________________");
        Optional<Employee> optMin= empSortedList.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .findFirst();
        System.out.println(optMin.get().getAge());




        System.out.println("____________________________________________");

    List<String> flowers = Arrays.asList("sunflower","rose","lily","jasmine");
    flowers.stream()
            .sorted()
            .forEach(System.out::println);
    }
}
