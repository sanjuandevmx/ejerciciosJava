/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package ejercicios_java;

import java.util.Scanner;


public class Ejercicio2 {


    public static void main(String[] args) {
        
        //Definimos las variable
       
        String name;
        Scanner Leer = new Scanner(System.in);
        
        System.out.println(" Ingresa tu nombre por teclado ");
        name = Leer.nextLine();
        
        System.out.println("Tu nombre es:" + name);
    }
    
}
