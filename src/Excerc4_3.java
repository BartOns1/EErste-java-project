import java.util.Scanner;
public class Excerc4_3{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give acceleration:");
        double a = s.nextInt();
        System.out.println("Give airplane's take off speed:");
        double v = s.nextInt();
        double L = Math.ceil(v*v/2/a);
        System.out.println("The length of the runway is minimum " + L);
    }
}