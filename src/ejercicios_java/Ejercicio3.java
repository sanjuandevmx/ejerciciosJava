/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() 
 */
package ejercicios_java;

import java.util.Scanner;


public class Ejercicio3 {


    
    public static void main(String[] args) {
        
        //Definimos la Variable
        
        String frase;
        
        //Defiinimos el Scanner
        Scanner Leer = new Scanner (System.in);
        
        //Mostramos un mensaje de bienvenida en pantalla y pedimos al usuario que ingrese una frase.
        
        System.out.println(" Este programa te ayudara a poner una frase en MAYUSCULAS y minusculas ! ");
        //Imprimimos una raya con guion bajo para separar el mensaje bienvenida con la funcionalidad del programa.
        
        System.out.println("____________________________________________________________________________");
        //Pedimos la frase
        System.out.println(" Ingrese por teclado una frase ");
        
        //Leemos la frase
        frase = Leer.nextLine();
        
        //Imprimimos una raya con guion bajo para separar la funcionalidad del programa con el resultados.
        
        System.out.println("____________________________________________________________________________");
        
        //Imprimimos en letras mayusculas
        System.out.println(frase.toUpperCase());
        
        //Imprimimos en letras minusculas
        System.out.println(frase.toLowerCase());
    }
    
}
