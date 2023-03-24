/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package ejercicios_java;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limite;
        int suma= 0;
        int contador =0;
        
        Scanner Leer = new Scanner(System.in);
        System.out.println(" Ingrese un numero positivo ");
        limite = Leer.nextInt();
        
        while (suma<limite){
            System.out.println(" Ingrese un numero ");
            int numero = Leer.nextInt();
            suma += numero;
            contador++;
            
        }
        System.out.println(" La suma de los "+ contador + "Numeros ingresados supera el limite inicial de " + limite);
    }
    
}
