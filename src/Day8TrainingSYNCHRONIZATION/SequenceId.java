package Day8TrainingSYNCHRONIZATION;
//shared resource
public class SequenceId {

    private int serialId;

    private SequenceId sid;

    public void increment(){
        synchronized (this){
        serialId++;}
        //System.out.println(this.serialId);
    }

    public int getSerialId() {
        return serialId;
    }
}
