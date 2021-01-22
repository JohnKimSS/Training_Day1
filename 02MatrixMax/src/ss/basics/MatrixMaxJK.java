/* @Author John Kim
Find the maximum value of an n x m array and return it's indicies
*/
package com.ss.basics.matrixmax;

public class MatrixMax {

    public static void main(String[] args) {

        int n = 5;
        int m = 5;
        int [][] matrix = new int[n][m];
        // Build array of n x m with random integers
        for(int i=0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = (int)(Math.random() * 100);   
            }
        }
        System.out.println(matrix);
    }

}