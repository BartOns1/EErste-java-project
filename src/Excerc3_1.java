import java.math.BigInteger;
import java.util.Scanner;

public class Excerc3_1{

    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
        System.out.println("Geef 3 integers op :");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println("De som is " + (a+b+c));
        double average=(a+b+c)/3;
        int produkt=a*b*c;
        int max = Math.max(a,b);
        max = Math.max(max,c);
        int min = Math.min(a,b);
        min = Math.min(min, c);
        System.out.println("The average is " + average);
        System.out.println("Het produkt is " + produkt);
        System.out.println("Het grootste getal is " + max);
        System.out.println("Het kleinste getal is " + min);
    }
}