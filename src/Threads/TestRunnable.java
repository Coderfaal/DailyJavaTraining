package Threads;

public class TestRunnable {

    public static void main(String[] args) {

        System.out.println("Starting Main Runnable class");
        MyRunnable mr = new MyRunnable();
        Thread thread = new Thread(mr,"hi");
        Thread thread1 = new Thread(mr,"fal");
        thread.start();
        thread1.start();

        System.out.println("Ending Main Runnable class");
    }
}
