package drawObjects;

/**
 * Created by barto on 17/06/2017.
 */
public class MyTriangle {
    MyPoints p1 = new MyPoints();
    MyPoints p2 = new MyPoints();
    MyPoints p3 = new MyPoints();


    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.p1.setXY(x1,y1);
        this.p2.setXY(x2,y2);
        this.p3.setXY(x3,y3);
    }

    public MyTriangle(MyPoints p1, MyPoints p2, MyPoints p3){
        this(p1.getX(),p1.getY(), p2.getX(), p2.getY(), p3.getX(), p3.getY());
    }

    public double getPerimeter(){
        double perimeter;
        perimeter = this.p1.distancePoint(this.p2) + this.p2.distancePoint(this.p3) + this.p3.distancePoint(this.p1);
        return perimeter;
    }


}