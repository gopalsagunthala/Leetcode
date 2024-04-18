class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int subset = 1<<n;
        for(int j = 0; j<=subset - 1; j++){
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i<n; i++){
                int val = j & (1<<i);
                if(val > 0){
                    temp.add(nums[i]);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}