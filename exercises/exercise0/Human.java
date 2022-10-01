import java.util.UUID;

public class Human {
    //Instance Variables or Properties
    String eyecolor;
    float height;
    float weight;
    String gender;
    int age;
    String haircolor;
    String nationality;
    Boolean birthmark; //Yes or No

    //Constructor
    public Human(String humanNationality){
        nationality = humanNationality;
        System.out.println("Created an instance: " +UUID.randomUUID().toString() + " for `Human` class with " +nationality + " nationality.");
    }

    //Methods
    void talk(){
        System.out.println("This is `talk()` method output for `Human` class.");
    }
    void walk(){
        System.out.println("This is `walk()` method output for `Human` class.");
    }
    void work(){
        System.out.println("This is `work()` method output for `Human` class.");
    }
}
