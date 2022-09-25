import java.util.UUID;

public class Fruit {
    //Instance Variables or Properties
    String shape;
    String taste;
    float weight;
    String color;
    String countryoforigin;
    String suitableseason;
    int cost;
    String name;

    //Constructor
    public Fruit(String name){
        System.out.println("Created instance: " +UUID.randomUUID().toString() + " of " +name + " fruit for Fruit class.");
    }
    
    //Methods
    void grow(){
        System.out.println("This is grow() method output for Fruit class.");
    }
    void benefitHealth(){
        System.out.println("This is benefitHealth() method output for Fruit class.");
    }
    void ripe(){
        System.out.println("This is ripe() method output for Fruit class.");
    }
}
