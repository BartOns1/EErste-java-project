/**
 * Created by vdabcursist on 14/06/2017.
 */
import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args){
        double salaris = 0d;
        Scanner s = new Scanner(System.in);
        double social_security = 0.1307d;

        System.out.println("Geef je salaris: ");
        salaris = s.nextDouble();
        double sociale_zekerheid = social_security*salaris;

        double bruto_bel_inkome =  salaris - sociale_zekerheid;
        System.out.printf("bruto belastbaar inkomen is %.2f\n", bruto_bel_inkome);

        double nettoloon = 0;

        if (bruto_bel_inkome <= 8680){
            nettoloon = (1-0.25) * bruto_bel_inkome;
        } else if (bruto_bel_inkome <= 12360){
            nettoloon = (1-0.3) * bruto_bel_inkome;
        } else if (bruto_bel_inkome <= 20600){
            nettoloon = (1-0.4) * bruto_bel_inkome;
        } else if (bruto_bel_inkome <= 37750){
            nettoloon = (1-0.45) * bruto_bel_inkome;
        } else {
            nettoloon = (1-0.5) * bruto_bel_inkome;
        }
        System.out.printf("Het nettollon is %.2f", nettoloon);
    }
}
