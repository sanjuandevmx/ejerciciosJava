/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;

import java.util.Random;

/**
 *
 * @author brian
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[][] matriz = new int[4][4]; // Crea una matriz de 4x4
    Random rnd = new Random();

    System.out.println("Matriz generada:");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        matriz[i][j] = rnd.nextInt(100); // Rellena la matriz con valores aleatorios del 0 al 99
        System.out.print(matriz[i][j] + "\t"); // Imprime cada elemento de la matriz
      }
      System.out.println();
    }

    System.out.println("Matriz traspuesta:");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(matriz[j][i] + "\t"); // Imprime la traspuesta de la matriz
      }
      System.out.println();
    }
    }
    
}
