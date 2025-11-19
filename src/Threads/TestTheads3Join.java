package Threads;

public class TestTheads3Join {


    public static void main(String[] args) {

        System.out.println("Statred main thread");
        System.out.println("PRIORTY IS SET TO : "+Thread.currentThread().getPriority());

        MyThread e1 = new MyThread("Sunny Day");
        e1.start();
        try {
            e1.join(); //main is calling join on e1
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }

        MyThread e2 = new MyThread("Rainy Day");
        e2.start();
        try {
            e2.join(); //main is calling join on e2
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
        for(int i= 101;i<=105;i++){
           System.out.println(Thread.currentThread().getName()+ " --- "+i);
       }

        System.out.println("Exiting main thread......");
    }

}
