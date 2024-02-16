class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        
        System.out.println(list);
        for (Map.Entry<Integer, Integer> entry : list) {
            if (k >= entry.getValue()) {
                k -= entry.getValue();
                System.out.print(k+" ");
                map.remove(entry.getKey());
            } else {
                break;
            }
        }
        
        
        return map.size();
    }
}