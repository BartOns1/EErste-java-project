import java.util.Arrays;

/**
 * Created by vdabcursist on 14/06/2017.
 */
public class Fibonacci {
    public static void main(String[] args){
        int[] F = new int[20];
        F[0]=1;
        F[1]=1;

        for(int i=2; i<20;i++){
            F[i]=F[i-1]+F[i-2];
        }
        String S=Arrays.toString(F);
        System.out.printf("De getallen zijn %s\n",S.substring(1,S.length()-1) );
    }
}
