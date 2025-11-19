package Threads;

public class TestThreads2 {

    public static void main(String[] args) {

        System.out.println("Statred main thread");
        System.out.println(Thread.currentThread().getPriority());

        MyThread n1 = new MyThread("Good Morning");
        MyThread n2= new MyThread("Good Evening");
        MyThread n3 = new MyThread ("Good Afternoon");

        System.out.println("Priority is :"+n1.getPriority());
        System.out.println("Priority is :"+n2.getPriority());
        System.out.println("Priority is :"+n3.getPriority());

        n1.setPriority(Thread.MAX_PRIORITY);
        n2.setPriority(Thread.NORM_PRIORITY);
        n3.setPriority(Thread.MIN_PRIORITY);

//        System.out.println("Priority is :"+ n1.getPriority());
//        System.out.println( "Priority is :"+n2.getPriority());
//        System.out.println( "Priority is :"+n3.getPriority());

        n1.start();
        n2.start();
        n3.start();

        System.out.println("Exiting main thread......");
    }

}
