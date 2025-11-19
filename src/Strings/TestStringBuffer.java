package Strings;

public class TestStringBuffer {

    public static void main(String[] args) {




        StringBuffer sb =new StringBuffer("welcome to jave");
        System.out.println("length :"+sb.length());
        System.out.println("capacity :"+sb.capacity());
        sb.append(" 2025 edition");
        System.out.println("length :"+sb.length());
        System.out.println("capacity :"+sb.capacity());

        sb.setLength(80);
        sb.insert(11,"25th ");
        System.out.println("length :"+sb.length());
        System.out.println("capacity :"+sb.capacity());
        sb.trimToSize();
        System.out.println(sb);



        StringBuffer sb1 = new StringBuffer("IAM  FAal");
        sb1.replace(sb1.indexOf("F"),sb1.length(),"faaal");
        System.out.println("replaced : "+sb1);

        StringBuffer sb2 = new StringBuffer("Tata Customer Services");
        sb2.replace(sb2.indexOf("C"),sb2.indexOf("S")-1,"Consultency");
        System.out.println(sb2);

        StringBuffer sb3 = new StringBuffer("yor are not *a wizard Harry");
        sb3.delete(sb3.indexOf("n"),sb3.indexOf("t")+1);
        System.out.println(sb3);

        System.out.println("_____________________________");

        sb3.deleteCharAt(sb3.indexOf("*"));
//        StringBuffer sbb3 = new StringBuffer("you are * a wizard harry");
//        sbb3.deleteCharAt(sb3.indexOf("*"));
        System.out.println(sb3);

        System.out.println("_____________________________");






        StringBuffer sb4 = new StringBuffer("tata");
        sb4.insert(sb4.append(" ").length(),new String("bye bye"));
        System.out.println(sb4);

        StringBuffer sb5 = new StringBuffer("same");
        StringBuffer sb6 = new StringBuffer("same");
        StringBuffer sb7 = new StringBuffer("same");
        boolean result = sb5==sb6;
        System.out.println(result);

        result = sb5.equals(sb6);
        System.out.println(result);

        result =sb5.toString().equals(sb6.toString());
        System.out.println(result);


        StringBuffer p1 = new StringBuffer("bingodingo@yahoo.com");
       // String text= p1.toString();
        String p2= p1.substring(16,19);
        //bingodingo@yahoo.com





    }




}
