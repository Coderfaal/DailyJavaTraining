package Inheritance;

public class A {
private int a=1;//DRY
    A(){
        System.out.println("from A()");
    }

    public A(int a){
        super();
        this.a=a;
    }
    public int getA(){
        return this.a;
    }
    public int setA(){
        return this.a;
    }


    void calculate(int n){

        for(int i =1;i<=n;i++){
            a=a+a;
        }
        System.out.println(a);
    }
}
