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
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

int[][] matrix = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}}; // initialize the 3x3 matrix
        int sum = 15; // the sum of each row, column, and diagonal should be 15 for a 3x3 magic matrix
        boolean isMagic = true; // initialize a boolean flag to check if the matrix is magic
        
        // check if the sum of the rows equals the magic number
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != sum) {
                isMagic = false;
                break;
            }
        }
        
        // check if the sum of the columns equals the magic number
        if (isMagic) {
            for (int i = 0; i < matrix[0].length; i++) {
                int colSum = 0;
                for (int j = 0; j < matrix.length; j++) {
                    colSum += matrix[j][i];
                }
                if (colSum != sum) {
                    isMagic = false;
                    break;
                }
            }
        }
        
        // check if the sum of the diagonals equals the magic number
        if (isMagic) {
            int diagonalSum1 = matrix[0][0] + matrix[1][1] + matrix[2][2];
            int diagonalSum2 = matrix[0][2] + matrix[1][1] + matrix[2][0];
            if (diagonalSum1 != sum || diagonalSum2 != sum) {
                isMagic = false;
            }
        }
        
        // print the matrix and the result
        System.out.println("The matrix is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        if (isMagic) {
            System.out.println("The matrix is a magic matrix!");
        } else {
            System.out.println("The matrix is not a magic matrix.");
        }
    }
    
}
