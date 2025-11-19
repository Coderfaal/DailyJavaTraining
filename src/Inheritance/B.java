package Inheritance;

public class B extends A{
int x;
B(){
    System.out.println("from B");
}
public B (int x){
    super();
    this.x=x;
    System.out.println(getA()+x);
}
public B(int a,int x){
    super(a);
    this.x=x;
    System.out.println(getA()+x);
}

    void calculate(int n){
        int a= getA();
        for(int i =1;i<=n;i++){
            a=a/a;
        }
       super.calculate(n);  //statck overflow if not used super
        System.out.println(n);
        System.out.println(a);
}}
