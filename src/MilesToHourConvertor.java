public class MilesToHourConvertor{
       public static double snelheid(double km, double tijd){
            //Scanner s = new Scanner(System.in);
            //System.out.println("Geef het aantal km op:");
            //double a = s.nextDouble();
            //System.out.println("Geef de tijd weer in minuten:");
            //double b = s.nextDouble();
            double p = Math.round(100d*(km/tijd)*60d/1.6d)/100d;
            //System.out.println("Je loopte " + p + " mile/uur");
           return p;
        }
 }

