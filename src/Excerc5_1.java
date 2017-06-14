import java.util.Scanner;
public class Excerc5_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Geef je volledige naam:");
        String Naam = s.next();
        String Voornaam = Naam.replaceAll(" *", "");
        String Upvn = Voornaam.toUpperCase();
        System.out.println("Jouw voornaam is " + Upvn);
    }
}