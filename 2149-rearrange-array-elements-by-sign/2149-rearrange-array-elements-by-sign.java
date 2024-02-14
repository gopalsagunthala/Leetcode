class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int[] positive = new int[nums.length/2];
        // int[] negative = new int[nums.length/2];
        // int j = 0, k=0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]>0){
        //         positive[j] = nums[i];
        //         j++;
        //     }
        //     else if(nums[i]<0){
        //         negative[k] = nums[i];
        //         k++;
        //     }
        // }
        // int[] res = new int[nums.length];
        // int l=0,m=0;
        // for(int i=0; i<nums.length-1; i = i+2){
        //     res[i] = positive[l];
        //     l++;
        //     res[i+1] = negative[m];
        //     m++;
        // }
        // System.out.println(positive[0]);
        // System.out.print(Arrays.toString(negative));
        int positive = 0, negative = 1;
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                res[positive] = nums[i];
                positive = positive + 2;
            }
            else if(nums[i]<0){
                res[negative] = nums[i];
                negative = negative+2;
            }
        }

        return res;
    }
}