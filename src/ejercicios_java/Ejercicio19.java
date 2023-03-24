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
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        
        System.out.print("Ingresa el número de filas de la matriz: ");
    int filas = Leer.nextInt();
    System.out.print("Ingresa el número de columnas de la matriz: ");
    int columnas = Leer.nextInt();

    int[][] matriz = new int[filas][columnas];
    boolean esAntiSimetrica = true;

    System.out.println("Ingresa los elementos de la matriz:");
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        matriz[i][j] = Leer.nextInt();
        if (i != j && matriz[i][j] != -matriz[j][i]) { // Verifica si la matriz es anti simétrica
          esAntiSimetrica = false;
        }
      }
    }

    if (esAntiSimetrica) {
      System.out.println("La matriz es anti simétrica");
    } else {
      System.out.println("La matriz no es anti simétrica");
    }

  
  }
}
    
