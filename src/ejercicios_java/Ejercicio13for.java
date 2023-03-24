/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 */
package ejercicios_java;

import java.util.Scanner;


public class Ejercicio13for {

   
    public static void main(String[] args) {
      // TODO code application logic here
             Scanner Leer = new Scanner(System.in);
            
            
            System.out.println(" Ingrese el numero de asteriscos por Lado ");
            int n = Leer.nextInt();
            
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++){
                    if(i == 1 || i == n || j == 1 || j == n){
                        System.out.println("* ");
                    } else {
                        System.out.println("  ");
                   }
                  
                }
                  System.out.println(); 
            }
            Leer.close();
           
        }
}
    

