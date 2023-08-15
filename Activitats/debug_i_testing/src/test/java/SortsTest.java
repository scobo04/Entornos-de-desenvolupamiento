import org.example.Sorts;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

public class SortsTest {

    @Test
    public void inverteixarray() {

        //1 CAJA NEGRA//
        //1.1 Caso aleatorio
        int[] array = {5, 1, 12, -5, 16};
        int[] r_esperado = {16, -5, 12, 1, 5};
        int[] r1 = Sorts.inverteixarray(array);
        assertArrayEquals(r_esperado, r1);

        //1.2 Caso límite
        //1.2.1 Array vacío
        int[] array2 = {};
        int[] r_esperado2 = {};
        int[] r2 = Sorts.inverteixarray(array2);
        assertArrayEquals(r_esperado2, r2);

        //1.2.2 Array con números repetidos
        int[] array3 = {5, 34, 34, 56, 5, 76};
        int[] r_esperado3 = {76, 5, 56, 34, 34, 5};
        int[] r3 = Sorts.inverteixarray(array3);
        assertArrayEquals(r_esperado3, r3);

        //1.3 Caso erróneo
        //Que devuelva los elementos del array en negativo.
        int[] array4 = {45, 32, 5, 9, 12};
        int[] r_esperado4 = {-12, -9, -5, -32, -45};
        int[] r4 = Sorts.inverteixarray(array4);
        assertNotEquals(r_esperado4, r4);


        //2 CAJA BLANCA//

        //2.1 El FOR no se ejecuta
        //Array vacío
        int[] array5 = {};
        int[] r_esperado5 = {};
        int[] r5 = Sorts.inverteixarray(array5);
        assertArrayEquals(r_esperado5, r5);

        //2.2 El FOR se ejecuta 1 vez
        //Array con un solo elemento
        int[] array6 = {10};
        int[] r_esperado6 = {10};
        int[] r6 = Sorts.inverteixarray(array6);
        assertArrayEquals(r_esperado6, r6);

        //2.3 El FOR se ejecuta n veces
        //Array con varios elementos
        int[] array7 = {5,4,3,2,1};
        int[] r_esperado7 = {1,2,3,4,5};
        int[] r7 = Sorts.inverteixarray(array7);
        assertArrayEquals(r_esperado7, r7);

    }

    @Test
    public void bubbleSort() {

        //1 CAJA NEGRA//

        //1.1 Caso aleatorio
        int[] array = {56,45,4,60,65,33,76,3};
        int[] r_esperado = {3,4,33,45,56,60,65,76};
        int[] r1 = Sorts.bubbleSort(array);
        assertArrayEquals(r_esperado, r1);

        //1.2 Caso límite
        int[] array2 = {21,54,7,9,67,89};
        int[] r_esperado2 = {7,9,21,54,67,89};
        int[] r2 = Sorts.bubbleSort(array2);
        assertArrayEquals(r_esperado2, r2);

        //1.3 Caso erróneo
        //El array devuelve los elementos incorrectos
        int[] array3 = {6,56,87,0,43,7,3};
        int[] r_esperado3 = {1,2,3,4,5,6,7};
        int[] r3 = Sorts.bubbleSort(array3);
        assertNotEquals(r_esperado3, r3);


        //CAJA BLANCA//

        //2.1 El primer FOR no se ejecuta
        //La matriz se encuentra vacío
        int[] array4 = {};
        int[] r_esperado4 = {};
        int[] r4 = Sorts.bubbleSort(array4);
        assertArrayEquals(r_esperado4, r4);

        //2.2 El primer FOR se ejecuta 1 vez
        //Solo hay un elemento en el array
        int[] array5 = {3};
        int[] r_esperado5 = {3};
        int[] r5 = Sorts.bubbleSort(array5);
        assertArrayEquals(r_esperado5, r5);

        //2.3 El primer FOR se ejecuta n veces
        //Varios elementos en un array
        int[] array6 = {6,45,89,1,49};
        int[] r_esperado6 = {1,6,45,49,89};
        int[] r6 = Sorts.bubbleSort(array6);
        assertArrayEquals(r_esperado6, r6);

        //2.4 El segundo FOR no se ejecuta
        //No hay ningún elemento dentro de la matriz
        int[] array7 = {};
        int[] r_esperado7 = {};
        int[] r7 = Sorts.bubbleSort(array7);
        assertArrayEquals(r_esperado7, r7);

        //2.5 El segundo FOR se ejecuta 1 vez
        //En la matriz hay ubicado un solo elemento
        int[] array8 = {88};
        int[] r_esperado8 = {88};
        int[] r8 = Sorts.bubbleSort(array8);
        assertArrayEquals(r_esperado8, r8);

        //2.6 El segundo FOR se ejecuta n veces
        //La matriz tiene varios elementos
        int[] array9 = {54,56,87,4,7,98,44};
        int[] r_esperado9 = {4,7,44,54,56,87,98};
        int[] r9 = Sorts.bubbleSort(array9);
        assertArrayEquals(r_esperado9, r9);

        //2.7 El IF no se ejecuta
        //El array ya se encuentra ordenado
        int[] array10 = {1,2,3,4,5,6};
        int[] r_esperado10 = {1,2,3,4,5,6};
        int[] r10 = Sorts.bubbleSort(array10);
        assertArrayEquals(r_esperado10, r10);

        //2.8 El IF se ejecuta
        //El array está desordenado
        int[] array11 = {65,8,54,37,4,87,55,34};
        int[] r_esperado11 = {4,8,34,37,54,55,65,87};
        int[] r11 = Sorts.bubbleSort(array11);
        assertArrayEquals(r_esperado11, r11);

    }

