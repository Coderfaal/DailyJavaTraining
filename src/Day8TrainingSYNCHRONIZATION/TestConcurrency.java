package Day8TrainingSYNCHRONIZATION;

public class TestConcurrency {

    public static void main(String[] args) {
        System.out.println("-----Main Starting-----");

        SequenceId sid = new SequenceId();

        DBClient db = new DBClient("DB_FAL",sid);
        FileClient fc = new FileClient("FC_PEPSI",sid);

        db.start();
        fc.start();



        System.out.println("-------Exiting Main ------");
    }
}
