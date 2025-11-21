package Searlization;

import java.io.*;

public class DeserializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {




        FileInputStream fis = new FileInputStream("my.data");// here pass the file name
        ObjectInputStream ois = new ObjectInputStream(fis);
       Account ref =(Account) ois.readObject();
        System.out.println(ref.getBalance());

        ois.close();
        fis.close();
    }

    // make sure you dont change anything in the serialization before running deserializarion
}