    @Test
    public void insertionSort() {

        //1 CAJA NEGRA//

        //1.1 Caso aleatorio
        int[] array = {56,45,4,60,65,33,76,3};
        int[] r_esperado = {3,4,33,45,56,60,65,76};
        int[] r1 = Sorts.InsertionSort(array);
        assertArrayEquals(r_esperado, r1);

        //1.2 Caso límite
        int[] array2 = {21,54,7,9,67,89};
        int[] r_esperado2 = {7,9,21,54,67,89};
        int[] r2 = Sorts.InsertionSort(array2);
        assertArrayEquals(r_esperado2, r2);

        //1.3 Caso erróneo
        //No se devuelven los numeros del array dado
        int[] array3 = {6,56,87,0,43,7,3};
        int[] r_esperado3 = {1,2,3,4,5,6,7};
        int[] r3 = Sorts.InsertionSort(array3);
        assertNotEquals(r_esperado3, r3);


        //2 CAJA BLANCA//

        //2.1 El primer FOR no se ejecuta
        //La matriz no tiene elementos
        int[] array4 = {};
        int[] r_esperado4 = {};
        int[] r4 = Sorts.InsertionSort(array4);
        assertArrayEquals(r_esperado4, r4);

        //2.2 El primer FOR se ejecuta 1 vez
        //Solo se dispone de un elemento
        int[] array5 = {70};
        int[] r_esperado5 = {70};
        int[] r5 = Sorts.InsertionSort(array5);
        assertArrayEquals(r_esperado5, r5);

        //2.3 El primer FOR se ejecuta n veces
        //Dado el array se ordena de menor a mayor
        int[] array6 = {34,9,54,6,45,43,23,64,445};
        int[] r_esperado6 = {6,9,23,34,43,45,54,64,445};
        int[] r6 = Sorts.InsertionSort(array6);
        assertArrayEquals(r_esperado6, r6);

        //2.4 El WHILE se ejecuta
        //Hay más de un elemento en el array
        int[] array7 = {65,8,54};
        int[] r_esperado7 = {8,54,65};
        int[] r7 = Sorts.InsertionSort(array7);
        assertArrayEquals(r_esperado7, r7);

        //2.5 El WHILE no se ejecuta
        //La matriz no dispone de elementos
        int[] array8 = {};
        int[] r_esperado8 = {};
        int[] r8 = Sorts.InsertionSort(array8);
        assertArrayEquals(r_esperado8, r8);

        //2.6 El segundo FOR no se ejecuta
        //No dispone de elementos en el array
        int[] array9 = {};
        int[] r_esperado9 = {};
        int[] r9 = Sorts.InsertionSort(array9);
        assertArrayEquals(r_esperado9, r9);

        //2.7 El segundo FOR se ejecuta
        //El array tiene una serie de elementos
        int[] array10 = {65,76,49,4,0,34,8,3};
        int[] r_esperado10 = {0,3,4,8,34,49,65,76};
        int[] r10 = Sorts.InsertionSort(array10);
        assertArrayEquals(r_esperado10, r10);

    }

