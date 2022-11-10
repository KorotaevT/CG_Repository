package Math.testClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import Math.MyVector2;

class MyVector2Test {

    @Test
    void plusVector() {
        MyVector2 first = new MyVector2(2, 4);
        MyVector2 second = new MyVector2(2, 4);
        MyVector2 answer = new MyVector2(4, 8);
        assertEquals(answer.getCoords()[0], MyVector2.plusVector(first, second).getCoords()[0]);
        assertEquals(answer.getCoords()[1], MyVector2.plusVector(first, second).getCoords()[1]);
    }

    @Test
    void minusVector() {
        MyVector2 first = new MyVector2(2, 4);
        MyVector2 second = new MyVector2(2, 4);
        MyVector2 answer = new MyVector2(0, 0);
        assertEquals(answer.getCoords()[0], MyVector2.minusVector(first, second).getCoords()[0]);
        assertEquals(answer.getCoords()[1], MyVector2.minusVector(first, second).getCoords()[1]);
    }

    @Test
    void multiplierVector() {
        MyVector2 first = new MyVector2(2, 4);
        double second = 5;
        MyVector2 answer = new MyVector2(10, 20);
        assertEquals(answer.getCoords()[0], MyVector2.multiplierVector(first, second).getCoords()[0]);
        assertEquals(answer.getCoords()[1], MyVector2.multiplierVector(first, second).getCoords()[1]);
    }

    @Test
    void separationVector() {
        MyVector2 first = new MyVector2(2, 4);
        double second = 5;
        MyVector2 answer = new MyVector2(0.4, 0.8);
        assertEquals(answer.getCoords()[0], MyVector2.separationVector(first, second).getCoords()[0]);
        assertEquals(answer.getCoords()[1], MyVector2.separationVector(first, second).getCoords()[1]);
    }

    @Test
    void scalarMultiplier() {
        MyVector2 first = new MyVector2(2, 4);
        MyVector2 second = new MyVector2(2, 4);
        double answer = 20;
        assertEquals(answer, MyVector2.scalarMultiplier(first, second));
    }
}