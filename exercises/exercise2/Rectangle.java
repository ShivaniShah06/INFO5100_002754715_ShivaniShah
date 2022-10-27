package exercises.exercise2;

public class Rectangle extends Shape {

    public Rectangle(double l, double w){ //Constructor
        length = l;
        width = w;
        shape = "Rectangle";
    }

    public void calculateArea(){ //Implementing inherited abstract method
        System.out.println("The area of rectangle with length " +length+ "cm and width " +width+ "cm is "  +length*width+ "cm.");
    }
}
