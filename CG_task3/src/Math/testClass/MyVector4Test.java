package Math.testClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import Math.MyVector4;

class MyVector4Test {

    @Test
    void plusVector() {
        MyVector4 first = new MyVector4(2, 4, 6, 8);
        MyVector4 second = new MyVector4(2, 4, 6, 8);
        MyVector4 answer = new MyVector4(4, 8, 12, 16);
        assertEquals(answer.getCoords()[0], MyVector4.plusVector(first, second).getCoords()[0]);
        assertEquals(answer.getCoords()[1], MyVector4.plusVector(first, second).getCoords()[1]);
        assertEquals(answer.getCoords()[2], MyVector4.plusVector(first, second).getCoords()[2]);
        assertEquals(answer.getCoords()[3], MyVector4.plusVector(first, second).getCoords()[3]);
    }

    @Test
    void minusVector() {
        MyVector4 first = new MyVector4(2, 4, 6, 8);
        MyVector4 second = new MyVector4(2, 4, 6, 8);
        MyVector4 answer = new MyVector4(0, 0, 0, 0);
        assertEquals(answer.getCoords()[0], MyVector4.minusVector(first, second).getCoords()[0]);
        assertEquals(answer.getCoords()[1], MyVector4.minusVector(first, second).getCoords()[1]);
        assertEquals(answer.getCoords()[2], MyVector4.minusVector(first, second).getCoords()[2]);
        assertEquals(answer.getCoords()[3], MyVector4.minusVector(first, second).getCoords()[3]);
    }

    @Test
    void multiplierVector() {
        MyVector4 first = new MyVector4(2, 4, 6, 8);
        double second = 5;
        MyVector4 answer = new MyVector4(10, 20, 30, 40);
        assertEquals(answer.getCoords()[0], MyVector4.multiplierVector(first, second).getCoords()[0]);
        assertEquals(answer.getCoords()[1], MyVector4.multiplierVector(first, second).getCoords()[1]);
        assertEquals(answer.getCoords()[2], MyVector4.multiplierVector(first, second).getCoords()[2]);
        assertEquals(answer.getCoords()[3], MyVector4.multiplierVector(first, second).getCoords()[3]);
    }

    @Test
    void separationVector() {
        MyVector4 first = new MyVector4(2, 4, 6, 8);
        double second = 5;
        MyVector4 answer = new MyVector4(0.4, 0.8, 1.2, 1.6);
        assertEquals(answer.getCoords()[0], MyVector4.separationVector(first, second).getCoords()[0]);
        assertEquals(answer.getCoords()[1], MyVector4.separationVector(first, second).getCoords()[1]);
        assertEquals(answer.getCoords()[2], MyVector4.separationVector(first, second).getCoords()[2]);
        assertEquals(answer.getCoords()[3], MyVector4.separationVector(first, second).getCoords()[3]);
    }

    @Test
    void scalarMultiplier() {
        MyVector4 first = new MyVector4(2, 4, 6, 8);
        MyVector4 second = new MyVector4(2, 4, 6, 8);
        double answer = 120;
        assertEquals(answer, MyVector4.scalarMultiplier(first, second));
    }
}