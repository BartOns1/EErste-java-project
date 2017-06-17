package drawObjects;


/**
 * Created by barto on 17/06/2017.
 */
public class MyCircle {
    MyPoints center = new MyPoints();
    int radius = 1;

    public MyCircle(int x, int y, int radius){
        this.center.setXY(x,y);
        this.radius = radius;
    }

    public MyCircle(MyPoints point, int radisu){
        this(point.getX(),point.getY(), radisu);
    }
    public String toString() {
        String circleS = new String();
        circleS = "circle @ (" + this.center.getX() + "," + this.center.getY() + ") radius = " + this.radius;
        return circleS;
    }

    public double getArea(){
        double area = Math.pow(this.radius,2)*3.14;
        return area;
    }
}
