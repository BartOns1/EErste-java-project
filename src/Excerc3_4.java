import java.util.Scanner;
public class Excerc3_4{
    public static void main(String[] args){
         System.out.println("Hoeveel koekjes heb je gegeten");
         Scanner s = new Scanner(System.in);
         int cookies = s.nextInt();
         System.out.println("Je hebt " + Math.round((cookies/4d)*300) + " calorieën op");
    }
}