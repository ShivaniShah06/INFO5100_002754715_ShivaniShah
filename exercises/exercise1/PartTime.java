package exercises.exercise1;

public class PartTime extends Student{
    public PartTime(){
        student = new String[10];
    }

   /* public void printPartTimeStudentNames(){
        for (String partTimeStudent : student){
            System.out.println(partTimeStudent);
        }
    }*/
    public void setQuizScores(double[] quizScores){
        /*quizScores = new double[15];*/
        this.quizScores = quizScores;
    }
    
}
