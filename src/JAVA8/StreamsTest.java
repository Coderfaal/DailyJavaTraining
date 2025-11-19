package JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsTest {
    public static void main(String[] args) {




        IntStream.of(10,40,70,80,50,30,99,13,7,20)
                .skip(3)
                .sorted()
                .filter((n)->(n%2==0))
                .map((n)-> (int)((Math.pow(n,3))))
                .forEach(System.out::println);

        System.out.println("______________________________________________________");

        List<String>list = Arrays.asList("Java","Python","DotNet","Ruby on rails","c","Go");

        Predicate<String>p= (s)->{return s.length()>5;};
        Function<String,String>f=(s)->{return s.toUpperCase();};
        Consumer<String>c= (s)->{System.out.println(s); };

        list.stream().filter(p).map(f).forEach(c);

        list.stream().filter(p).map(f);

        list.forEach(c);


        List<String>languages =list.stream().filter(p).map(f).toList();
        System.out.println(languages);
}}
