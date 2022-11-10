package Math;

public class MyMatrix {
    private double[][] matrix;

    public MyMatrix(double[][] matrix){
        this.matrix = matrix;
    }

    public double[][] getMatrixArray() {
        return matrix;
    }

    public MyMatrix transposeMatrix(){
        double[][] m = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                m[j][i] = matrix[i][j];
            }
        }
        return new MyMatrix(m);
    }

    public static MyMatrix getZeroMatrix(int size) {
        double[][] m = new double[size][size];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = 0;
            }
        }
        return new MyMatrix(m);
    }

    public static MyMatrix getOneMatrix(int size){
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
        return new MyMatrix(m);
    }
}
