package Assignments;

public class Palindrom {

    public static void main(String[] args) {
        boolean p = new StringBuilder("MADAM").reverse().toString().equals("MADAM");
        System.out.println(p);
    }
}
