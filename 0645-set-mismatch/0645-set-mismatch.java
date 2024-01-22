class Solution {
    public int[] findErrorNums(int[] nums) {
        // Arrays.sort(nums);
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =1; i<=n; i++){
            map.put(i,0);
        }
        for(int i: nums){
            map.put(i, map.get(i)-1);
        }
        List<Integer> list = new ArrayList<>();
        for(int i: map.keySet()){
            if(map.get(i)< -1){
                list.add(i);
            }
        }
        for(int i: map.keySet()){
            if(map.get(i) == 0){
                list.add(i);
            }
        }
        int[] res = new int[list.size()];
        int j = 0;
        for(int i: list){
            res[j] = i;
            j++;
        }
        return res;
    }
}