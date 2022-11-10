package Math.testClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import Math.MyMatrix4;
import Math.MyVector4;

class MyMatrix4Test {

    @Test
    void plusMatrix() {
        double[] first = {1, 2, 3, 4};
        double[] second = {5, 6, 7, 8};
        double[] third = {9, 10, 11, 12};
        double[] fourth = {13, 14, 15, 16};
        double[][] matrix = new double[4][4];
        matrix[0] = first;
        matrix[1] = second;
        matrix[2] = third;
        matrix[3] = fourth;
        MyMatrix4 answer = new MyMatrix4(matrix);

        double[] first2 = {1, 2, 3, 4};
        double[] second2 = {5, 6, 7, 8};
        double[] third2 = {9, 10, 11, 12};
        double[] fourth2 = {13, 14, 15, 16};
        double[][] matrix2 = new double[4][4];
        matrix2[0] = first2;
        matrix2[1] = second2;
        matrix2[2] = third2;
        matrix2[3] = fourth2;
        MyMatrix4 answer2 = new MyMatrix4(matrix2);

        double[] first3 = {2, 4, 6, 8};
        double[] second3 = {10, 12, 14, 16};
        double[] third3 = {18, 20, 22, 24};
        double[] fourth3 = {26, 28, 30, 32};
        double[][] matrix3 = new double[4][4];
        matrix3[0] = first3;
        matrix3[1] = second3;
        matrix3[2] = third3;
        matrix3[3] = fourth3;

        MyMatrix4 answer3 = MyMatrix4.plusMatrix(answer, answer2);
        assertEquals(answer3.getMatrixArray()[0][0], matrix3[0][0]);
        assertEquals(answer3.getMatrixArray()[0][1], matrix3[0][1]);
        assertEquals(answer3.getMatrixArray()[0][2], matrix3[0][2]);
        assertEquals(answer3.getMatrixArray()[0][3], matrix3[0][3]);
        assertEquals(answer3.getMatrixArray()[1][0], matrix3[1][0]);
        assertEquals(answer3.getMatrixArray()[1][1], matrix3[1][1]);
        assertEquals(answer3.getMatrixArray()[1][2], matrix3[1][2]);
        assertEquals(answer3.getMatrixArray()[1][3], matrix3[1][3]);
        assertEquals(answer3.getMatrixArray()[2][0], matrix3[2][0]);
        assertEquals(answer3.getMatrixArray()[2][1], matrix3[2][1]);
        assertEquals(answer3.getMatrixArray()[2][2], matrix3[2][2]);
        assertEquals(answer3.getMatrixArray()[2][3], matrix3[2][3]);
        assertEquals(answer3.getMatrixArray()[3][0], matrix3[3][0]);
        assertEquals(answer3.getMatrixArray()[3][1], matrix3[3][1]);
        assertEquals(answer3.getMatrixArray()[3][2], matrix3[3][2]);
        assertEquals(answer3.getMatrixArray()[3][3], matrix3[3][3]);
    }

    @Test
    void minusMatrix() {
        double[] first = {1, 2, 3, 4};
        double[] second = {5, 6, 7, 8};
        double[] third = {9, 10, 11, 12};
        double[] fourth = {13, 14, 15, 16};
        double[][] matrix = new double[4][4];
        matrix[0] = first;
        matrix[1] = second;
        matrix[2] = third;
        matrix[3] = fourth;
        MyMatrix4 answer = new MyMatrix4(matrix);

        double[] first2 = {1, 2, 3, 4};
        double[] second2 = {5, 6, 7, 8};
        double[] third2 = {9, 10, 11, 12};
        double[] fourth2 = {13, 14, 15, 16};
        double[][] matrix2 = new double[4][4];
        matrix2[0] = first2;
        matrix2[1] = second2;
        matrix2[2] = third2;
        matrix2[3] = fourth2;
        MyMatrix4 answer2 = new MyMatrix4(matrix2);

        double[] first3 = {0, 0, 0, 0};
        double[] second3 = {0, 0, 0, 0};
        double[] third3 = {0, 0, 0, 0};
        double[] fourth3 = {0, 0, 0, 0};
        double[][] matrix3 = new double[4][4];
        matrix3[0] = first3;
        matrix3[1] = second3;
        matrix3[2] = third3;
        matrix3[3] = fourth3;

        MyMatrix4 answer3 = MyMatrix4.minusMatrix(answer, answer2);
        assertEquals(answer3.getMatrixArray()[0][0], matrix3[0][0]);
        assertEquals(answer3.getMatrixArray()[0][1], matrix3[0][1]);
        assertEquals(answer3.getMatrixArray()[0][2], matrix3[0][2]);
        assertEquals(answer3.getMatrixArray()[0][3], matrix3[0][3]);
        assertEquals(answer3.getMatrixArray()[1][0], matrix3[1][0]);
        assertEquals(answer3.getMatrixArray()[1][1], matrix3[1][1]);
        assertEquals(answer3.getMatrixArray()[1][2], matrix3[1][2]);
        assertEquals(answer3.getMatrixArray()[1][3], matrix3[1][3]);
        assertEquals(answer3.getMatrixArray()[2][0], matrix3[2][0]);
        assertEquals(answer3.getMatrixArray()[2][1], matrix3[2][1]);
        assertEquals(answer3.getMatrixArray()[2][2], matrix3[2][2]);
        assertEquals(answer3.getMatrixArray()[2][3], matrix3[2][3]);
        assertEquals(answer3.getMatrixArray()[3][0], matrix3[3][0]);
        assertEquals(answer3.getMatrixArray()[3][1], matrix3[3][1]);
        assertEquals(answer3.getMatrixArray()[3][2], matrix3[3][2]);
        assertEquals(answer3.getMatrixArray()[3][3], matrix3[3][3]);
    }

