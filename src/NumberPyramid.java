/**
 * Created by vdabcursist on 14/06/2017.
 */
public class NumberPyramid {
    public static void main(String[] args) {


        double getal = -1;
        //String s = new String[15];
        int[][] getallen = new int[8][15];

        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                getal = Math.pow(2, i - 7 + j);
                if (getal < 1) {
                    System.out.printf("     ");
                } else {
                    if (getal < 10) {
                        System.out.printf("    %d", (int) getal);
                    } else if (getal < 100) {
                        System.out.printf("   %d", (int) getal);
                    } else {
                        System.out.printf("  %d", (int) getal);
                    }
                }
            }

            for (int j = 6; j >= 0; j--) {
                getal = Math.pow(2, i - 7 + j);
                if (getal < 1) {
                    System.out.printf("   ");
                }  else {
                    if (getal < 10) {
                        System.out.printf("    %d", (int) getal);
                    } else if (getal < 100) {
                        System.out.printf("   %d", (int) getal);
                    } else {
                        System.out.printf("  %d", (int) getal);
                    }
                }
            }
            System.out.printf("\n");
        }

    }
}

