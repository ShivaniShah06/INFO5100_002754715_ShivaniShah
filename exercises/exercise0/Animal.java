import java.util.UUID;

public class Animal {
    //Instance Variables or Properties
    String name; //Dog, Cat, Cow, etc
    String type; //Herbivorous, Carnivorous or Omnivorous
    String numberoflegs;
    String color;
    String breed; //Normal or hybrid
    String couldpet; //Yes or No
    String friendly; //Yes or No
    String hasfangs; //Yes or No

    //Constructor
    public Animal(String Animalname){
        name = Animalname;
        System.out.println("Created instance: " +UUID.randomUUID().toString() + " of " +name + " for Animal class.");
    }

    //Methods
    void speak(){
        System.out.println("This is speak() method output for Animal class.");
    }
    void eat(){
        System.out.println("This is eat() method output for Animal class.");
    }
    void sleep(){
        System.out.println("This is sleep() method output for Animal class.");
    }
}
