import java.util.Scanner;
public class AgePredictor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Geef uw naam op:");
        String naam = s.next();
        System.out.println("Geef uw leeftijd");
        int age = s.nextInt();
        System.out.println("Hallo " + naam + "! Next year you will be " + (age + 1));
    }
}