package Threads;

public class MyRunnable implements Runnable{
    //another way of writing threads
    @Override
    public void run() {
        for(int i=1;i<5;i++){
            System.out.println( Thread.currentThread().getName()+"--" +i);
            try{
                Thread.sleep(500);   // sleeps for 500 milliseconds

            }catch(InterruptedException e )
            {
                e.printStackTrace();
                System.out.println();
            }
        }

    }
}
