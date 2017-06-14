import java.util.Arrays;
import java.util.Random;

/**
 * Created by vdabcursist on 14/06/2017.
 */
public class Quickpick {
    public static void main(String[]args){
        int max=42;
        int[] getallen = new int[6];

        for(int i=0; i< getallen.length; i++){
            getallen[i] = pickUniqueNumber(getallen);
        }
        Arrays.sort(getallen);
        System.out.println(Arrays.toString(getallen));

    }
    public static int pickUniqueNumber(int[] bestaande){
        Random r = new Random();

        int candidate = r.nextInt(42)+1;
        while(alreaydyPicked(bestaande, candidate)){
            candidate = r.nextInt(42)+1;
        }
        return candidate;
    }

    public static boolean alreaydyPicked(int[] lijst, int num){
        for(int i=0; i<lijst.length; i++){
            if(lijst[i]!=0 && lijst[i] == num){
               return true;
            }
        }
        return false;
    }
}
