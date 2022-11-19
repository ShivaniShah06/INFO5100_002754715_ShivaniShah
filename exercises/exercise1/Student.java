package exercises.exercise1;
//base class
public class Student {

    public double[] quizScores; //array for storing quizScores for students
    String studentName;
    int rollNumber;

    //student class constructor
    public Student(String studentName, int rollNumber, double[] quizScores){
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.quizScores = quizScores;
    }
}