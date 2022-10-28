package ru.vsu.cs.korotaev;

import javafx.scene.control.Label;
import javafx.scene.shape.Line;

public class MyLine extends Line {
    private double centerX;
    private double centerY;
    private double clickX;
    private double clickY;
    private double length;
    private double sin;
    private double cos;

    public MyLine(){

    }

    public MyLine(double startX, double startY, double endX, double endY) {
        setStartX(startX);
        setStartY(startY);
        setEndX(endX);
        setEndY(endY);
        setCenterX(startX);
        setCenterY(startY);
        setClickX(endX);
        setClickY(endY);
    }

    public double getSin() {
        return sin;
    }

    public void setSin(double sin) {
        this.sin = sin;
    }

    public double getCos() {
        return cos;
    }

    public void setCos(double cos) {
        this.cos = cos;
    }

    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public double getClickX() {
        return clickX;
    }

    public void setClickX(double clickX) {
        this.clickX = clickX;
    }

    public double getClickY() {
        return clickY;
    }

    public void setClickY(double clickY) {
        this.clickY = clickY;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double[] giveKoef(){
        // y = mx+b
        double m = sin/-cos;
        double b = -(m*centerX)+(centerY);
        double[] ret = new double[2];
        ret[0]=m;
        ret[1]=b;
        return ret;
    }

    public boolean underLine(double inputX, double inputY){
        double[] res = giveKoef();
        return inputY >= inputX * res[0] + res[1];
    }

    public boolean upperLine(double inputX, double inputY){
        double[] res = giveKoef();
        return inputY <= inputX * res[0] + res[1];
    }

    public static boolean isFirst(MyLine first, MyLine second){
        return (first.sin/first.cos) >= (second.sin/second.cos);
    }
}
