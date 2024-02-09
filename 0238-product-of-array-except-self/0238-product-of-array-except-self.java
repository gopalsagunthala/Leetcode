class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int product = 1;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
                continue;
            }
            product *= num;
        }

        int[] result = new int[nums.length];
        if (zeroCount > 1) {
            return result; 
        } else if (zeroCount == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    result[i] = product;
                } else {
                    result[i] = 0;
                }
            }
        } else { 
            for (int i = 0; i < nums.length; i++) {
                result[i] = product / nums[i];
            }
        }
        return result;
    }
}
