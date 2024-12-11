class rotate_48 {
//Brute Force
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j ++){
                ans[j][(n-1)-i] = matrix[i][j];
            }
        }
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j ++){
                matrix[i][j] = ans[i][j] ;
            }
        }
    }
  //Optimal Approach Transpose and Reverse
    public void rotate1(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
}
