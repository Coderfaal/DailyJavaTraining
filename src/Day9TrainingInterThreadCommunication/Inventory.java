package Day9TrainingInterThreadCommunication;

public class Inventory {
    private int stock[]= new int[5];

    int item=0;
  synchronized   public void produce(){
      System.out.println("FROM PRODUCER : "+Thread.currentThread().isAlive());

      if(item==0){
          for(int i =0;i<stock.length;i++){

        stock[i]=item+1;
        System.out.println(item+1  +" : produced-- ");
        item++;
          }
          notifyAll();
      }

          try {
              wait();
          } catch (InterruptedException e) {
               e.printStackTrace();
          }
      }

    synchronized public void consumer(){
        System.out.println("FROM CONSUMER : "+Thread.currentThread().isAlive());
      if(item!=0){
          System.out.println("FROM CONSUMER");
          for(int i=0;i<stock.length;i++){
              System.out.println(stock[i]+ ": Consumed--");
              item--;
          }
          notifyAll();
      }
          try {
              wait();
          } catch (InterruptedException e) {
             e.printStackTrace();
          }
      }






    }


