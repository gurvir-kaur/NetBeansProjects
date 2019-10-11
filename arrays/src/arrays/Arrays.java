/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gurvir
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        Arrays.multiplicar();
    }
    
    //////// FUNCION PARA ESCRIBIR UN ARRAY /////////
    public static void escribir(int[] a){
        int l = a.length;
        for(int i = 0; i < l; ++i){
            System.out.print(a[i] + " ");
        }
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
    
    ////// FUNCION PARA LEER ARRAY ///// 
    public static void leer(int[] a, int n){
        for(int i = 0; i < n; ++i){
            a[i] = teclado.nextInt();
        }
    }
    
    public static void ejercicio1(){
        /*
        a) Crea una tabla unidimensional de 10 elementos de tipo numérico 
        entero y nombre 'numeros'
        */
        /*
        b) Carga la tabla con valores positivos y negativos
        */
        
        int[] numeros = {1, -3, 4, 5, -9, 2, 0, -7, 01, -21};
      
        
        /*
        c) Muestra en pantalla cada elemento de la tabla junto con su 
        cuadrado y su cubo.*/
        
        for(int i = 0; i < numeros.length; ++i){
            System.out.println(numeros[i] + " " + (numeros[i]*numeros[i]));
        }
    }
    
    public static void ejercicio2(){
    /*2.- Diseñar el algoritmo correspondiente a un programa, que:

        a) Crea una tabla unidimensional de 15 elementos 
                 de tipo entero y nombre'vector'.*/
        
        int[] vector = new int[15];
        
        /*b) Carga la tabla con valores aleatorios.*/
        
        llenar(vector);
        
        /*c) Calcula la suma de los 'N' primeros elementos de la tabla.*/
        /*d) Muestra el resultado obtenido, así como el contenido de la 
             tabla en pantalla.*/
        
        Random r = new Random();
        int N = r.nextInt(15);
        int suma = 0;
        
        for(int i = 0; i < N; ++i){
            suma += vector[i];
        }
        System.out.println();
        System.out.println("La suma de los primeros " + N + " numero es " 
                + suma );
    }
    
    public static void ejercicio3(){
    /*
    3.- Diseñar el algoritmo correspondiente a un programa, que:
        a) Crea un vector de 20 elementos de tipo entero y nombre 'tabla'.*/
        
        int[] tabla = new int[20];
        
        /*b) Carga el vector con valores aleatorios.*/
        llenar(tabla);
        System.out.println();
        
        /*c) Muestra en pantalla todos aquellos elementos mayores de 30 junto 
           con la posición que ocupan en el vector. En caso de no existir 
           ninguno se mostrará el siguiente mensaje:
                        "NO HAY NUMEROS MAYORES DE 30"
        */
        int l = tabla.length;
        boolean found = false;
        for(int i = 0; i < l; ++i){
            if(tabla[i] > 30){
                System.out.println(i + " " + tabla[i]);
                found = true;
            }
        }
        
        if(!found) System.out.println("NO HAY NUMEROS MAYORES DE 30");
    }
    
    public static void ejercicio4(){
        /*
        4.- Diseñar un algoritmo en el que dado el siguiente vector de nombre 
        'origen':
        --- --- ---- ---- ---- ---- ---- ---- ---- ---- ----
        | 1 | 4 | 10 | 32 | 60 | 91 | 34 | 56 | 73 | 88 | 86 |
        --- --- ---- ---- ---- ---- ---- ---- ---- ---- ----
        */
        
        int[] origen = {1, 4, 10, 32, 60, 91, 34, 56, 73, 88, 86};
                
        /*a) Lo recorra metiendo en un segundo vector de nombre 'destino' todos 
        aquellos elementos pares, mayores de 25.*/
        int[] destino = new int[11];
        int l = origen.length;
        int j = 0;
        for(int i = 0; i < l; ++i){
            if((origen[i]%2 == 0) && (origen[i] > 25)){
                destino[j] = origen[i];
                ++j;
            }
        }
        //b) Muestre en pantalla el contenido de los dos vectores.
        
        for(int i = 0; i < l; ++i){
            System.out.print(origen[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < l; ++i){
            System.out.print(destino[i] + " ");
        }
        System.out.println();
    }
    
    public static void ejercicio5(){
        
        //5.- Diseñar el algoritmo correspondiente a un programa, que:
        
        //a) Crea una matriz de 10x10 (filas x columnas) y nombre 'tabla'.
        int tabla[][] = new int[10][10];
        
        /*b) Carga la matriz de manera que las filas pares se rellenan con 
             1 y las filas impares con 0.*/
        
        int l = tabla.length;
        for(int i = 0; i < l; i++){
            for(int j = 0; j < l; j++){
                if(i%2 == 0){
                    tabla[i][j] = 1;
                }
                else tabla[i][j] = 0;
            } 
        }
        
        /*c) Una vez inicializada la matriz muestra su contenido en pantalla.*/
        
        for(int i = 0; i < tabla.length; i++){
            for(int j = 0; j < tabla.length; j++){
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void ejercicio6(){
        //6.- Diseñar el algoritmo correspondiente a un programa, que:
        
        //a) Crea una tabla bidimensional de longitud 5x5 y nombre 'diagonal'.
        int[][] diagonal = new int[5][5];
        
        /*b) Carga la tabla de forma que los componentes pertenecientes a la 
             diagonal de la matriz tomen el valor 1 y el resto el valor 0.*/
        int l = diagonal.length;
        for(int i = 0; i < l; i++){
            for(int j = 0; j < l; j++){
                if(i == j) diagonal[i][j] = 1;
                else diagonal[i][j] = 0;
            } 
        }
        //c) Muestra el contenido de la tabla en pantalla.
        
        for(int i = 0; i < l; i++){
            for(int j = 0; j < l; j++){
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void ejercicio7(){
        //7.- Diseñar el algoritmo correspondiente a un programa, que:
        //a) Crea una tabla bidimensional de longitud 10x10 y nombre 'matriz'.
        int[][] matriz = new int[10][10];
        
        //b) Carga la tabla con valores numéricos enteros.
        int l = matriz.length;
        int x = 0;
        for(int i = 0; i < l; i++){
            for(int j = 0; j < l; j++){
                matriz[i][j] = x;
                ++x;
            }
        }
        
        /*c) Suma todos los elementos de cada fila y todos los elementos de 
        cada columna visualizando los resultados en pantalla.*/
        int sumaFila = 0;
        int sumaCol = 0;
        
        for(int i = 0; i < l; i++){
            for(int j = 0; j < l; j++){
                System.out.print(matriz[i][j] + " ");
                sumaFila += matriz[i][j];
            }
            System.out.print(" -> " + sumaFila);
            sumaFila = 0;
            System.out.println();
        }
        
        System.out.println("Suma de Columnas :");
        
        for(int j = 0; j < l; j++){
            for(int i = 0; i < l; i++){
                sumaCol += matriz[i][j];
            }
            System.out.print(sumaCol + " ");
            sumaCol = 0;
        }
    }
    
    public static void ejercicio8(){
        /*
        8.- Diseñar el algoritmo correspondiente a un programa, que:
        a) Crea una tabla bidimensional de longitud 5x15 y nombre 'marco'.*/
        int[][] marco = new int[5][15];
        
       /* b) Carga la tabla con dos únicos valores 0 y 1, donde el valor uno 
        ocupará las posiciones o elementos que delimitan la tabla, es decir, 
        las más externas, mientras que el resto de los elementos contendrán 
        el valor 0.
                            111111111111111
                            100000000000001
                            100000000000001
                            100000000000001
                            111111111111111
        */
       for(int i = 0; i < 5; i++){
           for(int j = 0; j < 15; j++){
               if( (i == 0) || (i == 4) || (j == 0) || (j == 14)){
                   marco[i][j] = 1;
               }
               else marco[i][j] = 0;
           }
       }
        
        //c) Visualiza el contenido de la matriz en pantalla.*/
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 15; j++){
                System.out.print(marco[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void ejercicio9(){
        /*
        9.- Programa que declare un vector de diez enteros, pida al usuario 
        valores para rellenarlo y muestre las cinco sumas de los elementos 
        impares con los pares siguientes (es decir, el 1 con el 2, el 2 con 
        el 3...).*/
        int[] vector = new int[10];
        
        System.out.println("Enter 10 digits : ");
        for(int i = 0; i < 10; i++){
            vector[i] = teclado.nextInt();
        }
        int suma = vector[0];
        for(int i = 1; i < 10; i++){
            System.out.print(suma + vector[i] + " ");
            suma = vector[i];
        }
    }
    
    public static void ejercicio10(){
        /*
        10.- Programa que declare un vector de cinco enteros, lo rellene con 
        los datos introducidos por el usuario y muestre las sumas parciales 
        de los dos primeros elementos, de los tres primeros, etc.
        */
        int[] vector = new int[5];
        
        System.out.println("Enter 5 digits : ");
        for(int i = 0; i < 5; i++){
            vector[i] = teclado.nextInt();
        }
        int suma = vector[0];
        for(int i = 1; i < 5; i++){
            suma += vector[i];
            System.out.print(suma + " ");
        }
    }
    
    public static void ejercicio11(){
        /*
        11.- Programa que declare un vector de diez reales, lo rellene y 
        calcule el índice del elemento menor.
        */
        double[] vectorReales = new double[10];
        int l = vectorReales.length;
        
        for(int i = 0; i < l; ++i){
            
            Random r = new Random();
            double randomNumber = r.nextInt(40);
            
            vectorReales[i] = randomNumber;
            System.out.print(vectorReales[i] + " ");
        }
        System.out.println();
        
        int minAt = 0;
        double min = vectorReales[0];
        for(int i = 1; i < l; ++i){
            if(vectorReales[i] < min){
                min = vectorReales[i];
                minAt = i;
            }
        }
        System.out.println(min + " en la posición " + minAt);
    }
    
    public static void ejercicio12(){
        /*
        12.- Programa que declare dos vectores 'v' y 'w' de cinco enteros 
        cada uno, pida valores para 'v' y los copie en orden inverso a 'w'.
        */
        
        int[] v = new int[5];
        int[] w = new int[5];
        System.out.print("Enter 5 digits with space : ");
        int j = 4;
        for(int i = 0; i < 5; i++){
            v[i] = teclado.nextInt();
            w[j] = v[i];
            --j;
        }
        escribir(w);
    }
    
    public static void ejercicio13(){
        /*
        13.- Programa que declare tres vectores 'v', 'w' y 'x' de cinco 
        enteros cada uno, pida valores para 'v' y 'w' y calcule x=v+w.
        */
        int[] v = new int[5];
        int[] w = new int[5];
        int[] x = new int[5];
        System.out.println("Enter 5 numbers for v : ");
        leer(v, 5);
        System.out.println("Enter 5 numbers for w : ");
        leer(w, 5);
        
        System.out.print("La suma de v+w es = ");
        for(int i = 0; i < 5; ++i){
            x[i] = v[i]+w[i];
            System.out.print(x[i] + " ");
        }
    }
    
    public static void ejercicio14(){
        /*
        14.- Programa que declare un vector de diez elementos enteros y pida 
        números para rellenarlo hasta que se llene el vector o se introduzca 
        un número negativo. Entonces se debe imprimir el vector (sólo los 
        elementos introducidos).
        */
        int[] array = new int[10];
        System.out.println("Enter 10 number for array : ");
        
        int in = teclado.nextInt();
        int i = 0;
        
        while(in >= 0 && i < 10){
            array[i] = in;
            ++i;
            in = teclado.nextInt();
        }
        escribir(array);
    }
    
    public static void ejercicio15(){
        /*
        15.- Programa que declare tres vectores 'v', 'w' y 'x' de cinco, 
        cinco y diez enteros respectivamente, pida valores para 'v' y 'w' 
        y rellene 'x' con valores alternos de 'v' y 'w', es decir, el primer 
        elemento de 'v', el primero de 'w', el segundo de 'v', el segundo 
        de 'w'... Al final debe mostrar 'x' por pantalla.
        */
        int[] v = new int[5];
        int[] w = new int[5];
        int[] x = new int[10];
        
        System.out.println("Enter 5 numbers for v : ");
        leer(v, 5);
        System.out.println("Enter 5 numbers for w : ");
        leer(w, 5);
        
        int j = 0, k = 0;
        for(int i = 0; i < 10; ++i){
            if(i%2 == 0){
                x[i] = v[j];
                ++j;
            }
            else{
                x[i] = w[k];
                ++k;
            }
        }
        escribir(x);
    }
    
    public static void ejercicio16(){
        /*
        16.- Programa que declare tres vectores 'i', 'p' y 'v' de cinco, 
        cinco y diez enteros respectivamente, pida valores para 'v' 
        y rellene 'i' con los elementos de índice par de 'v',y 'p' con los 
        de índice impar. Al final debe mostrar 'v' por pantalla.
        */
        
        int[] i = new int[5];
        int[] p = new int[5];
        int[] v = new int[10];
        System.out.println("Enter 10 numbers for v : ");
        leer(v, 10);
        
        int j = 0, k = 0;
        for(int w = 0; w < 10; ++w){
            if(w%2 == 0){
                i[j] = v[w];
                ++j;
            }
            else{
                p[k] = v[w];
                ++k;
            }
        }
        escribir(i);
        System.out.println();
        escribir(p);
        System.out.println();
        escribir(v);
    }
    
    public static void ejercicio17(){
        /*
        17.- Programa que declare tres vectores 'may', 'men' y 'v' de cinco 
        enteros cada uno, pida valores para 'v', calcule su media ('m') y 
        rellene 'may' con los elementos de 'v' mayores o iguales que 'm' y 
        'men' con los elementos de 'v' menores que 'm'. Al final debe mostrar
        'may' y 'men' por pantalla.
        */
        int[] may = new int[5];
        int[] men = new int[5];
        int[] v = new int[5];
        System.out.println("Enter 5 numbers for v : ");
        leer(v, 5);
        
        //calculamos la media
        int suma = 0;
        for(int i = 0; i < 5; ++i){
            suma = suma + v[i];
        }
        int media = suma/5;
        System.out.println("media = " + media);
        
        //rellenar may con elementos de v mayores que media
        int j = 0;
        for(int i = 0; i < 5; ++i){
            if(v[i] > media) {
                may[j] = v[i];
                ++j;
            }
        }
        //rellenar mem con elementos de v menores que media
        int k = 0;
        for(int i = 0; i < 5; ++i){
            if(v[i] < media) {
                men[k] = v[i];
                ++k;
            }
        }
        escribir(may);
        System.out.println();
        escribir(men);
    }
    
    public static void ejercicio18(){
        /*
        18.- Programa que calcule, según la siguiente tabla, el impuesto a 
        pagar según el salario anual. Se pedirán como datos al usuario el 
        salario mensual y el número de pagas. No se deben usar decisiones 
        anidadas sino tres vectores 'liminf', 'limsup' y 'pct' que darán el
        límite inferior, el superior y el impuesto asociado, respectivamente.
        Salario anual Porcentaje de impuesto
                    ------------- ----------------------
                            < 1000000 5%
                        1000000-2500000 12%
                        2500001-3800000 15%
                        3800001-6000000 22%
                        > 6000000 30%
        */
        System.out.println("Enter your salary and number of payments : ");
        int sal_mensual = teclado.nextInt();
        int pagas = teclado.nextInt();
        int sal = sal_mensual*pagas;
        
        int[] liminf = {0, 1000000, 2500001, 3800001, 6000000};
        int[] limsup = {1000000, 2500000, 3800000, 6000000, 100000000};
        int[] pct = {5, 12, 15, 22, 30};
        
        for(int i = 0; i < 5; ++i){
            if(sal >= liminf[i] && sal <= limsup[i]){
                System.out.println((sal*pct[i])/100);
            }
        } 
    }

    public static void ejercicio19(){
        /*
        19.- Escribir un programa que permita leer el nombre y las notas del primer y segundo parcial de N alumnos.
        Se utilizará un array bidimensional de tipo float para guardar las notas. Los nombres de cada alumno/a se
        guardarán en un array de tipo String denominado nombre. El programa deberá pedir el nombre y las notas de
        cada alumno/a y calculará la nota final como la media de las notas parciales. Al final mostrará los/as
        alumnos/as suspensos/as, los/as aprobados/as, la nota máxima y los/as alumnos/as que hayan alcanzado dicha
        nota máxima. Modificar el programa de forma que la nota de cada parcial tenga un porcentaje de influencia en
        la nota final. Por ejemplo: primer parcial 40%, segundo 60%; primero 35%, segundo 65%, etc. Los porcentajes se
        introducirán por teclado.
        * */

        //lee numero de alumnos
        System.out.println("Enter the number of students : ");
        int n = teclado.nextInt();

        //lee los porcentajes
        System.out.println("Escribe el porcentaje de primer parcial : ");
        float pp = teclado.nextFloat();

        System.out.println("Escribe el porcentaje del segundo parcial : ");
        float sp = teclado.nextFloat();

        //el array bidimensional tendra solo 2 columas en este ejercicio ya que solo hay dos parciales
        int m = 2;

        //crear arrays para guardar nombres y notas
        String[] alumnos = new String[n];
        float[][] notas = new float[n][m];

        for(int i = 0; i < n; ++i){
            alumnos[i] = teclado.next();
            for(int j = 0; j < m; ++j){
                notas[i][j] = teclado.nextFloat();
            }
        }

        //calcula la media de todos los alumnos
        float[] medias = new float[n];

        for(int i = 0; i < n; ++i){

            float media = 0;
            for(int j = 0; j < m; ++j){
                if(j == 0) media +=  (notas[i][j]*pp)/100;
                else media +=  (notas[i][j]*sp)/100;
            }
            medias[i] = media;
        }

        //imprime los alumnos suspesos y calcula la nota_max
        float nota_max = 0;
        System.out.println("Suspensos");
        for(int i = 0; i < n; ++i){
            if(medias[i] < 5) System.out.println(alumnos[i] + " " + medias[i]);
            if(medias[i] > nota_max) nota_max = medias[i];
        }

        //imprime los alumnos aprobados
        System.out.println("Aprobados");
        for(int i = 0; i < n; ++i){
            if(medias[i] >= 5) System.out.println(alumnos[i] + " " + medias[i]);
        }

        //ahora hay que imprimir nota_max y todos los alumnos que hayan alcanzado nota_max
        System.out.println("La mota maxima es : " + nota_max);

        for(int i = 0; i < n; ++i){
            if(medias[i] >= nota_max) System.out.println(alumnos[i]);
        }
    }

    // La Hormiga !
    public static void printHormiga(char[][] camino){
        int n = camino.length;
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                System.out.print(camino[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int asignaPosicion(int n){
        Random r = new Random();
        int randomNumber = r.nextInt(n-1);
        int x = randomNumber;
        return x;
    }

    public static void ejercicio20(){
        //La Hormiga borracha

        System.out.println("Escribe el tamaño de tu camino : ");
        int n = teclado.nextInt();

        char[][] camino = new char[n][n];
        char[] caracters = {'o','a', 'z', 'x'};


        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                camino[i][j] = caracters[ (int) (Math.random() * 4) ];
            }
        }

        int x = 0;
        int y = 0;
        camino[x][y] = '*';

        printHormiga(camino);

        System.out.println("o = vacia, a = azucar, z = vino, x = veneno, * = La Hormiga");
        System.out.println();

        int i = 1;
        int j = 1;
        boolean muerto = false;

        while(!muerto){
            camino[x][y] = 'o';

            // VACIO
            if(camino[i][j] == 'o'){
                camino[i][j] = '*';
                printHormiga(camino);
                System.out.println();
                camino[i][j] = 'o';
                if(( i == 0 || i != n-1) || (i == n-1 && j == 0) || (i == 0 && j == 0)) ++j;
                else{
                    if((i == n-1) && (j != n-1)) --i;
                    else{
                        if(i == 0 || j == n-1) --j;
                    }
                }
            }

            // AZUCAR
            if (camino[i][j] == 'a') {
                System.out.println("Es con azucar, me lo como !");
                camino[i][j] = ' ';
                System.out.println();
                printHormiga(camino);
                if(( i == 0 || i != n-1) || (i == n-1 && j == 0) || (i == 0 && j == 0)) ++j;
                else{
                    if((i == n-1) && (j != n-1)) --i;
                    else{
                        if(i == 0 || j == n-1) --j;
                    }
                }
            }

            //VINO
            if (camino[i][j] == 'z') {
                System.out.println();
                System.out.println("Ha comido azucar con vino !! ");
                camino[i][j] = '%';
                printHormiga(camino);
                muerto =true;
            }

            //VENENO
            if (camino[i][j] == 'x') {
                System.out.println();
                System.out.println("Es azucar con veneno, no lo como ! ");
                printHormiga(camino);
                if(( i == 0 || i != n-1) || (i == n-1 && j == 0) || (i == 0 && j == 0)) ++j;
                else{
                    if((i == n-1) && (j != n-1)) --i;
                    else{
                        if(i == 0 || j == n-1) --j;
                    }
                }
            }

            if(camino[i][j] == ' '){
                if(( i == 0 || i != n-1) || (i == n-1 && j == 0) || (i == 0 && j == 0)) ++j;
                else{
                    if((i == n-1) && (j != n-1)) --i;
                    else{
                        if(i == 0 || j == n-1) --j;
                    }
                }
            }
        }

        System.out.println("Ha comido azucar con vino, ahora esta borracha !! ");

        boolean aun_vivo = false;
        if(muerto) aun_vivo = true;

        while(aun_vivo){
            i = j = asignaPosicion(n);


            //VACIO
            if(camino[i][j] == 'o'){
                i = j = asignaPosicion(n);
                printHormiga(camino);
            }

            //AZUCAR
            if(camino[i][j] == 'a'){
                System.out.println("Es con azucar, me lo como !");
                camino[i][j] = ' ';
                System.out.println();
                printHormiga(camino);
                i = j = asignaPosicion(n);
            }


            //VENENO
            if(camino[i][j] == 'x'){
                System.out.println(" Ha muerto de verdad !");
                aun_vivo = false;
            }

            //VINO
            if(camino[i][j] == 'z'){
                camino[i][j] = ' ';
                printHormiga(camino);
                System.out.println();
                i = j = asignaPosicion(n);
            }
        }

        System.out.println("Fin !! ");
    }

    //un 1 como vecino
    public static void ejercicioVecino(){
        int n = 10;
        int[][] a = new int[n][n];

        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j) {
                Random r = new Random();
                int randomNumber = r.nextInt(100);
                a[i][j] = randomNumber;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int count = 0;

        for(int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {

                // i != 0, j != 0, i != n-1, j != n-1
                if(i != n-1 && i != 0 && j != 0 && j != n-1 ) {

                    if (a[i - 1][j] == 1) ++count;
                    else {
                        if (a[i][j + 1] == 1) ++count;
                        else {
                            if (a[i + 1][j] == 1) ++count;
                            else{
                                if (a[i][j - 1] == 1) ++count;
                            }
                        }
                    }
                }


                //i == 0
                if(i == 0){
                    //j == 0
                    if(j == 0 ){
                        if(a[i][j+1] == 1){
                            ++count;
                        }
                        else {
                            if(a[i+1][j] == 1){
                                ++count;
                            }
                            else{
                                if(a[i][n-1] == 1){
                                    ++count;
                                }
                                else{
                                    if(a[n-1][j] == 1){
                                        ++count;
                                    }
                                }
                            }
                        }
                    }
                     // j == n-1
                    if(j == n-1 ){
                        if(a[i][j-1] == 1){
                            ++count;
                        }
                        else{
                            if(a[i][0] == 1){
                                ++count;
                            }
                            else{
                                if(a[n-1][j] == 1){
                                    ++count;
                                }
                                else{
                                    if(a[i+1][j] == 1){
                                        ++count;
                                    }
                                }
                            }
                        }
                    }
                    else{
                        // cualquier j diferente de 0 y n-1
                        if(j != 0 && j != n-1 ){
                            if(a[n-1][j] == 1){
                                ++count;
                            }
                            else{
                                if(a[i][j-1] == 1){
                                    ++count;
                                }
                                else{
                                    if(a[i][j+1] == 1){
                                        ++count;
                                    }
                                    else{
                                        if(a[i+1][j] == 1){
                                            ++count;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                // i == n-1
                if(i == n-1){
                    // j == 0
                    if(j == 0 ){
                        if(a[0][j] == 1){
                            ++count;
                        }
                        else {
                            if(a[i][n-1] == 1){
                                ++count;
                            }
                            else{
                                if(a[i-1][j] == 1){
                                    ++count;
                                }
                                else{
                                    if(a[i][j+1] == 1){
                                        ++count;
                                    }
                                }
                            }
                        }
                    }
                    // j == n-1
                    if(j == n-1){
                        if(a[0][j] == 1){
                            ++count;
                        }
                        else{
                            if(a[n-1][0] == 1){
                                ++count;
                            }
                            else{
                                if(a[n-1][j-1] == 1){
                                    ++count;
                                }
                                else{
                                    if(a[i-1][j] == 1){
                                        ++count;
                                    }
                                }
                            }
                        }
                    }
                    else{
                        //cualquier j diferente de 0 y n-1
                        if(j != 0 && j != n-1 ){
                            if(a[i-1][j] == 1){
                                ++count;
                            }
                            else{
                                if(a[i][j-1] == 1){
                                    ++count;
                                }
                                else{
                                    if(a[i][j+1] == 1){
                                        ++count;
                                    }
                                    else{
                                        if(a[0][j] == 1){
                                            ++count;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }

    public static void color(){

        System.out.println("Enter a positive number:" );
        int n = teclado.nextInt();
        char[][] celda = new char[n][n];

        int x = asignaPosicion(n);
        celda[x][x] = '*';
        celda[x+1][x] = '*';
        celda[x][x+1] = '*';

        printHormiga(celda);

    }

    public static void ejercicioE(){
        int[] repito = new int[10];

        llenar(repito);

        boolean rep = false;

        int r = -1;
        int i = 0;
        while( i < 10){

            for(int j = i+1; j < 10; ++j){
                if(repito[i] == repito[j]){
                    r = i;
                    break;
                }
            }
            ++i;
        }
        System.out.println();
        System.out.println(r);
    }

    public static void circular(){
        // recibe 2 arrays
        // hay que decir si son iguales circularmente !
        //ejemplo :
        //   3 4 1 5
        //   5 3 4 1

        System.out.println("Escribe el tamañao de arrays : ");
        int n = teclado.nextInt();
        int[] one = new int[n];
        int[] two = new int[n];

        System.out.println("Ecribe los elementos de primer array separados !");
        leer(one, n);
        System.out.println("Escribe los elementos de segundo array separados !");
        leer(two, n);

        // en j guardare la posicion del elemento de two que es igual al primer elemento de one
        int j = 0;
        while(j < two.length){
            if(two[j] == one[0]) break;
            else ++j;
        }

        // i circula en array one
        // j circula en array two
        int i = 1;
        j = j+1;
        boolean cir = false;
        while( i < one.length && !cir){
            if(j >= two.length) j = 0;
            if(one[i] == two[j]){
                ++i;
                ++j;
            }
            else {
                System.out.println("No son iguales !");
                cir = true;
            }
        }

        if(!cir) System.out.println("Son iguales ! ");
    }

    public static void leerMatric(int[][] a, int f, int c){

        for(int i = 0; i < f; ++i){
            for(int j = 0; j < c; ++j){
                a[i][j] = teclado.nextInt();
            }
        }
    }

    public static void multiplicar(){

        System.out.println("dimensiones de primer Matric : ");
        int f1 = teclado.nextInt();
        int c1 = teclado.nextInt();

        System.out.println("dimensiones de segundo Matric : ");
        int f2 = teclado.nextInt();
        int c2 = teclado.nextInt();

        if(c1 == f2) {
            System.out.println("se pueden multipilcar !");

            System.out.println("Valores de primer matric : ");
            int[][] primer = new int[f1][c1];

            leerMatric(primer, f1, c1);

            System.out.println("Valores de segundo matric : ");
            int[][] segundo = new int[f2][c2];

            leerMatric(segundo, f2, c2);

            int[][] resultado = new int[f1][c2];

            for (int i = 0; i < f1; ++i) {
                for (int j = 0; j < c2; ++j) {
                    int x = 0;
                    for (int k = 0; k < segundo.length; ++k) {
                        x += primer[i][k] * segundo[k][j];
                    }
                    resultado[i][j] = x;
                    System.out.print(resultado[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("no se pueden multiplicar !");
        }
    }
}


