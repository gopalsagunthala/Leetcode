class Solution {
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[][] matrix = new int[R*C][2];;
        int i=0;
        int len = 0;
        int step = 0;
        int[] direction = new int[] {0,1,0,-1,0};
        matrix[i++]  = new int[]{r0,c0};
        while(i<R*C){
            if(step == 0 || step == 2){
                len++;
            }
            for(int j=0; j<len; j++){
                r0 = r0 + direction[step];
                c0 = c0 + direction[step+1];
                if(r0<R && r0>=0 && c0<C && c0>=0){
                    matrix[i++] = new int[]{r0,c0};
                }
            }
            step = ++step % 4;
        }
        return matrix;
    }
}