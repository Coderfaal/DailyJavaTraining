package JAVA8;

import java.util.ArrayList;
import java.util.Arrays;
interface UnKnown{
    public void m();
}
class Other{
    public void x(){
        System.out.println("from x");
    }
    static public void y(){
        System.out.println("from static method");

    }
}

public class MethodReferencesTest
{

    public static void main(String[] args) {


        Other o = new Other();
        UnKnown uk = o::x;
        uk.m();
        uk=Other::y;
        uk.m();



        ArrayList<String> list=new ArrayList<>();
        list.addAll(Arrays.asList("java","python","go","c++","ruby on rails","c"));

        list.forEach(System.out::println);

    }
}
