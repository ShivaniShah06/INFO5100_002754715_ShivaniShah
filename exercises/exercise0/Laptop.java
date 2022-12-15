package exercises.exercise0;

import java.util.UUID;

public class Laptop {
    // Instance Variable or Properties
    String Processor;
    String model;
    String brand;
    int size;
    Boolean touchscreen; // Yes or No
    Boolean fingerprintsensor; // Yes or No
    int memory;
    Boolean screenrotation; // Yes or No

    // nested class
    class Processor {
        // nested class instance variable or propery
        String core;

        // nested class constructor
        public Processor(String processorCore) {
            core = processorCore;
            System.out.println("Created nested class instance: " + UUID.randomUUID().toString() + "of" + core
                    + " for `Processor` subclass of the `Laptop` class.");
        }

        // nested class method
        void processing() {
            System.out.println("This is `processing()` method output for `processing` subclass of the `Laptop` class.");
        }
    }

    // nested class
    class OperatingSystem {
        // nested class instance variable or property
        String OS;

        // nested class constructor
        public OperatingSystem(String operatingOS) {
            OS = operatingOS;
            System.out.println("Created nested class instance: " + UUID.randomUUID().toString() + "of" + OS
                    + " for `OperatingSystem` subclass of the `Laptop` class.");
        }

        // nested class method
        void provideServices() {
            System.out.println(
                    "This is `provideServices()` method output for `OperatingSystem` subclass of the `Laptop` class.");
        }
    }

    // Constructor
    public Laptop(String laptopBrand) {
        brand = laptopBrand;
        System.out.println(
                "Created instance: " + UUID.randomUUID().toString() + " of  " + brand + " for `Laptop` class.");
    }

    // Methods
    void playMusic() {
        System.out.println("This is `playMusic()` method output for Laptop class.");
    }

    void allowInternetAccess() {
        System.out.println("This is `allowInterntAccess()` method output for Laptop class.");
    }

    void controlScreenBrightness() {
        System.out.println("This is `controlScreenBrightness()` method output for Laptop class.");
    }
}