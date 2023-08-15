package org.example;

public class Sorts {

    /*

    MÉTODO inverteixArray

    He modificado los parámetros del FOR ya que no eran correctos y dentro del FOR he
    añadido el código adecuado para que ejecute la inversión del array.
    Además he añadido el método imprimirArray para devolver el array invertido.

    */
    public static int[] inverteixarray(int[] arr) {
        int temp;
        System.out.println("Array invertida");
        //Imprimeix l'array amb els numeros invertits
        for (int i = 0; i< arr.length / 2; i++) {

            temp = arr[i];
            arr[i] = arr[arr.length -1 -i];
            arr[arr.length -1 -i] = temp;

        }
        imprimirArray(arr);
        return arr;
    }

    public static void imprimirArray(int[] arr) {

        String cadena = "";
        for (int i = 0; i < arr.length; i++) {

            cadena += arr[i] + " ";

        }

        cadena = cadena.substring(0, cadena.length());
        System.out.println(cadena + "\n");

    }


    /*

    MÉTODO bubbleSort

    He cambiado los parámetros del FOR y he añadido un segundo FOR, dentro de este he
    creado un condicional IF para que compruebe si el siguiente numero del array es
    mayor o no al actual.
    He creado el método imprimirBubbleSort para que devuelva la matriz.

    */

    public static int[] bubbleSort(int[] arr) {
        int[] array = arr;
        int aux;

        System.out.println("Bubble Sort");

        for (int i = 0; i < array.length -1; i++) {

            for (int j = 0; j < array.length -i -1; j++) {
                if (array[j+1] < array[j]) {

                    aux = array[j+1];
                    array[j+1] = array[j];
                    array[j] = aux;
                }
            }
        }
        imprimirBubbleSort(array);
        return array;
    }

    public static void imprimirBubbleSort(int[] arr) {

        String cadena = "";
        for (int i = 0; i < arr.length; i++) {

            cadena += arr[i] + " ";

        }

        cadena = cadena.substring(0, cadena.length());
        System.out.println(cadena + "\n");

    }


    /*

    MÉTODO InsertionSort

    En este método no he precisado hacer ningún cambio, solo he creado como en los
    demás métodos otro método para imprimir el array del primero.

    */

    public static int[] InsertionSort (int[] arr) {
        int[] array = arr;

        System.out.println("Insertion Sort");

        for (int i = 0; i < array.length; i++) {
            int valueToInsert = array[i];
            int position = i;

            while ( position > 0 && array[position - 1] > valueToInsert ) {
                array[position] = array[position - 1];
                position = position - 1;
            }
            array[position] = valueToInsert;
        }
        System.out.println("\n After Sorting...");
        imprimirInsertionSort(array);
        return array;
    }

    public static void imprimirInsertionSort(int[] arr) {

        String cadena = "";
        for (int i = 0; i < arr.length; i++) {

            cadena += arr[i] + " ";

        }

        cadena = cadena.substring(0, cadena.length());
        System.out.println(cadena + "\n");

    }


    /*

    MÉTODO SelectionSort

    En el primer FOR solo he tenido que modificar el segundo parámetro y dentro de él,
    dejando de lado el segundo FOR, he añadido la variable index y eliminado del
    segundo FOR. En el segundo FOR he modificado la condición del IF ya que la
    condición era que si el elemento en la posición era mayor a esta misma hiciera lo
    que contiene el IF, además he corregido el contenido del IF. Despúes del cierre del
    segundo FOR he añadido un código similar al que había en el IF que había en el
    código inicial. Finalmente he añadido el método que devuelve el array.

    */

    public static int[] SelectionSort (int[] arr) {
        int[] array = arr;

        System.out.println("Selection Sort");

        for (int i = 0; i < array.length -1; i++) {

            int index = i;

            for (int j = i+1; j < array.length; j++) {

                if (array[j] < array[index]) {

                    index = j;

                }
            }

            int nombreMenor = array[index];
            array[index] = array[i];
            array[i] = nombreMenor;

        }

        System.out.println("\n After Sorting...");
        imprimirSelectionSort(array);
        return array;

    }

    public static void imprimirSelectionSort(int[] arr) {

        String cadena = "";
        for (int i = 0; i < arr.length; i++) {

            cadena += arr[i] + " ";

        }

        cadena = cadena.substring(0, cadena.length());
        System.out.println(cadena + "\n");

    }

}