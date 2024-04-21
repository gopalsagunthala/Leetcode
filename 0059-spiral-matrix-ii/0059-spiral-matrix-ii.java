class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];

        int left =0, top = 0;
        int end_col = n-1, end_row = n-1;
        int count = 1;
        for(int j=0; j<n/2; j++){
            for(int i = left; i<=end_col; i++){
                res[top][i] = count++;
            }
            top++;
            for(int i = top; i<=end_row; i++){
                res[i][end_col] = count++;
            }
            end_col--;
            for(int i=end_col; i>=left; i--){
                res[end_row][i] = count++;
            }
            end_row--;
            for(int i=end_row; i>=top; i--){
                res[i][left] = count++;
            }
            left++;
        }
        if(n%2 == 1){
            res[n/2][n/2] = count++;
        }
        return res;
    }
}