/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
 */
package ejercicios_java;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Ejericicio12while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner Leer = new Scanner(System.in);
        String cadena;
        String fde = "&&&&&";
        
        
       do { 
        System.out.println("Ingrese la cadena");
        cadena= Leer.nextLine();
        
       }while (cadena.length()==5 && cadena.substring(0, 1).equals("X") && cadena.substring(4,5).equals("O"));
            
       if (cadena.equals(fde)){
           System.out.println(" El envio de cadenas a finalizado ");
       } else {
           System.out.println("Cadena incorrecta");
       }
    
       }
    
    
}
