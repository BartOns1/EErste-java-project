package drawObjects;

/**
 * Created by barto on 17/06/2017.
 */
public class MyPoints {
    int x;
    int y;


    public MyPoints(int xcor, int ycor){
        this.x=xcor;
        this.y=ycor;
    }
    public  MyPoints(){
        this(0,0);

    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
     public String toString(){
        String cor = new String();
        cor = "(" + this.x + "," + this.y + ")";
        return cor;
     }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {

        return x;
    }

    public int getY() {
        return y;
    }


    public double distance(int x, int y){
         double dist = Math.sqrt(Math.pow(x-this.x, 2)+ Math.pow(y-this.y,2));
         return dist;
    }

    public double distancePoint(MyPoints point){
        double dist = Math.sqrt(Math.pow(point.x-this.x, 2)+ Math.pow(point.y-this.y,2));
        return dist;
    }
}
