package searializationinjava;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableStudent {

    public static void main(String[] args) throws Exception {
        OfficeData officeData = new OfficeData("Gaurav","Pandey","123","3");

        FileOutputStream fos = new FileOutputStream("C:/Users/pandey.G/IdeaProjects/algods/serial.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(officeData);

    }
}
