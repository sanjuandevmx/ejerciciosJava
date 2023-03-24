/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicios_java;

import java.util.Scanner;


public class Ejercicio4 {

   
    public static void main(String[] args) {
        
        //Definimos las variables
        double gradosCentigrados;
        double gradosFarenheit;
        
        //Definimos el nuevo Scanner
        Scanner Leer = new Scanner(System.in);
        
        //Mostramos un mensaje de bienvenida
        System.out.println(" Bienvenido, Este programa te ayudara a convertir Grados Celsius a Farenheit ");
        
        //Imprimimos una linea con guion bajo nos ayudara a separar el mensaje de bienvenida de la funcionalidad del programa
        System.out.println("_________________________________________________________________________________");
        
        //Pedimos al usuario que ingrese los grados Celsius
        System.out.println(" Ingrese los grados centigrados ");
        gradosCentigrados= Leer.nextDouble();
        
        //Escribimos la formula
        gradosFarenheit = 32 + (9 * gradosCentigrados/5);
        
        System.out.println(gradosCentigrados + " Equivalen a " + gradosFarenheit + " grados Farenheit ");
    }
    
}
