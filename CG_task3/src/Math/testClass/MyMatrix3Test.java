package Math.testClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import Math.MyMatrix3;
import Math.MyVector3;

class MyMatrix3Test {

    @Test
    void plusMatrix() {
        double[] first = {1, 2, 3};
        double[] second = {4, 5, 6};
        double[] third = {7, 8, 9};
        double[][] matrix = new double[3][3];
        matrix[0] = first;
        matrix[1] = second;
        matrix[2] = third;
        MyMatrix3 answer = new MyMatrix3(matrix);

        double[] first2 = {1, 2, 3};
        double[] second2 = {4, 5, 6};
        double[] third2 = {7, 8, 9};
        double[][] matrix2 = new double[3][3];
        matrix2[0] = first2;
        matrix2[1] = second2;
        matrix2[2] = third2;
        MyMatrix3 answer2 = new MyMatrix3(matrix2);

        double[] first3 = {2, 4, 6};
        double[] second3 = {8, 10, 12};
        double[] third3 = {14, 16, 18};
        double[][] matrix3 = new double[3][3];
        matrix3[0] = first3;
        matrix3[1] = second3;
        matrix3[2] = third3;

        MyMatrix3 answer3 = MyMatrix3.plusMatrix(answer, answer2);
        assertEquals(answer3.getMatrixArray()[0][0], matrix3[0][0]);
        assertEquals(answer3.getMatrixArray()[0][1], matrix3[0][1]);
        assertEquals(answer3.getMatrixArray()[0][2], matrix3[0][2]);
        assertEquals(answer3.getMatrixArray()[1][0], matrix3[1][0]);
        assertEquals(answer3.getMatrixArray()[1][1], matrix3[1][1]);
        assertEquals(answer3.getMatrixArray()[1][2], matrix3[1][2]);
        assertEquals(answer3.getMatrixArray()[2][0], matrix3[2][0]);
        assertEquals(answer3.getMatrixArray()[2][1], matrix3[2][1]);
        assertEquals(answer3.getMatrixArray()[2][2], matrix3[2][2]);
    }

    @Test
    void minusMatrix() {
        double[] first = {1, 2, 3};
        double[] second = {4, 5, 6};
        double[] third = {7, 8, 9};
        double[][] matrix = new double[3][3];
        matrix[0] = first;
        matrix[1] = second;
        matrix[2] = third;
        MyMatrix3 answer = new MyMatrix3(matrix);

        double[] first2 = {1, 2, 3};
        double[] second2 = {4, 5, 6};
        double[] third2 = {7, 8, 9};
        double[][] matrix2 = new double[3][3];
        matrix2[0] = first2;
        matrix2[1] = second2;
        matrix2[2] = third2;
        MyMatrix3 answer2 = new MyMatrix3(matrix2);

        double[] first3 = {0, 0, 0};
        double[] second3 = {0, 0, 0};
        double[] third3 = {0, 0, 0};
        double[][] matrix3 = new double[3][3];
        matrix3[0] = first3;
        matrix3[1] = second3;
        matrix3[2] = third3;

        MyMatrix3 answer3 = MyMatrix3.minusMatrix(answer, answer2);
        assertEquals(answer3.getMatrixArray()[0][0], matrix3[0][0]);
        assertEquals(answer3.getMatrixArray()[0][1], matrix3[0][1]);
        assertEquals(answer3.getMatrixArray()[0][2], matrix3[0][2]);
        assertEquals(answer3.getMatrixArray()[1][0], matrix3[1][0]);
        assertEquals(answer3.getMatrixArray()[1][1], matrix3[1][1]);
        assertEquals(answer3.getMatrixArray()[1][2], matrix3[1][2]);
        assertEquals(answer3.getMatrixArray()[2][0], matrix3[2][0]);
        assertEquals(answer3.getMatrixArray()[2][1], matrix3[2][1]);
        assertEquals(answer3.getMatrixArray()[2][2], matrix3[2][2]);
    }

    @Test
    void multiplierVector() {
        double[] first = {1, 2, 3};
        double[] second = {4, 5, 6};
        double[] third = {7, 8, 9};
        double[][] matrix = new double[3][3];
        matrix[0] = first;
        matrix[1] = second;
        matrix[2] = third;
        MyMatrix3 answer = new MyMatrix3(matrix);

        MyVector3 answer2 = new MyVector3(7, 8, 9);

        MyVector3 answer3 = new MyVector3(50, 122, 194);

        MyVector3 answer4 = MyMatrix3.multiplierVector(answer, answer2);
        assertEquals(answer3.getCoords()[0], answer4.getCoords()[0]);
        assertEquals(answer3.getCoords()[1], answer4.getCoords()[1]);
        assertEquals(answer3.getCoords()[2], answer4.getCoords()[2]);
    }

    @Test
    void matrixMultiplier() {
        double[] first = {1, 2, 3};
        double[] second = {4, 5, 6};
        double[] third = {7, 8, 9};
        double[][] matrix = new double[3][3];
        matrix[0] = first;
        matrix[1] = second;
        matrix[2] = third;
        MyMatrix3 answer = new MyMatrix3(matrix);

        double[] first2 = {2, 3, 4};
        double[] second2 = {5, 6, 7};
        double[] third2 = {8, 9, 10};
        double[][] matrix2 = new double[3][3];
        matrix2[0] = first2;
        matrix2[1] = second2;
        matrix2[2] = third2;
        MyMatrix3 answer2 = new MyMatrix3(matrix2);

        double[] first3 = {36, 42, 48};
        double[] second3 = {81, 96, 111};
        double[] third3 = {126, 150, 174};
        double[][] matrix3 = new double[3][3];
        matrix3[0] = first3;
        matrix3[1] = second3;
        matrix3[2] = third3;

        MyMatrix3 answer3 = MyMatrix3.matrixMultiplier(answer, answer2);
        assertEquals(answer3.getMatrixArray()[0][0], matrix3[0][0]);
        assertEquals(answer3.getMatrixArray()[0][1], matrix3[0][1]);
        assertEquals(answer3.getMatrixArray()[0][2], matrix3[0][2]);
        assertEquals(answer3.getMatrixArray()[1][0], matrix3[1][0]);
        assertEquals(answer3.getMatrixArray()[1][1], matrix3[1][1]);
        assertEquals(answer3.getMatrixArray()[1][2], matrix3[1][2]);
        assertEquals(answer3.getMatrixArray()[2][0], matrix3[2][0]);
        assertEquals(answer3.getMatrixArray()[2][1], matrix3[2][1]);
        assertEquals(answer3.getMatrixArray()[2][2], matrix3[2][2]);
    }
}