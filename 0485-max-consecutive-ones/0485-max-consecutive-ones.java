class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int l = 0;
        int ans = 0;
        int sum = 0;
        for(int r = 0; r<n; r++){
            if(nums[r] == 1){
                sum++;
            }
            ans = Math.max(ans,sum);
            if(nums[r] == 0){
                sum = 0;
            }

        }
        return ans;
    }
}