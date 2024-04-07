class Solution {
    public void sortColors(int[] nums) {
        
        //// Dutch national flag algorithm.......
        
        int left = 0;
        int mid = 0; 
        int right = nums.length-1;
        int temp = 0;
        while(mid<=right){
            if(nums[mid] == 0){
                temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                mid++;
                left++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
    }
}