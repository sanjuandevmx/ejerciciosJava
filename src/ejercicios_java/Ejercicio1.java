
/* 
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
*/


package ejercicios_java;

import java.util.Scanner;

public class Ejercicio1 {

 
    public static void main(String[] args) {
        
        //Definimos las variables
   
        int sumando1;
        int sumando2;
        int totalSuma;
        
        //Creamos un scanner
        
        Scanner Leer = new Scanner(System.in);
        
        //Imprimimos en pantalla el Mensaje de bienvenida
        System.out.println("Este programa te ayudara a realizar la suma de Valores ");
        
        //Raya en guion bajo para separar el mensaje de bienvenida de los valores
        System.out.println("__________________________________________________________");
        
        //Imprimimos en pantalla un mensaje donde pedimos se ingrese el primer valor de la sumatoria
        System.out.println(" Ingrese el primer valor ");
        
        //Leemos con un scanner el primer valor
        sumando1 = Leer.nextInt();
        
         //Imprimimos en pantalla un mensaje donde pedimos se ingrese el segundo valor de la sumatoria
        System.out.println(" Ingrese el segundo valor ");
        
        //Leemos con un scanner el segundo valor
        sumando2 = Leer.nextInt();
        
        //Escribimos la formula de la operacion
        totalSuma = sumando1 + sumando2;
        
        //Imprimimos en pantalla el resultado con un mensaje amigable 
        System.out.println(" El total de la suma es de: " + totalSuma);
       
        
        
        
        
       
    }
    
}
