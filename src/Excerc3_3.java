public class Excerc3_3{
    public static void main(String[] args){
        String firstName , middleName , lastName;
        char firstInitial , middleInitial , lastInitial;
        firstName = "Bart";
        middleName = "Willem";
        lastName = "Ons";

        firstInitial=firstName.charAt(0);
        middleInitial=middleName.charAt(0);
        lastInitial=lastName.charAt(0);


        System.out.println("Uw initials zijn: " + firstInitial + middleInitial + lastInitial);

    }
}