package exercises.exercise0;

import java.util.UUID;

public class Clothes {
    // Instance Variables or Properties
    String material;
    String type; // jeans, top, skirt, onepiece, shirt, tshirt, pant, traditional
    int size; // M, S, L, XL, XXL
    int length;
    String fit; // loose fit, tight fit, medium fit
    String category; // male, female, children, toddler
    String brand;
    double price;

    // Constructor
    public Clothes(String clothFit) {
        fit = clothFit;
        System.out.println(
                "Created an instance: " + UUID.randomUUID().toString() + " with " + fit + " of `Clothes` class.");
    }

    // Methods
    void coversBody() {
        System.out.println("This is `coversBody()` method output for `Clothes` class.");
    }

    void provideWarmth() {
        System.out.println("This is `provideWarmth()` method output for `Clothes` class.");
    }

    void reflectsFashion() {
        System.out.println("This is `reflectFashion()` method output for `Clothes` class.");
    }
}
