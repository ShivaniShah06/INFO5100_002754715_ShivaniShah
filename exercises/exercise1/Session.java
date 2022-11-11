package exercises.exercise1;
import java.util.Arrays;

public class Session {
    public double averageScore;
    public double sum = 0;
    public double average;
    public double[] quizScores;
    //Array to store students
    String[] student = new String[20];
    
    
    //Method for calculating average quiz scores of students
    public void calculateAverageQuizScores(){
        for (int i=0 ; i<=15; i++){
            sum =+ quizScores[i];
        }
        average = sum / 15;
        System.out.println("The average score of the quiz is: " +average+ ".");
    }

    //Method for printing quiz scores in ascending order for one session
    public void ascendingScores(){
        Arrays.sort(quizScores);
        System.out.println("Quiz scores in ascending order: /n" +Arrays.toString(quizScores));
}
    public void printPartTimeStudentNames(){
        for (String partTimeStudent : student){
            System.out.println(partTimeStudent);
        }
    }

    public void printFullTimeStudentQuizScores(){
        for (double quizScore : quizScores) {
            System.out.println(quizScore);
        }
    }
}