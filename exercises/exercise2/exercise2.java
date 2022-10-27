package exercises.exercise2;

public class exercise2 {

    public static void main(String[] args){

        //Instantiate object of class Rectangle
        Rectangle rectangle = new Rectangle(5.0,6.0);
        System.out.println("----- Output for Rectangle -----\n");
        System.out.println(Shape.getShape()); //Accessing value of static field shape
        rectangle.calculateArea(); //Accessing class-implemented inherited abstract method
        rectangle.calculatePerimeter(); //Using the inherited method from Shapes class - Not overriding
        
        
        //Instantiate object of class Circle using Polymorphism concept
        Shape circle = new Circle(8.0);
        System.out.println("\n----- Output for Circle -----\n");
        System.out.println(Shape.getShape()); //Accessing value of static field shape
        circle.calculateArea(); //Accessing class-implemented inherited abstract method
        circle.calculatePerimeter(); //Accessing overriden method

        //Instantiate object of class Square
        Square square = new Square(7.5);
        System.out.println("\n----- Output for Square -----\n");
        System.out.println(Shape.getShape()); //Accessing value of static field shape
        square.calculateArea(); //Accessing class-implemented inherited abstract method
        square.calculatePerimeter(); //Accessing overriden method

        //Instantiate object of class Triangle
        Triangle triangle = new Triangle(10.0, 14.0, 12.0, 5.0, 4.0);
        System.out.println("\n----- Output for Triangle -----\n");
        System.out.println(Shape.getShape()); //Accessing value of static field shape
        triangle.calculateArea(); //Accessing class-implemented inherited abstract method
        triangle.calculatePerimeter(); //Accessing overriden method
    }
    
}
