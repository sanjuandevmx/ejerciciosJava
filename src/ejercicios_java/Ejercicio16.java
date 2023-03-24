/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        
        int n;
        System.out.println(" Ingresa tamaño del vector ");
        n = Leer.nextInt();
        int[] vector = new int[n];
        Random rnd = new Random();
        
        for(int i = 0; i<n; i++){
            vector[i]=rnd.nextInt(100);
        }
        System.out.println(Arrays.toString(vector));
        System.out.println(" Ingrese el numero a buscar ");
        int nBusqueda = Leer.nextInt();
        boolean encontrado = false;
        int posicion = -1;
        int repeticiones = 0;
        
        for (int i = 0; i< n; i++){
            if (vector[i]== nBusqueda){ 
                if (encontrado){
                    repeticiones++;
                } else {
                    encontrado = true;
                    posicion = i;
                }
            }
        }
        if (encontrado){
            System.out.println("El numero" + nBusqueda + "Esta en la posicion "+ posicion+ "Del vector" );
        if (repeticiones > 0) {
        System.out.println("Además, el número se encontró " + (repeticiones + 1) + " veces en el vector");
      }
    } else {
      System.out.println("El número " + nBusqueda + " no se encontró en el vector");
    }
  }
}

   
    

