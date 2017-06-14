/**
 * Created by vdabcursist on 14/06/2017.
 */
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Geef de limiet van de multiplicatie tafel op: ");
        int Limit = s.nextInt();
        for (int i=1 ;i <= Limit; i++) {
            System.out.printf("%d | ", i);
            for (int j = 1; j <= Limit; j++) {
                System.out.printf("%d ", i * j);
            }
            System.out.printf("\n");
        }
    }
}
