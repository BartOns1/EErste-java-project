/**
 * Created by vdabcursist on 14/06/2017.
 */
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args){
        double default_weekuren = 40;
        System.out.println("Geef de naam van de werknemer: ");
        Scanner s = new Scanner(System.in);
        String naam = s.next();
        System.out.println("Geef het aantal uur dat deze werknemer gewerkt heeft: ");
        double hours = s.nextDouble();
        System.out.println("Wat Is het uurloon?");
        double rate = s.nextDouble();
        double gross_salary = 0;
        if (hours>default_weekuren){
            gross_salary = default_weekuren * rate + (hours-default_weekuren)*1.5*rate;
        } else {
            gross_salary = hours * rate;
        }
        System.out.println("Het globale loon is " + Math.round(gross_salary*100)/100d);
    }
}
