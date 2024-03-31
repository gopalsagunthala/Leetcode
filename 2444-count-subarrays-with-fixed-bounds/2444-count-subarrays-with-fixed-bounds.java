class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int mini = -1, maxi = -1, left = -1;
        long ans = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < minK || nums[i] > maxK){
                left = mini = maxi = i;
            }
            mini = (nums[i] == minK) ? i: mini;
            maxi = (nums[i] == maxK) ? i: maxi;
            ans += Math.min(maxi , mini) - left;
        }
        return ans;
    }
}