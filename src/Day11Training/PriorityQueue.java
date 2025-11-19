package Day11Training;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueue {

    public static void main(String[] args) {

           // PriorityQueue pq = new PriorityQueue();

        PriorityBlockingQueue<Integer>pq= new PriorityBlockingQueue<>();
        pq.offer(Integer.valueOf(2));
        pq.offer(Integer.valueOf(4));
        pq.offer(Integer.valueOf(6));
        pq.offer(Integer.valueOf(8));
        pq.offer(Integer.valueOf(10));
        pq.offer(Integer.valueOf(3));
        pq.offer(Integer.valueOf(6));
        System.out.println(pq.size());
        System.out.println(pq);


        System.out.println("________________________________");
        for(int i=0;i<pq.size();i++){

           // System.out.println("peek value is  :"+pq.peek());
            System.out.println("poll value is  :"+pq.poll());
            System.out.println("current top node is :"+pq.element());
            System.out.println(pq);
        }


        System.out.println("_________________");

        Iterator<Integer> itpq= pq.iterator();
        while(itpq.hasNext()){

            System.out.println(itpq.next());

        }
        System.out.println("_________________");


        //Spliterator<Integer>spilt = pq.spliterator();

      //  while(spilt.h)--- continue in lambadas


    }
}
