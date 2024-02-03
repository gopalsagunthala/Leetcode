class Solution {
    public int numIdenticalPairs(int[] nums) {
      Map<Integer,Integer> map = new HashMap<>();
    //   Map<Integer, Integer> map = new HashMap<>();

      for(int i = 0; i<nums.length; i++){
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }
      int ans = 0;
      for(int a: map.keySet()){
          if(map.get(a)>1){
              int v = map.get(a);
              ans = ans + (v*(v-1)/2) ;
          }
      }
      // System.out.print(map);
      return ans;
    }
}