import java.util.UUID;

public class Table {
    //Instance Variable or Properties
    int width;
    int height;
    int length;
    String material;
    String brand;
    String model;
    Boolean portable;
    String color;

    //Constructor
    public Table(String tableBrand){
        brand = tableBrand;
        System.out.println("Created an instance: " +UUID.randomUUID().toString() + " for `Table` class with " +brand + " brand.");
    }

    //Methods
    void provideComfort(){
        System.out.println("This is `provideComfort()` method output for `Table` class.");
    }

    void keepThingsOrganized(){
        System.out.println("This is `keepThingsOrganized()` method output for `Table` class.");
    }

    void provideStorage(){
        System.out.println("This is `provideStorage()` method output for `Table` class.");
    }
}
