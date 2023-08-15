import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DescomposicioFactorialTest {

    public void erastotenes() {
        //1- Prova aleatòria
        int[] r1 = Main.erastotenes(20);
        assertArrayEquals(r1, new int[]{1,2,3,5,7,9,11,13,17,19});

        int[] r2 = Main.erastotenes(21);
        assertArrayEquals(r2, new int[]{1,2,3,5,7,9,11,13,17,19});

        //2- Casos límit (1 - 1000)
        int[] r3 = Main.erastotenes(1);
        assertArrayEquals(r3, new int[]{});

        int[] r4 = Main.erastotenes(1000);
        assertArrayEquals(r4, new int[]{1,2,3,5,7,9,11,13,17,19});

        //3- Casos erronis
        int[] r5 = Main.erastotenes(0);
        assertArrayEquals(r5, null);

        int[] r6 = Main.erastotenes(-3);
        assertArrayEquals(r6, null);

        int[] r7 = Main.erastotenes(1001);
        assertArrayEquals(r7, null);

        int[] r8 = Main.erastotenes(2387);
        assertArrayEquals(r8, null);
    }

    @Test
    public void multiplicarMatrius() {

        int[][] matriuA = new int[3][3];
        matriuA[0][0] = 2;
        matriuA[0][1] = 0;
        matriuA[0][2] = 1;
        matriuA[1][0] = 3;
        matriuA[1][1] = 0;
        matriuA[1][2] = 0;
        matriuA[2][0] = 5;
        matriuA[2][1] = 1;
        matriuA[2][2] = 1;

        int[][] matriuB = {
                {1,0,1},
                {1,2,1},
                {1,1,0}
        };

        int[][] resultatAB = {
                {3,1,2},
                {3,0,3},
                {7,3,6}
        };

        //Cas aleatori
        assertArrayEquals(Main.multiplicarMatrius(matriuA,matriuB),resultatAB);

    }

    public void descomposicioFactorial() {
        //1- Prova aleatòria
        int[] r1 = Main.descomposicioFactorial(60);
        assertArrayEquals(r1, new int[]{2,2,3,5});

        int[] r2 = Main.descomposicioFactorial(42);
        assertArrayEquals(r2, new int[]{2,3,7});

        //2- Casos límit (2 - infinit)
        int[] r3 = Main.descomposicioFactorial(2);
        assertArrayEquals(r3, new int[]{2});

        /*Aquest cas infinit no es pot descomposar*/
        //int[] r4 = Main.descomposicioFactorial(Integer.MAX_VALUE);
        //assertArrayEquals(r4, new int[]{});

        //3- Casos erronis
        int[] r5 = Main.descomposicioFactorial(1);
        assertArrayEquals(r5, null); //pot ser null, {1} o {}

        int[] r6 = Main.descomposicioFactorial(0);
        assertArrayEquals(r6, null);

        int[] r7 = Main.descomposicioFactorial(-3);
        assertArrayEquals(r7, null);




    }

    //Exercici 3
    /*
    Rang "",
    */

    @Test
    public void multiplicacionMatricesCajaBlanca() {
        int[][] A = {
                {0,1},
                {2,1},
                {0,2}
        };

        int[][] B = {
                {0,1,0,1},
                {1,1,2,2}
        };

        int[][] resultadoAB = {
                {1,1,2,2},
                {1,3,2,4},
                {2,2,4,4}
        };

        int[][] C = {};

        //Condicional NO entra i For "n" vegades
        assertArrayEquals(Main.multiplicacionMatrices(A,B), resultadoAB);

        //Condicional SI entra
        assertArrayEquals(Main.multiplicacionMatrices(B,A), null);

        //For entra 0 vegades
        assertThrows(ArrayIndexOutOfBoundsException.class,() -> Main.multiplicacionMatrices(C,C));

    }

}
