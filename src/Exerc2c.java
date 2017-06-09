import java.util.Scanner;
public class Exerc2c{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Geef 3 integers:");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println("Het gemiddelde is " + Math.round((a+b+c)/3));
    }
}