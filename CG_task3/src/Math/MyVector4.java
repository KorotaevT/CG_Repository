package Math;

public class MyVector4 extends MyVector{

    public MyVector4 (double a, double b, double c, double d){
        super(a, b, c, d);
    }

    public static MyVector4 plusVector(MyVector4 v1, MyVector4 v2){
        return new MyVector4(v1.getCoords()[0] + v2.getCoords()[0], v1.getCoords()[1] + v2.getCoords()[1], v1.getCoords()[2] + v2.getCoords()[2], v1.getCoords()[3] + v2.getCoords()[3]);
    }

    public static MyVector4 minusVector(MyVector4 v1, MyVector4 v2){
        return new MyVector4(v1.getCoords()[0] - v2.getCoords()[0], v1.getCoords()[1] - v2.getCoords()[1], v1.getCoords()[2] - v2.getCoords()[2], v1.getCoords()[3] - v2.getCoords()[3]);
    }

    public static MyVector4 multiplierVector(MyVector4 v, double n){
        return new MyVector4(v.getCoords()[0] * n, v.getCoords()[1] * n, v.getCoords()[2] * n, v.getCoords()[3] * n);
    }

    public static MyVector4 separationVector(MyVector4 v, double n){
        return new MyVector4(v.getCoords()[0] / n, v.getCoords()[1] / n, v.getCoords()[2] / n, v.getCoords()[3] / n);
    }

    public static double scalarMultiplier(MyVector4 v1, MyVector4 v2){
        return v1.getCoords()[0] * v2.getCoords()[0] + v1.getCoords()[1] * v2.getCoords()[1] + v1.getCoords()[2] * v2.getCoords()[2] + v1.getCoords()[3] * v2.getCoords()[3];
    }
}
