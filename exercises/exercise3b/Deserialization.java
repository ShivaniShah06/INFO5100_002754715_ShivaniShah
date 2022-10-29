package exercises.exercise3b;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static Object deserialize(String fileName) throws IOException,
                    ClassNotFoundException {
                        FileInputStream fis = new FileInputStream(fileName);
                        ObjectInputStream ois = new ObjectInputStream(fis);
                        Object obj = ois.readObject();
                        ois.close();
                        return obj;
                    }
}
