package Threads;

public class TestThread4Yielding {


        public static void main(String[] args) {

            System.out.println("Statred main thread");
            System.out.println("PRIORTY IS SET TO : "+Thread.currentThread().getPriority());

            MyThread y1 = new MyThread(" Y");
            y1.start();
           // y1.yield();
             Thread.yield();

            for(int i= 101;i<=105;i++){
                System.out.println(Thread.currentThread().getName()+ " --- "+i);
            }

            System.out.println("Exiting main thread......");
        }

    }



