/**
 * Created by barto on 16/06/2017.
 */
package arrayexercices;
import java.util.Scanner;
public class CountChars8a {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String sentence = new String();
        System.out.println("Type a sentence: ");
        sentence = s.nextLine();
        sentence.toLowerCase();
        sentence.replaceAll("\\s+","");
        System.out.printf("%s\n",sentence);
        String alphabet = new String();
        alphabet="abcdefghijklmnopqrstuvwxyz";




        String tempString = new String();
        tempString=sentence;
        int[] counts = new int[alphabet.length()];

        for (int i=0; i< alphabet.length(); i++){

            while (tempString.indexOf(alphabet.charAt(i))!=-1) {
                counts[i] = counts[i] + 1;
                for (int n:counts) System.out.printf("%d ", n);
               // String c = new String();
               // c=;
               // System.out.println(c);
                tempString = tempString.replaceFirst(alphabet.substring(i, i+1), "");
                System.out.printf("%s\n",tempString);
            }

        }
        System.out.println("The occurences are");
        for(int i=0; i<alphabet.length(); i++)   System.out.printf("%c : %d \n",alphabet.charAt(i), counts[i]);
        //System.out.printf("occurences = %s\n", counts.toString());

    }
}
