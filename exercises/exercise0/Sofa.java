package exercises.exercise0;

import java.util.UUID;

public class Sofa {
    // Instance Variables or Properties
    String coverMaterial;
    Boolean Recliner;
    double size;
    Boolean glassCompartment;
    Boolean cushionFilling;
    String frameMaterial;
    String color;
    double cost;

    // Constructor
    public Sofa(double sofaCost) {
        cost = sofaCost;
        System.out.println(
                "Created an instance: " + UUID.randomUUID().toString() + " of `Sofa` class which costs $" + cost + ".");
    }

    // Methods
    void letsUsRest() {
        System.out.println("This is `letsUsRest()` method output of `Sofa` class.");
    }

    void letsUsSleep() {
        System.out.println("This is `letsUsSleep()` method output of `Sofa` class.");
    }

    void provideComfort() {
        System.out.println("This is `provideComfort()` method output of `Sofa` class.");
    }
}
