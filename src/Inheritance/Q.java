package Inheritance;

public class Q extends P{

    int a=20;
     Q() {
        System.out.println(super.a +this.a);
    }
Q(int a,int b){
        // super(a);
        // this.a=a;
        // this.a=b;
    this();

    System.out.println(super.a+this.a);
}
@Override
 public String method(int d,int e ){
         return d+e+"Q";
}


}
