package Inheritance;

public class P
{
    int a=10;
     P() {
         System.out.println(this.a);
    }
    P(int a){
         this.a=a;
    }

    String method(int a, int b){
         return a+b+"P";
    }
    public String method2(){
        return "null";
    }
}
