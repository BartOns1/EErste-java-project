/**
 * Created by vdabcursist on 14/06/2017.
 */
public class PiCalculator {
    public static void main(String[] args){

        double pi;

        for (int i=10000; i<100001; i=i+10000){
            pi=0d;
            for (int j=1; j<=i; j=j+4){
                pi=pi+1d/j-1d/(j+2);
            }
            System.out.printf("De benadering voor %d is %.10f\n",i, 4*pi);

        }
    }
}
