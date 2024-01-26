class Solution {
    public int jump(int[] nums) {
        int n = nums.length-1;
        int l = 0;
        int r = 0;
        int res = 0;
        while(r<n){
            int farthest = 0;
            for(int i = l; i<= r; i++){
                farthest = Math.max(farthest,i+nums[i]);
            }
            l = r + 1;
            r = farthest;
            res += 1;
        }
        return res;
    }
}