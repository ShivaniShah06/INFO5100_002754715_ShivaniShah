package exercises.exercise3b;
import java.io.*;

public class Serialization {
    //Serialize the given object and save it to a file
    public static void Serialize(Object obj, String fileName)
                    throws IOException{
                        FileOutputStream fos = new FileOutputStream(fileName);
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(obj);
                        fos.close();
                    }
}
