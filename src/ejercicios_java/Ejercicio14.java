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
public class Ejercicio14 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        
         int moneda;
         double pesos;
         
        System.out.println(" Convertidor de moneda ");
        System.out.println("1. Yenes ");
        System.out.println("2. Dolares ");
        System.out.println("3. Libras ");
        System.out.println(" Seleccione una moneda ");
        moneda=Leer.nextInt();
        
        System.out.println("Ingrse la cantidad de pesos a convertir");
        pesos = Leer.nextInt();
        
         convertidor(moneda, pesos);
        
        
        
       
        
        
    }
    public static double convertidor(int moneda, double pesos){
        
        
        switch(moneda){
            case 1:
                System.out.println(" La cantidad de Euros a Yenes es de: ");
                double yenes = (pesos * 129.852);
                System.out.println(yenes + "Yenes");
                break;
            case 2:
                System.out.println("La cantidad de Dolares a Pesos es de:");
                double dolar = (pesos * 1.28611);
                System.out.println(dolar + "Dolar");
                break;
            case 3:
                System.out.println(" La cantidad de Euros a Libras es de: ");
                double libras = (pesos * 0.86) ;
                System.out.println(libras + "Libras");
            }     
      
        return moneda + pesos;
     
        
    
}
}