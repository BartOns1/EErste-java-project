import java.util.Scanner;
public class Exerc1_5{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Geef het aantal km op:");
        double a = s.nextDouble();
        System.out.println("Geef de tijd weer in minuten:");
        double b = s.nextDouble();
        double p;
        p= Math.round(100d*(a/b)*60d/1.6d)/100d;
        System.out.println("Je loopte " + p + " mile/uur");
    }
}