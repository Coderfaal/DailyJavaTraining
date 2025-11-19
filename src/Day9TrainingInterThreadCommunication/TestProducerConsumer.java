package Day9TrainingInterThreadCommunication;

public class TestProducerConsumer {

    public static void main(String[] args) {
        Inventory i = new Inventory();

        ProducerThread p = new ProducerThread("Producer",i);
        ConsumerThread c = new ConsumerThread("Consumer", i);
        c.start();
        p.start();

       // System.out.println("items available :"+i.item);
    }
}
