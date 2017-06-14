import java.util.Scanner;
public class Excerc3_5{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Hoeveel koekjes wil je maken");
        int cookies = s.nextInt();
        double proportion=cookies/48d;
        double cups_sugar=proportion*2;
        double cups_butter=proportion*1;
        double cups_flour=proportion*2.75;
        System.out.println("you need " + Math.round(100d*cups_sugar)/100d + " cups of sugar, " + Math.round(cups_butter*100d)/100d + " cups of butter and " + Math.round(cups_flour*100d)/100d + " cups of flour for " + cookies + " cookies");
    }
}