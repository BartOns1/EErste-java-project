/**
 * Created by vdabcursist on 14/06/2017.
 */

package arrayexercices;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayOef {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] getallen = new int[3];
        int index=0;
        for (int i=0; i<3; i++) {
            System.out.printf("Geef een getal \n");
             getallen[index] = s.nextInt();
             index++;
        }

        Arrays.sort(getallen);

        System.out.printf("De drie getallen zijn %d %d en %d \n", getallen[0], getallen[1], getallen[2]);
        System.out.printf("De drei getallen zijn %s", Arrays.toString(getallen));
    }
}
