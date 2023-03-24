/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la 
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se 
obtiene cambiando sus filas por columnas (o viceversa)
 */
package ejercicios_java;

/**
 *
 * @author brian
 */
public class Ejercicio18Brian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     int[][] matriz = new int[4][4];
     
     for (int i =0; i<3;i++){
         for (int j = 0; j<3;j++){
            matriz[i][j] = (int) Math.round((double) (Math.random()*5));
             
         
             
         
         System.out.print(matriz[i][j]);
     }
         System.out.println();
         
    }
        System.out.println("Matriz Transpuesta");
        for(int i=0; i<3; i++){
            for(int j=0;j<3; j++){
                System.out.print(matriz[j][i]);
            }
            System.out.println();
        }
     
    }
}


