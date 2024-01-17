class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0, cur = 0,length = 0;
        for(int r= 0; r<n ;r++){
            if(nums[r] == 0){
                cur++;
            }
            while(cur>k){
                
                if(nums[l] == 0){
                cur--;

                }
                l++;

            }
            length = Math.max(length, r-l+1);
        }
        return length;
    }
}