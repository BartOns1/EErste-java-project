import java.util.Scanner;
public class Getalsorter{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Geef een getal op");
        int getal = s.nextInt();

        if(getal>10) {
            System.out.println("Groot getal");
        } else if (getal>5){
            System.out.println("Tussen 5 en 11");
        } else {
            System.out.println("Klein getal");
        }

    }
}