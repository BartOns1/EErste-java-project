/**
 * Created by vdabcursist on 14/06/2017.
 */
public class HarmonicSum {
    public static void main(String[] args){
        int n = 50000;
        int i = 1;
        double somRL=0;

        while (i <= n) {
            somRL=somRL+1d/i;
            i++;
        }
        System.out.printf("left to right %.2f \n", somRL);

        double somLR = 0;
        i=50000;
        while (i >= 1){
            somLR=somLR+1d/i;
            i--;
        }
        System.out.printf("right to left %.2f \n", somLR);
    }

}
