public class MatrixMaxJK {
    public static void main(String[] args) {
        // Declare / initialize all vars
        int n = 5;
        int m = 5;
        int [][] matrix = new int[n][m];
        int maxNum = 0;
        int [] indices = {0, 0};
        //Build array of n x m with random integers
        for(int i=0; i < n; i++) {
            for(int j=0; j < m; j++) {
                matrix[i][j] = (int)(Math.random() * 100);   
            }
        }
        // Find the max value of the array and save the indices
        for(int i=0; i < n; i++) {
            for(int j=0; j < m; j++) {
                if( matrix[i][j] > maxNum ) {
                    maxNum = matrix[i][j];
                    indices[0] = i;
                    indices[1] = j;
                } 
            }
        }
    System.out.println("Max val = " + maxNum + ", (i, j) = " + indices[0] + ", " + indices[1]);
    }

}
