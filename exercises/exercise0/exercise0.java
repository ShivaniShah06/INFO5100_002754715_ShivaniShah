public class exercise0{

    public static void main(String[] args){

        //Instantiate objects from `Backpack` class
        Backpack bag1 = new Backpack("Red");
        Backpack bag2 = new Backpack("Blue");
        Backpack bag3 = new Backpack("Black");
        //Calling methods from `Backpack` class
        bag1.keepThingsSafe();
        bag2.keepThingsTogether();
        bag3.easyAccessToThings();
        //Instantiate objects from `human` class
        Human human1 = new Human("Indian");
        Human human2 = new Human("American");
        Human human3 = new Human("Australian");
        //Calling methods from `human` class
        human1.talk();
        human2.walk();
        human3.work();
        //Instatiate objects from `Animal` class
        Animal animal1 = new Animal("Dog");
        Animal animal2 = new Animal("Lion");
        Animal animal3 = new Animal("Crocodile");
        //Calling methods for `Animal` class
        animal1.speak();
        animal2.eat();
        animal3.sleep();
        //Instantiate objects from `Laptop` class
        Laptop laptop1 = new Laptop("hp");
        Laptop laptop2 = new Laptop("Apple");
        Laptop laptop3 = new Laptop("Lenovo");
        //Calling methods for `Laptop` class
        laptop1.allowInternetAccess();
        laptop2.controlScreenBrightness();
        laptop3.playMusic();
        //Instantiate objects from `Fruit` class
        Fruit fruit1 = new Fruit("Orange");
        Fruit fruit2 = new Fruit("Mango");
        Fruit fruit3 = new Fruit("Banana");
        //Calling methods from `Fruit` class
        fruit1.grow();
        fruit1.benefitHealth();
        fruit3.ripe();
    }
}