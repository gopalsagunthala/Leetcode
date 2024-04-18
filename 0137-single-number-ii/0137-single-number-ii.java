class Solution {
    public int singleNumber(int[] nums) {
        int one = 0;
        int two = 0;
        for(int i: nums){
            one = (i ^ one) & ~two;
            two = (i ^ two) & ~one;
        }
        return one;
    }
}