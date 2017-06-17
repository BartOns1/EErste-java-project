package drawObjects;

/**
 * Created by barto on 17/06/2017.
 */
public class MyTest {
    public static void main(String[] args){
        MyPoints p1 = new MyPoints(10,8);
        MyPoints p2 = new MyPoints();
        MyPoints p3 = new MyPoints(15,15);

        double afstand = p2.distancePoint(p1);

        System.out.printf("De afstand is %f\n", afstand);

        p2.setXY(9,7);
        afstand = p2.distancePoint(p1);

        System.out.printf("De afstand is nu %f\n", afstand);


        // set an array of points with cor (1,1), (2,2), ....
        MyPoints[] points = new MyPoints[10];
        //System.out.printf("%s", points[2].toString());
        for (int i=0; i<10; i++){
            points[i] = new MyPoints();
            points[i].x = i+1;
            points[i].y = i+1;
        }


        //test van MyCircle class

        MyCircle cir = new MyCircle(p2,5);
        System.out.printf("%s has area %f\n",cir.toString(),cir.getArea());

        MyTriangle D = new MyTriangle(p1,p2,p3);
        System.out.printf("The perimeter of the triangle is %f", D.getPerimeter());
    }
}
