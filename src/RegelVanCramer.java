import java.util.Scanner;
public class RegelVanCramer{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double a=3.4, b=50.2, c=2.1, d=0.55, e=44.5, f=5.9;
        double x, y;
        System.out.println("Geef waarden voor a,b,c,d,e,f: ");
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        d = s.nextDouble();
        e = s.nextDouble();
        f = s.nextDouble();

        x = (e*d - b*f)/(a*d - b*c);
        y = (a*f - e*c)/(a*d - b*c);
        System.out.println("De oplossing is x = " + x + "en y = " + y);
    }
}