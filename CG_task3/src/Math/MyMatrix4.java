package Math;

public class MyMatrix4 extends MyMatrix {
    public MyMatrix4(double[][] matrix) {
        super(matrix);
    }

    public static MyMatrix4 plusMatrix(MyMatrix4 m1, MyMatrix4 m2){
        double[][] m = new double[4][4];
        for(int i = 0; i < m1.getMatrixArray().length; i++){
            for(int j = 0; j < m1.getMatrixArray()[0].length; j++){
                m[i][j] =  m1.getMatrixArray()[i][j] + m2.getMatrixArray()[i][j];
            }
        }
        return new MyMatrix4(m);
    }

    public static MyMatrix4 minusMatrix(MyMatrix4 m1, MyMatrix4 m2 ){
        double[][] m = new double[4][4];
        for(int i = 0; i < m1.getMatrixArray().length; i++){
            for(int j = 0; j < m1.getMatrixArray()[0].length; j++){
                m[i][j] =  m1.getMatrixArray()[i][j] - m2.getMatrixArray()[i][j];
            }
        }
        return new MyMatrix4(m);
    }

    public static MyVector4 multiplierVector(MyMatrix4 m1, MyVector4 v1) {
        MyVector4 v = new MyVector4(0, 0, 0, 0);
        for (int i = 0; i < m1.getMatrixArray().length; i++) {
            for (int j = 0; j < m1.getMatrixArray()[0].length; j++) {
                v.getCoords()[i] += m1.getMatrixArray()[i][j] * v1.getCoords()[j];
            }
        }
        return v;
    }

    public static MyMatrix4 matrixMultiplier(MyMatrix4 m1, MyMatrix4 m2) {
        double[][] m = new double[4][4];
        for (int i = 0; i < m1.getMatrixArray().length; i++) {
            for (int j = 0; j < m1.getMatrixArray()[0].length; j++) {
                for (int k = 0; k < m1.getMatrixArray().length; k++) {
                    m[i][j] += m1.getMatrixArray()[i][k] * m2.getMatrixArray()[k][j];
                }
            }
        }
        return new MyMatrix4(m);
    }
}
