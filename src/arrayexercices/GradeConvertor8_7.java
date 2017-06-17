package arrayexercices;

import java.util.Scanner;

/**
 * Created by barto on 17/06/2017.
 */
public class GradeConvertor8_7 {


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int nStud = scanNumberofStudents(s);
        int nGrades = scanNumberofGrades(s);
        int[] scores = new int[1];
        String[] studentNames = new String[nStud];
        int bestScore=100;
        char[][] grades = new char[nStud][nGrades];

        for (int i=0; i<nStud; i++){
          studentNames[i]=scanNameStudent(s);
          System.out.printf("\n");
          System.out.printf("Give the first score: ");
          int j=0;
          scores[j]=s.nextInt();

          for(j = 1; j<nGrades; j++){
              System.out.printf("Give the next score: ");
              scores=addScoretoArray(scores, s.nextInt(), s);
          }

          grades[i] = turnScoresIntoGrades(scores, bestScore);

        }


        for (int i=0; i<nStud; i++){
            System.out.printf("The grades for student %s are: \n", studentNames[i]);
            for (int j=0; j<nGrades; j++)  System.out.printf("%c ",grades[i][j]);
            System.out.printf("\n");
        }



    }

    public static char[] turnScoresIntoGrades(int[] scores, int bestscore){
        char[] ngrades = new char[scores.length];
        for (int i=0; i<scores.length; i++){
            if (scores[i]< bestscore-40) ngrades[i]='F';
            else if (scores[i]< bestscore-30) ngrades[i]='D';
            else if (scores[i]< bestscore-20) ngrades[i]='C';
            else if (scores[i]< bestscore-10) ngrades[i]='B';
            else ngrades[i]='A';
            }
        return ngrades;

    }



    public static int scanNumberofStudents(Scanner scan){
        System.out.printf("Give the number of students : ");
        int numstud = scan.nextInt();
        return numstud;
    }
    public static int scanNumberofGrades(Scanner scan){
        System.out.printf("Give the number of scores : ");
        int numgrad = scan.nextInt();
        return numgrad;
    }
    public static String scanNameStudent(Scanner scan){
        String name = new String();
        System.out.printf("Give the name : ");
        scan.nextLine();
        name = scan.nextLine();
        System.out.printf("%s \n", name);
        return name;
    }
    public static int[] addScoretoArray(int [] arrayOfNumbers, int score, Scanner scan){
        int L=arrayOfNumbers.length;
        int[] newArrayOfNumbers = new int[L+1];
        for (int i=0; i < L; i++) newArrayOfNumbers[i]=arrayOfNumbers[i];
        newArrayOfNumbers[L]=score;
        return newArrayOfNumbers;
    }
}
