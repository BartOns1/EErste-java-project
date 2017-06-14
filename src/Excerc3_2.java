import java.util.Scanner;

public class Excerc3_2{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Geef 2 integers op :");
        int a = s.nextInt();
        int b = s.nextInt();
        if (a!=b){
            System.out.println(Math.max(a,b) + " is groter dan " + Math.min(a,b));
        }
        if (a==b){
            System.out.println("De numers zijn even groot");
        }

    }
}