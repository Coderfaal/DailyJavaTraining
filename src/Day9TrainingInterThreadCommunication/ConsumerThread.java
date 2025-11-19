package Day9TrainingInterThreadCommunication;

public class ConsumerThread extends Thread{




        String name;
        Inventory inventory;

        public ConsumerThread(String name, Inventory inventory){

            super();
            this.name=name;
            this.inventory=inventory;


        }
        public void run(){

                inventory.consumer();

        }



}
