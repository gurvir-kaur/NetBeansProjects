package arrays;

import java.util.Random;
import java.util.Scanner;

public class GURVIR_KAUR_EXAMEN {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        GURVIR_KAUR_EXAMEN.ejercicio5();
    }

    /////// FUNCION PARA LLENAR ARRAY CON NUMEROS ENTEROS ALEATORIOS ////
    public static void llenar(int[] a){
        int l = a.length;
        for(int i = 0; i < l; ++i){

            Random r = new Random();
            int randomNumber = r.nextInt(40);

            a[i] = randomNumber;
            System.out.print(a[i] + " ");
        }
    }

    /////// FUNCION PARA LLENAR Matrices CON NUMEROS ENTEROS ALEATORIOS ////
    public static void llenarMatriz(int[][] a){
        int l = a.length;
        for(int i = 0; i < l; ++i){
            for (int j = 0; j < l; ++j){
                Random r = new Random();
                int randomNumber = r.nextInt(40);

                a[i][j] = randomNumber;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    /////// FUNCION PARA SUMAR TODOS LOS ELEMENTOS DE ARRAY  ////
    public static int sumarElementosArray(int[] a){
        int size = a.length;
        int suma = 0;
        for(int i = 0; i < size;++i){
            suma += a[i];
        }
        return suma;
    }

    /////// FUNCION PARA IMPRIMIR ARRAY  ////
    public static void printMatriz(int[][] a){
        int size = a.length;

        for(int i = 0; i < size; ++i){
            for (int j = 0; j <size; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ejercicio1(){

        /*
        * Compara dos arrays de 10 elementos generados aleatoriamente segun la suma de sus elementos.
        * A > B si la suma de los elementos de A es mayor que la suma de los elementos de B.*/

        //declarar variable, 2 arrays de 10 elementos

        int[] A = new int[10];
        int[] B = new int[10];

        //llenar arrays aleatoriamente
        // he creado una funcion aparte para este paso
        System.out.print("A : ");
        llenar(A);
        System.out.println();
        System.out.print("B : ");
        llenar(B);
        System.out.println();

        //funcion para sumar todos los elementos de array
        int sumaA = sumarElementosArray(A);
        System.out.println("Suma de A es : " + sumaA);
        int sumaB = sumarElementosArray(B);
        System.out.println("Suma de B es : " + sumaB);

        System.out.println();

        //comparacion entre sumaA y sumaB
        if(sumaA > sumaB) System.out.println("A es mayor que B.");
        if(sumaA == sumaB) System.out.println("A y B son iguales.");
        if(sumaB > sumaA) System.out.println(" B es mayor que A.");
    }

    public static void ejercicio2(){

        /*
        *  Dado un array creado con número aleatorios, el usuario introduce un número
        *  y nuestro programa debe buscar dicho número e indicar cuántas veces aparece
        *  en el array*/

        //declarar la variable, 1 arrays de 10 elementos

        int[] array = new int[10];

        //llenar arrays aleatoriamente llamando la funcion llenar()
        System.out.print("Array : ");
        llenar(array);
        System.out.println();

        //declarar 2 variables mas
        // uno para guardar el numero que indicará el usuario
        //otro para guardar las veces que aparece en el array

        int este = teclado.nextInt();
        int veces = 0;

        for(int i = 0; i < 10; ++i){
            if(array[i] == este) ++veces;
        }
        System.out.println();
        System.out.print("El numero " + este + " ha aparecido tantas veces : " + veces);

    }

    public static void ejercicio3() {

        /* Crea un programa que genere un array 2D de manera aleatoria y ponga a 1
        todos los elementos del array menos los que ocupan la diagonal*/

        //declarar la matriz
        int[][] mat = new int[5][5];

        //inicialitzarla
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                if (i == j) {
                    Random r = new Random();
                    int randomNumber = r.nextInt(40);

                    mat[i][j] = randomNumber;
                }
                else mat[i][j] = 1;
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ejercicio4(){

        /*Calcula la traspuesta de un array de 2 dimensiones.
        El nuevo array debe tener como filas las columnas del
        original y como columnas las filas del original.*/

        //declarar 2 arrays bidimensionals
        int[][] mat = new int[5][5];
        int[][] tam = new int[5][5];

        //llenar la mtriz aleatoriamente
        llenarMatriz(mat);

        for(int i = 0; i < 5; ++i){
            for (int j = 0; j < 5; ++j){
                tam[i][j] =  mat[j][i];
            }
        }

        System.out.println();
        printMatriz(tam);
    }


    public static void ejercicio5() {

        /*
         * Juego 3 en Raya. Rellena de manera aleatoria un array 3x3 con 1's y 0's de
         * manera alternativa. El programa parará si en algun momento hay 3 casillas
         * contiguas con el mismo valor, indicando el ganador*/

        int[][] matriz = new int[3][3];

        int i = 1, j = 1;
        matriz[i][j] = 1;
        matriz[i][j+1] = 0;
        matriz[i-1][j] = 1;

        boolean found = false;

        while (!found) {
            if (j == 0) {
                if ((matriz[i][j] == matriz[i][j + 1]) && (matriz[i][j] == matriz[i][j + 2])) found = true;
                else {
                    //para obterner i
                    Random s = new Random();
                    i = s.nextInt(3);

                    //para obterner j
                    Random t = new Random();
                    j = t.nextInt(3);

                    //para obtener 0 o 1
                    Random r = new Random();
                    int randomNumber = r.nextInt(2);

                    matriz[i][j] = randomNumber;
                    System.out.println(matriz[i][j] + " ");
                }

            }
            else {
                if (j == 2) {
                    if ((matriz[i][j] == matriz[i][j - 1]) && (matriz[i][j] == matriz[i][j - 2])) found = true;
                    else {
                        //para obterner i
                        Random s = new Random();
                        i = s.nextInt(3);

                        //para obterner j
                        Random t = new Random();
                        j = t.nextInt(3);

                        //para obtener 0 o 1
                        Random r = new Random();
                        int randomNumber = r.nextInt(2);

                        matriz[i][j] = randomNumber;
                        System.out.println(matriz[i][j] + " ");
                    }
                }
                else {
                    if ((matriz[i][j] == matriz[i][j + 1]) && (matriz[i][j] == matriz[i][j - 1]))found = true;
                    else {
                        //para obterner i
                        Random s = new Random();
                        i = s.nextInt(3);

                        //para obterner j
                        Random t = new Random();
                        j = t.nextInt(3);

                        //para obtener 0 o 1
                        Random r = new Random();
                        int randomNumber = r.nextInt(2);

                        matriz[i][j] = randomNumber;
                        System.out.println(matriz[i][j] + " ");
                    }
                }
            }
        }
    }
}
