package exercises.exercise3b;
import java.io.*;

public class SerializationMainClass {
    public static void main(String[] args){
        //Instantiate object of class Rectangle
        Rectangle rectangle = new Rectangle(5.0,6.0);
        //Instantiate object of class Circle using Polymorphism concept
        Circle circle = new Circle(8.0);
        //Instantiate object of class Square
        Square square = new Square(7.5);
        //Instantiate object of class Triangle
        Triangle triangle = new Triangle(10.0, 14.0, 12.0, 5.0, 4.0);

        try {
            Serialization.Serialize(rectangle, "Rectangle.txt");
            System.out.println("=====Serialized data for *Rectangle* class and stored in Rectangle.txt file=====\n");
        }
        catch (IOException e){
            e.printStackTrace();
            return;
        }

        try {
            Serialization.Serialize(circle, "Circle.txt");
            System.out.println("=====Serialized data for *Circle* class and stored in Circle.txt file=====\n");
        }
        catch (IOException e){
            e.printStackTrace();
            return;
        }

        try {
            Serialization.Serialize(square, "Square.txt");
            System.out.println("=====Serialized data for *Square* class and stored in Square.txt file=====\n");
        }
        catch (IOException e){
            e.printStackTrace();
            return;
        }

        try {
            Serialization.Serialize(triangle, "Triangle.txt");
            System.out.println("=====Serialized data for *Triangle* class and stored in Triangle.txt file=====\n");
        }
        catch (IOException e){
            e.printStackTrace();
            return;
        }
    }
}