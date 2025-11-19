package Threads;

public class TestThreads {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Now Main Thread is Runninggg....");

        MyThread t1=new MyThread("hello");
        MyThread t2 = new MyThread("faal");
        //t1.run();
        //t2.run();
       // t1.setDaemon(true);
        //t2.setDaemon(true);
        t1.start();
        t2.start();


//        for(int i=1;i<100;i++) {try{
//            Thread.sleep(500);}catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        }

            System.out.println("Now Main Thread is Ending....");



    }
}
