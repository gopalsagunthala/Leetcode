class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        return fun(n,1);
    }
    public static boolean fun(int n, int mul){
        if(n == mul){
            return true;
        }
        if(mul > n || mul <=0){
            return false;
        }
        return fun(n,mul*3);
    } 
}