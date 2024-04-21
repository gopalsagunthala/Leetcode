class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int nrow[] = new int[row];
        int ncol[] = new int[col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == 0){
                    nrow[i] = 1;
                    ncol[j] = 1;
                }
            }
        } 
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(nrow[i] == 1 || ncol[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}