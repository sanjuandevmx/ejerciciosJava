/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package ejercicios_java;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Leer = new Scanner(System.in);
        
        String frase;
        
        System.out.println(" Ingrese una frase de 8 caracteres ");
        frase = Leer.nextLine();
        
        if(frase.length()==8){
            System.out.println("La frase es CORRECTA");
        
        } else {
            System.out.println(" La frase es INCORRECTA ");
        }
    }
    
}
