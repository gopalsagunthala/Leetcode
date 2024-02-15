class Solution {
    public long largestPerimeter(int[] nums) {
        long sum = 0;
        Arrays.sort(nums);
        for(int g: nums){
            sum  = sum + g;
        }
        for(int i = nums.length -1;i>=0; i--){
            sum = sum - nums[i];
            if(sum > nums[i]){
                sum = sum + nums[i];
                return sum;
            }
        }
        return -1;
    }
}