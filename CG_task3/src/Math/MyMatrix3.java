package Math;

public class MyMatrix3 extends MyMatrix {

    public MyMatrix3(double[][] matrix) {
        super(matrix);
    }

    public static MyMatrix3 plusMatrix(MyMatrix3 m1, MyMatrix3 m2){
        double[][] m = new double[3][3];
        for(int i = 0; i < m1.getMatrixArray().length; i++){
            for(int j = 0; j < m1.getMatrixArray()[0].length; j++){
                m[i][j] =  m1.getMatrixArray()[i][j] + m2.getMatrixArray()[i][j];
            }
        }
        return new MyMatrix3(m);
    }

    public static MyMatrix3 minusMatrix(MyMatrix3 m1, MyMatrix3 m2 ){
        double[][] m = new double[3][3];
        for(int i = 0; i < m1.getMatrixArray().length; i++){
            for(int j = 0; j < m1.getMatrixArray()[0].length; j++){
                m[i][j] =  m1.getMatrixArray()[i][j] - m2.getMatrixArray()[i][j];
            }
        }
        return new MyMatrix3(m);
    }

    public static MyVector3 multiplierVector(MyMatrix3 m1, MyVector3 v1) {
        MyVector3 v = new MyVector3(0, 0, 0);
        for (int i = 0; i < m1.getMatrixArray().length; i++) {
            for (int j = 0; j < m1.getMatrixArray()[0].length; j++) {
                v.getCoords()[i] += m1.getMatrixArray()[i][j] * v1.getCoords()[j];
            }
        }
        return v;
    }

    public static MyMatrix3 matrixMultiplier(MyMatrix3 m1, MyMatrix3 m2) {
        double[][] m = new double[3][3];
        for (int i = 0; i < m1.getMatrixArray().length; i++) {
            for (int j = 0; j < m1.getMatrixArray()[0].length; j++) {
                for (int k = 0; k < m1.getMatrixArray().length; k++) {
                    m[i][j] += m1.getMatrixArray()[i][k] * m2.getMatrixArray()[k][j];
                }
            }
        }
        return new MyMatrix3(m);
    }
}
