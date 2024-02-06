class Solution {
    public int finalValueAfterOperations(String[] op) {
        int x =0;
        for(int i=0; i<op.length; i++){
            String str = op[i];
            if(str.charAt(0) == '+' || str.charAt(2) == '+'){
                x++;
            }
            else{
                x--;
            }
        }
        return x;
    }
}