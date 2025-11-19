package Day8TrainingSYNCHRONIZATION;

public class FileClient extends Thread {

    private String name;
     private SequenceId sId;
    public FileClient(String name ,SequenceId sId) {
        this.name = name;
        this.sId= sId;
    }

   public void run() {
       for (int i = 1; i < 5; i++) {
           System.out.println(this.name+" : IS RUNNINGGG");
           try {
               sId.increment();
               System.out.println(sId.getSerialId());
               sleep(5000);
           } catch (InterruptedException e) {
               System.err.println(e.getMessage());
               e.printStackTrace();
           }
       }

   }
}
