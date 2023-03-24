/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicios_java;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gradosCentigrados;
        double gradosFarenheit;
        Scanner Leer = new Scanner(System.in);
        
        System.out.println(" Ingrese los grados Centigrados ");
        gradosCentigrados = Leer.nextDouble();
        
        gradosFarenheit = 32 + (9 * gradosCentigrados / 5);
        
        System.out.println( gradosCentigrados + " Convertidos a Grados Farenheit son " + gradosFarenheit + " Grados " );
    }
    
}
