package Searlization;

import java.io.*;

public class SerializationTest {


    public static void main(String[] args) throws IOException {


        Account a1 = new Account(101,5000,"Harry Potter");
        Account a2 = new Account(102,10000,"Draco Malfoy");


        FileOutputStream fos = new FileOutputStream("my.data");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);


        oos.close();
        fos.close();

//what is serialization where is it used how do we use it what is deserialization waht about static variablke and transend variable of the class
    }

}
