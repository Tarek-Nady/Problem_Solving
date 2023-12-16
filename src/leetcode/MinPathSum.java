package leetcode;

public class MinPathSum {
    public int minPathSum(int[][] matrix) {
        int rows = matrix.length;
        int colums = matrix[0].length;
        int[][]min_sum = new int[rows][colums];

        min_sum[0][0] = matrix[0][0];
        for(int i=1;i<colums;i++){
            min_sum[0][i] = matrix[0][i]+min_sum[0][i-1];
        }
        for(int j=1;j<rows;j++){
            min_sum[j][0] = matrix[j][0]+min_sum[j-1][0];
        }

        for(int i=1;i<rows;i++){
            for(int j=1;j<colums;j++){
                min_sum[i][j] = matrix[i][j]+Math.min(min_sum[i-1][j],min_sum[i][j-1]);
            }
        }
        return min_sum[rows-1][colums-1];
    }
}
