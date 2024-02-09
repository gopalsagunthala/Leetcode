class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int max = nums[0];
        int min = nums[nums.length-1];
        for(int i = 1; i<=max && i<=min; i++){
            if(max%i == 0 && min%i == 0){
                res = i;
            }
        }
        return res;
    }
}