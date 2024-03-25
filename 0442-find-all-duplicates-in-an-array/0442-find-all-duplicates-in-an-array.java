class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        boolean[] dup = new boolean[nums.length+1];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: nums){
            if(dup[i]){
                list.add(i);
            }
            dup[i] = true;
        }
        // Collections.sort(list);
        return list;
    }
}