/**
 * Created by vdabcursist on 14/06/2017.
 */
import java.util.Scanner;
public class GradeStatistics {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.printf("Enter the number of grades: ");
        int ngrades = s.nextInt();

        int[] grades = new int[ngrades];
        double som = 0d;
        int mingrades = 100;
        int maxgrades = 0;
        for(int i=0; i<ngrades; i++){
             System.out.printf("Geef de %d eerste graad :", i+1);
             grades[i]= s.nextInt();
             som=som+grades[i];
             if(grades[i]<mingrades){
                 mingrades=grades[i];
             }
             if(grades[i]> maxgrades){
                 maxgrades=grades[i];
             }
             if (grades[i]==-1){
                 System.out.printf("Canceled by user");
                 break;
             }

        }

        double average = som/grades.length;
        System.out.printf("het gemiddelde is : %.2f\n",average);
        System.out.printf("De hoogste graad is : %d\n", maxgrades);
        System.out.printf("De laagste graad is : %d\n", mingrades);
    }
}
