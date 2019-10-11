/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacion_de_ejercicios_1;

import java.util.Scanner;

/**
 *
 * @author gurvir_kaur
 */
public class Relacion_de_ejercicios_1 {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        Relacion_de_ejercicios_1.ejercicio1();
    }
    
    public static void ejercicio1(){
        //la diferencia entre los dos conjunto de instruciiones es
        //en el primero se utiliza la sentencia if/else
        //en el segundo se utilitza solo la sentencia if
        //en el primero el resultado seria un 1 y en el segundo un 3.
    }
    
    public static void ejercicio2(){
        //hay que decir si el primero es divisible entre segundo
        
        System.out.println("Entra dos numero que quieres dividir: ");
        
        int primero = teclado.nextInt();
        int segundo = teclado.nextInt();
        
        if(primero % segundo == 0){
            System.out.println(primero + " es divisible por " + segundo);
        }
        else {
            System.out.println(primero + " no es divisible por " + segundo);
        }
    }
    
    public static void ejercicio3(){
        System.out.println("Enter three numbers: ");
        
        int primero = teclado.nextInt();
        int segundo = teclado.nextInt();
        int tercero = teclado.nextInt();
        
        int maxim = 0;
        int minim = 0;
        
        if((primero > segundo) && (primero > tercero) && (segundo < tercero)){
            maxim = primero;
            minim = segundo;
        }
        
        if((segundo > primero) && (segundo > tercero) && (primero < tercero)){
            maxim = segundo;
            minim = primero;
        }
        
        if((tercero > primero) && (tercero > segundo) && (primero < segundo)){
            maxim = tercero;
            minim = primero;
        }
        
        if((primero > segundo) && (primero > tercero) && (segundo > tercero)){
            maxim = primero;
            minim = tercero;
        }
        
        if((segundo > primero) && (segundo > tercero) && (primero > tercero)){
            maxim = segundo;
            minim = tercero;
        }
        
        if((tercero > primero) && (tercero > segundo) && (primero > segundo)){
            maxim = tercero;
            minim = segundo;
        }
        
        System.out.println(maxim + " " + minim);
        
    }
    
    public static void ejercicio4(){
        char c = teclado.next().charAt(0);
        
        if((c == 'a')|| (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')){
            System.out.println(c + " es un vocal.");
        }
        else {
            if(c >= 'a' && c <= 'z'){
                System.out.println(c + " es un constante.");
            }
            else System.out.println("ERROR");
        }
    }
    
    public static void ejercicio5(){
        System.out.println("Escribe una nota: ");
        double nota = teclado.nextDouble();
        
        String mensaje;
        if(nota < 5){
            mensaje = "S";
        }
        else {
            if((nota >= 5) && (nota <= 6.5)) mensaje = "A";
            else{
                if(nota >= 6.5 && nota <= 8.5) mensaje = "N";
                else{
                    if(nota >= 8.5 && nota <= 9.75) mensaje = "E";
                    else mensaje = "M";
                }
            }
        }
        
        System.out.println(mensaje);
    }
    
    public static void ejercicio6(){
        
        System.out.println("Entra un numero entre 1-7 : ");
        int numero = teclado.nextInt();
        teclado.nextLine();
        
        switch(numero){
            case 1:
                System.out.println("Dilluns");
                break;
                
            case 2:
                System.out.println("Dimarts");
                break;
                
            case 3:
                System.out.println("Dimecres");
                break;
                
            case 4:
                System.out.println("Dijous");
                break;
                
            case 5:
                System.out.println("Divendres");
                break;
                
            case 6:
                System.out.println("Dissabte");
                break;
                
            case 7:
                System.out.println("Diumenge");
                break;
            
            default:
                System.out.println("Error");
                break;
        }
        
    }
    
    public static void ejercicio7(){
        System.out.println("Entra un numero entre 1 i 7 : ");
        int numero = teclado.nextInt();
        
        if(numero == 1){
            System.out.println("Dilluns");
        }
        else {
            if(numero == 2){
                System.out.println("Dimarts");
            }
            else {
                if(numero == 3){
                    System.out.println("Dimecres");
                }
                else{
                    if(numero == 4){
                        System.out.println("Dijous");
                    }
                    else{
                        if(numero == 5){
                            System.out.println("Divendres");
                        }
                        else{
                            if(numero == 6){
                                System.out.println("Dissabte");
                            }
                            else {
                                if (numero == 7){
                                    System.out.println("Diumenge");
                                }
                                else System.out.println("El numero ha d'estar entre 1-7");
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void ejercicio8(){
        System.out.println("Entra una nota: ");
        int nota = teclado.nextInt();
        teclado.nextLine();
        
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("S");
                break;
            case 5:
            case 6:
                System.out.println("A");
                break;
            case 7:
            case 8:
                System.out.println("N");
                break;
            case 9:
                System.out.println("E");
                break;
            case 10:
                System.out.println("M");
                break;
        }
    }
    
    public static void ejercicio9(){
        System.out.println("Entra el número de mes i l'any:");
        int mes = teclado.nextInt();
        int any = teclado.nextInt();
        teclado.nextLine();
        
        if((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)){
            System.out.println("El mes " + mes + " de l'any " + any + " té 31 dies.");   
        }
        else {
            if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                System.out.println("El mes " + mes + " de l'any " + any + " té 30 dies.");
            }
            else{
                if(mes == 2){
                    if((any%4 == 0 && any%100 != 0) || (any%400 == 0)){
                        System.out.println("El mes " + mes + " de l'any " + any + " té 29 dies.");
                    }
                    else System.out.println("El mes " + mes + " de l'any " + any + " té 28 dies.");
                }
                
                else System.out.println("Error");
            }
        }
    }
    
    public static void ejercicio10(){
        /*
        Quin és l’error del següent tros de codi? Com es podria corregir?
            if (x < y < z) printf (“%d < %d < %d\n”, x, y, z); 
        
        -- La condición de if está mal ya que no se puede comparar 
           tres variables. 
        */
        
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        int z = teclado.nextInt();
        
        if(x < z && y < z){
            System.out.println(x + " " + y + " " + z);
        }
    }
}
