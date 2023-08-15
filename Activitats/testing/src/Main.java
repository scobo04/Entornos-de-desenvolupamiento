import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {


    }

    //EXERCICI 1
    public static int[] erastotenes(int numero) {

        //Condició per casos límit
        if (numero < 1) {
            return  new int[]{};
        }

        int[] x= {2,2,3,5};
        return x;
    }

    //EXERCICI 2
    public static int[] descomposicioFactorial(int n) {

        int [] x = {2,2,3,5};
        return x;
    }

    //EXERCICI 3
    public static String eliminarCerca(String text, String cerca) {
        return "";
    }

    //EXERCICI 4
    public static int[][] multiplicarMatrius(int[][] a, int[][] b) {
        //CLASSE MAIN.JAVA
        //AQUÍ VA EL NOSTRE CODI

        return new int[][]{};

    }


    public static int[][] multiplicacionMatrices(int[][] A, int[][] B) {
        int[][] R; // convenio (fila,columna)


        int columnas_A = A[0].length;
        int filas_A = A.length;
        int columnas_B = B[0].length;
        int filas_B = B.length;

        if (columnas_A != filas_B) {
            System.out.println("Las matrices NO son multiplicables");
            return null;
        }

        R = new int[filas_A][columnas_B];

        for (int fila = 0; fila < filas_A; fila++) {
            for (int col = 0; col < columnas_B; col++) {

                for (int k = 0; k < columnas_A; k++) {
                    R[fila][col] += A[fila][k] * B[k][col];
                }
            }
        }
        return R;
    }




}