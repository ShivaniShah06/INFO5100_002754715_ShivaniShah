package exercises.exercise3b;
import java.io.Serializable;

abstract class Shape implements Serializable{
    public static String shape = "No Shape defined";
    double length;
    double width;
    public final double pi = 3.14;
    public abstract void calculateArea(); //Abstract method - does not have body
    public void calculatePerimeter(){ //Regular method
        System.out.println("The perimeter of rectangle with length " +length+ "cm and width " +width+ "cm is " + 2*length*width + "cm.");
    }

    public static String getShape(){ //Method to return the value of the static field
        return "Using static field, the shape is now changed to " +shape+ ".";
    } 
}
