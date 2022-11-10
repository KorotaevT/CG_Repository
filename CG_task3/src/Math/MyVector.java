package Math;

public class MyVector {

    private double[] coords;

    public MyVector(){
    }

    public MyVector(double a, double b) {
        coords = new double[2];
        this.coords[0] = a;
        this.coords[1] = b;
    }

    public MyVector(double a, double b, double c) {
        coords = new double[3];
        this.coords[0] = a;
        this.coords[1] = b;
        this.coords[2] = c;
    }

    public MyVector(double a, double b, double c, double d) {
        coords = new double[4];
        this.coords[0] = a;
        this.coords[1] = b;
        this.coords[2] = c;
        this.coords[3] = d;
    }

    public double[] getCoords() {
        return coords;
    }

    public double length(){
        double cur = 0;
        for (double coord : coords) {
            cur += coord * coord;
        }
        return Math.sqrt(cur);
    }

    public MyVector normal() {
        int length = coords.length;
        new MyVector();
        return switch (length) {
            case 2 -> new MyVector(coords[0] / length(), coords[1] / length());
            case 3 -> new MyVector(coords[0] / length(), coords[1] / length(), coords[2] / length());
            case 4 -> new MyVector(coords[0] / length(), coords[1] / length(), coords[2] / length(), coords[3] / length());
            default -> new MyVector();
        };
    }
}
