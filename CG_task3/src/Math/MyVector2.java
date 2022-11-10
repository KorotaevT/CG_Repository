package Math;

public class MyVector2 extends MyVector{

    public MyVector2(double a, double b) {
        super(a, b);
    }

    public static MyVector2 plusVector(MyVector2 v1, MyVector2 v2){
        return new MyVector2(v1.getCoords()[0] + v2.getCoords()[0], v1.getCoords()[1] + v2.getCoords()[1]);
    }

    public static MyVector2 minusVector(MyVector2 v1, MyVector2 v2){
        return new MyVector2(v1.getCoords()[0] - v2.getCoords()[0], v1.getCoords()[1] - v2.getCoords()[1]);
    }

    public static MyVector2 multiplierVector(MyVector2 v, double n){
        return new MyVector2(v.getCoords()[0] * n, v.getCoords()[1] * n);
    }

    public static MyVector2 separationVector(MyVector2 v, double n){
        return new MyVector2(v.getCoords()[0] / n, v.getCoords()[1] / n);
    }

    public static double scalarMultiplier(MyVector2 v1, MyVector2 v2){
        return v1.getCoords()[0] * v2.getCoords()[0] + v1.getCoords()[1] * v2.getCoords()[1];
    }
}
