package exercises.exercise3b;

public class Triangle extends Shape {
    double side1;
    double side2;
    double side3;
    double base;
    double height;

    public Triangle(double s1, double s2, double s3, double b, double h){
        side1 = s1;
        side2 = s2;
        side3 = s3;
        base = b;
        height = h;
        shape = "Triangle";
        //System.out.println("Using static field to set the value of shape to " +shape+ ".");
    }

    @Override
    public String toString(){
        return "Triangle{side1=" +side1+ ", side2=" +side2+ ", side3=" +side3+ ", base=" +base+ ", height=" +height+ "}";
    }

    public void calculateArea(){ //Implementing inherited abstract method
        System.out.println("The area of triangle with base " +base+ "cm and height " +height+ "cm is " +0.5*base*height+ "cm.");
    }

    @Override //Method overriding
    public void calculatePerimeter(){
        System.out.println("The perimeter of triangle with sides " +side1+"cm, " +side2+ "cm, " +side3+ "cm, is " +side1*side2*side3+ "cm.");
    }
    
}
