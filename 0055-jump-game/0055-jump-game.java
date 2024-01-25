class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int g = n-1;
        for(int i = nums.length-2; i>=0; i--){
            // g = 0;
            if((i+nums[i])>= g){
                g = i;
            }
        }
        return g == 0;
    }
}