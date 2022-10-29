package exercises.exercise3b;

public class Square extends Shape {
    double length;
    public Square(double l){ //Constructor
        this.length = l;
        shape = "Square";
    }

    @Override
    public String toString(){
        return "Square{length=" +this.length+ "}"; 
    }

    public void calculateArea(){ //Implementing inherited abstract method
        System.out.println("The area of square with length " +this.length+ "cm is " +this.length*this.length + "cm.");
    }

    @Override //Method overriding
    public void calculatePerimeter(){
        System.out.println("The perimeter of square with length " +this.length+ "cm is " +4*this.length+ "cm.");
    }    
}
