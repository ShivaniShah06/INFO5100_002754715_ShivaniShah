package exercises.exercise1;

//derived class
public class FullTime extends Student{
    double[] examScores = new double[2];

    public void setFullTimeStudentQuizScores(double[] quizScores){
        this.quizScores = quizScores;
    }

    public double[] getFullTimeStudentQuizScores(){
        return quizScores;
    }

    /*public void printFullTimeStudentQuizScores(){
        for (double quizScore : quizScores) {
            System.out.println(quizScore);
        }
    }*/
}