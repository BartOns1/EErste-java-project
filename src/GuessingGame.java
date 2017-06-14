/**
 * Created by vdabcursist on 14/06/2017.
 */
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.printf("Geef de min waarde: \n");
        int min = s.nextInt();
        System.out.printf("Geef de max waarde in: \n");
        int max = s.nextInt();
        int range = max-min;

        //choose random number
        int getal = 0;
        getal = (int) (Math.round(Math.random()*range+min));

        //raden
        int i = 3;

        while (i>0){
            System.out.printf("rarara, Doe een gok: ");
            int gok = s.nextInt();
            if (gok==getal){
                System.out.printf("\n GOED GERADEN \n");
                break;
            }
            i--;
        }
        if (i==0) {
            System.out.printf("\n GAME OVER \n");
        }



    }
}