    @Test
    public void selectionSort() {

        //1 CAJA NEGRA//

        //1.1 Caso aleatorio
        int[] array = {6,8,45,43,7,13};
        int[] r_esperado = {6,7,8,13,43,45};
        int[] r1 = Sorts.SelectionSort(array);
        assertArrayEquals(r_esperado, r1);

        //1.2 Caso límite
        int[] array2 = {21,54,7,9,67,89};
        int[] r_esperado2 = {7,9,21,54,67,89};
        int[] r2 = Sorts.SelectionSort(array2);
        assertArrayEquals(r_esperado2, r2);

        //1.3 Caso erróneo
        //No devuelve los elementos que corresponden al array dado
        int[] array3 = {65,54,9,63,6,348,3};
        int[] r_esperado3 = {3,6,9,65,54,63,348};
        int[] r3 = Sorts.SelectionSort(array3);
        assertNotEquals(r_esperado3, r3);


        //CAJA BLANCA//

        //2.1 El FOR no se ejecuta
        //No hay elementos
        int[] array4 = {};
        int[] r_esperado4 = {};
        int[] r4 = Sorts.SelectionSort(array4);
        assertArrayEquals(r_esperado4, r4);

        //2.2 El FOR se ejecuta 1 vez
        //Solo hay un elemento dentro del array
        int[] array5 = {231};
        int[] r_esperado5 = {231};
        int[] r5 = Sorts.SelectionSort(array5);
        assertArrayEquals(r_esperado5, r5);

        ///2.3 El FOR se ejecuta n veces
        //Dispone de varios elemnentos en el array
        int[] array6 = {67,45,8,99,8,3};
        int[] r_esperado6 = {3,8,8,45,67,99};
        int[] r6 = Sorts.SelectionSort(array6);
        assertArrayEquals(r_esperado6, r6);

        //2.4 El segundo FOR no se ejecuta
        //La matriz no tiene elementos
        int[] array7 = {};
        int[] r_esperado7 = {};
        int[] r7 = Sorts.SelectionSort(array7);
        assertArrayEquals(r_esperado7, r7);

        //2.5 El segundo FOR se ejecuta 1 vez
        //La matriz solo tiene un elemento
        int[] array8 = {16};
        int[] r_esperado8 = {16};
        int[] r8 = Sorts.SelectionSort(array8);
        assertArrayEquals(r_esperado8, r8);

        ///2.6 El segundo FOR se ejecuta n veces
        //La matriz tiene varios elementos
        int[] array9 = {8,5,54,45,32,2,12};
        int[] r_esperado9 = {2,5,8,12,32,45,54};
        int[] r9 = Sorts.SelectionSort(array9);
        assertArrayEquals(r_esperado9, r9);

        //2.7 El IF no se ejecuta
        //El array ya se encuentra ordenado
        int[] array10 = {56,78,98,244,645};
        int[] r_esperado10 = {56,78,98,244,645};
        int[] r10 = Sorts.SelectionSort(array10);
        assertArrayEquals(r_esperado10, r10);

        //2.8 El IF se ejecuta
        //El array no está ordenado
        int[] array11 = {53,5,8,46,67,65,98};
        int[] r_esperado11 = {5,8,46,53,65,67,98};
        int[] r11 = Sorts.SelectionSort(array11);
        assertArrayEquals(r_esperado11, r11);

    }


}