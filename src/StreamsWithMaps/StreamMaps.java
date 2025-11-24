package StreamsWithMaps;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class StreamMaps {

    public static void main(String[] args) {
        //using Collectors.toMap(keyMapper,valueMapper,mergeFunction)
        Stream<String> nameStream = Stream.of("Anna-Kat","Taylor","Katie","Oliver","Greg","Harry","Draco");

        Map<String,Integer> map= nameStream
                .collect(Collectors.toMap(Function.identity(),
                String::length,
                        (key1,key2)->key1));
        System.out.println(map);
        System.out.println("______________________________________-");
//to hashMap
        HashMap<String,Integer> hashMap= new HashMap<>(map); ////passing map to hashMap constructor so it becomes hashMap
        System.out.println(hashMap);
        nameStream.close();
        System.out.println("______________________________________-");
// using collerctors.toMap(keyMapper,valueMapper,mergeFunction, supplier)

        Stream<String> nameStream1 = Stream.of("Anna-Kat","Taylor","Katie","Oliver","Greg","Harry","Draco");

       HashMap <String,Integer> hashMap2= nameStream1
                .collect(Collectors.toMap(Function.identity(),
                        String::length,
                        (key1,key2)->key1 ,HashMap::new)); //supply the instance of map
        System.out.println(hashMap2);
        System.out.println("____________________________________");



// Creating map from two arrays.
        String [] keys = {"one","two","four"};
        Integer[] values ={1,2,3};
//should make sure that both string and integer should be of same length..
        Map<String,Integer> maps = IntStream.range(0, keys.length)
                .boxed()
                .collect(Collectors.toMap(i->keys[i],i->values[i]));
        System.out.println(maps);

        System.out.println("____________________________________");

        //creating map from user defined objects

        List<User> u = Arrays.asList(new User("Joey",25),new User("Alex",30),new User("Draco",28));
        Map<String,Integer> userMaps= u.stream()
              //  .collect(Collectors.toMap(Function.identity(),String::length),(key1,key2) -> key1 );
                .collect(Collectors.toMap(User::getName,User::getAge));
        System.out.println(userMaps);
        System.out.println("____________________________________");

        HashMap<String,Integer> userMap2= u.stream()
        .collect(Collectors.toMap(User::getName,User::getAge,(key1,key2)->key1,HashMap::new));
        System.out.println(userMap2);
        System.out.println("____________________________________");
//employee object and map

        List<Employee> employee = Arrays.asList(
                new Employee("Sundar","HR","M"),
                new Employee("Satya","Dev","M"),
                new Employee("Shantanu","HR","M"),
                new Employee("Vasanth","Dev","M"),
                new Employee("Nikesh","Dev","M"),
                new Employee("Indira Nooyi","Dev","F"),
                new Employee("Kiran Majoomdar","HR","F")
        );

        Map<String,List<Employee>> empList = employee.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(empList);
        System.out.println("____________________________________");

        Map<String, List<Employee>> empList2 = employee.stream().collect(Collectors.groupingBy(Employee::gender));
        System.out.println(empList2);
        System.out.println("____________________________________");
//TreeMaps

        List<User> u2 = Arrays.asList(
                new User("Anna",20),
                new User("Bingo",30),
                new User("Alex",25),
                new User("Lightning Mcqueen",30)
        );

        TreeMap<String,Integer> tree = u2.stream()
                .collect(Collectors.toMap(User::getName,User::getAge,
                        (oldValue,newValue)->oldValue,TreeMap::new));
        System.out.println(tree);





    }
}
class User{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
};
record  Employee(String name, String dept ,String gender){
    public String getDept(){
        return this.dept;
    }
};