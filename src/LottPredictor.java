import java.util.Arrays;
import java.util.Random;
/**
 * Created by vdabcursist on 14/06/2017.
 */
public class LottPredictor {
    public static void main(String[] args){
    int[] lottonummers = new int[]{-1,-1,-1,-1,-1,-1};

    //System.out.println(LottPredictor.kiesRandomGetal(42));
    int index=0;
    lottonummers[index]=LottPredictor.kiesRandomGetal(42);

    Arrays.sort(lottonummers);

    int LaatsteTrekking;
    while (Arrays.binarySearch(lottonummers,-1)>=0){

        LaatsteTrekking=LottPredictor.kiesRandomGetal(42);

        Arrays.sort(lottonummers);
       // System.out.println(Arrays.binarySearch(lottonummers,LaatsteTrekking));
        while (Arrays.binarySearch(lottonummers,LaatsteTrekking)>=0){
            LaatsteTrekking=LottPredictor.kiesRandomGetal(42);
            //System.out.printf("%d\n", LaatsteTrekking);
        }
        lottonummers[index]=LaatsteTrekking;
        Arrays.sort(lottonummers);
        }

    System.out.printf("%s",Arrays.toString(lottonummers));
    }
public static int kiesRandomGetal(int n){
    Random getal= new Random();
    return getal.nextInt(n-1)+1;
    }

}
