class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0; 
        int z = 0, max = 0;
        for(int r = 0; r<nums.length; r++){
            if(nums[r] == 0){
                z++;
            }
            while(z>1){
                if(nums[l] == 0){
                    z--;
                }
                l++;
            }
            max = Math.max(max, (r-l+1));
        }
        return max -1;
    }
}