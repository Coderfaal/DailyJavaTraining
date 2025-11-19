package Strings;

public class TestStrings{

    public static void main(String[] args) {


        String s= new String("ola bingo");

        System.out.println(s.length());
        System.out.println(s);


        String s1= new String(s);

        char[]chars ={'p','e','p','s','i'};

        String s2= new String(chars);
        System.out.println(s2);

        byte[]bytes= {11,12,13,14,15,16,24,36};

        String s3 = new String(bytes);
        System.out.println(s3);

        System.out.println("___________________________________________");

        String s4 = new String(bytes,2,3);
        System.out.println(s4);

        String s5= new String("$*jioisfplt$z%my#geo_&%^");
        String s6= new String (s5);


        System.out.println("___________________________________________");
        int post = s5.indexOf('#');
        System.out.println("position of this is : "+post);
        System.out.println("___________________________________________");

        //getting a particular letters for a string
        String newSub=s5.substring(2,5);
        System.out.println("extracted word is :"+newSub);

        System.out.println("___________________________________________");
       String newSub1=s5.substring(s5.indexOf('#'));
        System.out.println("index is at :"+newSub1);

        System.out.println("___________________________________________");
        String s7 = new String(" helloo          welcome         ");
        System.out.println(s7);
        //s7=s7.strip();
        s7=s7.trim();
        System.out.println("length is : "+s7.length());



        System.out.println("___________________________________________");
        //compare strings

        boolean result =s5==s6;
        System.out.println(result);
        System.out.println("___________________________________________");

        result = s5.equals(s6);
        System.out.println(result);

        System.out.println("___________________________________________");
        //index,substring,strip,empty,blank,compareTo,toLowerCase,to UpperCase
        //concat,startsWith, endsWith, split
        //replaceFirst,replaceAll

        String s8= new String();
        boolean r1=s8.isBlank();
        System.out.println("balnk :"+r1);

        r1=s8.isEmpty();
        System.out.println("empty :"+r1);
        System.out.println("___________________________________________");

        String st1= new String("MAPPLE");
        String st2= new String("APPLE");
        int value= st1.compareTo(st2);
        int v2= st2.compareTo(st1);
        System.out.println("compared value  :"+value);
        System.out.println("compared value  :"+v2);

        System.out.println("___________________________________________");

        String st3= new String("Are you sleeping brother john");
        String[]words =st3.split("");

        for(String t: words){
            System.out.println(t);
        }
        System.out.println("___________________________________________");
        char c=s5.charAt(s5.indexOf('_'));
        System.out.println("element is at :"+c);

        for(int i=0;i<s5.length();){
            char at=s5.charAt(i);
            System.out.println("char at "+i+ " is :"+ at);
            i++;
        }







    }

}
