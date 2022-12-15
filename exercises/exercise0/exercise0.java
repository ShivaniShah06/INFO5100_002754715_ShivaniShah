package exercises.exercise0;

public class Exercise0 {
    public static void main(String[] args) {

        System.out.println("===== Output for Class 1 =====\n");
        // Instantiate objects from `Backpack` class
        Backpack bag1 = new Backpack("Red");
        Backpack bag2 = new Backpack("Blue");
        Backpack bag3 = new Backpack("Black");
        // Calling methods from `Backpack` class
        bag1.keepThingsSafe();
        bag2.keepThingsTogether();
        bag3.easyAccessToThings();
        System.out.println("\n===== Output for Class 2 =====\n");
        // Instantiate objects from `Human` class
        Human human1 = new Human("Indian");
        Human human2 = new Human("American");
        Human human3 = new Human("Australian");
        // Calling methods from `Human` class
        human1.talk();
        human2.walk();
        human3.work();
        System.out.println("\n===== Output for Class 3 =====\n");
        // Instatiate objects from `Animal` class
        Animal animal1 = new Animal("Dog");
        Animal animal2 = new Animal("Lion");
        Animal animal3 = new Animal("Crocodile");
        // Calling methods from `Animal` class
        animal1.speak();
        animal2.eat();
        animal3.sleep();
        System.out.println("\n===== Output for Class 4 (contains 2 nested classes) =====\n");
        // Instantiate objects from `Laptop` class
        Laptop laptop1 = new Laptop("hp");
        Laptop laptop2 = new Laptop("Apple");
        Laptop laptop3 = new Laptop("Lenovo");
        // Calling methods from `Laptop` class
        laptop1.allowInternetAccess();
        laptop2.controlScreenBrightness();
        laptop3.playMusic();
        // Instantiate object from `Processor` subclass
        Laptop.Processor processor1 = laptop1.new Processor("i5");
        // Calling method for `Processor` subclass
        processor1.processing();
        // Instatiate object from `OperatingSystem` subclass
        Laptop.OperatingSystem operatingsystem1 = laptop1.new OperatingSystem("Windows");
        // Calling method from `OperatingSystem` subclass
        operatingsystem1.provideServices();
        System.out.println("\n===== Output for Class 5 =====\n");
        // Instantiate objects from `Fruit` class
        Fruit fruit1 = new Fruit("Orange");
        Fruit fruit2 = new Fruit("Mango");
        Fruit fruit3 = new Fruit("Banana");
        // Calling methods from `Fruit` class
        fruit1.grow();
        fruit2.benefitHealth();
        fruit3.ripe();
        System.out.println("\n===== Output for Class 6 =====\n");
        // Instantiate objects from `Table` class
        Table table1 = new Table("ikea");
        Table table2 = new Table("Amazon");
        Table table3 = new Table("Poliform");
        // Calling methods from `Table` class
        table1.provideComfort();
        table2.keepThingsOrganized();
        table3.provideStorage();
        System.out.println("\n===== Output for Class 7 =====\n");
        // Instantiate objects from `Clothes` class
        Clothes cloth1 = new Clothes("loose fit");
        Clothes cloth2 = new Clothes("medimum fit");
        Clothes cloth3 = new Clothes("skinny fit");
        // Calling methods from `Clothes` class
        cloth1.coversBody();
        cloth2.provideWarmth();
        cloth3.reflectsFashion();
        System.out.println("\n===== Output for Class 8 =====\n");
        // Instantiate objects from `Television` class
        Television television1 = new Television("Roku");
        Television television2 = new Television("Sony");
        Television television3 = new Television("Samsung");
        // Calling methods from `Television` class
        television1.provideEntertainment();
        television2.supportGames();
        television3.showNews();
        System.out.println("\n===== Output for Class 9 =====\n");
        // Instantiate objects from `Bottle` class
        Bottle bottle1 = new Bottle("Black");
        Bottle bottle2 = new Bottle("Blue");
        Bottle bottle3 = new Bottle("Grey");
        // Calling methods from `Bottle` class
        bottle1.carryWater();
        bottle2.provideEasyLiquidTransport();
        bottle3.keepHydrated();
        System.out.println("\n===== Output for Class 10 =====\n");
        // Instantiate objects from `Sofa` class
        Sofa sofa1 = new Sofa(449);
        Sofa sofa2 = new Sofa(680);
        Sofa sofa3 = new Sofa(1000);
        // Calling methods from `Sofa` class
        sofa1.letsUsRest();
        sofa2.letsUsSleep();
        sofa3.provideComfort();

    }

}