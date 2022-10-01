import java.util.UUID;

public class Television {
    //Instance Variables or Properties
    String brand;
    String resolution;
    int screenWidth;
    Boolean touchscreen;
    Boolean smartTv;
    String panel; //LCD, OLED, LED
    int cost;
    String hdr;

    //Constructor
    public Television(String televisionBrand){
        brand = televisionBrand;
        System.out.println("Created an instance: " +UUID.randomUUID().toString() + " of " +brand+ " brand of `Television` class.");
    }

    //Methods
    void provideEntertainment(){
        System.out.println("This is `provideEntertainment()` method output for `Television` class.");
    }

    void showNews(){
        System.out.println("This is `showNews()` method output for `Television` class.");
    }

    void supportGames(){
        System.out.println("This is `supportGames()` method output for `Television` class.");
    }
}
