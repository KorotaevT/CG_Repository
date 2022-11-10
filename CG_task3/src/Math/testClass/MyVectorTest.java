package Math.testClass;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import Math.MyVector;
import Math.MyVector2;
import Math.MyVector3;
import Math.MyVector4;

class MyVectorTest {

    @Test
    void getCoords() {
        MyVector3 myVector3 = new MyVector3(4, 6, 8);
        double[] answer = {4, 6, 8};
        assertEquals(answer[0], myVector3.getCoords()[0]);
        assertEquals(answer[1], myVector3.getCoords()[1]);
        assertEquals(answer[2], myVector3.getCoords()[2]);
    }

    @Test
    void length() {
        MyVector4 myVector4 = new MyVector4(4, 6, 8, 1);
        float ans = (float) 10.82;
        int result = (int)Math.round(myVector4.length()*100);
        float result2 = (float) result / 100;
        assertEquals(ans, result2);
    }

    @Test
    void normal() {
        MyVector2 myVector2 = new MyVector2(4, 3);
        MyVector ans = new MyVector(0.8, 0.6);
        assertEquals(myVector2.normal().getCoords()[0], ans.getCoords()[0]);
        assertEquals(myVector2.normal().getCoords()[1], ans.getCoords()[1]);
    }
}