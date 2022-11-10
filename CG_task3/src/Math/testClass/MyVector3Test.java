package Math.testClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import Math.MyVector3;

class MyVector3Test {

    @Test
    void plusVector() {
        MyVector3 first = new MyVector3(2, 4, 6);
        MyVector3 second = new MyVector3(2, 4, 6);
        MyVector3 answer = new MyVector3(4, 8, 12);
        assertEquals(answer.getCoords()[0], MyVector3.plusVector(first, second).getCoords()[0]);
        assertEquals(answer.getCoords()[1], MyVector3.plusVector(first, second).getCoords()[1]);
        assertEquals(answer.getCoords()[2], MyVector3.plusVector(first, second).getCoords()[2]);
    }

    @Test
    void minusVector() {
        MyVector3 first = new MyVector3(2, 4, 6);
        MyVector3 second = new MyVector3(2, 4, 6);
        MyVector3 answer = new MyVector3(0, 0, 0);
        assertEquals(answer.getCoords()[0], MyVector3.minusVector(first, second).getCoords()[0]);
        assertEquals(answer.getCoords()[1], MyVector3.minusVector(first, second).getCoords()[1]);
        assertEquals(answer.getCoords()[2], MyVector3.minusVector(first, second).getCoords()[2]);
    }

    @Test
    void multiplierVector() {
        MyVector3 first = new MyVector3(2, 4, 6);
        double second = 5;
        MyVector3 answer = new MyVector3(10, 20, 30);
        assertEquals(answer.getCoords()[0], MyVector3.multiplierVector(first, second).getCoords()[0]);
        assertEquals(answer.getCoords()[1], MyVector3.multiplierVector(first, second).getCoords()[1]);
        assertEquals(answer.getCoords()[2], MyVector3.multiplierVector(first, second).getCoords()[2]);
    }

    @Test
    void separationVector() {
        MyVector3 first = new MyVector3(2, 4, 6);
        double second = 5;
        MyVector3 answer = new MyVector3(0.4, 0.8, 1.2);
        assertEquals(answer.getCoords()[0], MyVector3.separationVector(first, second).getCoords()[0]);
        assertEquals(answer.getCoords()[1], MyVector3.separationVector(first, second).getCoords()[1]);
        assertEquals(answer.getCoords()[2], MyVector3.separationVector(first, second).getCoords()[2]);
    }

    @Test
    void scalarMultiplier() {
        MyVector3 first = new MyVector3(2, 4, 6);
        MyVector3 second = new MyVector3(2, 4, 6);
        double answer = 56;
        assertEquals(answer, MyVector3.scalarMultiplier(first, second));
    }

    @Test
    void vectorsMultiplier() {
        MyVector3 first = new MyVector3(2, 4, 6);
        MyVector3 second = new MyVector3(4, 6, 8);
        MyVector3 answer = new MyVector3(-4, 8, -4);
        assertEquals(answer.getCoords()[0], MyVector3.vectorsMultiplier(first, second).getCoords()[0]);
        assertEquals(answer.getCoords()[1], MyVector3.vectorsMultiplier(first, second).getCoords()[1]);
        assertEquals(answer.getCoords()[2], MyVector3.vectorsMultiplier(first, second).getCoords()[2]);
    }
}