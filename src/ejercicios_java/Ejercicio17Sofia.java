/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Ejercicio17Sofia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
              Scanner input = new Scanner(System.in);

        // Pedir al usuario que ingrese el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int n = input.nextInt();

        // Crear el vector
        int[] vector = new int[n];

        // Pedir al usuario que ingrese los elementos del vector
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = input.nextInt();
        }

        // Contabilizar los números de cada tamaño de dígito
        int[] counts = new int[5];
        for (int i = 0; i < vector.length; i++) {
            int numDigits = String.valueOf(vector[i]).length();
            if (numDigits == 1) {
                counts[0]++;
            } else if (numDigits == 2) {
                counts[1]++;
            } else if (numDigits == 3) {
                counts[2]++;
            } else if (numDigits == 4) {
                counts[3]++;
            } else if (numDigits == 5) {
                counts[4]++;
            }
        }

        // Imprimir el resultado por pantalla
        System.out.println("Resultados:");
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%d-digit numbers: %d\n", i + 1, counts[i]);
        }
    }
}

