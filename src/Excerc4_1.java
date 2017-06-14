public class Excerc4_1{
    public static void main(String[] args) {
        int start = 312032486;
        double secperYear = 365 * 24 * 3600;
        double prop_birth = secperYear / 7;
        double prop_death = secperYear / 13;
        double prop_immigrants = secperYear / 45;
        for (int i = 0; i < 5; i++) {
            System.out.println("year " + i + " --> new births: " + Math.round((start + i * prop_birth)) + " deaths: " + Math.round(start + i * prop_death) + " number of immigrants is " + Math.round(start + i * prop_immigrants));
        }
    }
}