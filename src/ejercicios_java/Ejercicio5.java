/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package ejercicios_java;

import java.util.Scanner;


public class Ejercicio5 {

   
    public static void main(String[] args) {
    
        //Escribimos las variables
        int num;
        int doble;
        int triple;
        double raiz = 0;
        
        //Damos nombre a nuestro metodo Scanner
        Scanner Leer = new Scanner(System.in);
        
        //Imprimimos un mensaje de Bienvenida
        System.out.println(" Bienvenido, este programa te ayudara a saber el doble, el triple y la raiz cuadrada de 1 numero ");
        //Imprimimos una linea con guion bajo para separar el titulo de la funcionalidad del programa
        System.out.println("__________________________________________________________________________________________________");
        //Pedimos al usuario que ingrese un numero
        System.out.println("Ingresa el numero que deeses");
        num = Leer.nextInt();
        //Formulas
        doble = num*2;
        triple = num*3;
        raiz = Math.sqrt(raiz);
        //Imprimimos el doble 
        System.out.println(" El doble de: " + num + "es: " + doble);
        //Imprimimos el triple 
        System.out.println(" El triple de: " + num + "es: " + triple);
        //Imprimimos la raiz cuadrada
        System.out.println(" La raiz cuadrada de: " + raiz );
    }
   
}
