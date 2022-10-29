package exercises.exercise3b;
import java.io.*;

public class DeserializationMainClass {
    public static void main(String[] args){
        Rectangle rectangle1 = null;
        try{
            rectangle1 = (Rectangle) Deserialization.deserialize("Rectangle.txt");
        }
        catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }

        System.out.println("=====Deserializing rectangle object=====\n");
        System.out.println("Object rectangle1 = " +rectangle1);

        Circle circle1 = null;
        try{
            circle1 = (Circle) Deserialization.deserialize("Circle.txt");
        }
        catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }

        System.out.println("\n=====Deserializing circle object=====\n");
        System.out.println("Object circle1 = " +circle1);

        Triangle triangle1 = null;
        try{
            triangle1 = (Triangle) Deserialization.deserialize("Triangle.txt");
        }
        catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }

        System.out.println("\n=====Deserializing triangle object=====\n");
        System.out.println("Object triangle1 = " +triangle1);

        Square square1 = null;
        try{
            square1 = (Square) Deserialization.deserialize("Square.txt");
        }
        catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }

        System.out.println("\n=====Deserializing square object=====\n");
        System.out.println("Object square1 = " +square1);
    }
}
