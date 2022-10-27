package exercises.exercise2;

public class Circle extends Shape {
    double radius;
    public Circle(double r){ //Constructor
        radius = r;
        shape = "Circle";
        //System.out.println("Using static field to set the value of shape to " +shape+ ".");
    }

    public void calculateArea(){ //Implementing inherited abstract method
        System.out.println("The area of circle with radius " +radius+ "cm is " +pi*radius*radius+ "cm.");
    }

    @Override //Method overriding
    public void calculatePerimeter(){
        System.out.println("The perimeter of circle with radius " +radius+ "cm is " +2*pi*radius+ "cm.");
    }
}
