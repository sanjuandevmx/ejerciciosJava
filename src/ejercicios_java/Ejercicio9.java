/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */
package ejercicios_java;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una Frase");
        frase = Leer.nextLine();
        
        if( frase.substring(0, 1).equals("A") || frase.substring(0, 1).equals("a") ){
            System.out.println(" Correcto");
        
    } else {
            System.out.println("Incorrecto");
        }
    
    }
}
