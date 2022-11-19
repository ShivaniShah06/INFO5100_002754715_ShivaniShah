package exercises.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args){
        //Populating 20 students with dummy scores by instantiating objects of PartTime and FullTime classes
       List<PartTime> pt = new ArrayList<>();

       PartTime partTime1 = new PartTime("Rohan", 1, getQuizScores());
       PartTime partTime2 = new PartTime("Rahul", 2, getQuizScores());
       PartTime partTime3 = new PartTime("Rakesh", 3, getQuizScores());
       PartTime partTime4 = new PartTime("Siddhant", 4, getQuizScores());
       PartTime partTime5 = new PartTime("Shivani", 5, getQuizScores());
       PartTime partTime6 = new PartTime("Aishwarya", 6, getQuizScores());
       PartTime partTime7 = new PartTime("Hani", 7, getQuizScores());
       PartTime partTime8 = new PartTime("Niyomi", 8, getQuizScores());
       PartTime partTime9 = new PartTime("Natasha", 9, getQuizScores());
       PartTime partTime10 = new PartTime("Ashutosh", 10, getQuizScores());

       List<FullTime> ft = new ArrayList<>();

       FullTime fullTime1 = new FullTime("Nirali", 11, getQuizScores(), getExamScores());
       FullTime fullTime2 = new FullTime("Mrudang", 12, getQuizScores(), getExamScores());
       FullTime fullTime3 = new FullTime("Varun", 13, getQuizScores(), getExamScores());
       FullTime fullTime4 = new FullTime("Vishesh", 14, getQuizScores(), getExamScores());
       FullTime fullTime5 = new FullTime("Yatri", 15, getQuizScores(), getExamScores());
       FullTime fullTime6 = new FullTime("Komal", 16, getQuizScores(), getExamScores());
       FullTime fullTime7 = new FullTime("Harsh", 17, getQuizScores(), getExamScores());
       FullTime fullTime8 = new FullTime("Kevin", 18, getQuizScores(), getExamScores());
       FullTime fullTime9 = new FullTime("Chaitali", 19, getQuizScores(), getExamScores());
       FullTime fullTime10 = new FullTime("Parth", 20, getQuizScores(), getExamScores());

       //Adding students to their respective list
       pt.add(partTime1);
       pt.add(partTime2);
       pt.add(partTime3);
       pt.add(partTime4);
       pt.add(partTime5);
       pt.add(partTime6);
       pt.add(partTime7);
       pt.add(partTime8);
       pt.add(partTime9);
       pt.add(partTime10);
       ft.add(fullTime1);
       ft.add(fullTime2);
       ft.add(fullTime3);
       ft.add(fullTime4);
       ft.add(fullTime5);
       ft.add(fullTime6);
       ft.add(fullTime7);
       ft.add(fullTime8);
       ft.add(fullTime9);
       ft.add(fullTime10);
       
       //Instantiating object of Session class
       Session session1 = new Session(ft, pt);

       //Calling methods of Session class on its object
       session1.ascendingScores();
       session1.printStudentAverageQuizScore();
       session1.printPartTimeStudentNames();
       session1.printFullTimeStudentExamScores();
    }

       //Method for generating 15 random quiz scores from 0 to 100 for each student
       public static double[] getQuizScores(){
        double[] quizScores = new double[15];
        for(int i=0; i<15; i++){
            double min = 0.0;
            double max = 100.0;
            double range = max - min;
            quizScores[i] = Math.round((Math.random()*range) + min);
        }
        return quizScores;
    }
       
       //Method for generating 2 randome exam scores from 0 to 100 for each student
       public static double[] getExamScores(){
        double[] examScores = new double[2];
        double min = 0.0;
        double max = 100.0;
        double range = max - min;
        for(int i=0; i<2; i++){
        examScores[i] = Math.round((Math.random()*range) + min);
        }
        return examScores;
       }

}