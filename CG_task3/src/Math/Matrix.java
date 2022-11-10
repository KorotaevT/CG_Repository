package Math;

public class Matrix {
    private double[][] matrix;

    public Matrix(double[][] matrix){
        this.matrix = matrix;
    }

    public double[][] getMatrixArray() {
        return matrix;
    }

    public Matrix transposeMatrix(){
        double[][] m = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                m[j][i] = matrix[i][j];
            }
        }
        return new Matrix(m);
    }

    public static Matrix getZeroMatrix(int size) {
        double[][] m = new double[size][size];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = 0;
            }
        }
        return new Matrix(m);
    }

    public static Matrix getOneMatrix(int size){
        double[][] m = new double[size][size];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if(i == j){
                    m[i][j] = 1;
                }else {
                    m[i][j] = 0;
                }
            }
        }
        return new Matrix(m);
    }
}
