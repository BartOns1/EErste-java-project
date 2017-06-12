import java.util.Scanner;
public class Exerc1_5{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Geef het aantal km op:");
        int a = s.nextInt();
        System.out.println("Geef de tijd weer in minuten:");
        int b = s.nextInt();
        System.out.println("Je loopte " + Math.round((a/b)*60/1.6));
    }
}