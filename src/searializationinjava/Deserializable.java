package searializationinjava;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializable {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("C:/Users/pandey.G/IdeaProjects/algods/serial.txt");
        ObjectInputStream is = new ObjectInputStream(fis);
        OfficeData officeData=(OfficeData)is.readObject();
        officeData.printData();
    }
}
