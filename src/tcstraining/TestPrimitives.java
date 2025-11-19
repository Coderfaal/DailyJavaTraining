package tcstraining;

public class TestPrimitives {

    static void methodName(int a, int b){
        System.out.println(a+b);
    }
    static void methodName(int a, long b){
        System.out.println(a+b);
    }
    static void methodName(long a, int b){
        System.out.println(a/b);
    }
    static void methodName(long a, long b){
        System.out.println(a*b);
    }

    public static void main(String [] args){

        int x=10;// Integer obj= new Integer(10);
        long y=10;
        methodName(x,y);//primitives same or wider


//        Integer i=new Integer("10");//operations--> .,==...
//        x=i;
        int k=10;
        Integer z=k;
        System.out.println(z.MIN_VALUE);
        System.out.println(z.MAX_VALUE);
        System.out.println(z);




      byte b=10;
      final int i=10;
      //b= (byte) i;
        int j=b;//widening and its implicit


        //types and expressions

        byte c =10;
        //short s= b+c;    //conversion context
        //while evaluating number expression, all the operands are promoted to the widest type in the expression and the result will be in the widest type, so LHS should be of the widest type or wider
        //the expression is always evaluated minimum on int type or wider int+int
        char ch=85;
        char chw= '\u0041';
        char r= '%';
        System.out.println(ch);
        System.out.println(chw);
        System.out.println((int)r);

        String s ='%'+5+"TCS";
        System.out.println(s);

        String ss ="TCS"+'%'+5;
        System.out.println(ss);

    }
}
