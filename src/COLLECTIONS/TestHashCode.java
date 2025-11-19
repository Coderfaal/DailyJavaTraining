package COLLECTIONS;

public class TestHashCode {
    public static void main(String[] args) {


        String s1="falguni";
        String s2 ="inuglaf";

        boolean r= s1.equals(s2);
        System.out.println(r);

        r= s1.hashCode()==s2.hashCode();
        System.out.println(r);

        byte b1[]=s1.getBytes();
                int h1=1;
                for (byte b :b1) {
                    h1 *= b*32;
                }


        byte b2[]=s2.getBytes();
        int h2=1;
        for (byte bb :b2) {
            h2 *= bb*32;
        }
            r=h1==h2;
        System.out.println(r +" :h1==h2");

    }
}
