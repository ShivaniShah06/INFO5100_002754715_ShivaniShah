package exercises.exercise1;
import java.util.Arrays;
import java.util.List;

public class Session {
    //List to store full-time and part-time students
    List<FullTime> fullTimeStudents;
    List<PartTime> partTimeStudents;
    
    //Session class constructor
    public Session(List<FullTime> fullTimeStudents, List<PartTime> partTimeStudents){
        this.fullTimeStudents = fullTimeStudents;
        this.partTimeStudents = partTimeStudents;
    }
    
    //Method for calculating average quiz scores of students
    public double calculateAverageQuizScores(double[] quizScores){
        double sum = 0;
        for (int i=0 ; i<quizScores.length; i++){
            sum =+ quizScores[i];
        }
        double average = Math.round(sum / quizScores.length);
        return average;
    }

    //Method for printing average quiz scores of all the students
    public void printStudentAverageQuizScore(){
        System.out.println("\n=====Average scores for full-time students=====\n");
        for (FullTime fullTimeStudent : fullTimeStudents){
        double average = calculateAverageQuizScores(fullTimeStudent.quizScores);
        System.out.println(fullTimeStudent.studentName+ " - " +average);
        }
        System.out.println("\n=====Average scores for part-time students=====\n");
        for (PartTime partTimeStudent : partTimeStudents){
            double average = calculateAverageQuizScores(partTimeStudent.quizScores);
            System.out.println(partTimeStudent.studentName+ " - " +average);
            }
    }

    //Method for printing quiz scores of all the students in ascending order for one session
    public void ascendingScores(){
        System.out.println("=====Quiz scores for full-time students in ascending order=====\n");
        for (FullTime fullTimeStudent : fullTimeStudents){
            Arrays.sort(fullTimeStudent.quizScores);
            System.out.println( fullTimeStudent.studentName+ " - " +Arrays.toString(fullTimeStudent.quizScores));
            }
        System.out.println("\n=====Quiz scores for part-time students in ascending order=====\n");
        for (PartTime partTimeStudent : partTimeStudents){
            Arrays.sort(partTimeStudent.quizScores);
            System.out.println(partTimeStudent.studentName+ " - " +Arrays.toString(partTimeStudent.quizScores));
            }
        }
        
    //Method for printing names of part-time students
    public void printPartTimeStudentNames(){
    System.out.println("\n=====Names of part-time students=====\n");
    for (PartTime partTimeStudent : partTimeStudents){
        System.out.println(partTimeStudent.studentName);
    }
}
    
    //Method for printing exam scores of full-time students
    public void printFullTimeStudentExamScores(){
        System.out.println("\n=====Exam-scores of full-time students=====\n");
        for (FullTime fullTimeStudent : fullTimeStudents) {
            System.out.println(fullTimeStudent.studentName+ " - " +Arrays.toString(fullTimeStudent.examScores));
        }
    }
}