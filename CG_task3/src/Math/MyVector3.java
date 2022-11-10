package Math;

public class MyVector3 extends MyVector{
    public MyVector3 (double a, double b, double c){
        super(a, b, c);
    }

    public static MyVector3 plusVector(MyVector3 v1, MyVector3 v2){
        return new MyVector3(v1.getCoords()[0] + v2.getCoords()[0], v1.getCoords()[1] + v2.getCoords()[1], v1.getCoords()[2] + v2.getCoords()[2]);
    }

    public static MyVector3 minusVector(MyVector3 v1, MyVector3 v2){
        return new MyVector3(v1.getCoords()[0] - v2.getCoords()[0], v1.getCoords()[1] - v2.getCoords()[1], v1.getCoords()[2] - v2.getCoords()[2]);
    }

    public static MyVector3 multiplierVector(MyVector3 v, double n){
        return new MyVector3(v.getCoords()[0] * n, v.getCoords()[1] * n, v.getCoords()[2] * n);
    }

    public static MyVector3 separationVector(MyVector3 v, double n){
        return new MyVector3(v.getCoords()[0] / n, v.getCoords()[1] / n, v.getCoords()[2] / n);
    }

    public static double scalarMultiplier(MyVector3 v1, MyVector3 v2){
        return v1.getCoords()[0] * v2.getCoords()[0] + v1.getCoords()[1] * v2.getCoords()[1] + v1.getCoords()[2] * v2.getCoords()[2];
    }

    public static MyVector3 vectorsMultiplier(MyVector v1, MyVector v2){
        double x  = v1.getCoords()[1] * v2.getCoords()[2] - v2.getCoords()[1] * v1.getCoords()[2];
        double y  = -(v1.getCoords()[0] * v2.getCoords()[2] - v2.getCoords()[0] * v1.getCoords()[2]);
        double z  = v1.getCoords()[0] * v2.getCoords()[1] - v2.getCoords()[0] * v1.getCoords()[1];
        return new MyVector3(x,y,z);
    }
}
