import java.util.UUID;

public class Backpack {
    //Instance Variables or Properties
    String color;
    int number_of_compartments;
    double cost;
    int capacity;
    String waterproof; //Yes or No
    String material;
    String brand;
    String waterresistant; //Yes or No
    
    //Constructor
    Backpack(String bagColor){
        color = bagColor;
        System.out.println("Created instance: " +UUID.randomUUID().toString() + " of `Backpack` class with " +bagColor + " color.");
        
    }
    //Methods
    void keepThingsSafe(){
        System.out.println("This is `keepThingsSafe()` method output for Backpack class.");
    }
    void keepThingsTogether(){
        System.out.println("This is `keepThingsTogether()` method output for Backpack class.");
    }
    void easyAccessToThings(){
        System.out.println("This is `easyAccessToThings()` method output for Backpack class.");
    }
}