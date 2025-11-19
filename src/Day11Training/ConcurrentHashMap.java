package Day11Training;

public class ConcurrentHashMap {

    public static void main(String[] args) {

        java.util.concurrent.ConcurrentHashMap<String,String>c = new java.util.concurrent.ConcurrentHashMap<>();
        c.putIfAbsent("one","Apple");
        c.putIfAbsent("two","Samsung");
        c.putIfAbsent("three","Blackberry");
        c.putIfAbsent("four","Nokia");
        c.putIfAbsent("five","Xiaomi");
        c.putIfAbsent("eon","MAC");
        System.out.println("________________________________________");
        System.out.println(c.size());
        System.out.println(c);
        System.out.println("________________________________________");
        c.replace("tyu","ijuio");
        System.out.println(c);
        c.replace("eon","MAC","MACINTOSH");
        System.out.println(c);

        System.out.println("________________________________________");
        c.replace("eon",null);
        System.out.println(c);
        c.getOrDefault("eon",null);
        System.out.println("________________________________________");
        System.out.println(c);
        //System.out.println(c.getOrDefault());



    }
}

