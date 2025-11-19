package Day9TrainingInterThreadCommunication;

public class ProducerThread extends Thread{

    String name;
    Inventory inventory;

    public ProducerThread(String name, Inventory inventory){

        super();
        this.name=name;
        this.inventory=inventory;


    }
    public void run(){

            inventory.produce();

    }

}
