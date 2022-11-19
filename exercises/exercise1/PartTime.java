package exercises.exercise1;

//Derived class of Student class
public class PartTime extends Student{

    //PartTime class constructor
    public PartTime(String studentName, int rollNumber, double[] quizScores){
        //Using inheritance and polymorphism concepts - accessing parent class constructor using super keyword
        super(studentName, rollNumber, quizScores);
    }
    }
    