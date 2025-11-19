package Day3Training;

public class Demo2 {

    private int id;
//    int a=b;// forward refernce
//     static b=20;

    public Demo2(int id) {
        this.id = id;

        final int total ;
        id=101;
        System.out.println(id);
        System.out.println(total=300);


        final Object ref= new Object(); /// final reference cannot be dereference
        //ref=new String();
    }
    final void method(final int x){

    }
}
