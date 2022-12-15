package exercises.exercise0;

import java.util.UUID;

public class Bottle {
    // Instance Variables or Properties
    int capacity;
    String color;
    String material;
    Boolean thermos;
    String brand;
    Boolean scratchResistant;
    String shape;
    Boolean filter;

    // Constructor
    public Bottle(String bottleColor) {
        color = bottleColor;
        System.out.println("Created an instance: " + UUID.randomUUID().toString() + " with " + color
                + " color of `Bottle` class.");
    }

    // Methods
    void carryWater() {
        System.out.println("This is `carryWater()` method output for `Bottle` class");
    }

    void keepHydrated() {
        System.out.println("This is `keepHydrated()` method output for `Bottle` class.");
    }

    void provideEasyLiquidTransport() {
        System.out.println("This is `provideEasyLiquidTransport()` method output for `Bottle` class.");
    }
}
