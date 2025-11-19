package Threads;
//type
public class MyThread extends Thread{
String name;
MyThread(String name){
    this.name=name;
}
    public void run(){

        for(int i=0;i<10;i++){
          //  System.out.println("This Thread is Running....."+i);
       // System.out.println("This Thread is Running....."+Thread.currentThread().getName()+"......"+i);
            System.out.println("Thread is running :"+this.name + "..."+i);



        }}









}
