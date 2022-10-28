package ru.vsu.cs.korotaev;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MyCircle extends Circle {
    private double curX;
    private double curY;
    private double centralX;
    private double centralY;

    public double getCurX() {
        return curX;
    }

    public void setCurX(double curX) {
        this.curX = curX;
    }

    public double getCurY() {
        return curY;
    }

    public void setCurY(double curY) {
        this.curY = curY;
    }

    public double getrad() {
        return Math.sqrt(Math.pow(this.centralX - this.curX, 2) + Math.pow(this.centralY - this.curY, 2));
    }

    public double getCentralX() {
        return centralX;
    }

    public void setCentralX(double centralX) {
        this.centralX = centralX;
        setCenterX(centralX);
    }

    public double getCentralY() {
        return centralY;
    }

    public void setCentralY(double centralY) {
        this.centralY = centralY;
        setCenterY(centralY);
    }

    public boolean insideTheCircle(double inputX, double inputY){
        return (inputX - centralX) * (inputX - centralX) + (inputY - centralY) * (inputY - centralY) < (getRadius() * getRadius());
    }

    public boolean borderCircle(double inputX, double inputY){
        return (inputX - centralX) * (inputX - centralX) + (inputY - centralY) * (inputY - centralY) > (getRadius() * getRadius()) &&
                (inputX - centralX) * (inputX - centralX) + (inputY - centralY) * (inputY - centralY) < ((getRadius()+2) * (getRadius()+2));
    }

    private double[] findColorsDifference(Color firstColor, Color secondColor) {
        double red = (firstColor.getRed() - secondColor.getRed()) * 255 / getRadius();
        double green = (firstColor.getGreen() - secondColor.getGreen()) * 255 / getRadius();
        double blue = (firstColor.getBlue() - secondColor.getBlue()) * 255 / getRadius();

        red = (firstColor.getRed() - secondColor.getRed() >= 0) ? Math.abs(red) * -1 : Math.abs(red);
        green = (firstColor.getGreen() - secondColor.getGreen() >= 0) ? Math.abs(green) * -1 : Math.abs(green);
        blue = (firstColor.getBlue() - secondColor.getBlue() >= 0) ? Math.abs(blue) * -1 : Math.abs(blue);

        return new double[] {red, green, blue};
    }
    public Color getInterpolatedColor(int x, int y, Color firstColor, Color secondColor) {
        int distance = (int) Math.sqrt((centralX - x) * (centralY - x) + (centralY - y) * (centralY - y));
        double[] colorDifference = findColorsDifference(firstColor, secondColor);
        int rColor = Math.toIntExact(Math.round(firstColor.getRed() * 255));
        int gColor = Math.toIntExact(Math.round(firstColor.getGreen() * 255));
        int bColor = Math.toIntExact(Math.round(firstColor.getBlue() * 255));
        int red = fixRgbValues((int) (rColor + colorDifference[0] * distance));
        int green = fixRgbValues((int) (gColor + colorDifference[1] * distance));
        int blue = fixRgbValues((int) (bColor + colorDifference[2] * distance));

        return Color.rgb(red, green, blue);
    }

    private int fixRgbValues(int value) {
        if (value < 0) value = 0;
        if (value > 255) value = 255;
        return value;
    }
}
