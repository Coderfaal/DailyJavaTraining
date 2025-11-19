package Streams;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) throws IOException {

        System.out.println("____________INTEGER STREAM_____________________");
        IntStream
                .range(1,10)
                .forEach(System.out::print);  //terminal operation

        System.out.println("____________INTEGER STREAM WITH SKIP_____________________");
        Consumer<Integer> consumer = x-> System.out.println(x);
        IntStream
                .range(1,10)
                .skip(2)
                .forEach(a -> consumer.accept(a));  //terminal operation


        System.out.println("____________INTEGER STREAM WITH SUM____________________________");

        System.out.println(IntStream.range(1,15).sum());
        Integer sum = IntStream.range(1,10).sum();
        System.out.println(sum);

        System.out.println("______STREAM OF <SORTED AND FINDFIRST__________");

        Stream.of("ava","amy","anistone","ammu","alex","arron")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);


        System.out.println("______STREAM OF SORTED AND FINDFIRST__________");

        Stream.of("ava","amy","anistone","ammu","alex","arron")
                .sorted()
                .findAny()
                .ifPresent(System.out::println);



        System.out.println("_________________________________");
        Stream.of(10,20,40,50,70,80,40,90).sorted()
                        .findFirst().ifPresent(System.out::println);


        System.out.println("_________________________________");
        Stream.of(10,20,40,50,70,80,40,90)
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("____________average of squares of an int array_____________________");

        //can start a stream from anything
        Arrays.stream(new int[]{2,4,6,8,10,12,14,16,18,20})
                        .map(x-> x*x) //function
                                .average()
                                        .ifPresent(System.out::println);


        System.out.println("_____Stream List ,filter and print____________________");

        List<String> people = Arrays.asList("Alex","Benny","Anna Kat","Taylor","Oliver","Katie","jake","amy","Greg");

        people.stream()
                .map(String::toLowerCase)
                    .filter(q-> q.startsWith("a"))
                        .forEach(System.out::println);

        System.out.println("__________________");
        List<String> aNames = people
        .stream()
                .map(String ::toLowerCase)
                    .filter(q-> q.startsWith("a"))
                        .collect(Collectors.toList());
        System.out.println(aNames);


        System.out.println("_________with files__________________");


Stream<String>bands =Files.lines(Paths.get("/home/labuser/IdeaProjects/NEWWORLD/src/bands.txt"));


bands   .sorted()
        .filter(z-> z.length()>13)
        .forEach(System.out::println);
bands.close();

        System.out.println("_________with files with list __________________"); // here we are storing the data into
        // list and then performing the streams operations

        List<String> bands2 =  Files.lines
                (Paths.get("/home/labuser/IdeaProjects/NEWWORLD/src/bands.txt"))
        .filter(x-> x.contains("jit")).collect(Collectors.toList());

        bands2.forEach(x->System.out.println(x));

        System.out.println("__________CSV File______________");
        Stream<String> rows1 = Files.lines(Paths.get("/home/labuser/IdeaProjects/NEWWORLD/src/data.txt"));
        int rowCount = (int) rows1
                .map(z-> z.split(","))
                .filter(z-> z.length==3)
                .count();

        System.out.println(rowCount+ "rows");
        rows1.close();


        System.out.println("_______parse data from rows_____________________________________");

        Stream<String> rows2 = Files.lines(Paths.get("/home/labuser/IdeaProjects/NEWWORLD/src/data.txt"));
        rows2
                .map(z-> z.split(","))
                .filter(z-> z.length==3)
                .filter(z->Integer.parseInt(z[1])>15)
              //  .filter(z-> Boolean.parseBoolean(String.valueOf(z[0]))) // try this later
                .forEach(z-> System.out.println(z[0]+ "  "+z[1]+ " "+z[2]));
        rows2.close();

//store fields in hashmap
        Stream<String> rows3 = Files.lines(Paths.get("/home/labuser/IdeaProjects/NEWWORLD/src/data.txt"));
        Map<String ,Integer> map1 = new HashMap<>();
        map1= rows3
                .map(z-> z.split(","))
                .filter(z-> z.length==3)
                .filter(z->Integer.parseInt(z[1])>15).collect(Collectors.toMap(
                        z->z[0], z->Integer.parseInt(z[1])));
        rows3.close();
        for(String key : map1.keySet())
        System.out.println(key  +" "+ map1.keySet());



        //Reduction - sum

        double total = Stream.of(7.4,1.5,3.7,9.9)
               .reduce(0.0 ,(Double a, Double b)-> a+b)
                ;
        System.out.println("total = "+total);


        System.out.println("_________summary Statics__________" );
        IntSummaryStatistics summary = IntStream.of(7,8,44,55,87,90).summaryStatistics();
        System.out.println(summary);













    }
}
