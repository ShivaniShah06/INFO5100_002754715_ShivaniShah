package exercises.exercise1;

public class Exercise1 {
    public static void main(String[] args){
        //Populating 20 students with dummy scores
       PartTime student1 = new PartTime();
       double[] quizScoreStudent1 = {20.0, 15.5, 18.0, 18.0, 14.5, 15.0, 16.0, 19.0, 12.0, 13.0, 17.5, 15.5, 13.5, 15.0, 19.0};
       student1.setQuizScores(quizScoreStudent1);
       student1.calculateAverageQuizScores();
       student1.ascendingScores();
       


       FullTime student2 = new FullTime();


    }
}