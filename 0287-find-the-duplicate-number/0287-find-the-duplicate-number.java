class Solution {
    public int findDuplicate(int[] nums) {
        int[] buk = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int val = nums[i];
            buk[val-1]++;
        }
        System.out.print(Arrays.toString(buk));
        for(int i=0; i<buk.length; i++){
            if(buk[i] >1){
                return i+1;
            }
        }
        return 0;
    }
}