import java.util.UUID;

public class Laptop {
    //Instance Variable or Properties
    String Processor;
    String model;
    String brand;
    int size;
    String touchscreen; //Yes or No
    String fingerprintsensor; //Yes or No
    int memory;
    String screenrotation; //Yes or No

    //Constructor
    public Laptop(String brand){
        System.out.println("Created instance: " +UUID.randomUUID().toString() + " of  " +brand + " for Laptop class.");
    }

    //Methods
    void playMusic(){
        System.out.println("This is playMusic() method output for Laptop class.");
    }
    void allowInternetAccess(){
        System.out.println("This is allowInterntAccess() method output for Laptop class.");
    }
    void controlScreenBrightness(){
        System.out.println("This is controlScreenBrightness() method output for Laptop class.");
    }
}
