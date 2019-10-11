/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gurvir
 */
public class JavaEjercicios {
    
    static Scanner lector = new Scanner(System.in);
    
    public static void main(String[] args){
        JavaEjercicios.ejercicio9();
        
    }
    
    public static void ejercicio1(){
        
        System.out.print("First number : ");
        int n1 = lector.nextInt();
        
        System.out.print("Second number : ");
        int n2 = lector.nextInt();
        
        int sum = n1+n2;
        
        System.out.println("The sum is : " + sum );
        
        /* Declaracion de variables */
        int n3 = 40;
        char cha = 'M';
        boolean b1 = true;
        boolean b2 = false;
        boolean b3;
        
        /* b3 = false
        b3 = ((n1 + n2 < n2 * 2) && b2 && b1) || !(n1 != n2) || cha == 'F';
        
        //b3 = true
        b3 = (n1 < n2 && (n1 + 7 == n2)) || n2 == 10 || cha == 'M';
        
        //false
        b3 = (n1 > n2 && (n1 + 7 == n2)) && (n2*2 < n1*9);
        
        //true
        b3 = (n1 < n2 && (n1 + 7 == n2)) && (n2*2 < n1*9);
        
        //n1[10...40]
        b3 = ((n1 < n3) && (n1 > n2));
        */
        
        //n1[1..5][20...30]
        b3 = ((n1 >= 1 && n1 <= 5) || (n1 >= 20 && n1 <= 30));
        n1 = 2*30+n1/n2;
        
        System.out.println("Answer : " + b3 + ",  Value : " + n1);
    }
    
    public static void ejercicio2() {
        
        
        //START
        
        //LEER PRIMER NUMERO n1
        System.out.print("Enter first number : ");
        int n1 = lector.nextInt();
        
        //LEER SEGUNDO NUMERO n2
        System.out.print("Enter second number : ");
        int n2 = lector.nextInt();
        
        int mayor;
        
        //IF Y LA CONDICIÓN
        if(n1 > n2) {
            //Si se cumple entonces mayor = n1
            mayor = n1;
        }
        
        //Sino mayor = n2
        else {
            mayor = n2;
        }
        System.out.println("The greater number is : " + mayor );
    }  
    
    public static void ejercicio3() {
        
        // int numeroAleatorio = (int) (Math.random()*10);
        
        Random r = new Random();
        int randomNumber = r.nextInt(50);
        
        System.out.println(" Numero Aleatorio : " + randomNumber);
    }
    
    public static void ejercicio4(){
        
        System.out.println("Enter a number between 1 to 10:");
        int n = lector.nextInt();
        
        Random r = new Random();
        int randomNumber = r.nextInt(10);
        
        String mensaje;
        
        if(n == randomNumber) mensaje = "Yes";
        else mensaje = "NO";
        System.out.println(mensaje);
        
    }
    
    public static void ejercicio5(){
        System.out.println("Escribir una nota: ");
        int nota = lector.nextInt();
        
        String mensaje;
        if(nota <= 4){
            mensaje = "Suspendido !";
        }
        else {
            if(nota == 5) mensaje = "Aprobado";
            else{
                if(nota == 6 || nota == 7) mensaje = "Bien";
                else{
                    if(nota == 8 || nota == 9) mensaje = "Notable";
                    else mensaje = "Excelente !";
                }
            }
        }
        
        System.out.println(mensaje);
    }
    
    public static void ejercicio6(){
        
        System.out.print("Introdueix un primer enter: ");
        int primerValor = lector.nextInt();
        lector.nextLine();
        
        System.out.print("Introdueix un segon enter: ");
        int segonValor = lector.nextInt();
        lector.nextLine();
        
        System.out.println("Quina operació vols fer? ");
        System.out.println("[1] per Sumar");
        System.out.println("[2] per Restar");
        System.out.println("[3] per Multiplicar");
        System.out.println("[4] per Dividir");
        System.out.print("Selecciona l'opció [1-4]: ");
        
        int opcio = lector.nextInt();
        lector.nextLine();
        
        int resultat = 0;
        
        switch(opcio) {
            case 1:
                System.out.print("Has triat sumar...");
                resultat = primerValor + segonValor;
                break;
            case 2:
                System.out.print("Has triat restar...");
                resultat = primerValor - segonValor;
                break;
            case 3:
                System.out.print("Has triat multiplicar...");
                resultat = primerValor * segonValor;
                break;
            case 4:
                System.out.print("Has triat dividir...");
                resultat = primerValor / segonValor;
                break;
            default:
                System.out.println("Opció no prevista.");
        }
        
        System.out.println("El resultat és " + resultat + ".");
    }
    
    public static void ejercicio7(){
        
        System.out.println("Enter three numbers : ");
        int n1 = lector.nextInt();
        int n2 = lector.nextInt();
        int n3 = lector.nextInt();
        int mayor, menor, medio;
        
        if(n1 > n2 && n1 > n3){
            mayor = n1;
            if(n2 > n3 ){
                medio = n2;
                menor = n3;
            }
            else {
                medio = n3;
                menor = n2;
            }
        }
        else{
            if(n2 > n1 && n2 > n3){
                mayor = n2;
                if(n1 > n3){
                    medio = n1;
                    menor = n3;
                }
                else {
                    medio = n3;
                    menor = n1;
                }
            }
            else{
                mayor = n3;
                if(n1 > n2){
                    medio = n1;
                    menor = n2;
                }
                else {
                    medio = n2;
                    menor = n1;
                }
            }
        }
        
        System.out.println(mayor + " " + medio + " " + menor);
    }
    
    // ejercicios de repetición
    
    public static void ejercicio8(){
        int n = lector.nextInt();
        int i = 0;
        int multiplicador = 7;
        
        while (i <= n){
            int resultat = i*multiplicador;
            System.out.println(multiplicador + " x " + i + " = " + resultat);
            i++;
        }
    }
    
    public static void ejercicio9(){
        int n = lector.nextInt();
        int resultat = 0;
        
        if(n == 0) resultat = 1;
        while (n > 0){
            n = n/10;
            resultat++;
        }
        
        System.out.println(resultat);
    }
    
}
