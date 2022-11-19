package exercises.exercise1;

//derived class
public class FullTime extends Student{
    
    double[] examScores = new double[2]; //Array to store 2 exam scores

    //FullTime class constructor
    public FullTime(String studentName, int rollNumber, double[] quizScores, double[] examScores){
        //Using inheritance and polymorphism concepts - accessing parent class constructor using super keyword
        super(studentName, rollNumber, quizScores);
        this.examScores = examScores; //examScores is an array of FullTime class itself meaning - not coming from the parent class
    }
}