    @Test
    void multiplierVector() {
        double[] first = {1, 2, 3, 4};
        double[] second = {5, 6, 7, 8};
        double[] third = {9, 10, 11, 12};
        double[] fourth = {13, 14, 15, 16};
        double[][] matrix = new double[4][4];
        matrix[0] = first;
        matrix[1] = second;
        matrix[2] = third;
        matrix[3] = fourth;
        MyMatrix4 answer = new MyMatrix4(matrix);

        MyVector4 answer2 = new MyVector4(7, 8, 9, 10);

        MyVector4 answer3 = new MyVector4(90, 226, 362, 498);

        MyVector4 answer4 = MyMatrix4.multiplierVector(answer, answer2);
        assertEquals(answer3.getCoords()[0], answer4.getCoords()[0]);
        assertEquals(answer3.getCoords()[1], answer4.getCoords()[1]);
        assertEquals(answer3.getCoords()[2], answer4.getCoords()[2]);
        assertEquals(answer3.getCoords()[3], answer4.getCoords()[3]);
    }

    @Test
    void matrixMultiplier() {
        double[] first = {1, 2, 3, 4};
        double[] second = {5, 6, 7, 8};
        double[] third = {9, 10, 11, 12};
        double[] fourth = {13, 14, 15, 16};
        double[][] matrix = new double[4][4];
        matrix[0] = first;
        matrix[1] = second;
        matrix[2] = third;
        matrix[3] = fourth;
        MyMatrix4 answer = new MyMatrix4(matrix);

        double[] first2 = {1, 2, 3, 4};
        double[] second2 = {5, 6, 7, 8};
        double[] third2 = {9, 10, 11, 12};
        double[] fourth2 = {13, 14, 15, 16};
        double[][] matrix2 = new double[4][4];
        matrix2[0] = first2;
        matrix2[1] = second2;
        matrix2[2] = third2;
        matrix2[3] = fourth2;
        MyMatrix4 answer2 = new MyMatrix4(matrix2);

        double[] first3 = {90, 100, 110, 120};
        double[] second3 = {202, 228, 254, 280};
        double[] third3 = {314, 356, 398, 440};
        double[] fourth3 = {426, 484, 542, 600};
        double[][] matrix3 = new double[4][4];
        matrix3[0] = first3;
        matrix3[1] = second3;
        matrix3[2] = third3;
        matrix3[3] = fourth3;

        MyMatrix4 answer3 = MyMatrix4.matrixMultiplier(answer, answer2);
        assertEquals(answer3.getMatrixArray()[0][0], matrix3[0][0]);
        assertEquals(answer3.getMatrixArray()[0][1], matrix3[0][1]);
        assertEquals(answer3.getMatrixArray()[0][2], matrix3[0][2]);
        assertEquals(answer3.getMatrixArray()[0][3], matrix3[0][3]);
        assertEquals(answer3.getMatrixArray()[1][0], matrix3[1][0]);
        assertEquals(answer3.getMatrixArray()[1][1], matrix3[1][1]);
        assertEquals(answer3.getMatrixArray()[1][2], matrix3[1][2]);
        assertEquals(answer3.getMatrixArray()[1][3], matrix3[1][3]);
        assertEquals(answer3.getMatrixArray()[2][0], matrix3[2][0]);
        assertEquals(answer3.getMatrixArray()[2][1], matrix3[2][1]);
        assertEquals(answer3.getMatrixArray()[2][2], matrix3[2][2]);
        assertEquals(answer3.getMatrixArray()[2][3], matrix3[2][3]);
        assertEquals(answer3.getMatrixArray()[3][0], matrix3[3][0]);
        assertEquals(answer3.getMatrixArray()[3][1], matrix3[3][1]);
        assertEquals(answer3.getMatrixArray()[3][2], matrix3[3][2]);
        assertEquals(answer3.getMatrixArray()[3][3], matrix3[3][3]);
    }
}