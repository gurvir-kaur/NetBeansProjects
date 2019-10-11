/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacion_de_ejercicios_2;

import java.util.Scanner;

/**
 *
 * @author gurvi
 */
public class Relacion_de_ejercicios_2 {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        Relacion_de_ejercicios_2.ejercicio11a();
    }
    
    
    /*
    Escriure un programa que escrigui la suma dels n primers nombres parells, 
    considerant que el primer nombre parell és el 2. Podeu suposar que n és 
    sempre més gran o igual que 0. Si n val 0, el programa ha d’escriure també
    0. El valor de n és introduït per teclat. Heu d’escriure tres versions 
    diferents del programa, utilitzant les tres estructures iteratives del 
    C: while ... , do ... while, for ...
    */
    public static void ejercicio11a(){
        
        // do...while
        System.out.println("Enter a number : ");
        int n = teclado.nextInt();
        int i  = 0;
        int suma = 2;
        
        if(n == 0 || n == 1) System.out.println(0);
        else{
            do{
                suma = suma+2;
                ++i;
            }
            while(i <= n);
            System.out.println(suma);
        }
    }
    
    public static void ejercicio11b(){
        
        // while
        int n = teclado.nextInt();
        int i = 0;
        int suma = 2;
        
        if(n == 0 || n == 1) System.out.println(0);
        else{
            while(i <= n){
            suma = suma+2;
            ++i;
            }
            System.out.println(suma);
        }
        
    }
    
    public static void ejercicio11c(){
        
        // for
        
        int n = teclado.nextInt();
        int suma = 2;
        
        if(n == 0 || n == 1) System.out.println(0);
        else{
            for(int i = 0; i <= n; ++i){
                suma = suma+2;
            }
            System.out.println(suma);
        }
    }
    
    /*
    Escriure un programa (amb les tres estructures iteratives, 
    while..., do ... while i for ...) que llegeixi un nombre N 
    més gran que zero i calculi la suma 1 + 2 + 3 + .... + N.*/
    
    public static void ejercicio12a(){
        
        // do...while
        int n = teclado.nextInt();
        int i  = 0;
        int suma = 0;
        
        do{
            suma = suma + i;
            ++i;
        }
        while(i <= n);
        System.out.println(suma);
        
    }
    
    public static void ejercicio12b(){
        
        // while
        int n = teclado.nextInt();
        int i = 0;
        int suma = 0;
        
        while(i <= n){
            suma = suma+i;
            ++i;
        }
        
        System.out.println(suma);
    }
    
    public static void ejercicio12c(){
        
        // for
        
        int n = teclado.nextInt();
        int suma = 0;
        
        for(int i = 0; i <= n; ++i){
                suma = suma+i;
        }
        
        System.out.println(suma);
    }
    
    public static void ejercicio13(){
        /*Quin serà el valor de les variable n i x després 
        d’executar el següent fragment de programa?*/
        int x = 0;
        int n = 16;
        while (n % 2 == 0){
            x = x + n;
            n = n / 2;
        }
        
        System.out.println(n + " " + x);
        
        // el valor de n = 1 y x = 30;
    }
    
    public static void ejercicio14(){
        /*
        Quantes vegades s’executa la instrucció printf en el següent programa?
        
        for (i = 1; i <= 20; i = i + 2){
        a = 0;
          do{
            printf (“%d” %d\n”, i, a);
            a = a + 1;
           }while (a < 10)
        }
        
        S'EXECUTA 200 vegades !!!
        */
    }
    
    public static void ejercicio15(){
        /*
        Quin és el valor de les variables j i k 
        després d’executar el següent programa?
        
        int x = 12, j = 5, k = 0;
        
        if (0 == x % 4){
            for (j = 0; j < 10; j = j + 4)
            k = k + j;
        }
        else{
            for (j = 0; j < 10; j = j + 2)
            k = k + j;
        }
        
        Los valor son j = k = 12 !!!
        */
        
    }
    
    public static void ejercicio16(){
        
        /*
        Escriure un programa que calculi el mínim, el màxim i la mitja 
        d’una sèrie de nombres introduïts per l’usuari. La sèrie acaba 
        quan l’usuari introdueix un nombre negatiu.
        */
        
        System.out.println("Enter a number : ");
        int n = teclado.nextInt();
        int max = 0, min = 0, media = 0, i = 0, m = n;
        
        while(n >= 0){
            
            if(m >= n) max = m;
            if(m < n) min = m;
            media = media + n;
            ++i;
            m = n;
            n = teclado.nextInt();
        }
        
        System.out.println("Suma total = " + media + 
                ",  Numero total = " + i);
        
        media = media/i;
        
        System.out.println("Max = " + max + " Medio = " + media + " Min = "
                + min );
    }
    
    public static void ejercicio17(){
        
        /*
        Escriure un programa que compti quants nombres positius i negatius 
        d’introdueixen per teclat. El programa ha de parar quan el nombre 
        introduït sigui el zero.
        */
        
        int n = teclado.nextInt();
        int sumaN = 0, sumaP = 0;
        
        while(n != 0){
            if(n < 0) ++sumaN;
            else ++sumaP;
            n = teclado.nextInt();
        }
        
        System.out.println("Nombres positius = " + sumaP + 
                ", Nombres negatius = " + sumaN);
    }
    
    public static void ejercicio18(){
        /*
        Escriure un programa que llegeixi un nombre N més gran 
        que zero i escrigui la sèrie: 2^1 ,2^2 ,2^3...2^N
        */
        
        int n = teclado.nextInt();
        
        for(int i = 1; i <= n; ++i){
            System.out.println(Math.pow(2, i));
        }
    }
    
    public static void ejercicio19(){
        /*
        Escriure un programa que llegeixi un nombre N més gran 
        que zero i digui quantes vegades és divisible aquest nombre per 2.
        */
        int n = teclado.nextInt();
        int i = 0, m = n;
        while(n%2 == 0){
            ++i;
            n = n/2;
        }
        
        System.out.println(m + " es " + i + " vegades divisible per 2.");
    }
    
    public static void ejercicio20(){
        /*
        --Quin és l’error en les estructures iteratives que fa que 
        els següents programes no funcionin correctament?
        
        1. Càlcul del factorial d'un número 
        
                #include <stdio.h>  
                main(){
                    int numero, factorial, i;
                    printf ("Introdueix un numero positiu:");
                    scanf("%d",&numero); 
                    factorial = 1;
                    i = 1;
                    while (i <= numero){
                        factorial = factorial * i;
                    }
                    printf ("El factorial del numero és: %d.",factorial);
                }
        -- NO ESTA INCREMENTANDO EL VALOR DE i
        
        2. Càlcul del factorial d'un número 
                #include <stdio.h>
                main(){
                int numero, factorial, i;
                printf ("Introdueix un numero positiu:");
                scanf("%d",&numero);
                factorial = 1;
                for (i=1; i <= numero; i++){
                    factorial = factorial * i;
                    i++;
                }
                printf ("El factorial del numero és: %d.",factorial);
                }
        --EL VALOR DE i SE ESTA INCREMENTANDO DOS VECES.
        
        3. Càlcul del factorial d'un número 
                #include <stdio.h>
                main(){
                int numero, factorial, i;
                printf ("Introdueix un numero positiu:");
                scanf("%d",&numero);
                factorial = 1;
                i = 1;
                while (i <= numero);{
                    factorial = factorial * i;
                    i++;
                }
                printf ("El factorial del numero és: %d.",factorial);
                }
        -- NO HAY QUE PONER ; AL CERRAR LA CONDICION DEL WHILE
        
        4. Càlcul del factorial d'un número 
                #include <stdio.h>
                main(){
                int numero, factorial, i;
                printf ("Introdueix un numero positiu:");
                scanf("%d",&numero);
                factorial = 1;
                while (i <= numero){
                    factorial = factorial * i;
                    i++;
                }
                printf ("El factorial del numero és: %d.",factorial);
                }
        -- i NO ESTA INICIALIZADA. 
        
        5. Càlcul del factorial d'un número
                #include <stdio.h>
                main(){
                int numero, factorial, i;
                printf ("Introdueix un numero positiu:");
                scanf("%d",&numero);
                i = 1;
                while (i <= numero){
                    factorial = factorial * i;
                    i++;
                }
                printf ("El factorial del numero és: %d.",factorial);
                }
        -- LA VARIABLE factorial NO ES INICIALIZADA.
        
        6. Càlcul del factorial d'un número 
                #include <stdio.h>
                main(){
                int numero, factorial, i;
                printf ("Introdueix un numero positiu:");
                scanf("%d",&numero);
                factorial = 1;
                for (i=1; i <= numero; i++);
                    factorial = factorial * i;
                printf ("El factorial del numero és: %d.",factorial);
                }
        --  NO HAY QUE PONER ; AL CERRAR LA CONDICION DEL for
        
        7. Calcula la divisió per 2 d'un número positiu
                #include <stdio.h>
                main(){
                int numero, divisio;
                printf ("Introdueix un numero positiu:");
                scanf("%d",&numero);
                divisio = 0
                for (i=numero; i != 0; i = i-2)
                    divisio = divisio+1;
                printf ("Divisio de %d per 2 = %d", numero, divisio);
                }
        -- LA CONDICION DEL for ESTA MAL i > 1, 
           Y la variable i NO ESTA DECLARADA
        
        8. Calcula la divisió per 2 d'un número qualsevol (positiu o negatiu)
                #include <stdio.h>
                main(){
                int numero, divisio;
                printf ("Introdueix un numero:");
                scanf("%d",&numero);
                divisio = 0
                for (i=numero; i > 1; i = i-2)
                    divisio = divisio+1;
                printf ("Divisio de %d per 2 = %d", numero, divisio);
            }
        -- i NO ESTA DECLARADA
        */
    }
}
