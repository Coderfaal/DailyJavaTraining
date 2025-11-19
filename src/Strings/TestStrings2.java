package Strings;

public class TestStrings2 {


    public static void main(String[] args) {
        String hour = "morning";
       /* switch (hour){
            case "morning":
                System.out.println("good morning");
                break;

            case "afternoon":
                System.out.println("good afternoon");
                break;
            case"evening" :
                System.out.println("good evening");
                break;
            case"night":
                System.out.println("good night");
                break;
            default:
                System.out.println("hola");
                break;

        } */ // swithch with strings
       /* String s= new String("hello fal");
        System.out.println(s);

        String s1= s.replace("hello","ola");
        String s2= new String("hello fal");
        System.out.println(s1);
        System.out.println("____________________________________________");
       boolean result2 =s==s2;
        System.out.println("result =="+result2);
       // System.out.println(s);;
        System.out.println("____________________________________________");

        //string literal
        String f = "faalcandoit";
        String f1="faalcandoit";
        boolean result=f==f1;

        System.out.println("result :"+result);
        System.out.println(f.length());
        System.out.println("____________________________________________");

        result =f.equals(f1);
        System.out.println("result() :"+result);

        String n = "welcome";
        String n1= new String("welcome").intern();
        String n2 = new String("welcome");
        result=n==n2;

        System.out.println(result);
        result=n.equals(n2);
        System.out.println(result);

        System.out.println("____________________________________________");

        String e = new String("hello world");
        System.out.println(e.hashCode());
        e=e.replace("hello","okla");
        System.out.println(e.hashCode());

        System.out.println("____________________________________________");

        */

     StringBuffer sb =new StringBuffer(new String ("hello"));
     String buf=new String(sb);

    }
}
